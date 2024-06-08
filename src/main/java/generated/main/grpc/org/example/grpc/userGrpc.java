package org.example.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 * <pre>
 *service definition
 *service calls
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.3.0)",
    comments = "Source: user.proto")
public final class userGrpc {

  private userGrpc() {}

  public static final String SERVICE_NAME = "user";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.example.grpc.User.LoginRequest,
      org.example.grpc.User.ApiResponse> METHOD_LOGIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user", "login"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.example.grpc.User.LoginRequest.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.example.grpc.User.ApiResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.example.grpc.User.Empty,
      org.example.grpc.User.ApiResponse> METHOD_LOGOUT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "user", "logout"),
          io.grpc.protobuf.ProtoUtils.marshaller(org.example.grpc.User.Empty.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(org.example.grpc.User.ApiResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static userStub newStub(io.grpc.Channel channel) {
    return new userStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static userBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new userBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static userFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new userFutureStub(channel);
  }

  /**
   * <pre>
   *service definition
   *service calls
   * </pre>
   */
  public static abstract class userImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(org.example.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.User.ApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGIN, responseObserver);
    }

    /**
     */
    public void logout(org.example.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc.User.ApiResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_LOGOUT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_LOGIN,
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.User.LoginRequest,
                org.example.grpc.User.ApiResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            METHOD_LOGOUT,
            asyncUnaryCall(
              new MethodHandlers<
                org.example.grpc.User.Empty,
                org.example.grpc.User.ApiResponse>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   * <pre>
   *service definition
   *service calls
   * </pre>
   */
  public static final class userStub extends io.grpc.stub.AbstractStub<userStub> {
    private userStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userStub(channel, callOptions);
    }

    /**
     */
    public void login(org.example.grpc.User.LoginRequest request,
        io.grpc.stub.StreamObserver<org.example.grpc.User.ApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(org.example.grpc.User.Empty request,
        io.grpc.stub.StreamObserver<org.example.grpc.User.ApiResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LOGOUT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *service definition
   *service calls
   * </pre>
   */
  public static final class userBlockingStub extends io.grpc.stub.AbstractStub<userBlockingStub> {
    private userBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.grpc.User.ApiResponse login(org.example.grpc.User.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGIN, getCallOptions(), request);
    }

    /**
     */
    public org.example.grpc.User.ApiResponse logout(org.example.grpc.User.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_LOGOUT, getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *service definition
   *service calls
   * </pre>
   */
  public static final class userFutureStub extends io.grpc.stub.AbstractStub<userFutureStub> {
    private userFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private userFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected userFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new userFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.User.ApiResponse> login(
        org.example.grpc.User.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGIN, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.grpc.User.ApiResponse> logout(
        org.example.grpc.User.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LOGOUT, getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_LOGOUT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final userImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(userImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((org.example.grpc.User.LoginRequest) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.User.ApiResponse>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((org.example.grpc.User.Empty) request,
              (io.grpc.stub.StreamObserver<org.example.grpc.User.ApiResponse>) responseObserver);
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

  private static final class userDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.grpc.User.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (userGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new userDescriptorSupplier())
              .addMethod(METHOD_LOGIN)
              .addMethod(METHOD_LOGOUT)
              .build();
        }
      }
    }
    return result;
  }
}
