package io.grpc.examples.data;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataClient {
    private static final Logger logger = Logger.getLogger(DataClient.class.getName());

    private final UsersGrpc.UsersBlockingStub blockingStub;

    public DataClient(Channel channel){
        blockingStub = UsersGrpc.newBlockingStub(channel);
    }

    public void listNames(String name) {
        logger.info("Trying to say hi to " + name + " ...");
        UsersRequest request = UsersRequest.newBuilder().setName(name).build();
        UsersReply response;
        try {
            response = blockingStub.listNames(request);
        } catch (StatusRuntimeException e){
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Names: " + response.getMessage());
    }

    public static void main(String[] args) throws Exception {
        String user = "user";
        String target = "localhost:50051";

        if(args.length > 0){
            if ("--help".equals(args[0])) {
                System.err.println("Usage: [name [target]]");
                System.err.println("");
                System.err.println("  name    The name you wish to be greeted by. Defaults to " + user);
                System.err.println("  target  The server to connect to. Defaults to " + target);
                System.exit(1);
            }
            user = args[0];  
        }
        if (args.length > 1){
            target = args[1];
        }

        ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
        // needing certificates.
            .usePlaintext()
            .build();
        try{
            DataClient client = new DataClient(channel);
            client.listNames(user);
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
    }

}