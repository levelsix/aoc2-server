// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ItemProto.proto

package com.lvl6.aoc2.noneventprotos;

public final class Item {
  private Item() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum itemType
      implements com.google.protobuf.ProtocolMessageEnum {
    QUEST_ITEMS(0, 0),
    FIRST_RELEASED_KEY(1, 1),
    ;
    
    public static final int QUEST_ITEMS_VALUE = 0;
    public static final int FIRST_RELEASED_KEY_VALUE = 1;
    
    
    public final int getNumber() { return value; }
    
    public static itemType valueOf(int value) {
      switch (value) {
        case 0: return QUEST_ITEMS;
        case 1: return FIRST_RELEASED_KEY;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<itemType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<itemType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<itemType>() {
            public itemType findValueByNumber(int number) {
              return itemType.valueOf(number);
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
      return com.lvl6.aoc2.noneventprotos.Item.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final itemType[] VALUES = {
      QUEST_ITEMS, FIRST_RELEASED_KEY, 
    };
    
    public static itemType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private itemType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:proto.itemType)
  }
  
  public interface ItemProtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string itemName = 1;
    boolean hasItemName();
    String getItemName();
    
    // optional int32 itemType = 2;
    boolean hasItemType();
    int getItemType();
  }
  public static final class ItemProto extends
      com.google.protobuf.GeneratedMessage
      implements ItemProtoOrBuilder {
    // Use ItemProto.newBuilder() to construct.
    private ItemProto(Builder builder) {
      super(builder);
    }
    private ItemProto(boolean noInit) {}
    
    private static final ItemProto defaultInstance;
    public static ItemProto getDefaultInstance() {
      return defaultInstance;
    }
    
    public ItemProto getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lvl6.aoc2.noneventprotos.Item.internal_static_proto_ItemProto_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lvl6.aoc2.noneventprotos.Item.internal_static_proto_ItemProto_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string itemName = 1;
    public static final int ITEMNAME_FIELD_NUMBER = 1;
    private java.lang.Object itemName_;
    public boolean hasItemName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getItemName() {
      java.lang.Object ref = itemName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          itemName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getItemNameBytes() {
      java.lang.Object ref = itemName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        itemName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional int32 itemType = 2;
    public static final int ITEMTYPE_FIELD_NUMBER = 2;
    private int itemType_;
    public boolean hasItemType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public int getItemType() {
      return itemType_;
    }
    
    private void initFields() {
      itemName_ = "";
      itemType_ = 0;
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
        output.writeBytes(1, getItemNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, itemType_);
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
          .computeBytesSize(1, getItemNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, itemType_);
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
    
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseDelimitedFrom(
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
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static com.lvl6.aoc2.noneventprotos.Item.ItemProto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.lvl6.aoc2.noneventprotos.Item.ItemProto prototype) {
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
       implements com.lvl6.aoc2.noneventprotos.Item.ItemProtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.lvl6.aoc2.noneventprotos.Item.internal_static_proto_ItemProto_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.lvl6.aoc2.noneventprotos.Item.internal_static_proto_ItemProto_fieldAccessorTable;
      }
      
      // Construct using com.lvl6.aoc2.noneventprotos.Item.ItemProto.newBuilder()
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
        itemName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        itemType_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.lvl6.aoc2.noneventprotos.Item.ItemProto.getDescriptor();
      }
      
      public com.lvl6.aoc2.noneventprotos.Item.ItemProto getDefaultInstanceForType() {
        return com.lvl6.aoc2.noneventprotos.Item.ItemProto.getDefaultInstance();
      }
      
      public com.lvl6.aoc2.noneventprotos.Item.ItemProto build() {
        com.lvl6.aoc2.noneventprotos.Item.ItemProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private com.lvl6.aoc2.noneventprotos.Item.ItemProto buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        com.lvl6.aoc2.noneventprotos.Item.ItemProto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public com.lvl6.aoc2.noneventprotos.Item.ItemProto buildPartial() {
        com.lvl6.aoc2.noneventprotos.Item.ItemProto result = new com.lvl6.aoc2.noneventprotos.Item.ItemProto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.itemName_ = itemName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.itemType_ = itemType_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.lvl6.aoc2.noneventprotos.Item.ItemProto) {
          return mergeFrom((com.lvl6.aoc2.noneventprotos.Item.ItemProto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(com.lvl6.aoc2.noneventprotos.Item.ItemProto other) {
        if (other == com.lvl6.aoc2.noneventprotos.Item.ItemProto.getDefaultInstance()) return this;
        if (other.hasItemName()) {
          setItemName(other.getItemName());
        }
        if (other.hasItemType()) {
          setItemType(other.getItemType());
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
              bitField0_ |= 0x00000001;
              itemName_ = input.readBytes();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              itemType_ = input.readInt32();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string itemName = 1;
      private java.lang.Object itemName_ = "";
      public boolean hasItemName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getItemName() {
        java.lang.Object ref = itemName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          itemName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setItemName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        itemName_ = value;
        onChanged();
        return this;
      }
      public Builder clearItemName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        itemName_ = getDefaultInstance().getItemName();
        onChanged();
        return this;
      }
      void setItemName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        itemName_ = value;
        onChanged();
      }
      
      // optional int32 itemType = 2;
      private int itemType_ ;
      public boolean hasItemType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public int getItemType() {
        return itemType_;
      }
      public Builder setItemType(int value) {
        bitField0_ |= 0x00000002;
        itemType_ = value;
        onChanged();
        return this;
      }
      public Builder clearItemType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        itemType_ = 0;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:proto.ItemProto)
    }
    
    static {
      defaultInstance = new ItemProto(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:proto.ItemProto)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_ItemProto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_proto_ItemProto_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017ItemProto.proto\022\005proto\"/\n\tItemProto\022\020\n" +
      "\010itemName\030\001 \001(\t\022\020\n\010itemType\030\002 \001(\005*3\n\010ite" +
      "mType\022\017\n\013QUEST_ITEMS\020\000\022\026\n\022FIRST_RELEASED" +
      "_KEY\020\001B$\n\034com.lvl6.aoc2.noneventprotosB\004" +
      "Item"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_proto_ItemProto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_proto_ItemProto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_proto_ItemProto_descriptor,
              new java.lang.String[] { "ItemName", "ItemType", },
              com.lvl6.aoc2.noneventprotos.Item.ItemProto.class,
              com.lvl6.aoc2.noneventprotos.Item.ItemProto.Builder.class);
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
