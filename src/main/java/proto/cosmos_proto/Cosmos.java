// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos_proto/cosmos.proto

package proto.cosmos_proto;

public final class Cosmos {
  private Cosmos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(proto.cosmos_proto.Cosmos.interfaceType);
    registry.add(proto.cosmos_proto.Cosmos.implementsInterface);
    registry.add(proto.cosmos_proto.Cosmos.acceptsInterface);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public static final int INTERFACE_TYPE_FIELD_NUMBER = 93001;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.String> interfaceType = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int IMPLEMENTS_INTERFACE_FIELD_NUMBER = 93002;
  /**
   * <code>extend .google.protobuf.MessageOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.MessageOptions,
      java.lang.String> implementsInterface = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  public static final int ACCEPTS_INTERFACE_FIELD_NUMBER = 93001;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.String> acceptsInterface = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031cosmos_proto/cosmos.proto\022\014cosmos_prot" +
      "o\032 google/protobuf/descriptor.proto:9\n\016i" +
      "nterface_type\022\037.google.protobuf.MessageO" +
      "ptions\030\311\326\005 \001(\t:?\n\024implements_interface\022\037" +
      ".google.protobuf.MessageOptions\030\312\326\005 \001(\t:" +
      ":\n\021accepts_interface\022\035.google.protobuf.F" +
      "ieldOptions\030\311\326\005 \001(\tB\024\n\022proto.cosmos_prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        });
    interfaceType.internalInit(descriptor.getExtensions().get(0));
    implementsInterface.internalInit(descriptor.getExtensions().get(1));
    acceptsInterface.internalInit(descriptor.getExtensions().get(2));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
