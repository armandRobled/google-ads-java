// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/enums/bidding_strategy_type.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.enums;

/**
 * <pre>
 * Container for enum describing possible bidding strategy types.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.enums.BiddingStrategyTypeEnum}
 */
public final class BiddingStrategyTypeEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.enums.BiddingStrategyTypeEnum)
    BiddingStrategyTypeEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BiddingStrategyTypeEnum.newBuilder() to construct.
  private BiddingStrategyTypeEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BiddingStrategyTypeEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BiddingStrategyTypeEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.enums.BiddingStrategyTypeProto.internal_static_google_ads_googleads_v17_enums_BiddingStrategyTypeEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.enums.BiddingStrategyTypeProto.internal_static_google_ads_googleads_v17_enums_BiddingStrategyTypeEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.class, com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible bidding strategy types.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.BiddingStrategyType}
   */
  public enum BiddingStrategyType
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
     * Commission is an automatic bidding strategy in which the advertiser pays
     * a certain portion of the conversion value.
     * </pre>
     *
     * <code>COMMISSION = 16;</code>
     */
    COMMISSION(16),
    /**
     * <pre>
     * Enhanced CPC is a bidding strategy that raises bids for clicks
     * that seem more likely to lead to a conversion and lowers
     * them for clicks where they seem less likely.
     * </pre>
     *
     * <code>ENHANCED_CPC = 2;</code>
     */
    ENHANCED_CPC(2),
    /**
     * <pre>
     * Used for return value only. Indicates that a campaign does not have a
     * bidding strategy. This prevents the campaign from serving. For example,
     * a campaign may be attached to a manager bidding strategy and the serving
     * account is subsequently unlinked from the manager account. In this case
     * the campaign will automatically be detached from the now inaccessible
     * manager bidding strategy and transition to the INVALID bidding strategy
     * type.
     * </pre>
     *
     * <code>INVALID = 17;</code>
     */
    INVALID(17),
    /**
     * <pre>
     * Manual bidding strategy that allows advertiser to set the bid per
     * advertiser-specified action.
     * </pre>
     *
     * <code>MANUAL_CPA = 18;</code>
     */
    MANUAL_CPA(18),
    /**
     * <pre>
     * Manual click based bidding where user pays per click.
     * </pre>
     *
     * <code>MANUAL_CPC = 3;</code>
     */
    MANUAL_CPC(3),
    /**
     * <pre>
     * Manual impression based bidding
     * where user pays per thousand impressions.
     * </pre>
     *
     * <code>MANUAL_CPM = 4;</code>
     */
    MANUAL_CPM(4),
    /**
     * <pre>
     * A bidding strategy that pays a configurable amount per video view.
     * </pre>
     *
     * <code>MANUAL_CPV = 13;</code>
     */
    MANUAL_CPV(13),
    /**
     * <pre>
     * A bidding strategy that automatically maximizes number of conversions
     * given a daily budget.
     * </pre>
     *
     * <code>MAXIMIZE_CONVERSIONS = 10;</code>
     */
    MAXIMIZE_CONVERSIONS(10),
    /**
     * <pre>
     * An automated bidding strategy that automatically sets bids to maximize
     * revenue while spending your budget.
     * </pre>
     *
     * <code>MAXIMIZE_CONVERSION_VALUE = 11;</code>
     */
    MAXIMIZE_CONVERSION_VALUE(11),
    /**
     * <pre>
     * Page-One Promoted bidding scheme, which sets max cpc bids to
     * target impressions on page one or page one promoted slots on google.com.
     * This enum value is deprecated.
     * </pre>
     *
     * <code>PAGE_ONE_PROMOTED = 5;</code>
     */
    PAGE_ONE_PROMOTED(5),
    /**
     * <pre>
     * Percent Cpc is bidding strategy where bids are a fraction of the
     * advertised price for some good or service.
     * </pre>
     *
     * <code>PERCENT_CPC = 12;</code>
     */
    PERCENT_CPC(12),
    /**
     * <pre>
     * Target CPA is an automated bid strategy that sets bids
     * to help get as many conversions as possible
     * at the target cost-per-acquisition (CPA) you set.
     * </pre>
     *
     * <code>TARGET_CPA = 6;</code>
     */
    TARGET_CPA(6),
    /**
     * <pre>
     * Target CPM is an automated bid strategy that sets bids to help get
     * as many impressions as possible at the target cost per one thousand
     * impressions (CPM) you set.
     * </pre>
     *
     * <code>TARGET_CPM = 14;</code>
     */
    TARGET_CPM(14),
    /**
     * <pre>
     * An automated bidding strategy that sets bids so that a certain percentage
     * of search ads are shown at the top of the first page (or other targeted
     * location).
     * </pre>
     *
     * <code>TARGET_IMPRESSION_SHARE = 15;</code>
     */
    TARGET_IMPRESSION_SHARE(15),
    /**
     * <pre>
     * Target Outrank Share is an automated bidding strategy that sets bids
     * based on the target fraction of auctions where the advertiser
     * should outrank a specific competitor.
     * This enum value is deprecated.
     * </pre>
     *
     * <code>TARGET_OUTRANK_SHARE = 7;</code>
     */
    TARGET_OUTRANK_SHARE(7),
    /**
     * <pre>
     * Target ROAS is an automated bidding strategy
     * that helps you maximize revenue while averaging
     * a specific target Return On Average Spend (ROAS).
     * </pre>
     *
     * <code>TARGET_ROAS = 8;</code>
     */
    TARGET_ROAS(8),
    /**
     * <pre>
     * Target Spend is an automated bid strategy that sets your bids
     * to help get as many clicks as possible within your budget.
     * </pre>
     *
     * <code>TARGET_SPEND = 9;</code>
     */
    TARGET_SPEND(9),
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
     * Commission is an automatic bidding strategy in which the advertiser pays
     * a certain portion of the conversion value.
     * </pre>
     *
     * <code>COMMISSION = 16;</code>
     */
    public static final int COMMISSION_VALUE = 16;
    /**
     * <pre>
     * Enhanced CPC is a bidding strategy that raises bids for clicks
     * that seem more likely to lead to a conversion and lowers
     * them for clicks where they seem less likely.
     * </pre>
     *
     * <code>ENHANCED_CPC = 2;</code>
     */
    public static final int ENHANCED_CPC_VALUE = 2;
    /**
     * <pre>
     * Used for return value only. Indicates that a campaign does not have a
     * bidding strategy. This prevents the campaign from serving. For example,
     * a campaign may be attached to a manager bidding strategy and the serving
     * account is subsequently unlinked from the manager account. In this case
     * the campaign will automatically be detached from the now inaccessible
     * manager bidding strategy and transition to the INVALID bidding strategy
     * type.
     * </pre>
     *
     * <code>INVALID = 17;</code>
     */
    public static final int INVALID_VALUE = 17;
    /**
     * <pre>
     * Manual bidding strategy that allows advertiser to set the bid per
     * advertiser-specified action.
     * </pre>
     *
     * <code>MANUAL_CPA = 18;</code>
     */
    public static final int MANUAL_CPA_VALUE = 18;
    /**
     * <pre>
     * Manual click based bidding where user pays per click.
     * </pre>
     *
     * <code>MANUAL_CPC = 3;</code>
     */
    public static final int MANUAL_CPC_VALUE = 3;
    /**
     * <pre>
     * Manual impression based bidding
     * where user pays per thousand impressions.
     * </pre>
     *
     * <code>MANUAL_CPM = 4;</code>
     */
    public static final int MANUAL_CPM_VALUE = 4;
    /**
     * <pre>
     * A bidding strategy that pays a configurable amount per video view.
     * </pre>
     *
     * <code>MANUAL_CPV = 13;</code>
     */
    public static final int MANUAL_CPV_VALUE = 13;
    /**
     * <pre>
     * A bidding strategy that automatically maximizes number of conversions
     * given a daily budget.
     * </pre>
     *
     * <code>MAXIMIZE_CONVERSIONS = 10;</code>
     */
    public static final int MAXIMIZE_CONVERSIONS_VALUE = 10;
    /**
     * <pre>
     * An automated bidding strategy that automatically sets bids to maximize
     * revenue while spending your budget.
     * </pre>
     *
     * <code>MAXIMIZE_CONVERSION_VALUE = 11;</code>
     */
    public static final int MAXIMIZE_CONVERSION_VALUE_VALUE = 11;
    /**
     * <pre>
     * Page-One Promoted bidding scheme, which sets max cpc bids to
     * target impressions on page one or page one promoted slots on google.com.
     * This enum value is deprecated.
     * </pre>
     *
     * <code>PAGE_ONE_PROMOTED = 5;</code>
     */
    public static final int PAGE_ONE_PROMOTED_VALUE = 5;
    /**
     * <pre>
     * Percent Cpc is bidding strategy where bids are a fraction of the
     * advertised price for some good or service.
     * </pre>
     *
     * <code>PERCENT_CPC = 12;</code>
     */
    public static final int PERCENT_CPC_VALUE = 12;
    /**
     * <pre>
     * Target CPA is an automated bid strategy that sets bids
     * to help get as many conversions as possible
     * at the target cost-per-acquisition (CPA) you set.
     * </pre>
     *
     * <code>TARGET_CPA = 6;</code>
     */
    public static final int TARGET_CPA_VALUE = 6;
    /**
     * <pre>
     * Target CPM is an automated bid strategy that sets bids to help get
     * as many impressions as possible at the target cost per one thousand
     * impressions (CPM) you set.
     * </pre>
     *
     * <code>TARGET_CPM = 14;</code>
     */
    public static final int TARGET_CPM_VALUE = 14;
    /**
     * <pre>
     * An automated bidding strategy that sets bids so that a certain percentage
     * of search ads are shown at the top of the first page (or other targeted
     * location).
     * </pre>
     *
     * <code>TARGET_IMPRESSION_SHARE = 15;</code>
     */
    public static final int TARGET_IMPRESSION_SHARE_VALUE = 15;
    /**
     * <pre>
     * Target Outrank Share is an automated bidding strategy that sets bids
     * based on the target fraction of auctions where the advertiser
     * should outrank a specific competitor.
     * This enum value is deprecated.
     * </pre>
     *
     * <code>TARGET_OUTRANK_SHARE = 7;</code>
     */
    public static final int TARGET_OUTRANK_SHARE_VALUE = 7;
    /**
     * <pre>
     * Target ROAS is an automated bidding strategy
     * that helps you maximize revenue while averaging
     * a specific target Return On Average Spend (ROAS).
     * </pre>
     *
     * <code>TARGET_ROAS = 8;</code>
     */
    public static final int TARGET_ROAS_VALUE = 8;
    /**
     * <pre>
     * Target Spend is an automated bid strategy that sets your bids
     * to help get as many clicks as possible within your budget.
     * </pre>
     *
     * <code>TARGET_SPEND = 9;</code>
     */
    public static final int TARGET_SPEND_VALUE = 9;


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
    public static BiddingStrategyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static BiddingStrategyType forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 16: return COMMISSION;
        case 2: return ENHANCED_CPC;
        case 17: return INVALID;
        case 18: return MANUAL_CPA;
        case 3: return MANUAL_CPC;
        case 4: return MANUAL_CPM;
        case 13: return MANUAL_CPV;
        case 10: return MAXIMIZE_CONVERSIONS;
        case 11: return MAXIMIZE_CONVERSION_VALUE;
        case 5: return PAGE_ONE_PROMOTED;
        case 12: return PERCENT_CPC;
        case 6: return TARGET_CPA;
        case 14: return TARGET_CPM;
        case 15: return TARGET_IMPRESSION_SHARE;
        case 7: return TARGET_OUTRANK_SHARE;
        case 8: return TARGET_ROAS;
        case 9: return TARGET_SPEND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BiddingStrategyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        BiddingStrategyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<BiddingStrategyType>() {
            public BiddingStrategyType findValueByNumber(int number) {
              return BiddingStrategyType.forNumber(number);
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
      return com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final BiddingStrategyType[] VALUES = values();

    public static BiddingStrategyType valueOf(
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

    private BiddingStrategyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.BiddingStrategyType)
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
    if (!(obj instanceof com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum other = (com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum) obj;

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

  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum prototype) {
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
   * Container for enum describing possible bidding strategy types.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.enums.BiddingStrategyTypeEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.enums.BiddingStrategyTypeEnum)
      com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.enums.BiddingStrategyTypeProto.internal_static_google_ads_googleads_v17_enums_BiddingStrategyTypeEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.enums.BiddingStrategyTypeProto.internal_static_google_ads_googleads_v17_enums_BiddingStrategyTypeEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.class, com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.newBuilder()
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
      return com.google.ads.googleads.v17.enums.BiddingStrategyTypeProto.internal_static_google_ads_googleads_v17_enums_BiddingStrategyTypeEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum build() {
      com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum buildPartial() {
      com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum result = new com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum(this);
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
      if (other instanceof com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum) {
        return mergeFrom((com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum other) {
      if (other == com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.enums.BiddingStrategyTypeEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.enums.BiddingStrategyTypeEnum)
  private static final com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum();
  }

  public static com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BiddingStrategyTypeEnum>
      PARSER = new com.google.protobuf.AbstractParser<BiddingStrategyTypeEnum>() {
    @java.lang.Override
    public BiddingStrategyTypeEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<BiddingStrategyTypeEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BiddingStrategyTypeEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.enums.BiddingStrategyTypeEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

