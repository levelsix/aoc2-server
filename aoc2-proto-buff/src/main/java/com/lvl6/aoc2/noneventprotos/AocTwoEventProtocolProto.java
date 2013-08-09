// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AocTwoEventProtocol.proto

package com.lvl6.aoc2.noneventprotos;

public final class AocTwoEventProtocolProto {
  private AocTwoEventProtocolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public enum AocTwoEventProtocolRequest
      implements com.google.protobuf.ProtocolMessageEnum {
    C_TRAIN_OR_UPGRADE_SPELL_EVENT(0, 0),
    C_BUILD_OR_UPGRADE_STRUCTURE_EVENT(1, 1),
    C_REFILL_HP_OR_MANA_WITH_CONSUMABLE_EVENT(2, 2),
    C_REPAIR_EQUIP_EVENT(3, 3),
    C_SELECT_USER_CLASS_TYPE_EVENT(4, 4),
    C_STARTUP_EVENT(5, 5),
    ;
    
    public static final int C_TRAIN_OR_UPGRADE_SPELL_EVENT_VALUE = 0;
    public static final int C_BUILD_OR_UPGRADE_STRUCTURE_EVENT_VALUE = 1;
    public static final int C_REFILL_HP_OR_MANA_WITH_CONSUMABLE_EVENT_VALUE = 2;
    public static final int C_REPAIR_EQUIP_EVENT_VALUE = 3;
    public static final int C_SELECT_USER_CLASS_TYPE_EVENT_VALUE = 4;
    public static final int C_STARTUP_EVENT_VALUE = 5;
    
    
    public final int getNumber() { return value; }
    
    public static AocTwoEventProtocolRequest valueOf(int value) {
      switch (value) {
        case 0: return C_TRAIN_OR_UPGRADE_SPELL_EVENT;
        case 1: return C_BUILD_OR_UPGRADE_STRUCTURE_EVENT;
        case 2: return C_REFILL_HP_OR_MANA_WITH_CONSUMABLE_EVENT;
        case 3: return C_REPAIR_EQUIP_EVENT;
        case 4: return C_SELECT_USER_CLASS_TYPE_EVENT;
        case 5: return C_STARTUP_EVENT;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<AocTwoEventProtocolRequest>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<AocTwoEventProtocolRequest>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AocTwoEventProtocolRequest>() {
            public AocTwoEventProtocolRequest findValueByNumber(int number) {
              return AocTwoEventProtocolRequest.valueOf(number);
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
      return com.lvl6.aoc2.noneventprotos.AocTwoEventProtocolProto.getDescriptor().getEnumTypes().get(0);
    }
    
    private static final AocTwoEventProtocolRequest[] VALUES = {
      C_TRAIN_OR_UPGRADE_SPELL_EVENT, C_BUILD_OR_UPGRADE_STRUCTURE_EVENT, C_REFILL_HP_OR_MANA_WITH_CONSUMABLE_EVENT, C_REPAIR_EQUIP_EVENT, C_SELECT_USER_CLASS_TYPE_EVENT, C_STARTUP_EVENT, 
    };
    
    public static AocTwoEventProtocolRequest valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private AocTwoEventProtocolRequest(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:proto.AocTwoEventProtocolRequest)
  }
  
  public enum AocTwoEventProtocolResponse
      implements com.google.protobuf.ProtocolMessageEnum {
    S_TRAIN_OR_UPGRADE_SPELL_EVENT(0, 0),
    S_BUILD_OR_UPGRADE_STRUCTURE_EVENT(1, 1),
    S_REFILL_HP_OR_MANA_WITH_CONSUMABLE_EVENT(2, 2),
    S_REPAIR_EQUIP_EVENT(3, 3),
    S_SELECT_USER_CLASS_TYPE_EVENT(4, 4),
    S_STARTUP_EVENT(5, 5),
    ;
    
    public static final int S_TRAIN_OR_UPGRADE_SPELL_EVENT_VALUE = 0;
    public static final int S_BUILD_OR_UPGRADE_STRUCTURE_EVENT_VALUE = 1;
    public static final int S_REFILL_HP_OR_MANA_WITH_CONSUMABLE_EVENT_VALUE = 2;
    public static final int S_REPAIR_EQUIP_EVENT_VALUE = 3;
    public static final int S_SELECT_USER_CLASS_TYPE_EVENT_VALUE = 4;
    public static final int S_STARTUP_EVENT_VALUE = 5;
    
    
    public final int getNumber() { return value; }
    
    public static AocTwoEventProtocolResponse valueOf(int value) {
      switch (value) {
        case 0: return S_TRAIN_OR_UPGRADE_SPELL_EVENT;
        case 1: return S_BUILD_OR_UPGRADE_STRUCTURE_EVENT;
        case 2: return S_REFILL_HP_OR_MANA_WITH_CONSUMABLE_EVENT;
        case 3: return S_REPAIR_EQUIP_EVENT;
        case 4: return S_SELECT_USER_CLASS_TYPE_EVENT;
        case 5: return S_STARTUP_EVENT;
        default: return null;
      }
    }
    
    public static com.google.protobuf.Internal.EnumLiteMap<AocTwoEventProtocolResponse>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<AocTwoEventProtocolResponse>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AocTwoEventProtocolResponse>() {
            public AocTwoEventProtocolResponse findValueByNumber(int number) {
              return AocTwoEventProtocolResponse.valueOf(number);
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
      return com.lvl6.aoc2.noneventprotos.AocTwoEventProtocolProto.getDescriptor().getEnumTypes().get(1);
    }
    
    private static final AocTwoEventProtocolResponse[] VALUES = {
      S_TRAIN_OR_UPGRADE_SPELL_EVENT, S_BUILD_OR_UPGRADE_STRUCTURE_EVENT, S_REFILL_HP_OR_MANA_WITH_CONSUMABLE_EVENT, S_REPAIR_EQUIP_EVENT, S_SELECT_USER_CLASS_TYPE_EVENT, S_STARTUP_EVENT, 
    };
    
    public static AocTwoEventProtocolResponse valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }
    
    private final int index;
    private final int value;
    
    private AocTwoEventProtocolResponse(int index, int value) {
      this.index = index;
      this.value = value;
    }
    
    // @@protoc_insertion_point(enum_scope:proto.AocTwoEventProtocolResponse)
  }
  
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031AocTwoEventProtocol.proto\022\005proto*\352\001\n\032A" +
      "ocTwoEventProtocolRequest\022\"\n\036C_TRAIN_OR_" +
      "UPGRADE_SPELL_EVENT\020\000\022&\n\"C_BUILD_OR_UPGR" +
      "ADE_STRUCTURE_EVENT\020\001\022-\n)C_REFILL_HP_OR_" +
      "MANA_WITH_CONSUMABLE_EVENT\020\002\022\030\n\024C_REPAIR" +
      "_EQUIP_EVENT\020\003\022\"\n\036C_SELECT_USER_CLASS_TY" +
      "PE_EVENT\020\004\022\023\n\017C_STARTUP_EVENT\020\005*\353\001\n\033AocT" +
      "woEventProtocolResponse\022\"\n\036S_TRAIN_OR_UP" +
      "GRADE_SPELL_EVENT\020\000\022&\n\"S_BUILD_OR_UPGRAD" +
      "E_STRUCTURE_EVENT\020\001\022-\n)S_REFILL_HP_OR_MA",
      "NA_WITH_CONSUMABLE_EVENT\020\002\022\030\n\024S_REPAIR_E" +
      "QUIP_EVENT\020\003\022\"\n\036S_SELECT_USER_CLASS_TYPE" +
      "_EVENT\020\004\022\023\n\017S_STARTUP_EVENT\020\005B8\n\034com.lvl" +
      "6.aoc2.noneventprotosB\030AocTwoEventProtoc" +
      "olProto"
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