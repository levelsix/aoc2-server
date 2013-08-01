// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SelectUserClassTypeEvent.proto

package com.lvl6.aoc2.eventprotos;

public final class SelectUserClassTypeEventProto {
  private SelectUserClassTypeEventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface SelectUserClassTypeRequestProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional .proto.ClassType classType = 2;
    boolean hasClassType();
    com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType getClassType();
  }
  public static final class SelectUserClassTypeRequestProto extends
      com.google.protobuf.GeneratedMessage
      implements SelectUserClassTypeRequestProtoOrBuilder {
    // Use SelectUserClassTypeRequestProto.newBuilder() to construct.
    private SelectUserClassTypeRequestProto(Builder builder) {
      super(builder);
    }
    private SelectUserClassTypeRequestProto(boolean noInit) {}
    
    private static final SelectUserClassTypeRequestProto defaultInstance;
    public static SelectUserClassTypeRequestProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public SelectUserClassTypeRequestProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.internal_static_proto_SelectUserClassTypeRequestProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.internal_static_proto_SelectUserClassTypeRequestProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional .proto.ClassType classType = 2;
    public static final int CLASSTYPE_FIELD_NUMBER = 2;
    private com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType classType_;
    public boolean hasClassType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType getClassType() {
      return classType_;
    }
    
    private void initFields() {
      classType_ = com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType.WARRIOR;
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
        output.writeEnum(2, classType_.getNumber());
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
          .computeEnumSize(2, classType_.getNumber());
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
    
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseDelimitedFrom(
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
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto prototype) {
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
       implements com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.internal_static_proto_SelectUserClassTypeRequestProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.internal_static_proto_SelectUserClassTypeRequestProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto.newBuilder()
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
        classType_ = com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType.WARRIOR;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto build() {
        com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto buildPartial() {
        com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto result = new com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.classType_ = classType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto) {
          return mergeFrom((com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto other) {
        if (other == com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto.getDefaultInstance()) return this;
        if (other.hasClassType()) {
          setClassType(other.getClassType());
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
            case 16: {
              int rawValue = input.readEnum();
              com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType value = com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                classType_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional .proto.ClassType classType = 2;
      private com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType classType_ = com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType.WARRIOR;
      public boolean hasClassType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType getClassType() {
        return classType_;
      }
      public Builder setClassType(com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        classType_ = value;
        onChanged();
        return this;
      }
      public Builder clearClassType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        classType_ = com.lvl6.aoc2.noneventprotos.ClassEnum.ClassType.WARRIOR;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:proto.SelectUserClassTypeRequestProto)
    }
    
    static {
      defaultInstance = new SelectUserClassTypeRequestProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.SelectUserClassTypeRequestProto)
  }
  
  public interface SelectUserClassTypeResponseProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional .proto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus status = 2;
    boolean hasStatus();
    com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus getStatus();
  }
  public static final class SelectUserClassTypeResponseProto extends
      com.google.protobuf.GeneratedMessage
      implements SelectUserClassTypeResponseProtoOrBuilder {
    // Use SelectUserClassTypeResponseProto.newBuilder() to construct.
    private SelectUserClassTypeResponseProto(Builder builder) {
      super(builder);
    }
    private SelectUserClassTypeResponseProto(boolean noInit) {}
    
    private static final SelectUserClassTypeResponseProto defaultInstance;
    public static SelectUserClassTypeResponseProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public SelectUserClassTypeResponseProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.internal_static_proto_SelectUserClassTypeResponseProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.internal_static_proto_SelectUserClassTypeResponseProto_fieldAccessorTable;
    }
    
    public enum SelectUserClassTypeStatus
        implements com.google.protobuf.ProtocolMessageEnum {
      SUCCESS(0, 0),
      FAIL_WRONG_CLASS_TYPE(1, 1),
      FAIL_TOO_LOW_LEVEL(2, 2),
      FAIL_OTHER(3, 3),
      ;
      
      public static final int SUCCESS_VALUE = 0;
      public static final int FAIL_WRONG_CLASS_TYPE_VALUE = 1;
      public static final int FAIL_TOO_LOW_LEVEL_VALUE = 2;
      public static final int FAIL_OTHER_VALUE = 3;
      
      
      public final int getNumber() { return value; }
      
      public static SelectUserClassTypeStatus valueOf(int value) {
        switch (value) {
          case 0: return SUCCESS;
          case 1: return FAIL_WRONG_CLASS_TYPE;
          case 2: return FAIL_TOO_LOW_LEVEL;
          case 3: return FAIL_OTHER;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<SelectUserClassTypeStatus>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<SelectUserClassTypeStatus>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<SelectUserClassTypeStatus>() {
              public SelectUserClassTypeStatus findValueByNumber(int number) {
                return SelectUserClassTypeStatus.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final SelectUserClassTypeStatus[] VALUES = {
        SUCCESS, FAIL_WRONG_CLASS_TYPE, FAIL_TOO_LOW_LEVEL, FAIL_OTHER, 
      };
      
      public static SelectUserClassTypeStatus valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private SelectUserClassTypeStatus(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:proto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus)
    }
    
    private int bitField0_;
    // optional .proto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus status = 2;
    public static final int STATUS_FIELD_NUMBER = 2;
    private com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus status_;
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus getStatus() {
      return status_;
    }
    
    private void initFields() {
      status_ = com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus.SUCCESS;
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
        output.writeEnum(2, status_.getNumber());
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
          .computeEnumSize(2, status_.getNumber());
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
    
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseDelimitedFrom(
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
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto prototype) {
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
       implements com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.internal_static_proto_SelectUserClassTypeResponseProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.internal_static_proto_SelectUserClassTypeResponseProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.newBuilder()
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
        status_ = com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus.SUCCESS;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto build() {
        com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto buildPartial() {
        com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto result = new com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.status_ = status_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto) {
          return mergeFrom((com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto other) {
        if (other == com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.getDefaultInstance()) return this;
        if (other.hasStatus()) {
          setStatus(other.getStatus());
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
            case 16: {
              int rawValue = input.readEnum();
              com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus value = com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                status_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional .proto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus status = 2;
      private com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus status_ = com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus.SUCCESS;
      public boolean hasStatus() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus getStatus() {
        return status_;
      }
      public Builder setStatus(com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        status_ = value;
        onChanged();
        return this;
      }
      public Builder clearStatus() {
        bitField0_ = (bitField0_ & ~0x00000001);
        status_ = com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.SelectUserClassTypeStatus.SUCCESS;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:proto.SelectUserClassTypeResponseProto)
    }
    
    static {
      defaultInstance = new SelectUserClassTypeResponseProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.SelectUserClassTypeResponseProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_SelectUserClassTypeRequestProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_SelectUserClassTypeRequestProto_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_SelectUserClassTypeResponseProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_SelectUserClassTypeResponseProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036SelectUserClassTypeEvent.proto\022\005proto\032" +
      "\017ClassType.proto\"F\n\037SelectUserClassTypeR" +
      "equestProto\022#\n\tclassType\030\002 \001(\0162\020.proto.C" +
      "lassType\"\342\001\n SelectUserClassTypeResponse" +
      "Proto\022Q\n\006status\030\002 \001(\0162A.proto.SelectUser" +
      "ClassTypeResponseProto.SelectUserClassTy" +
      "peStatus\"k\n\031SelectUserClassTypeStatus\022\013\n" +
      "\007SUCCESS\020\000\022\031\n\025FAIL_WRONG_CLASS_TYPE\020\001\022\026\n" +
      "\022FAIL_TOO_LOW_LEVEL\020\002\022\016\n\nFAIL_OTHER\020\003B:\n" +
      "\031com.lvl6.aoc2.eventprotosB\035SelectUserCl",
      "assTypeEventProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_SelectUserClassTypeRequestProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_SelectUserClassTypeRequestProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_SelectUserClassTypeRequestProto_descriptor,
              new java.lang.String[] { "ClassType", },
              com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto.class,
              com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeRequestProto.Builder.class);
          internal_static_proto_SelectUserClassTypeResponseProto_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_proto_SelectUserClassTypeResponseProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_SelectUserClassTypeResponseProto_descriptor,
              new java.lang.String[] { "Status", },
              com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.class,
              com.lvl6.aoc2.eventprotos.SelectUserClassTypeEventProto.SelectUserClassTypeResponseProto.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.lvl6.aoc2.noneventprotos.ClassEnum.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
