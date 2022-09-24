package io.grpc.examples.data;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: data.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final String SERVICE_NAME = "data.Users";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.data.UsersRequest,
      io.grpc.examples.data.UsersReply> getListNamesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNames",
      requestType = io.grpc.examples.data.UsersRequest.class,
      responseType = io.grpc.examples.data.UsersReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.data.UsersRequest,
      io.grpc.examples.data.UsersReply> getListNamesMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.data.UsersRequest, io.grpc.examples.data.UsersReply> getListNamesMethod;
    if ((getListNamesMethod = UsersGrpc.getListNamesMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getListNamesMethod = UsersGrpc.getListNamesMethod) == null) {
          UsersGrpc.getListNamesMethod = getListNamesMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.data.UsersRequest, io.grpc.examples.data.UsersReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNames"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.data.UsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.data.UsersReply.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("ListNames"))
              .build();
        }
      }
    }
    return getListNamesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.data.UsersRequest,
      io.grpc.examples.data.UsersReply> getListAvailDriversMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailDrivers",
      requestType = io.grpc.examples.data.UsersRequest.class,
      responseType = io.grpc.examples.data.UsersReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.data.UsersRequest,
      io.grpc.examples.data.UsersReply> getListAvailDriversMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.data.UsersRequest, io.grpc.examples.data.UsersReply> getListAvailDriversMethod;
    if ((getListAvailDriversMethod = UsersGrpc.getListAvailDriversMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getListAvailDriversMethod = UsersGrpc.getListAvailDriversMethod) == null) {
          UsersGrpc.getListAvailDriversMethod = getListAvailDriversMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.data.UsersRequest, io.grpc.examples.data.UsersReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailDrivers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.data.UsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.data.UsersReply.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("ListAvailDrivers"))
              .build();
        }
      }
    }
    return getListAvailDriversMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersStub>() {
        @java.lang.Override
        public UsersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersStub(channel, callOptions);
        }
      };
    return UsersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub>() {
        @java.lang.Override
        public UsersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersBlockingStub(channel, callOptions);
        }
      };
    return UsersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub>() {
        @java.lang.Override
        public UsersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersFutureStub(channel, callOptions);
        }
      };
    return UsersFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UsersImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *sends all users in MissionEats, make sure rpc name
     *matches the public override void in server.java
     * </pre>
     */
    public void listNames(io.grpc.examples.data.UsersRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.data.UsersReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNamesMethod(), responseObserver);
    }

    /**
     */
    public void listAvailDrivers(io.grpc.examples.data.UsersRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.data.UsersReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailDriversMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListNamesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.data.UsersRequest,
                io.grpc.examples.data.UsersReply>(
                  this, METHODID_LIST_NAMES)))
          .addMethod(
            getListAvailDriversMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.data.UsersRequest,
                io.grpc.examples.data.UsersReply>(
                  this, METHODID_LIST_AVAIL_DRIVERS)))
          .build();
    }
  }

  /**
   */
  public static final class UsersStub extends io.grpc.stub.AbstractAsyncStub<UsersStub> {
    private UsersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersStub(channel, callOptions);
    }

    /**
     * <pre>
     *sends all users in MissionEats, make sure rpc name
     *matches the public override void in server.java
     * </pre>
     */
    public void listNames(io.grpc.examples.data.UsersRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.data.UsersReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNamesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAvailDrivers(io.grpc.examples.data.UsersRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.data.UsersReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailDriversMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsersBlockingStub extends io.grpc.stub.AbstractBlockingStub<UsersBlockingStub> {
    private UsersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *sends all users in MissionEats, make sure rpc name
     *matches the public override void in server.java
     * </pre>
     */
    public io.grpc.examples.data.UsersReply listNames(io.grpc.examples.data.UsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNamesMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.data.UsersReply listAvailDrivers(io.grpc.examples.data.UsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailDriversMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsersFutureStub extends io.grpc.stub.AbstractFutureStub<UsersFutureStub> {
    private UsersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *sends all users in MissionEats, make sure rpc name
     *matches the public override void in server.java
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.data.UsersReply> listNames(
        io.grpc.examples.data.UsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNamesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.data.UsersReply> listAvailDrivers(
        io.grpc.examples.data.UsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailDriversMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NAMES = 0;
  private static final int METHODID_LIST_AVAIL_DRIVERS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_NAMES:
          serviceImpl.listNames((io.grpc.examples.data.UsersRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.data.UsersReply>) responseObserver);
          break;
        case METHODID_LIST_AVAIL_DRIVERS:
          serviceImpl.listAvailDrivers((io.grpc.examples.data.UsersRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.data.UsersReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.data.DataProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Users");
    }
  }

  private static final class UsersFileDescriptorSupplier
      extends UsersBaseDescriptorSupplier {
    UsersFileDescriptorSupplier() {}
  }

  private static final class UsersMethodDescriptorSupplier
      extends UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsersMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (UsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersFileDescriptorSupplier())
              .addMethod(getListNamesMethod())
              .addMethod(getListAvailDriversMethod())
              .build();
        }
      }
    }
    return result;
  }
}
