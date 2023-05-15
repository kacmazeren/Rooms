package MeetingRoomNotificationService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: service3.proto")
public final class MeetingRoomNotificationServiceGrpc {

  private MeetingRoomNotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "meetingroomnotification.MeetingRoomNotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MeetingRoomNotificationService.DeviceSupplyRequest,
      MeetingRoomNotificationService.DeviceSupplyResponse> getDeviceSupplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deviceSupply",
      requestType = MeetingRoomNotificationService.DeviceSupplyRequest.class,
      responseType = MeetingRoomNotificationService.DeviceSupplyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MeetingRoomNotificationService.DeviceSupplyRequest,
      MeetingRoomNotificationService.DeviceSupplyResponse> getDeviceSupplyMethod() {
    io.grpc.MethodDescriptor<MeetingRoomNotificationService.DeviceSupplyRequest, MeetingRoomNotificationService.DeviceSupplyResponse> getDeviceSupplyMethod;
    if ((getDeviceSupplyMethod = MeetingRoomNotificationServiceGrpc.getDeviceSupplyMethod) == null) {
      synchronized (MeetingRoomNotificationServiceGrpc.class) {
        if ((getDeviceSupplyMethod = MeetingRoomNotificationServiceGrpc.getDeviceSupplyMethod) == null) {
          MeetingRoomNotificationServiceGrpc.getDeviceSupplyMethod = getDeviceSupplyMethod = 
              io.grpc.MethodDescriptor.<MeetingRoomNotificationService.DeviceSupplyRequest, MeetingRoomNotificationService.DeviceSupplyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "meetingroomnotification.MeetingRoomNotificationService", "deviceSupply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeetingRoomNotificationService.DeviceSupplyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  MeetingRoomNotificationService.DeviceSupplyResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingRoomNotificationServiceMethodDescriptorSupplier("deviceSupply"))
                  .build();
          }
        }
     }
     return getDeviceSupplyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeetingRoomNotificationServiceStub newStub(io.grpc.Channel channel) {
    return new MeetingRoomNotificationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeetingRoomNotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MeetingRoomNotificationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeetingRoomNotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MeetingRoomNotificationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class MeetingRoomNotificationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deviceSupply(MeetingRoomNotificationService.DeviceSupplyRequest request,
        io.grpc.stub.StreamObserver<MeetingRoomNotificationService.DeviceSupplyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeviceSupplyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeviceSupplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                MeetingRoomNotificationService.DeviceSupplyRequest,
                MeetingRoomNotificationService.DeviceSupplyResponse>(
                  this, METHODID_DEVICE_SUPPLY)))
          .build();
    }
  }

  /**
   */
  public static final class MeetingRoomNotificationServiceStub extends io.grpc.stub.AbstractStub<MeetingRoomNotificationServiceStub> {
    private MeetingRoomNotificationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomNotificationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomNotificationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomNotificationServiceStub(channel, callOptions);
    }

    /**
     */
    public void deviceSupply(MeetingRoomNotificationService.DeviceSupplyRequest request,
        io.grpc.stub.StreamObserver<MeetingRoomNotificationService.DeviceSupplyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeviceSupplyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MeetingRoomNotificationServiceBlockingStub extends io.grpc.stub.AbstractStub<MeetingRoomNotificationServiceBlockingStub> {
    private MeetingRoomNotificationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomNotificationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomNotificationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomNotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public MeetingRoomNotificationService.DeviceSupplyResponse deviceSupply(MeetingRoomNotificationService.DeviceSupplyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeviceSupplyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MeetingRoomNotificationServiceFutureStub extends io.grpc.stub.AbstractStub<MeetingRoomNotificationServiceFutureStub> {
    private MeetingRoomNotificationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingRoomNotificationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingRoomNotificationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingRoomNotificationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<MeetingRoomNotificationService.DeviceSupplyResponse> deviceSupply(
        MeetingRoomNotificationService.DeviceSupplyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeviceSupplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DEVICE_SUPPLY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MeetingRoomNotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MeetingRoomNotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEVICE_SUPPLY:
          serviceImpl.deviceSupply((MeetingRoomNotificationService.DeviceSupplyRequest) request,
              (io.grpc.stub.StreamObserver<MeetingRoomNotificationService.DeviceSupplyResponse>) responseObserver);
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

  private static abstract class MeetingRoomNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeetingRoomNotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return MeetingRoomNotificationService.MeetingRoomNotificationServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeetingRoomNotificationService");
    }
  }

  private static final class MeetingRoomNotificationServiceFileDescriptorSupplier
      extends MeetingRoomNotificationServiceBaseDescriptorSupplier {
    MeetingRoomNotificationServiceFileDescriptorSupplier() {}
  }

  private static final class MeetingRoomNotificationServiceMethodDescriptorSupplier
      extends MeetingRoomNotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MeetingRoomNotificationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MeetingRoomNotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeetingRoomNotificationServiceFileDescriptorSupplier())
              .addMethod(getDeviceSupplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
