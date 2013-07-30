// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ResourceType.proto

package com.lvl6.aoc2.noneventprotos;

public final class ResourceEnum {
  private ResourceEnum() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum ResourceType
      implements com.google.protobuf.ProtocolMessageEnum {
    GOLD(0, 0),
    TONIC(1, 1),
    GEMS(2, 2),
    ;
    
    public static final int GOLD_VALUE = 0;
    public static final int TONIC_VALUE = 1;
    public static final int GEMS_VALUE = 2;
    
    
    public final int getNumber() { return value; }
    
    public static ResourceType valueOf(int value) {
      switch (value) {
        case 0: return GOLD;
        case 1: return TONIC;
        case 2: return GEMS;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<ResourceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<ResourceType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ResourceType>() {
            public ResourceType findValueByNumber(int number) {
              return ResourceType.valueOf(number);
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
      return com.lvl6.aoc2.noneventprotos.ResourceEnum.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final ResourceType[] VALUES = {
      GOLD, TONIC, GEMS, 
    };
    
    public static ResourceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private ResourceType(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:proto.ResourceType)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022ResourceType.proto\022\005proto*-\n\014ResourceT" +
      "ype\022\010\n\004GOLD\020\000\022\t\n\005TONIC\020\001\022\010\n\004GEMS\020\002B,\n\034co" +
      "m.lvl6.aoc2.noneventprotosB\014ResourceEnum"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
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
