package io.grpc.examples.data;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import java.sql.*;
import io.grpc.protobuf.services.ProtoReflectionService;


public class DataServer{
    private static final Logger logger = Logger.getLogger(DataServer.class.getName());
    
    private Server server;

    private void start() throws IOException {
        /*The port on which server should run */
        int port = 50051;
        server = ServerBuilder.forPort(port)
            .addService(new UsersImpl())
            .addService(ProtoReflectionService.newInstance())
            .build()
            .start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                try {
                    DataServer.this.stop();
                }
                catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** server shut down");
            }
        });
    }
    
    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
          server.awaitTermination();
        }
    }
    public static String nameInfo(){
        String information = "";
        String url = "jdbc:mysql://localhost:3306/missioneats";
        String username = "root";
        String password = "password";
        try{
            Connection connection = DriverManager.getConnection(url, username, password);
            String sql = "select * from student;";
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
            
            while(result.next()){
                information = information + result.getString(2) + '\n';
            }
        } catch (SQLException e){
            System.out.println("Oops, error!");
            e.printStackTrace();
        }
        return information;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final DataServer server = new DataServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class UsersImpl extends UsersGrpc.UsersImplBase {

        @Override
        public void listNames(UsersRequest req, StreamObserver<UsersReply> responseObserver) {
            UsersReply reply = UsersReply.newBuilder().setMessage("List of students in MissionEats. \n" + nameInfo()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }

}