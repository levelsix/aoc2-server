// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BuildConsumableEvent.proto

package com.lvl6.aoc2.eventprotos;

public final class BuildConsumableEventProto {
  private BuildConsumableEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface BuildConsumableRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional .proto.MinimumUserProto mup = 1;
    boolean hasMup();
    com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto getMup();
    com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProtoOrBuilder getMupOrBuilder();
    
    // optional string consumableId = 2;
    boolean hasConsumableId();
    String getConsumableId();
  }
  public static final class BuildConsumableRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements BuildConsumableRequestProtoOrBuilder {
    // Use BuildConsumableRequestProto.newBuilder() to construct.
    private BuildConsumableRequestProto(Builder builder) {
      super(builder);
    }
    private BuildConsumableRequestProto(boolean noInit) {}
    
    private static final BuildConsumableRequestProto defaultInstance;
    public static BuildConsumableRequestProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public BuildConsumableRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.internal_static_proto_BuildConsumableRequestProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.internal_static_proto_BuildConsumableRequestProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional .proto.MinimumUserProto mup = 1;
    public static final int MUP_FIELD_NUMBER = 1;
    private com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto mup_;
    public boolean hasMup() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto getMup() {
      return mup_;
    }
    public com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProtoOrBuilder getMupOrBuilder() {
      return mup_;
    }
    
    // optional string consumableId = 2;
    public static final int CONSUMABLEID_FIELD_NUMBER = 2;
    private java.lang.Object consumableId_;
    public boolean hasConsumableId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getConsumableId() {
      java.lang.Object ref = consumableId_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          consumableId_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getConsumableIdBytes() {
      java.lang.Object ref = consumableId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        consumableId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      mup_ = com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.getDefaultInstance();
      consumableId_ = "";
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
        output.writeMessage(1, mup_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getConsumableIdBytes());
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
          .computeMessageSize(1, mup_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getConsumableIdBytes());
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
    
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseDelimitedFrom(
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
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto prototype) {
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
       implements com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.internal_static_proto_BuildConsumableRequestProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.internal_static_proto_BuildConsumableRequestProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getMupFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        if (mupBuilder_ == null) {
          mup_ = com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.getDefaultInstance();
        } else {
          mupBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        consumableId_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto build() {
        com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto buildPartial() {
        com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto result = new com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        if (mupBuilder_ == null) {
          result.mup_ = mup_;
        } else {
          result.mup_ = mupBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.consumableId_ = consumableId_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto) {
          return mergeFrom((com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto other) {
        if (other == com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto.getDefaultInstance()) return this;
        if (other.hasMup()) {
          mergeMup(other.getMup());
        }
        if (other.hasConsumableId()) {
          setConsumableId(other.getConsumableId());
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
            case 10: {
              com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.Builder subBuilder = com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.newBuilder();
              if (hasMup()) {
                subBuilder.mergeFrom(getMup());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setMup(subBuilder.buildPartial());
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              consumableId_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional .proto.MinimumUserProto mup = 1;
      private com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto mup_ = com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto, com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.Builder, com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProtoOrBuilder> mupBuilder_;
      public boolean hasMup() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto getMup() {
        if (mupBuilder_ == null) {
          return mup_;
        } else {
          return mupBuilder_.getMessage();
        }
      }
      public Builder setMup(com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto value) {
        if (mupBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mup_ = value;
          onChanged();
        } else {
          mupBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder setMup(
          com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.Builder builderForValue) {
        if (mupBuilder_ == null) {
          mup_ = builderForValue.build();
          onChanged();
        } else {
          mupBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder mergeMup(com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto value) {
        if (mupBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001) &&
              mup_ != com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.getDefaultInstance()) {
            mup_ =
              com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.newBuilder(mup_).mergeFrom(value).buildPartial();
          } else {
            mup_ = value;
          }
          onChanged();
        } else {
          mupBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      public Builder clearMup() {
        if (mupBuilder_ == null) {
          mup_ = com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.getDefaultInstance();
          onChanged();
        } else {
          mupBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      public com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.Builder getMupBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getMupFieldBuilder().getBuilder();
      }
      public com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProtoOrBuilder getMupOrBuilder() {
        if (mupBuilder_ != null) {
          return mupBuilder_.getMessageOrBuilder();
        } else {
          return mup_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto, com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.Builder, com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProtoOrBuilder> 
          getMupFieldBuilder() {
        if (mupBuilder_ == null) {
          mupBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto, com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProto.Builder, com.lvl6.aoc2.noneventprotos.FullUser.MinimumUserProtoOrBuilder>(
                  mup_,
                  getParentForChildren(),
                  isClean());
          mup_ = null;
        }
        return mupBuilder_;
      }
      
      // optional string consumableId = 2;
      private java.lang.Object consumableId_ = "";
      public boolean hasConsumableId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getConsumableId() {
        java.lang.Object ref = consumableId_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          consumableId_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setConsumableId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        consumableId_ = value;
        onChanged();
        return this;
      }
      public Builder clearConsumableId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        consumableId_ = getDefaultInstance().getConsumableId();
        onChanged();
        return this;
      }
      void setConsumableId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        consumableId_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:proto.BuildConsumableRequestProto)
    }
    
    static {
      defaultInstance = new BuildConsumableRequestProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.BuildConsumableRequestProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_BuildConsumableRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_BuildConsumableRequestProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032BuildConsumableEvent.proto\022\005proto\032\023Ful" +
      "lUserProto.proto\"Y\n\033BuildConsumableReque" +
      "stProto\022$\n\003mup\030\001 \001(\0132\027.proto.MinimumUser" +
      "Proto\022\024\n\014consumableId\030\002 \001(\tB6\n\031com.lvl6." +
      "aoc2.eventprotosB\031BuildConsumableEventPr" +
      "oto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_BuildConsumableRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_BuildConsumableRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_BuildConsumableRequestProto_descriptor,
              new java.lang.String[] { "Mup", "ConsumableId", },
              com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto.class,
              com.lvl6.aoc2.eventprotos.BuildConsumableEventProto.BuildConsumableRequestProto.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.lvl6.aoc2.noneventprotos.FullUser.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}