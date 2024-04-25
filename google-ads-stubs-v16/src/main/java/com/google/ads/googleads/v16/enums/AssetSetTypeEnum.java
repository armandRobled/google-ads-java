// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/enums/asset_set_type.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.enums;

/**
 * <pre>
 * Container for enum describing possible types of an asset set.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.enums.AssetSetTypeEnum}
 */
public final class AssetSetTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.enums.AssetSetTypeEnum)
    AssetSetTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetSetTypeEnum.newBuilder() to construct.
  private AssetSetTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetSetTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetSetTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.enums.AssetSetTypeProto.internal_static_google_ads_googleads_v16_enums_AssetSetTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.enums.AssetSetTypeProto.internal_static_google_ads_googleads_v16_enums_AssetSetTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.enums.AssetSetTypeEnum.class, com.google.ads.googleads.v16.enums.AssetSetTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible types of an asset set.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v16.enums.AssetSetTypeEnum.AssetSetType}
   */
  public enum AssetSetType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Page asset set.
     * </pre>
     *
     * <code>PAGE_FEED = 2;</code>
     */
    PAGE_FEED(2),
    /**
     * <pre>
     * Dynamic education asset set.
     * </pre>
     *
     * <code>DYNAMIC_EDUCATION = 3;</code>
     */
    DYNAMIC_EDUCATION(3),
    /**
     * <pre>
     * Google Merchant Center asset set.
     * </pre>
     *
     * <code>MERCHANT_CENTER_FEED = 4;</code>
     */
    MERCHANT_CENTER_FEED(4),
    /**
     * <pre>
     * Dynamic real estate asset set.
     * </pre>
     *
     * <code>DYNAMIC_REAL_ESTATE = 5;</code>
     */
    DYNAMIC_REAL_ESTATE(5),
    /**
     * <pre>
     * Dynamic custom asset set.
     * </pre>
     *
     * <code>DYNAMIC_CUSTOM = 6;</code>
     */
    DYNAMIC_CUSTOM(6),
    /**
     * <pre>
     * Dynamic hotels and rentals asset set.
     * </pre>
     *
     * <code>DYNAMIC_HOTELS_AND_RENTALS = 7;</code>
     */
    DYNAMIC_HOTELS_AND_RENTALS(7),
    /**
     * <pre>
     * Dynamic flights asset set.
     * </pre>
     *
     * <code>DYNAMIC_FLIGHTS = 8;</code>
     */
    DYNAMIC_FLIGHTS(8),
    /**
     * <pre>
     * Dynamic travel asset set.
     * </pre>
     *
     * <code>DYNAMIC_TRAVEL = 9;</code>
     */
    DYNAMIC_TRAVEL(9),
    /**
     * <pre>
     * Dynamic local asset set.
     * </pre>
     *
     * <code>DYNAMIC_LOCAL = 10;</code>
     */
    DYNAMIC_LOCAL(10),
    /**
     * <pre>
     * Dynamic jobs asset set.
     * </pre>
     *
     * <code>DYNAMIC_JOBS = 11;</code>
     */
    DYNAMIC_JOBS(11),
    /**
     * <pre>
     * Location sync level asset set.
     * </pre>
     *
     * <code>LOCATION_SYNC = 12;</code>
     */
    LOCATION_SYNC(12),
    /**
     * <pre>
     * Business Profile location group asset set.
     * </pre>
     *
     * <code>BUSINESS_PROFILE_DYNAMIC_LOCATION_GROUP = 13;</code>
     */
    BUSINESS_PROFILE_DYNAMIC_LOCATION_GROUP(13),
    /**
     * <pre>
     * Chain location group asset set which can be used for both owned
     * locations and affiliate locations.
     * </pre>
     *
     * <code>CHAIN_DYNAMIC_LOCATION_GROUP = 14;</code>
     */
    CHAIN_DYNAMIC_LOCATION_GROUP(14),
    /**
     * <pre>
     * Static location group asset set which can be used for both owned
     * locations and affiliate locations.
     * </pre>
     *
     * <code>STATIC_LOCATION_GROUP = 15;</code>
     */
    STATIC_LOCATION_GROUP(15),
    /**
     * <pre>
     * Hotel Property asset set which is used to link a hotel property feed to
     * Performance Max for travel goals campaigns.
     * </pre>
     *
     * <code>HOTEL_PROPERTY = 16;</code>
     */
    HOTEL_PROPERTY(16),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Not specified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Used for return value only. Represents value unknown in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Page asset set.
     * </pre>
     *
     * <code>PAGE_FEED = 2;</code>
     */
    public static final int PAGE_FEED_VALUE = 2;
    /**
     * <pre>
     * Dynamic education asset set.
     * </pre>
     *
     * <code>DYNAMIC_EDUCATION = 3;</code>
     */
    public static final int DYNAMIC_EDUCATION_VALUE = 3;
    /**
     * <pre>
     * Google Merchant Center asset set.
     * </pre>
     *
     * <code>MERCHANT_CENTER_FEED = 4;</code>
     */
    public static final int MERCHANT_CENTER_FEED_VALUE = 4;
    /**
     * <pre>
     * Dynamic real estate asset set.
     * </pre>
     *
     * <code>DYNAMIC_REAL_ESTATE = 5;</code>
     */
    public static final int DYNAMIC_REAL_ESTATE_VALUE = 5;
    /**
     * <pre>
     * Dynamic custom asset set.
     * </pre>
     *
     * <code>DYNAMIC_CUSTOM = 6;</code>
     */
    public static final int DYNAMIC_CUSTOM_VALUE = 6;
    /**
     * <pre>
     * Dynamic hotels and rentals asset set.
     * </pre>
     *
     * <code>DYNAMIC_HOTELS_AND_RENTALS = 7;</code>
     */
    public static final int DYNAMIC_HOTELS_AND_RENTALS_VALUE = 7;
    /**
     * <pre>
     * Dynamic flights asset set.
     * </pre>
     *
     * <code>DYNAMIC_FLIGHTS = 8;</code>
     */
    public static final int DYNAMIC_FLIGHTS_VALUE = 8;
    /**
     * <pre>
     * Dynamic travel asset set.
     * </pre>
     *
     * <code>DYNAMIC_TRAVEL = 9;</code>
     */
    public static final int DYNAMIC_TRAVEL_VALUE = 9;
    /**
     * <pre>
     * Dynamic local asset set.
     * </pre>
     *
     * <code>DYNAMIC_LOCAL = 10;</code>
     */
    public static final int DYNAMIC_LOCAL_VALUE = 10;
    /**
     * <pre>
     * Dynamic jobs asset set.
     * </pre>
     *
     * <code>DYNAMIC_JOBS = 11;</code>
     */
    public static final int DYNAMIC_JOBS_VALUE = 11;
    /**
     * <pre>
     * Location sync level asset set.
     * </pre>
     *
     * <code>LOCATION_SYNC = 12;</code>
     */
    public static final int LOCATION_SYNC_VALUE = 12;
    /**
     * <pre>
     * Business Profile location group asset set.
     * </pre>
     *
     * <code>BUSINESS_PROFILE_DYNAMIC_LOCATION_GROUP = 13;</code>
     */
    public static final int BUSINESS_PROFILE_DYNAMIC_LOCATION_GROUP_VALUE = 13;
    /**
     * <pre>
     * Chain location group asset set which can be used for both owned
     * locations and affiliate locations.
     * </pre>
     *
     * <code>CHAIN_DYNAMIC_LOCATION_GROUP = 14;</code>
     */
    public static final int CHAIN_DYNAMIC_LOCATION_GROUP_VALUE = 14;
    /**
     * <pre>
     * Static location group asset set which can be used for both owned
     * locations and affiliate locations.
     * </pre>
     *
     * <code>STATIC_LOCATION_GROUP = 15;</code>
     */
    public static final int STATIC_LOCATION_GROUP_VALUE = 15;
    /**
     * <pre>
     * Hotel Property asset set which is used to link a hotel property feed to
     * Performance Max for travel goals campaigns.
     * </pre>
     *
     * <code>HOTEL_PROPERTY = 16;</code>
     */
    public static final int HOTEL_PROPERTY_VALUE = 16;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static AssetSetType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AssetSetType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return PAGE_FEED;
        case 3: return DYNAMIC_EDUCATION;
        case 4: return MERCHANT_CENTER_FEED;
        case 5: return DYNAMIC_REAL_ESTATE;
        case 6: return DYNAMIC_CUSTOM;
        case 7: return DYNAMIC_HOTELS_AND_RENTALS;
        case 8: return DYNAMIC_FLIGHTS;
        case 9: return DYNAMIC_TRAVEL;
        case 10: return DYNAMIC_LOCAL;
        case 11: return DYNAMIC_JOBS;
        case 12: return LOCATION_SYNC;
        case 13: return BUSINESS_PROFILE_DYNAMIC_LOCATION_GROUP;
        case 14: return CHAIN_DYNAMIC_LOCATION_GROUP;
        case 15: return STATIC_LOCATION_GROUP;
        case 16: return HOTEL_PROPERTY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AssetSetType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AssetSetType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AssetSetType>() {
            public AssetSetType findValueByNumber(int number) {
              return AssetSetType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.enums.AssetSetTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AssetSetType[] VALUES = values();

    public static AssetSetType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AssetSetType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v16.enums.AssetSetTypeEnum.AssetSetType)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v16.enums.AssetSetTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.enums.AssetSetTypeEnum other = (com.google.ads.googleads.v16.enums.AssetSetTypeEnum) obj;

    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v16.enums.AssetSetTypeEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum describing possible types of an asset set.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.enums.AssetSetTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.enums.AssetSetTypeEnum)
      com.google.ads.googleads.v16.enums.AssetSetTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.enums.AssetSetTypeProto.internal_static_google_ads_googleads_v16_enums_AssetSetTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.enums.AssetSetTypeProto.internal_static_google_ads_googleads_v16_enums_AssetSetTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.enums.AssetSetTypeEnum.class, com.google.ads.googleads.v16.enums.AssetSetTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.enums.AssetSetTypeEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.enums.AssetSetTypeProto.internal_static_google_ads_googleads_v16_enums_AssetSetTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AssetSetTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.enums.AssetSetTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AssetSetTypeEnum build() {
      com.google.ads.googleads.v16.enums.AssetSetTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AssetSetTypeEnum buildPartial() {
      com.google.ads.googleads.v16.enums.AssetSetTypeEnum result = new com.google.ads.googleads.v16.enums.AssetSetTypeEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v16.enums.AssetSetTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v16.enums.AssetSetTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.enums.AssetSetTypeEnum other) {
      if (other == com.google.ads.googleads.v16.enums.AssetSetTypeEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.enums.AssetSetTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.enums.AssetSetTypeEnum)
  private static final com.google.ads.googleads.v16.enums.AssetSetTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.enums.AssetSetTypeEnum();
  }

  public static com.google.ads.googleads.v16.enums.AssetSetTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetSetTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<AssetSetTypeEnum>() {
    @java.lang.Override
    public AssetSetTypeEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AssetSetTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetSetTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.enums.AssetSetTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

