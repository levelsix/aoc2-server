// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UserSpellProto.proto

package com.lvl6.aoc2.proto;

public final class UserSpell {
  private UserSpell() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserSpellProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional int32 userID = 1;
    boolean hasUserID();
    int getUserID();
    
    // optional int32 spellID = 2;
    boolean hasSpellID();
    int getSpellID();
    
    // optional int32 level = 3;
    boolean hasLevel();
    int getLevel();
  }
  public static final class UserSpellProto extends
      com.google.protobuf.GeneratedMessage
      implements UserSpellProtoOrBuilder {
    // Use UserSpellProto.newBuilder() to construct.
    private UserSpellProto(Builder builder) {
      super(builder);
    }
    private UserSpellProto(boolean noInit) {}
    
    private static final UserSpellProto defaultInstance;
    public static UserSpellProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public UserSpellProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.proto.UserSpell.internal_static_com_lvl6_aoc2_proto_UserSpellProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.proto.UserSpell.internal_static_com_lvl6_aoc2_proto_UserSpellProto_fieldAccessorTable;
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
    
    // optional int32 spellID = 2;
    public static final int SPELLID_FIELD_NUMBER = 2;
    private int spellID_;
    public boolean hasSpellID() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getSpellID() {
      return spellID_;
    }
    
    // optional int32 level = 3;
    public static final int LEVEL_FIELD_NUMBER = 3;
    private int level_;
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public int getLevel() {
      return level_;
    }
    
    private void initFields() {
      userID_ = 0;
      spellID_ = 0;
      level_ = 0;
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
        output.writeInt32(2, spellID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, level_);
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
          .computeInt32Size(2, spellID_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, level_);
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
    
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseDelimitedFrom(
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
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.proto.UserSpell.UserSpellProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.proto.UserSpell.UserSpellProto prototype) {
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
       implements com.lvl6.aoc2.proto.UserSpell.UserSpellProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.proto.UserSpell.internal_static_com_lvl6_aoc2_proto_UserSpellProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.proto.UserSpell.internal_static_com_lvl6_aoc2_proto_UserSpellProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.proto.UserSpell.UserSpellProto.newBuilder()
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
        spellID_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.proto.UserSpell.UserSpellProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.proto.UserSpell.UserSpellProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.proto.UserSpell.UserSpellProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.proto.UserSpell.UserSpellProto build() {
        com.lvl6.aoc2.proto.UserSpell.UserSpellProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.proto.UserSpell.UserSpellProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.proto.UserSpell.UserSpellProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.proto.UserSpell.UserSpellProto buildPartial() {
        com.lvl6.aoc2.proto.UserSpell.UserSpellProto result = new com.lvl6.aoc2.proto.UserSpell.UserSpellProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.userID_ = userID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.spellID_ = spellID_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.level_ = level_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.proto.UserSpell.UserSpellProto) {
          return mergeFrom((com.lvl6.aoc2.proto.UserSpell.UserSpellProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.proto.UserSpell.UserSpellProto other) {
        if (other == com.lvl6.aoc2.proto.UserSpell.UserSpellProto.getDefaultInstance()) return this;
        if (other.hasUserID()) {
          setUserID(other.getUserID());
        }
        if (other.hasSpellID()) {
          setSpellID(other.getSpellID());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
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
              spellID_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              level_ = input.readInt32();
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
      
      // optional int32 spellID = 2;
      private int spellID_ ;
      public boolean hasSpellID() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getSpellID() {
        return spellID_;
      }
      public Builder setSpellID(int value) {
        bitField0_ |= 0x00000002;
        spellID_ = value;
        onChanged();
        return this;
      }
      public Builder clearSpellID() {
        bitField0_ = (bitField0_ & ~0x00000002);
        spellID_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 level = 3;
      private int level_ ;
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public int getLevel() {
        return level_;
      }
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000004;
        level_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000004);
        level_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:com.lvl6.aoc2.proto.UserSpellProto)
    }
    
    static {
      defaultInstance = new UserSpellProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:com.lvl6.aoc2.proto.UserSpellProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_lvl6_aoc2_proto_UserSpellProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_lvl6_aoc2_proto_UserSpellProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024UserSpellProto.proto\022\023com.lvl6.aoc2.pr" +
      "oto\"@\n\016UserSpellProto\022\016\n\006userID\030\001 \001(\005\022\017\n" +
      "\007spellID\030\002 \001(\005\022\r\n\005level\030\003 \001(\005B\013B\tUserSpe" +
      "ll"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_lvl6_aoc2_proto_UserSpellProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_lvl6_aoc2_proto_UserSpellProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_lvl6_aoc2_proto_UserSpellProto_descriptor,
              new java.lang.String[] { "UserID", "SpellID", "Level", },
              com.lvl6.aoc2.proto.UserSpell.UserSpellProto.class,
              com.lvl6.aoc2.proto.UserSpell.UserSpellProto.Builder.class);
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
