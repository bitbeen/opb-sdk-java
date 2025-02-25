package proto.tendermint.abci;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: tendermint/abci/types.proto")
public final class ABCIApplicationGrpc {

  private ABCIApplicationGrpc() {}

  public static final String SERVICE_NAME = "tendermint.abci.ABCIApplication";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Types.RequestEcho,
      Types.ResponseEcho> getEchoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Echo",
      requestType = Types.RequestEcho.class,
      responseType = Types.ResponseEcho.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestEcho,
      Types.ResponseEcho> getEchoMethod() {
    io.grpc.MethodDescriptor<Types.RequestEcho, Types.ResponseEcho> getEchoMethod;
    if ((getEchoMethod = ABCIApplicationGrpc.getEchoMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getEchoMethod = ABCIApplicationGrpc.getEchoMethod) == null) {
          ABCIApplicationGrpc.getEchoMethod = getEchoMethod =
              io.grpc.MethodDescriptor.<Types.RequestEcho, Types.ResponseEcho>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Echo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestEcho.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseEcho.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Echo"))
              .build();
        }
      }
    }
    return getEchoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestFlush,
      Types.ResponseFlush> getFlushMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Flush",
      requestType = Types.RequestFlush.class,
      responseType = Types.ResponseFlush.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestFlush,
      Types.ResponseFlush> getFlushMethod() {
    io.grpc.MethodDescriptor<Types.RequestFlush, Types.ResponseFlush> getFlushMethod;
    if ((getFlushMethod = ABCIApplicationGrpc.getFlushMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getFlushMethod = ABCIApplicationGrpc.getFlushMethod) == null) {
          ABCIApplicationGrpc.getFlushMethod = getFlushMethod =
              io.grpc.MethodDescriptor.<Types.RequestFlush, Types.ResponseFlush>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Flush"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestFlush.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseFlush.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Flush"))
              .build();
        }
      }
    }
    return getFlushMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestInfo,
      Types.ResponseInfo> getInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Info",
      requestType = Types.RequestInfo.class,
      responseType = Types.ResponseInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestInfo,
      Types.ResponseInfo> getInfoMethod() {
    io.grpc.MethodDescriptor<Types.RequestInfo, Types.ResponseInfo> getInfoMethod;
    if ((getInfoMethod = ABCIApplicationGrpc.getInfoMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getInfoMethod = ABCIApplicationGrpc.getInfoMethod) == null) {
          ABCIApplicationGrpc.getInfoMethod = getInfoMethod =
              io.grpc.MethodDescriptor.<Types.RequestInfo, Types.ResponseInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseInfo.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Info"))
              .build();
        }
      }
    }
    return getInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestSetOption,
      Types.ResponseSetOption> getSetOptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetOption",
      requestType = Types.RequestSetOption.class,
      responseType = Types.ResponseSetOption.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestSetOption,
      Types.ResponseSetOption> getSetOptionMethod() {
    io.grpc.MethodDescriptor<Types.RequestSetOption, Types.ResponseSetOption> getSetOptionMethod;
    if ((getSetOptionMethod = ABCIApplicationGrpc.getSetOptionMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getSetOptionMethod = ABCIApplicationGrpc.getSetOptionMethod) == null) {
          ABCIApplicationGrpc.getSetOptionMethod = getSetOptionMethod =
              io.grpc.MethodDescriptor.<Types.RequestSetOption, Types.ResponseSetOption>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetOption"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestSetOption.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseSetOption.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("SetOption"))
              .build();
        }
      }
    }
    return getSetOptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestDeliverTx,
      Types.ResponseDeliverTx> getDeliverTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeliverTx",
      requestType = Types.RequestDeliverTx.class,
      responseType = Types.ResponseDeliverTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestDeliverTx,
      Types.ResponseDeliverTx> getDeliverTxMethod() {
    io.grpc.MethodDescriptor<Types.RequestDeliverTx, Types.ResponseDeliverTx> getDeliverTxMethod;
    if ((getDeliverTxMethod = ABCIApplicationGrpc.getDeliverTxMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getDeliverTxMethod = ABCIApplicationGrpc.getDeliverTxMethod) == null) {
          ABCIApplicationGrpc.getDeliverTxMethod = getDeliverTxMethod =
              io.grpc.MethodDescriptor.<Types.RequestDeliverTx, Types.ResponseDeliverTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeliverTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestDeliverTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseDeliverTx.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("DeliverTx"))
              .build();
        }
      }
    }
    return getDeliverTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestCheckTx,
      Types.ResponseCheckTx> getCheckTxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTx",
      requestType = Types.RequestCheckTx.class,
      responseType = Types.ResponseCheckTx.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestCheckTx,
      Types.ResponseCheckTx> getCheckTxMethod() {
    io.grpc.MethodDescriptor<Types.RequestCheckTx, Types.ResponseCheckTx> getCheckTxMethod;
    if ((getCheckTxMethod = ABCIApplicationGrpc.getCheckTxMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getCheckTxMethod = ABCIApplicationGrpc.getCheckTxMethod) == null) {
          ABCIApplicationGrpc.getCheckTxMethod = getCheckTxMethod =
              io.grpc.MethodDescriptor.<Types.RequestCheckTx, Types.ResponseCheckTx>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestCheckTx.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseCheckTx.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("CheckTx"))
              .build();
        }
      }
    }
    return getCheckTxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestQuery,
      Types.ResponseQuery> getQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Query",
      requestType = Types.RequestQuery.class,
      responseType = Types.ResponseQuery.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestQuery,
      Types.ResponseQuery> getQueryMethod() {
    io.grpc.MethodDescriptor<Types.RequestQuery, Types.ResponseQuery> getQueryMethod;
    if ((getQueryMethod = ABCIApplicationGrpc.getQueryMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getQueryMethod = ABCIApplicationGrpc.getQueryMethod) == null) {
          ABCIApplicationGrpc.getQueryMethod = getQueryMethod =
              io.grpc.MethodDescriptor.<Types.RequestQuery, Types.ResponseQuery>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Query"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestQuery.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseQuery.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Query"))
              .build();
        }
      }
    }
    return getQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestCommit,
      Types.ResponseCommit> getCommitMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Commit",
      requestType = Types.RequestCommit.class,
      responseType = Types.ResponseCommit.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestCommit,
      Types.ResponseCommit> getCommitMethod() {
    io.grpc.MethodDescriptor<Types.RequestCommit, Types.ResponseCommit> getCommitMethod;
    if ((getCommitMethod = ABCIApplicationGrpc.getCommitMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getCommitMethod = ABCIApplicationGrpc.getCommitMethod) == null) {
          ABCIApplicationGrpc.getCommitMethod = getCommitMethod =
              io.grpc.MethodDescriptor.<Types.RequestCommit, Types.ResponseCommit>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Commit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestCommit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseCommit.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("Commit"))
              .build();
        }
      }
    }
    return getCommitMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestInitChain,
      Types.ResponseInitChain> getInitChainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitChain",
      requestType = Types.RequestInitChain.class,
      responseType = Types.ResponseInitChain.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestInitChain,
      Types.ResponseInitChain> getInitChainMethod() {
    io.grpc.MethodDescriptor<Types.RequestInitChain, Types.ResponseInitChain> getInitChainMethod;
    if ((getInitChainMethod = ABCIApplicationGrpc.getInitChainMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getInitChainMethod = ABCIApplicationGrpc.getInitChainMethod) == null) {
          ABCIApplicationGrpc.getInitChainMethod = getInitChainMethod =
              io.grpc.MethodDescriptor.<Types.RequestInitChain, Types.ResponseInitChain>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitChain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestInitChain.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseInitChain.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("InitChain"))
              .build();
        }
      }
    }
    return getInitChainMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestBeginBlock,
      Types.ResponseBeginBlock> getBeginBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BeginBlock",
      requestType = Types.RequestBeginBlock.class,
      responseType = Types.ResponseBeginBlock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestBeginBlock,
      Types.ResponseBeginBlock> getBeginBlockMethod() {
    io.grpc.MethodDescriptor<Types.RequestBeginBlock, Types.ResponseBeginBlock> getBeginBlockMethod;
    if ((getBeginBlockMethod = ABCIApplicationGrpc.getBeginBlockMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getBeginBlockMethod = ABCIApplicationGrpc.getBeginBlockMethod) == null) {
          ABCIApplicationGrpc.getBeginBlockMethod = getBeginBlockMethod =
              io.grpc.MethodDescriptor.<Types.RequestBeginBlock, Types.ResponseBeginBlock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BeginBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestBeginBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseBeginBlock.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("BeginBlock"))
              .build();
        }
      }
    }
    return getBeginBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestEndBlock,
      Types.ResponseEndBlock> getEndBlockMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EndBlock",
      requestType = Types.RequestEndBlock.class,
      responseType = Types.ResponseEndBlock.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestEndBlock,
      Types.ResponseEndBlock> getEndBlockMethod() {
    io.grpc.MethodDescriptor<Types.RequestEndBlock, Types.ResponseEndBlock> getEndBlockMethod;
    if ((getEndBlockMethod = ABCIApplicationGrpc.getEndBlockMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getEndBlockMethod = ABCIApplicationGrpc.getEndBlockMethod) == null) {
          ABCIApplicationGrpc.getEndBlockMethod = getEndBlockMethod =
              io.grpc.MethodDescriptor.<Types.RequestEndBlock, Types.ResponseEndBlock>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EndBlock"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestEndBlock.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseEndBlock.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("EndBlock"))
              .build();
        }
      }
    }
    return getEndBlockMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestListSnapshots,
      Types.ResponseListSnapshots> getListSnapshotsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSnapshots",
      requestType = Types.RequestListSnapshots.class,
      responseType = Types.ResponseListSnapshots.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestListSnapshots,
      Types.ResponseListSnapshots> getListSnapshotsMethod() {
    io.grpc.MethodDescriptor<Types.RequestListSnapshots, Types.ResponseListSnapshots> getListSnapshotsMethod;
    if ((getListSnapshotsMethod = ABCIApplicationGrpc.getListSnapshotsMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getListSnapshotsMethod = ABCIApplicationGrpc.getListSnapshotsMethod) == null) {
          ABCIApplicationGrpc.getListSnapshotsMethod = getListSnapshotsMethod =
              io.grpc.MethodDescriptor.<Types.RequestListSnapshots, Types.ResponseListSnapshots>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSnapshots"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestListSnapshots.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseListSnapshots.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("ListSnapshots"))
              .build();
        }
      }
    }
    return getListSnapshotsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestOfferSnapshot,
      Types.ResponseOfferSnapshot> getOfferSnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfferSnapshot",
      requestType = Types.RequestOfferSnapshot.class,
      responseType = Types.ResponseOfferSnapshot.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestOfferSnapshot,
      Types.ResponseOfferSnapshot> getOfferSnapshotMethod() {
    io.grpc.MethodDescriptor<Types.RequestOfferSnapshot, Types.ResponseOfferSnapshot> getOfferSnapshotMethod;
    if ((getOfferSnapshotMethod = ABCIApplicationGrpc.getOfferSnapshotMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getOfferSnapshotMethod = ABCIApplicationGrpc.getOfferSnapshotMethod) == null) {
          ABCIApplicationGrpc.getOfferSnapshotMethod = getOfferSnapshotMethod =
              io.grpc.MethodDescriptor.<Types.RequestOfferSnapshot, Types.ResponseOfferSnapshot>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OfferSnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestOfferSnapshot.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseOfferSnapshot.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("OfferSnapshot"))
              .build();
        }
      }
    }
    return getOfferSnapshotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestLoadSnapshotChunk,
      Types.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadSnapshotChunk",
      requestType = Types.RequestLoadSnapshotChunk.class,
      responseType = Types.ResponseLoadSnapshotChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestLoadSnapshotChunk,
      Types.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod() {
    io.grpc.MethodDescriptor<Types.RequestLoadSnapshotChunk, Types.ResponseLoadSnapshotChunk> getLoadSnapshotChunkMethod;
    if ((getLoadSnapshotChunkMethod = ABCIApplicationGrpc.getLoadSnapshotChunkMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getLoadSnapshotChunkMethod = ABCIApplicationGrpc.getLoadSnapshotChunkMethod) == null) {
          ABCIApplicationGrpc.getLoadSnapshotChunkMethod = getLoadSnapshotChunkMethod =
              io.grpc.MethodDescriptor.<Types.RequestLoadSnapshotChunk, Types.ResponseLoadSnapshotChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadSnapshotChunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestLoadSnapshotChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseLoadSnapshotChunk.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("LoadSnapshotChunk"))
              .build();
        }
      }
    }
    return getLoadSnapshotChunkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Types.RequestApplySnapshotChunk,
      Types.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplySnapshotChunk",
      requestType = Types.RequestApplySnapshotChunk.class,
      responseType = Types.ResponseApplySnapshotChunk.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Types.RequestApplySnapshotChunk,
      Types.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod() {
    io.grpc.MethodDescriptor<Types.RequestApplySnapshotChunk, Types.ResponseApplySnapshotChunk> getApplySnapshotChunkMethod;
    if ((getApplySnapshotChunkMethod = ABCIApplicationGrpc.getApplySnapshotChunkMethod) == null) {
      synchronized (ABCIApplicationGrpc.class) {
        if ((getApplySnapshotChunkMethod = ABCIApplicationGrpc.getApplySnapshotChunkMethod) == null) {
          ABCIApplicationGrpc.getApplySnapshotChunkMethod = getApplySnapshotChunkMethod =
              io.grpc.MethodDescriptor.<Types.RequestApplySnapshotChunk, Types.ResponseApplySnapshotChunk>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplySnapshotChunk"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.RequestApplySnapshotChunk.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Types.ResponseApplySnapshotChunk.getDefaultInstance()))
              .setSchemaDescriptor(new ABCIApplicationMethodDescriptorSupplier("ApplySnapshotChunk"))
              .build();
        }
      }
    }
    return getApplySnapshotChunkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ABCIApplicationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationStub>() {
        @Override
        public ABCIApplicationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIApplicationStub(channel, callOptions);
        }
      };
    return ABCIApplicationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ABCIApplicationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationBlockingStub>() {
        @Override
        public ABCIApplicationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIApplicationBlockingStub(channel, callOptions);
        }
      };
    return ABCIApplicationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ABCIApplicationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ABCIApplicationFutureStub>() {
        @Override
        public ABCIApplicationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ABCIApplicationFutureStub(channel, callOptions);
        }
      };
    return ABCIApplicationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ABCIApplicationImplBase implements io.grpc.BindableService {

    /**
     */
    public void echo(Types.RequestEcho request,
                     io.grpc.stub.StreamObserver<Types.ResponseEcho> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEchoMethod(), responseObserver);
    }

    /**
     */
    public void flush(Types.RequestFlush request,
                      io.grpc.stub.StreamObserver<Types.ResponseFlush> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFlushMethod(), responseObserver);
    }

    /**
     */
    public void info(Types.RequestInfo request,
                     io.grpc.stub.StreamObserver<Types.ResponseInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInfoMethod(), responseObserver);
    }

    /**
     */
    public void setOption(Types.RequestSetOption request,
                          io.grpc.stub.StreamObserver<Types.ResponseSetOption> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetOptionMethod(), responseObserver);
    }

    /**
     */
    public void deliverTx(Types.RequestDeliverTx request,
                          io.grpc.stub.StreamObserver<Types.ResponseDeliverTx> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeliverTxMethod(), responseObserver);
    }

    /**
     */
    public void checkTx(Types.RequestCheckTx request,
                        io.grpc.stub.StreamObserver<Types.ResponseCheckTx> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckTxMethod(), responseObserver);
    }

    /**
     */
    public void query(Types.RequestQuery request,
                      io.grpc.stub.StreamObserver<Types.ResponseQuery> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryMethod(), responseObserver);
    }

    /**
     */
    public void commit(Types.RequestCommit request,
                       io.grpc.stub.StreamObserver<Types.ResponseCommit> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommitMethod(), responseObserver);
    }

    /**
     */
    public void initChain(Types.RequestInitChain request,
                          io.grpc.stub.StreamObserver<Types.ResponseInitChain> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitChainMethod(), responseObserver);
    }

    /**
     */
    public void beginBlock(Types.RequestBeginBlock request,
                           io.grpc.stub.StreamObserver<Types.ResponseBeginBlock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBeginBlockMethod(), responseObserver);
    }

    /**
     */
    public void endBlock(Types.RequestEndBlock request,
                         io.grpc.stub.StreamObserver<Types.ResponseEndBlock> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEndBlockMethod(), responseObserver);
    }

    /**
     */
    public void listSnapshots(Types.RequestListSnapshots request,
                              io.grpc.stub.StreamObserver<Types.ResponseListSnapshots> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSnapshotsMethod(), responseObserver);
    }

    /**
     */
    public void offerSnapshot(Types.RequestOfferSnapshot request,
                              io.grpc.stub.StreamObserver<Types.ResponseOfferSnapshot> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOfferSnapshotMethod(), responseObserver);
    }

    /**
     */
    public void loadSnapshotChunk(Types.RequestLoadSnapshotChunk request,
                                  io.grpc.stub.StreamObserver<Types.ResponseLoadSnapshotChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadSnapshotChunkMethod(), responseObserver);
    }

    /**
     */
    public void applySnapshotChunk(Types.RequestApplySnapshotChunk request,
                                   io.grpc.stub.StreamObserver<Types.ResponseApplySnapshotChunk> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getApplySnapshotChunkMethod(), responseObserver);
    }

    @Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEchoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestEcho,
                Types.ResponseEcho>(
                  this, METHODID_ECHO)))
          .addMethod(
            getFlushMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestFlush,
                Types.ResponseFlush>(
                  this, METHODID_FLUSH)))
          .addMethod(
            getInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestInfo,
                Types.ResponseInfo>(
                  this, METHODID_INFO)))
          .addMethod(
            getSetOptionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestSetOption,
                Types.ResponseSetOption>(
                  this, METHODID_SET_OPTION)))
          .addMethod(
            getDeliverTxMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestDeliverTx,
                Types.ResponseDeliverTx>(
                  this, METHODID_DELIVER_TX)))
          .addMethod(
            getCheckTxMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestCheckTx,
                Types.ResponseCheckTx>(
                  this, METHODID_CHECK_TX)))
          .addMethod(
            getQueryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestQuery,
                Types.ResponseQuery>(
                  this, METHODID_QUERY)))
          .addMethod(
            getCommitMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestCommit,
                Types.ResponseCommit>(
                  this, METHODID_COMMIT)))
          .addMethod(
            getInitChainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestInitChain,
                Types.ResponseInitChain>(
                  this, METHODID_INIT_CHAIN)))
          .addMethod(
            getBeginBlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestBeginBlock,
                Types.ResponseBeginBlock>(
                  this, METHODID_BEGIN_BLOCK)))
          .addMethod(
            getEndBlockMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestEndBlock,
                Types.ResponseEndBlock>(
                  this, METHODID_END_BLOCK)))
          .addMethod(
            getListSnapshotsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestListSnapshots,
                Types.ResponseListSnapshots>(
                  this, METHODID_LIST_SNAPSHOTS)))
          .addMethod(
            getOfferSnapshotMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestOfferSnapshot,
                Types.ResponseOfferSnapshot>(
                  this, METHODID_OFFER_SNAPSHOT)))
          .addMethod(
            getLoadSnapshotChunkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestLoadSnapshotChunk,
                Types.ResponseLoadSnapshotChunk>(
                  this, METHODID_LOAD_SNAPSHOT_CHUNK)))
          .addMethod(
            getApplySnapshotChunkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                Types.RequestApplySnapshotChunk,
                Types.ResponseApplySnapshotChunk>(
                  this, METHODID_APPLY_SNAPSHOT_CHUNK)))
          .build();
    }
  }

  /**
   */
  public static final class ABCIApplicationStub extends io.grpc.stub.AbstractAsyncStub<ABCIApplicationStub> {
    private ABCIApplicationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ABCIApplicationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIApplicationStub(channel, callOptions);
    }

    /**
     */
    public void echo(Types.RequestEcho request,
                     io.grpc.stub.StreamObserver<Types.ResponseEcho> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void flush(Types.RequestFlush request,
                      io.grpc.stub.StreamObserver<Types.ResponseFlush> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void info(Types.RequestInfo request,
                     io.grpc.stub.StreamObserver<Types.ResponseInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setOption(Types.RequestSetOption request,
                          io.grpc.stub.StreamObserver<Types.ResponseSetOption> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetOptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deliverTx(Types.RequestDeliverTx request,
                          io.grpc.stub.StreamObserver<Types.ResponseDeliverTx> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeliverTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTx(Types.RequestCheckTx request,
                        io.grpc.stub.StreamObserver<Types.ResponseCheckTx> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void query(Types.RequestQuery request,
                      io.grpc.stub.StreamObserver<Types.ResponseQuery> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commit(Types.RequestCommit request,
                       io.grpc.stub.StreamObserver<Types.ResponseCommit> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initChain(Types.RequestInitChain request,
                          io.grpc.stub.StreamObserver<Types.ResponseInitChain> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitChainMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void beginBlock(Types.RequestBeginBlock request,
                           io.grpc.stub.StreamObserver<Types.ResponseBeginBlock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBeginBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void endBlock(Types.RequestEndBlock request,
                         io.grpc.stub.StreamObserver<Types.ResponseEndBlock> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEndBlockMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSnapshots(Types.RequestListSnapshots request,
                              io.grpc.stub.StreamObserver<Types.ResponseListSnapshots> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void offerSnapshot(Types.RequestOfferSnapshot request,
                              io.grpc.stub.StreamObserver<Types.ResponseOfferSnapshot> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOfferSnapshotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadSnapshotChunk(Types.RequestLoadSnapshotChunk request,
                                  io.grpc.stub.StreamObserver<Types.ResponseLoadSnapshotChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadSnapshotChunkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void applySnapshotChunk(Types.RequestApplySnapshotChunk request,
                                   io.grpc.stub.StreamObserver<Types.ResponseApplySnapshotChunk> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getApplySnapshotChunkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ABCIApplicationBlockingStub extends io.grpc.stub.AbstractBlockingStub<ABCIApplicationBlockingStub> {
    private ABCIApplicationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ABCIApplicationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIApplicationBlockingStub(channel, callOptions);
    }

    /**
     */
    public Types.ResponseEcho echo(Types.RequestEcho request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEchoMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseFlush flush(Types.RequestFlush request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFlushMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseInfo info(Types.RequestInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseSetOption setOption(Types.RequestSetOption request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetOptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseDeliverTx deliverTx(Types.RequestDeliverTx request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeliverTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseCheckTx checkTx(Types.RequestCheckTx request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseQuery query(Types.RequestQuery request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseCommit commit(Types.RequestCommit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommitMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseInitChain initChain(Types.RequestInitChain request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitChainMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseBeginBlock beginBlock(Types.RequestBeginBlock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBeginBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseEndBlock endBlock(Types.RequestEndBlock request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEndBlockMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseListSnapshots listSnapshots(Types.RequestListSnapshots request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSnapshotsMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseOfferSnapshot offerSnapshot(Types.RequestOfferSnapshot request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfferSnapshotMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseLoadSnapshotChunk loadSnapshotChunk(Types.RequestLoadSnapshotChunk request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadSnapshotChunkMethod(), getCallOptions(), request);
    }

    /**
     */
    public Types.ResponseApplySnapshotChunk applySnapshotChunk(Types.RequestApplySnapshotChunk request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getApplySnapshotChunkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ABCIApplicationFutureStub extends io.grpc.stub.AbstractFutureStub<ABCIApplicationFutureStub> {
    private ABCIApplicationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected ABCIApplicationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ABCIApplicationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseEcho> echo(
        Types.RequestEcho request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEchoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseFlush> flush(
        Types.RequestFlush request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFlushMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseInfo> info(
        Types.RequestInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseSetOption> setOption(
        Types.RequestSetOption request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetOptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseDeliverTx> deliverTx(
        Types.RequestDeliverTx request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeliverTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseCheckTx> checkTx(
        Types.RequestCheckTx request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseQuery> query(
        Types.RequestQuery request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseCommit> commit(
        Types.RequestCommit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommitMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseInitChain> initChain(
        Types.RequestInitChain request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitChainMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseBeginBlock> beginBlock(
        Types.RequestBeginBlock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBeginBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseEndBlock> endBlock(
        Types.RequestEndBlock request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEndBlockMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseListSnapshots> listSnapshots(
        Types.RequestListSnapshots request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSnapshotsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseOfferSnapshot> offerSnapshot(
        Types.RequestOfferSnapshot request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOfferSnapshotMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseLoadSnapshotChunk> loadSnapshotChunk(
        Types.RequestLoadSnapshotChunk request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadSnapshotChunkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Types.ResponseApplySnapshotChunk> applySnapshotChunk(
        Types.RequestApplySnapshotChunk request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getApplySnapshotChunkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ECHO = 0;
  private static final int METHODID_FLUSH = 1;
  private static final int METHODID_INFO = 2;
  private static final int METHODID_SET_OPTION = 3;
  private static final int METHODID_DELIVER_TX = 4;
  private static final int METHODID_CHECK_TX = 5;
  private static final int METHODID_QUERY = 6;
  private static final int METHODID_COMMIT = 7;
  private static final int METHODID_INIT_CHAIN = 8;
  private static final int METHODID_BEGIN_BLOCK = 9;
  private static final int METHODID_END_BLOCK = 10;
  private static final int METHODID_LIST_SNAPSHOTS = 11;
  private static final int METHODID_OFFER_SNAPSHOT = 12;
  private static final int METHODID_LOAD_SNAPSHOT_CHUNK = 13;
  private static final int METHODID_APPLY_SNAPSHOT_CHUNK = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ABCIApplicationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ABCIApplicationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ECHO:
          serviceImpl.echo((Types.RequestEcho) request,
              (io.grpc.stub.StreamObserver<Types.ResponseEcho>) responseObserver);
          break;
        case METHODID_FLUSH:
          serviceImpl.flush((Types.RequestFlush) request,
              (io.grpc.stub.StreamObserver<Types.ResponseFlush>) responseObserver);
          break;
        case METHODID_INFO:
          serviceImpl.info((Types.RequestInfo) request,
              (io.grpc.stub.StreamObserver<Types.ResponseInfo>) responseObserver);
          break;
        case METHODID_SET_OPTION:
          serviceImpl.setOption((Types.RequestSetOption) request,
              (io.grpc.stub.StreamObserver<Types.ResponseSetOption>) responseObserver);
          break;
        case METHODID_DELIVER_TX:
          serviceImpl.deliverTx((Types.RequestDeliverTx) request,
              (io.grpc.stub.StreamObserver<Types.ResponseDeliverTx>) responseObserver);
          break;
        case METHODID_CHECK_TX:
          serviceImpl.checkTx((Types.RequestCheckTx) request,
              (io.grpc.stub.StreamObserver<Types.ResponseCheckTx>) responseObserver);
          break;
        case METHODID_QUERY:
          serviceImpl.query((Types.RequestQuery) request,
              (io.grpc.stub.StreamObserver<Types.ResponseQuery>) responseObserver);
          break;
        case METHODID_COMMIT:
          serviceImpl.commit((Types.RequestCommit) request,
              (io.grpc.stub.StreamObserver<Types.ResponseCommit>) responseObserver);
          break;
        case METHODID_INIT_CHAIN:
          serviceImpl.initChain((Types.RequestInitChain) request,
              (io.grpc.stub.StreamObserver<Types.ResponseInitChain>) responseObserver);
          break;
        case METHODID_BEGIN_BLOCK:
          serviceImpl.beginBlock((Types.RequestBeginBlock) request,
              (io.grpc.stub.StreamObserver<Types.ResponseBeginBlock>) responseObserver);
          break;
        case METHODID_END_BLOCK:
          serviceImpl.endBlock((Types.RequestEndBlock) request,
              (io.grpc.stub.StreamObserver<Types.ResponseEndBlock>) responseObserver);
          break;
        case METHODID_LIST_SNAPSHOTS:
          serviceImpl.listSnapshots((Types.RequestListSnapshots) request,
              (io.grpc.stub.StreamObserver<Types.ResponseListSnapshots>) responseObserver);
          break;
        case METHODID_OFFER_SNAPSHOT:
          serviceImpl.offerSnapshot((Types.RequestOfferSnapshot) request,
              (io.grpc.stub.StreamObserver<Types.ResponseOfferSnapshot>) responseObserver);
          break;
        case METHODID_LOAD_SNAPSHOT_CHUNK:
          serviceImpl.loadSnapshotChunk((Types.RequestLoadSnapshotChunk) request,
              (io.grpc.stub.StreamObserver<Types.ResponseLoadSnapshotChunk>) responseObserver);
          break;
        case METHODID_APPLY_SNAPSHOT_CHUNK:
          serviceImpl.applySnapshotChunk((Types.RequestApplySnapshotChunk) request,
              (io.grpc.stub.StreamObserver<Types.ResponseApplySnapshotChunk>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ABCIApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ABCIApplicationBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return Types.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ABCIApplication");
    }
  }

  private static final class ABCIApplicationFileDescriptorSupplier
      extends ABCIApplicationBaseDescriptorSupplier {
    ABCIApplicationFileDescriptorSupplier() {}
  }

  private static final class ABCIApplicationMethodDescriptorSupplier
      extends ABCIApplicationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ABCIApplicationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ABCIApplicationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ABCIApplicationFileDescriptorSupplier())
              .addMethod(getEchoMethod())
              .addMethod(getFlushMethod())
              .addMethod(getInfoMethod())
              .addMethod(getSetOptionMethod())
              .addMethod(getDeliverTxMethod())
              .addMethod(getCheckTxMethod())
              .addMethod(getQueryMethod())
              .addMethod(getCommitMethod())
              .addMethod(getInitChainMethod())
              .addMethod(getBeginBlockMethod())
              .addMethod(getEndBlockMethod())
              .addMethod(getListSnapshotsMethod())
              .addMethod(getOfferSnapshotMethod())
              .addMethod(getLoadSnapshotChunkMethod())
              .addMethod(getApplySnapshotChunkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
