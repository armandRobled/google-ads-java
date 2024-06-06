// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/errors/ad_group_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.errors;

/**
 * <pre>
 * Container for enum describing possible ad group errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.errors.AdGroupErrorEnum}
 */
public final class AdGroupErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.errors.AdGroupErrorEnum)
    AdGroupErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupErrorEnum.newBuilder() to construct.
  private AdGroupErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdGroupErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.errors.AdGroupErrorProto.internal_static_google_ads_googleads_v17_errors_AdGroupErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.errors.AdGroupErrorProto.internal_static_google_ads_googleads_v17_errors_AdGroupErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.errors.AdGroupErrorEnum.class, com.google.ads.googleads.v17.errors.AdGroupErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible ad group errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v17.errors.AdGroupErrorEnum.AdGroupError}
   */
  public enum AdGroupError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * AdGroup with the same name already exists for the campaign.
     * </pre>
     *
     * <code>DUPLICATE_ADGROUP_NAME = 2;</code>
     */
    DUPLICATE_ADGROUP_NAME(2),
    /**
     * <pre>
     * AdGroup name is not valid.
     * </pre>
     *
     * <code>INVALID_ADGROUP_NAME = 3;</code>
     */
    INVALID_ADGROUP_NAME(3),
    /**
     * <pre>
     * Advertiser is not allowed to target sites or set site bids that are not
     * on the Google Search Network.
     * </pre>
     *
     * <code>ADVERTISER_NOT_ON_CONTENT_NETWORK = 5;</code>
     */
    ADVERTISER_NOT_ON_CONTENT_NETWORK(5),
    /**
     * <pre>
     * Bid amount is too big.
     * </pre>
     *
     * <code>BID_TOO_BIG = 6;</code>
     */
    BID_TOO_BIG(6),
    /**
     * <pre>
     * AdGroup bid does not match the campaign's bidding strategy.
     * </pre>
     *
     * <code>BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH = 7;</code>
     */
    BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH(7),
    /**
     * <pre>
     * AdGroup name is required for Add.
     * </pre>
     *
     * <code>MISSING_ADGROUP_NAME = 8;</code>
     */
    MISSING_ADGROUP_NAME(8),
    /**
     * <pre>
     * No link found between the ad group and the label.
     * </pre>
     *
     * <code>ADGROUP_LABEL_DOES_NOT_EXIST = 9;</code>
     */
    ADGROUP_LABEL_DOES_NOT_EXIST(9),
    /**
     * <pre>
     * The label has already been attached to the ad group.
     * </pre>
     *
     * <code>ADGROUP_LABEL_ALREADY_EXISTS = 10;</code>
     */
    ADGROUP_LABEL_ALREADY_EXISTS(10),
    /**
     * <pre>
     * The CriterionTypeGroup is not supported for the content bid dimension.
     * </pre>
     *
     * <code>INVALID_CONTENT_BID_CRITERION_TYPE_GROUP = 11;</code>
     */
    INVALID_CONTENT_BID_CRITERION_TYPE_GROUP(11),
    /**
     * <pre>
     * The ad group type is not compatible with the campaign channel type.
     * </pre>
     *
     * <code>AD_GROUP_TYPE_NOT_VALID_FOR_ADVERTISING_CHANNEL_TYPE = 12;</code>
     */
    AD_GROUP_TYPE_NOT_VALID_FOR_ADVERTISING_CHANNEL_TYPE(12),
    /**
     * <pre>
     * The ad group type is not supported in the country of sale of the
     * campaign.
     * </pre>
     *
     * <code>ADGROUP_TYPE_NOT_SUPPORTED_FOR_CAMPAIGN_SALES_COUNTRY = 13;</code>
     */
    ADGROUP_TYPE_NOT_SUPPORTED_FOR_CAMPAIGN_SALES_COUNTRY(13),
    /**
     * <pre>
     * Ad groups of AdGroupType.SEARCH_DYNAMIC_ADS can only be added to
     * campaigns that have DynamicSearchAdsSetting attached.
     * </pre>
     *
     * <code>CANNOT_ADD_ADGROUP_OF_TYPE_DSA_TO_CAMPAIGN_WITHOUT_DSA_SETTING = 14;</code>
     */
    CANNOT_ADD_ADGROUP_OF_TYPE_DSA_TO_CAMPAIGN_WITHOUT_DSA_SETTING(14),
    /**
     * <pre>
     * Promoted hotels ad groups are only available to customers on the
     * allow-list.
     * </pre>
     *
     * <code>PROMOTED_HOTEL_AD_GROUPS_NOT_AVAILABLE_FOR_CUSTOMER = 15;</code>
     */
    PROMOTED_HOTEL_AD_GROUPS_NOT_AVAILABLE_FOR_CUSTOMER(15),
    /**
     * <pre>
     * The field type cannot be excluded because an active ad group-asset link
     * of this type exists.
     * </pre>
     *
     * <code>INVALID_EXCLUDED_PARENT_ASSET_FIELD_TYPE = 16;</code>
     */
    INVALID_EXCLUDED_PARENT_ASSET_FIELD_TYPE(16),
    /**
     * <pre>
     * The asset set type is invalid for setting the
     * excluded_parent_asset_set_types field.
     * </pre>
     *
     * <code>INVALID_EXCLUDED_PARENT_ASSET_SET_TYPE = 17;</code>
     */
    INVALID_EXCLUDED_PARENT_ASSET_SET_TYPE(17),
    /**
     * <pre>
     * Cannot add ad groups for the campaign type.
     * </pre>
     *
     * <code>CANNOT_ADD_AD_GROUP_FOR_CAMPAIGN_TYPE = 18;</code>
     */
    CANNOT_ADD_AD_GROUP_FOR_CAMPAIGN_TYPE(18),
    /**
     * <pre>
     * Invalid status for the ad group.
     * </pre>
     *
     * <code>INVALID_STATUS = 19;</code>
     */
    INVALID_STATUS(19),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * AdGroup with the same name already exists for the campaign.
     * </pre>
     *
     * <code>DUPLICATE_ADGROUP_NAME = 2;</code>
     */
    public static final int DUPLICATE_ADGROUP_NAME_VALUE = 2;
    /**
     * <pre>
     * AdGroup name is not valid.
     * </pre>
     *
     * <code>INVALID_ADGROUP_NAME = 3;</code>
     */
    public static final int INVALID_ADGROUP_NAME_VALUE = 3;
    /**
     * <pre>
     * Advertiser is not allowed to target sites or set site bids that are not
     * on the Google Search Network.
     * </pre>
     *
     * <code>ADVERTISER_NOT_ON_CONTENT_NETWORK = 5;</code>
     */
    public static final int ADVERTISER_NOT_ON_CONTENT_NETWORK_VALUE = 5;
    /**
     * <pre>
     * Bid amount is too big.
     * </pre>
     *
     * <code>BID_TOO_BIG = 6;</code>
     */
    public static final int BID_TOO_BIG_VALUE = 6;
    /**
     * <pre>
     * AdGroup bid does not match the campaign's bidding strategy.
     * </pre>
     *
     * <code>BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH = 7;</code>
     */
    public static final int BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH_VALUE = 7;
    /**
     * <pre>
     * AdGroup name is required for Add.
     * </pre>
     *
     * <code>MISSING_ADGROUP_NAME = 8;</code>
     */
    public static final int MISSING_ADGROUP_NAME_VALUE = 8;
    /**
     * <pre>
     * No link found between the ad group and the label.
     * </pre>
     *
     * <code>ADGROUP_LABEL_DOES_NOT_EXIST = 9;</code>
     */
    public static final int ADGROUP_LABEL_DOES_NOT_EXIST_VALUE = 9;
    /**
     * <pre>
     * The label has already been attached to the ad group.
     * </pre>
     *
     * <code>ADGROUP_LABEL_ALREADY_EXISTS = 10;</code>
     */
    public static final int ADGROUP_LABEL_ALREADY_EXISTS_VALUE = 10;
    /**
     * <pre>
     * The CriterionTypeGroup is not supported for the content bid dimension.
     * </pre>
     *
     * <code>INVALID_CONTENT_BID_CRITERION_TYPE_GROUP = 11;</code>
     */
    public static final int INVALID_CONTENT_BID_CRITERION_TYPE_GROUP_VALUE = 11;
    /**
     * <pre>
     * The ad group type is not compatible with the campaign channel type.
     * </pre>
     *
     * <code>AD_GROUP_TYPE_NOT_VALID_FOR_ADVERTISING_CHANNEL_TYPE = 12;</code>
     */
    public static final int AD_GROUP_TYPE_NOT_VALID_FOR_ADVERTISING_CHANNEL_TYPE_VALUE = 12;
    /**
     * <pre>
     * The ad group type is not supported in the country of sale of the
     * campaign.
     * </pre>
     *
     * <code>ADGROUP_TYPE_NOT_SUPPORTED_FOR_CAMPAIGN_SALES_COUNTRY = 13;</code>
     */
    public static final int ADGROUP_TYPE_NOT_SUPPORTED_FOR_CAMPAIGN_SALES_COUNTRY_VALUE = 13;
    /**
     * <pre>
     * Ad groups of AdGroupType.SEARCH_DYNAMIC_ADS can only be added to
     * campaigns that have DynamicSearchAdsSetting attached.
     * </pre>
     *
     * <code>CANNOT_ADD_ADGROUP_OF_TYPE_DSA_TO_CAMPAIGN_WITHOUT_DSA_SETTING = 14;</code>
     */
    public static final int CANNOT_ADD_ADGROUP_OF_TYPE_DSA_TO_CAMPAIGN_WITHOUT_DSA_SETTING_VALUE = 14;
    /**
     * <pre>
     * Promoted hotels ad groups are only available to customers on the
     * allow-list.
     * </pre>
     *
     * <code>PROMOTED_HOTEL_AD_GROUPS_NOT_AVAILABLE_FOR_CUSTOMER = 15;</code>
     */
    public static final int PROMOTED_HOTEL_AD_GROUPS_NOT_AVAILABLE_FOR_CUSTOMER_VALUE = 15;
    /**
     * <pre>
     * The field type cannot be excluded because an active ad group-asset link
     * of this type exists.
     * </pre>
     *
     * <code>INVALID_EXCLUDED_PARENT_ASSET_FIELD_TYPE = 16;</code>
     */
    public static final int INVALID_EXCLUDED_PARENT_ASSET_FIELD_TYPE_VALUE = 16;
    /**
     * <pre>
     * The asset set type is invalid for setting the
     * excluded_parent_asset_set_types field.
     * </pre>
     *
     * <code>INVALID_EXCLUDED_PARENT_ASSET_SET_TYPE = 17;</code>
     */
    public static final int INVALID_EXCLUDED_PARENT_ASSET_SET_TYPE_VALUE = 17;
    /**
     * <pre>
     * Cannot add ad groups for the campaign type.
     * </pre>
     *
     * <code>CANNOT_ADD_AD_GROUP_FOR_CAMPAIGN_TYPE = 18;</code>
     */
    public static final int CANNOT_ADD_AD_GROUP_FOR_CAMPAIGN_TYPE_VALUE = 18;
    /**
     * <pre>
     * Invalid status for the ad group.
     * </pre>
     *
     * <code>INVALID_STATUS = 19;</code>
     */
    public static final int INVALID_STATUS_VALUE = 19;


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
    public static AdGroupError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdGroupError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return DUPLICATE_ADGROUP_NAME;
        case 3: return INVALID_ADGROUP_NAME;
        case 5: return ADVERTISER_NOT_ON_CONTENT_NETWORK;
        case 6: return BID_TOO_BIG;
        case 7: return BID_TYPE_AND_BIDDING_STRATEGY_MISMATCH;
        case 8: return MISSING_ADGROUP_NAME;
        case 9: return ADGROUP_LABEL_DOES_NOT_EXIST;
        case 10: return ADGROUP_LABEL_ALREADY_EXISTS;
        case 11: return INVALID_CONTENT_BID_CRITERION_TYPE_GROUP;
        case 12: return AD_GROUP_TYPE_NOT_VALID_FOR_ADVERTISING_CHANNEL_TYPE;
        case 13: return ADGROUP_TYPE_NOT_SUPPORTED_FOR_CAMPAIGN_SALES_COUNTRY;
        case 14: return CANNOT_ADD_ADGROUP_OF_TYPE_DSA_TO_CAMPAIGN_WITHOUT_DSA_SETTING;
        case 15: return PROMOTED_HOTEL_AD_GROUPS_NOT_AVAILABLE_FOR_CUSTOMER;
        case 16: return INVALID_EXCLUDED_PARENT_ASSET_FIELD_TYPE;
        case 17: return INVALID_EXCLUDED_PARENT_ASSET_SET_TYPE;
        case 18: return CANNOT_ADD_AD_GROUP_FOR_CAMPAIGN_TYPE;
        case 19: return INVALID_STATUS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdGroupError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdGroupError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdGroupError>() {
            public AdGroupError findValueByNumber(int number) {
              return AdGroupError.forNumber(number);
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
      return com.google.ads.googleads.v17.errors.AdGroupErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdGroupError[] VALUES = values();

    public static AdGroupError valueOf(
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

    private AdGroupError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v17.errors.AdGroupErrorEnum.AdGroupError)
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
    if (!(obj instanceof com.google.ads.googleads.v17.errors.AdGroupErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.errors.AdGroupErrorEnum other = (com.google.ads.googleads.v17.errors.AdGroupErrorEnum) obj;

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

  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.errors.AdGroupErrorEnum prototype) {
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
   * Container for enum describing possible ad group errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.errors.AdGroupErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.errors.AdGroupErrorEnum)
      com.google.ads.googleads.v17.errors.AdGroupErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.errors.AdGroupErrorProto.internal_static_google_ads_googleads_v17_errors_AdGroupErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.errors.AdGroupErrorProto.internal_static_google_ads_googleads_v17_errors_AdGroupErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.errors.AdGroupErrorEnum.class, com.google.ads.googleads.v17.errors.AdGroupErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.errors.AdGroupErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v17.errors.AdGroupErrorProto.internal_static_google_ads_googleads_v17_errors_AdGroupErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.AdGroupErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.errors.AdGroupErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.AdGroupErrorEnum build() {
      com.google.ads.googleads.v17.errors.AdGroupErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.AdGroupErrorEnum buildPartial() {
      com.google.ads.googleads.v17.errors.AdGroupErrorEnum result = new com.google.ads.googleads.v17.errors.AdGroupErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v17.errors.AdGroupErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v17.errors.AdGroupErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.errors.AdGroupErrorEnum other) {
      if (other == com.google.ads.googleads.v17.errors.AdGroupErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.errors.AdGroupErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.errors.AdGroupErrorEnum)
  private static final com.google.ads.googleads.v17.errors.AdGroupErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.errors.AdGroupErrorEnum();
  }

  public static com.google.ads.googleads.v17.errors.AdGroupErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupErrorEnum>() {
    @java.lang.Override
    public AdGroupErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdGroupErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.errors.AdGroupErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

