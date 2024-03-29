// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EquipmentProto.proto

package com.lvl6.aoc2.noneventprotos;

public final class Equipment {
  private Equipment() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EquipmentProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string equipID = 1;
    boolean hasEquipID();
    String getEquipID();
    
    // optional int32 level = 2;
    boolean hasLevel();
    int getLevel();
    
    // required .proto.EquipmentType type = 3;
    boolean hasType();
    com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType getType();
    
    // optional int32 durability = 4;
    boolean hasDurability();
    int getDurability();
    
    // optional int32 attack = 5;
    boolean hasAttack();
    int getAttack();
    
    // optional int32 defense = 6;
    boolean hasDefense();
    int getDefense();
    
    // optional int32 addHealth = 7;
    boolean hasAddHealth();
    int getAddHealth();
    
    // optional int32 addMana = 8;
    boolean hasAddMana();
    int getAddMana();
    
    // optional string name = 9;
    boolean hasName();
    String getName();
    
    // required .proto.RarityType rarity = 10;
    boolean hasRarity();
    com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType getRarity();
  }
  public static final class EquipmentProto extends
      com.google.protobuf.GeneratedMessage
      implements EquipmentProtoOrBuilder {
    // Use EquipmentProto.newBuilder() to construct.
    private EquipmentProto(Builder builder) {
      super(builder);
    }
    private EquipmentProto(boolean noInit) {}
    
    private static final EquipmentProto defaultInstance;
    public static EquipmentProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public EquipmentProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.noneventprotos.Equipment.internal_static_proto_EquipmentProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.noneventprotos.Equipment.internal_static_proto_EquipmentProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string equipID = 1;
    public static final int EQUIPID_FIELD_NUMBER = 1;
    private java.lang.Object equipID_;
    public boolean hasEquipID() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getEquipID() {
      java.lang.Object ref = equipID_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          equipID_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getEquipIDBytes() {
      java.lang.Object ref = equipID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        equipID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 level = 2;
    public static final int LEVEL_FIELD_NUMBER = 2;
    private int level_;
    public boolean hasLevel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getLevel() {
      return level_;
    }
    
    // required .proto.EquipmentType type = 3;
    public static final int TYPE_FIELD_NUMBER = 3;
    private com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType type_;
    public boolean hasType() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType getType() {
      return type_;
    }
    
    // optional int32 durability = 4;
    public static final int DURABILITY_FIELD_NUMBER = 4;
    private int durability_;
    public boolean hasDurability() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public int getDurability() {
      return durability_;
    }
    
    // optional int32 attack = 5;
    public static final int ATTACK_FIELD_NUMBER = 5;
    private int attack_;
    public boolean hasAttack() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    public int getAttack() {
      return attack_;
    }
    
    // optional int32 defense = 6;
    public static final int DEFENSE_FIELD_NUMBER = 6;
    private int defense_;
    public boolean hasDefense() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    public int getDefense() {
      return defense_;
    }
    
    // optional int32 addHealth = 7;
    public static final int ADDHEALTH_FIELD_NUMBER = 7;
    private int addHealth_;
    public boolean hasAddHealth() {
      return ((bitField0_ & 0x00000040) == 0x00000040);
    }
    public int getAddHealth() {
      return addHealth_;
    }
    
    // optional int32 addMana = 8;
    public static final int ADDMANA_FIELD_NUMBER = 8;
    private int addMana_;
    public boolean hasAddMana() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    public int getAddMana() {
      return addMana_;
    }
    
    // optional string name = 9;
    public static final int NAME_FIELD_NUMBER = 9;
    private java.lang.Object name_;
    public boolean hasName() {
      return ((bitField0_ & 0x00000100) == 0x00000100);
    }
    public String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          name_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // required .proto.RarityType rarity = 10;
    public static final int RARITY_FIELD_NUMBER = 10;
    private com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType rarity_;
    public boolean hasRarity() {
      return ((bitField0_ & 0x00000200) == 0x00000200);
    }
    public com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType getRarity() {
      return rarity_;
    }
    
    private void initFields() {
      equipID_ = "";
      level_ = 0;
      type_ = com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType.WEAPON;
      durability_ = 0;
      attack_ = 0;
      defense_ = 0;
      addHealth_ = 0;
      addMana_ = 0;
      name_ = "";
      rarity_ = com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType.COMMON;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasRarity()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getEquipIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, level_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeEnum(3, type_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeInt32(4, durability_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeInt32(5, attack_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        output.writeInt32(6, defense_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        output.writeInt32(7, addHealth_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        output.writeInt32(8, addMana_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        output.writeBytes(9, getNameBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        output.writeEnum(10, rarity_.getNumber());
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
          .computeBytesSize(1, getEquipIDBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, level_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_.getNumber());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, durability_);
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, attack_);
      }
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, defense_);
      }
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, addHealth_);
      }
      if (((bitField0_ & 0x00000080) == 0x00000080)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, addMana_);
      }
      if (((bitField0_ & 0x00000100) == 0x00000100)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(9, getNameBytes());
      }
      if (((bitField0_ & 0x00000200) == 0x00000200)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, rarity_.getNumber());
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
    
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseDelimitedFrom(
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
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto prototype) {
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
       implements com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.noneventprotos.Equipment.internal_static_proto_EquipmentProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.noneventprotos.Equipment.internal_static_proto_EquipmentProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto.newBuilder()
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
        equipID_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        level_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType.WEAPON;
        bitField0_ = (bitField0_ & ~0x00000004);
        durability_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        attack_ = 0;
        bitField0_ = (bitField0_ & ~0x00000010);
        defense_ = 0;
        bitField0_ = (bitField0_ & ~0x00000020);
        addHealth_ = 0;
        bitField0_ = (bitField0_ & ~0x00000040);
        addMana_ = 0;
        bitField0_ = (bitField0_ & ~0x00000080);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000100);
        rarity_ = com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType.COMMON;
        bitField0_ = (bitField0_ & ~0x00000200);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto build() {
        com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto buildPartial() {
        com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto result = new com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.equipID_ = equipID_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.level_ = level_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.durability_ = durability_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.attack_ = attack_;
        if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
          to_bitField0_ |= 0x00000020;
        }
        result.defense_ = defense_;
        if (((from_bitField0_ & 0x00000040) == 0x00000040)) {
          to_bitField0_ |= 0x00000040;
        }
        result.addHealth_ = addHealth_;
        if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
          to_bitField0_ |= 0x00000080;
        }
        result.addMana_ = addMana_;
        if (((from_bitField0_ & 0x00000100) == 0x00000100)) {
          to_bitField0_ |= 0x00000100;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000200) == 0x00000200)) {
          to_bitField0_ |= 0x00000200;
        }
        result.rarity_ = rarity_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto) {
          return mergeFrom((com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto other) {
        if (other == com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto.getDefaultInstance()) return this;
        if (other.hasEquipID()) {
          setEquipID(other.getEquipID());
        }
        if (other.hasLevel()) {
          setLevel(other.getLevel());
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasDurability()) {
          setDurability(other.getDurability());
        }
        if (other.hasAttack()) {
          setAttack(other.getAttack());
        }
        if (other.hasDefense()) {
          setDefense(other.getDefense());
        }
        if (other.hasAddHealth()) {
          setAddHealth(other.getAddHealth());
        }
        if (other.hasAddMana()) {
          setAddMana(other.getAddMana());
        }
        if (other.hasName()) {
          setName(other.getName());
        }
        if (other.hasRarity()) {
          setRarity(other.getRarity());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        if (!hasRarity()) {
          
          return false;
        }
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
              bitField0_ |= 0x00000001;
              equipID_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              level_ = input.readInt32();
              break;
            }
            case 24: {
              int rawValue = input.readEnum();
              com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType value = com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(3, rawValue);
              } else {
                bitField0_ |= 0x00000004;
                type_ = value;
              }
              break;
            }
            case 32: {
              bitField0_ |= 0x00000008;
              durability_ = input.readInt32();
              break;
            }
            case 40: {
              bitField0_ |= 0x00000010;
              attack_ = input.readInt32();
              break;
            }
            case 48: {
              bitField0_ |= 0x00000020;
              defense_ = input.readInt32();
              break;
            }
            case 56: {
              bitField0_ |= 0x00000040;
              addHealth_ = input.readInt32();
              break;
            }
            case 64: {
              bitField0_ |= 0x00000080;
              addMana_ = input.readInt32();
              break;
            }
            case 74: {
              bitField0_ |= 0x00000100;
              name_ = input.readBytes();
              break;
            }
            case 80: {
              int rawValue = input.readEnum();
              com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType value = com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(10, rawValue);
              } else {
                bitField0_ |= 0x00000200;
                rarity_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string equipID = 1;
      private java.lang.Object equipID_ = "";
      public boolean hasEquipID() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getEquipID() {
        java.lang.Object ref = equipID_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          equipID_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setEquipID(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        equipID_ = value;
        onChanged();
        return this;
      }
      public Builder clearEquipID() {
        bitField0_ = (bitField0_ & ~0x00000001);
        equipID_ = getDefaultInstance().getEquipID();
        onChanged();
        return this;
      }
      void setEquipID(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        equipID_ = value;
        onChanged();
      }
      
      // optional int32 level = 2;
      private int level_ ;
      public boolean hasLevel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getLevel() {
        return level_;
      }
      public Builder setLevel(int value) {
        bitField0_ |= 0x00000002;
        level_ = value;
        onChanged();
        return this;
      }
      public Builder clearLevel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        level_ = 0;
        onChanged();
        return this;
      }
      
      // required .proto.EquipmentType type = 3;
      private com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType type_ = com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType.WEAPON;
      public boolean hasType() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType getType() {
        return type_;
      }
      public Builder setType(com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        type_ = value;
        onChanged();
        return this;
      }
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        type_ = com.lvl6.aoc2.noneventprotos.EquipmentEnum.EquipmentType.WEAPON;
        onChanged();
        return this;
      }
      
      // optional int32 durability = 4;
      private int durability_ ;
      public boolean hasDurability() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public int getDurability() {
        return durability_;
      }
      public Builder setDurability(int value) {
        bitField0_ |= 0x00000008;
        durability_ = value;
        onChanged();
        return this;
      }
      public Builder clearDurability() {
        bitField0_ = (bitField0_ & ~0x00000008);
        durability_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 attack = 5;
      private int attack_ ;
      public boolean hasAttack() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      public int getAttack() {
        return attack_;
      }
      public Builder setAttack(int value) {
        bitField0_ |= 0x00000010;
        attack_ = value;
        onChanged();
        return this;
      }
      public Builder clearAttack() {
        bitField0_ = (bitField0_ & ~0x00000010);
        attack_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 defense = 6;
      private int defense_ ;
      public boolean hasDefense() {
        return ((bitField0_ & 0x00000020) == 0x00000020);
      }
      public int getDefense() {
        return defense_;
      }
      public Builder setDefense(int value) {
        bitField0_ |= 0x00000020;
        defense_ = value;
        onChanged();
        return this;
      }
      public Builder clearDefense() {
        bitField0_ = (bitField0_ & ~0x00000020);
        defense_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 addHealth = 7;
      private int addHealth_ ;
      public boolean hasAddHealth() {
        return ((bitField0_ & 0x00000040) == 0x00000040);
      }
      public int getAddHealth() {
        return addHealth_;
      }
      public Builder setAddHealth(int value) {
        bitField0_ |= 0x00000040;
        addHealth_ = value;
        onChanged();
        return this;
      }
      public Builder clearAddHealth() {
        bitField0_ = (bitField0_ & ~0x00000040);
        addHealth_ = 0;
        onChanged();
        return this;
      }
      
      // optional int32 addMana = 8;
      private int addMana_ ;
      public boolean hasAddMana() {
        return ((bitField0_ & 0x00000080) == 0x00000080);
      }
      public int getAddMana() {
        return addMana_;
      }
      public Builder setAddMana(int value) {
        bitField0_ |= 0x00000080;
        addMana_ = value;
        onChanged();
        return this;
      }
      public Builder clearAddMana() {
        bitField0_ = (bitField0_ & ~0x00000080);
        addMana_ = 0;
        onChanged();
        return this;
      }
      
      // optional string name = 9;
      private java.lang.Object name_ = "";
      public boolean hasName() {
        return ((bitField0_ & 0x00000100) == 0x00000100);
      }
      public String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          name_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000100;
        name_ = value;
        onChanged();
        return this;
      }
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000100);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      void setName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000100;
        name_ = value;
        onChanged();
      }
      
      // required .proto.RarityType rarity = 10;
      private com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType rarity_ = com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType.COMMON;
      public boolean hasRarity() {
        return ((bitField0_ & 0x00000200) == 0x00000200);
      }
      public com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType getRarity() {
        return rarity_;
      }
      public Builder setRarity(com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000200;
        rarity_ = value;
        onChanged();
        return this;
      }
      public Builder clearRarity() {
        bitField0_ = (bitField0_ & ~0x00000200);
        rarity_ = com.lvl6.aoc2.noneventprotos.RarityEnum.RarityType.COMMON;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:proto.EquipmentProto)
    }
    
    static {
      defaultInstance = new EquipmentProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.EquipmentProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_EquipmentProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_EquipmentProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024EquipmentProto.proto\022\005proto\032\020RarityTyp" +
      "e.proto\032\023EquipmentType.proto\"\336\001\n\016Equipme" +
      "ntProto\022\017\n\007equipID\030\001 \001(\t\022\r\n\005level\030\002 \001(\005\022" +
      "\"\n\004type\030\003 \002(\0162\024.proto.EquipmentType\022\022\n\nd" +
      "urability\030\004 \001(\005\022\016\n\006attack\030\005 \001(\005\022\017\n\007defen" +
      "se\030\006 \001(\005\022\021\n\taddHealth\030\007 \001(\005\022\017\n\007addMana\030\010" +
      " \001(\005\022\014\n\004name\030\t \001(\t\022!\n\006rarity\030\n \002(\0162\021.pro" +
      "to.RarityTypeB)\n\034com.lvl6.aoc2.noneventp" +
      "rotosB\tEquipment"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_EquipmentProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_EquipmentProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_EquipmentProto_descriptor,
              new java.lang.String[] { "EquipID", "Level", "Type", "Durability", "Attack", "Defense", "AddHealth", "AddMana", "Name", "Rarity", },
              com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto.class,
              com.lvl6.aoc2.noneventprotos.Equipment.EquipmentProto.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.lvl6.aoc2.noneventprotos.RarityEnum.getDescriptor(),
          com.lvl6.aoc2.noneventprotos.EquipmentEnum.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
