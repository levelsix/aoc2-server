// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserEquipmentProto.proto

package com.lvl6.aoc2.noneventprotos;

public final class UserEquipment {
  private UserEquipment() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserEquipmentProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 userID = 1;
    boolean hasUserID();
    int getUserID();
    
    // optional int32 equipID = 2;
    boolean hasEquipID();
    int getEquipID();
    
    // optional int32 equipLevel = 3;
    boolean hasEquipLevel();
    int getEquipLevel();
    
    // optional int32 currDurability = 4;
    boolean hasCurrDurability();
    int getCurrDurability();
    
    // optional bool equipped = 5;
    boolean hasEquipped();
    boolean getEquipped();
  }
  public static final class UserEquipmentProto extends
      com.google.protobuf.GeneratedMessage
      implements UserEquipmentProtoOrBuilder {
    // Use UserEquipmentProto.newBuilder() to construct.
    private UserEquipmentProto(Builder builder) {
      super(builder);
    }
    private UserEquipmentProto(boolean noInit) {}
    
    private static final UserEquipmentProto defaultInstance;
    public static UserEquipmentProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public UserEquipmentProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.noneventprotos.UserEquipment.internal_static_proto_UserEquipmentProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.noneventprotos.UserEquipment.internal_static_proto_UserEquipmentProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional int32 userID = 1;
    public static final int USERID_FIELD_NUMBER = 1;
    private int userID_;
    public boolean hasUserID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public int getUserID() {
      return userID_;
    }
    
    // optional int32 equipID = 2;
    public static final int EQUIPID_FIELD_NUMBER = 2;
    private int equipID_;
    public boolean hasEquipID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getEquipID() {
      return equipID_;
    }
    
    // optional int32 equipLevel = 3;
    public static final int EQUIPLEVEL_FIELD_NUMBER = 3;
    private int equipLevel_;
    public boolean hasEquipLevel() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getEquipLevel() {
      return equipLevel_;
    }
    
    // optional int32 currDurability = 4;
    public static final int CURRDURABILITY_FIELD_NUMBER = 4;
    private int currDurability_;
    public boolean hasCurrDurability() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getCurrDurability() {
      return currDurability_;
    }
    
    // optional bool equipped = 5;
    public static final int EQUIPPED_FIELD_NUMBER = 5;
    private boolean equipped_;
    public boolean hasEquipped() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public boolean getEquipped() {
      return equipped_;
    }
    
    private void initFields() {
      userID_ = 0;
      equipID_ = 0;
      equipLevel_ = 0;
      currDurability_ = 0;
      equipped_ = false;
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
        output.writeInt32(1, userID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, equipID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, equipLevel_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, currDurability_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBool(5, equipped_);
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
          .computeInt32Size(1, userID_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, equipID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, equipLevel_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, currDurability_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, equipped_);
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
    
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseDelimitedFrom(
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
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto prototype) {
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
       implements com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.noneventprotos.UserEquipment.internal_static_proto_UserEquipmentProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.noneventprotos.UserEquipment.internal_static_proto_UserEquipmentProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto.newBuilder()
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
        userID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        equipID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        equipLevel_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        currDurability_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        equipped_ = false;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto build() {
        com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto buildPartial() {
        com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto result = new com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userID_ = userID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.equipID_ = equipID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.equipLevel_ = equipLevel_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.currDurability_ = currDurability_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.equipped_ = equipped_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto) {
          return mergeFrom((com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto other) {
        if (other == com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto.getDefaultInstance()) return this;
        if (other.hasUserID()) {
          setUserID(other.getUserID());
        }
        if (other.hasEquipID()) {
          setEquipID(other.getEquipID());
        }
        if (other.hasEquipLevel()) {
          setEquipLevel(other.getEquipLevel());
        }
        if (other.hasCurrDurability()) {
          setCurrDurability(other.getCurrDurability());
        }
        if (other.hasEquipped()) {
          setEquipped(other.getEquipped());
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
              userID_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              equipID_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              equipLevel_ = input.readInt32();
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              currDurability_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              equipped_ = input.readBool();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional int32 userID = 1;
      private int userID_ ;
      public boolean hasUserID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public int getUserID() {
        return userID_;
      }
      public Builder setUserID(int value) {
        bitField0_ |= 0x00000001;
        userID_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        userID_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 equipID = 2;
      private int equipID_ ;
      public boolean hasEquipID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getEquipID() {
        return equipID_;
      }
      public Builder setEquipID(int value) {
        bitField0_ |= 0x00000002;
        equipID_ = value;
        onChanged();
        return this;
      }
      public Builder clearEquipID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        equipID_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 equipLevel = 3;
      private int equipLevel_ ;
      public boolean hasEquipLevel() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getEquipLevel() {
        return equipLevel_;
      }
      public Builder setEquipLevel(int value) {
        bitField0_ |= 0x00000004;
        equipLevel_ = value;
        onChanged();
        return this;
      }
      public Builder clearEquipLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        equipLevel_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 currDurability = 4;
      private int currDurability_ ;
      public boolean hasCurrDurability() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getCurrDurability() {
        return currDurability_;
      }
      public Builder setCurrDurability(int value) {
        bitField0_ |= 0x00000008;
        currDurability_ = value;
        onChanged();
        return this;
      }
      public Builder clearCurrDurability() {
        bitField0_ = (bitField0_ & ~0x00000008);
        currDurability_ = 0;
        onChanged();
        return this;
      }
      
      // optional bool equipped = 5;
      private boolean equipped_ ;
      public boolean hasEquipped() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public boolean getEquipped() {
        return equipped_;
      }
      public Builder setEquipped(boolean value) {
        bitField0_ |= 0x00000010;
        equipped_ = value;
        onChanged();
        return this;
      }
      public Builder clearEquipped() {
        bitField0_ = (bitField0_ & ~0x00000010);
        equipped_ = false;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:proto.UserEquipmentProto)
    }
    
    static {
      defaultInstance = new UserEquipmentProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.UserEquipmentProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_UserEquipmentProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_UserEquipmentProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030UserEquipmentProto.proto\022\005proto\"s\n\022Use" +
      "rEquipmentProto\022\016\n\006userID\030\001 \001(\005\022\017\n\007equip" +
      "ID\030\002 \001(\005\022\022\n\nequipLevel\030\003 \001(\005\022\026\n\016currDura" +
      "bility\030\004 \001(\005\022\020\n\010equipped\030\005 \001(\010B-\n\034com.lv" +
      "l6.aoc2.noneventprotosB\rUserEquipment"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_UserEquipmentProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_UserEquipmentProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_UserEquipmentProto_descriptor,
              new java.lang.String[] { "UserID", "EquipID", "EquipLevel", "CurrDurability", "Equipped", },
              com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto.class,
              com.lvl6.aoc2.noneventprotos.UserEquipment.UserEquipmentProto.Builder.class);
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
