// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CoordinateProto.proto

package com.lvl6.aoc2.proto;

public final class Coordiante {
  private Coordiante() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CoordinateProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 x = 1;
    boolean hasX();
    int getX();
    
    // optional int32 y = 2;
    boolean hasY();
    int getY();
  }
  public static final class CoordinateProto extends
      com.google.protobuf.GeneratedMessage
      implements CoordinateProtoOrBuilder {
    // Use CoordinateProto.newBuilder() to construct.
    private CoordinateProto(Builder builder) {
      super(builder);
    }
    private CoordinateProto(boolean noInit) {}
    
    private static final CoordinateProto defaultInstance;
    public static CoordinateProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public CoordinateProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.proto.Coordiante.internal_static_com_lvl6_aoc2_proto_CoordinateProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.proto.Coordiante.internal_static_com_lvl6_aoc2_proto_CoordinateProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 x = 1;
    public static final int X_FIELD_NUMBER = 1;
    private int x_;
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getX() {
      return x_;
    }
    
    // optional int32 y = 2;
    public static final int Y_FIELD_NUMBER = 2;
    private int y_;
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getY() {
      return y_;
    }
    
    private void initFields() {
      x_ = 0;
      y_ = 0;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, y_);
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, x_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, y_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.proto.Coordiante.CoordinateProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.proto.Coordiante.CoordinateProto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.lvl6.aoc2.proto.Coordiante.CoordinateProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.proto.Coordiante.internal_static_com_lvl6_aoc2_proto_CoordinateProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.proto.Coordiante.internal_static_com_lvl6_aoc2_proto_CoordinateProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.proto.Coordiante.CoordinateProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        x_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        y_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.proto.Coordiante.CoordinateProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.proto.Coordiante.CoordinateProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.proto.Coordiante.CoordinateProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.proto.Coordiante.CoordinateProto build() {
        com.lvl6.aoc2.proto.Coordiante.CoordinateProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.proto.Coordiante.CoordinateProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.proto.Coordiante.CoordinateProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.proto.Coordiante.CoordinateProto buildPartial() {
        com.lvl6.aoc2.proto.Coordiante.CoordinateProto result = new com.lvl6.aoc2.proto.Coordiante.CoordinateProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.x_ = x_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.y_ = y_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.proto.Coordiante.CoordinateProto) {
          return mergeFrom((com.lvl6.aoc2.proto.Coordiante.CoordinateProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.proto.Coordiante.CoordinateProto other) {
        if (other == com.lvl6.aoc2.proto.Coordiante.CoordinateProto.getDefaultInstance()) return this;
        if (other.hasX()) {
          setX(other.getX());
        }
        if (other.hasY()) {
          setY(other.getY());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              x_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              y_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 x = 1;
      private int x_ ;
      public boolean hasX() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getX() {
        return x_;
      }
      public Builder setX(int value) {
        bitField0_ |= 0x00000001;
        x_ = value;
        onChanged();
        return this;
      }
      public Builder clearX() {
        bitField0_ = (bitField0_ & ~0x00000001);
        x_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 y = 2;
      private int y_ ;
      public boolean hasY() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getY() {
        return y_;
      }
      public Builder setY(int value) {
        bitField0_ |= 0x00000002;
        y_ = value;
        onChanged();
        return this;
      }
      public Builder clearY() {
        bitField0_ = (bitField0_ & ~0x00000002);
        y_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.lvl6.aoc2.proto.CoordinateProto)
    }
    
    static {
      defaultInstance = new CoordinateProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.lvl6.aoc2.proto.CoordinateProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lvl6_aoc2_proto_CoordinateProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_lvl6_aoc2_proto_CoordinateProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025CoordinateProto.proto\022\023com.lvl6.aoc2.p" +
      "roto\"\'\n\017CoordinateProto\022\t\n\001x\030\001 \001(\005\022\t\n\001y\030" +
      "\002 \001(\005B\014B\nCoordiante"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_lvl6_aoc2_proto_CoordinateProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_lvl6_aoc2_proto_CoordinateProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_lvl6_aoc2_proto_CoordinateProto_descriptor,
              new java.lang.String[] { "X", "Y", },
              com.lvl6.aoc2.proto.Coordiante.CoordinateProto.class,
              com.lvl6.aoc2.proto.Coordiante.CoordinateProto.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
