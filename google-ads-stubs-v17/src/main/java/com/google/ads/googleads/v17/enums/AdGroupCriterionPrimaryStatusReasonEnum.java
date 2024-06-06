// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/enums/ad_group_criterion_primary_status_reason.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.enums;

/**
 * <pre>
 * Container for enum describing possible ad group criterion primary status
 * reasons.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum}
 */
public final class AdGroupCriterionPrimaryStatusReasonEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum)
    AdGroupCriterionPrimaryStatusReasonEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupCriterionPrimaryStatusReasonEnum.newBuilder() to construct.
  private AdGroupCriterionPrimaryStatusReasonEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupCriterionPrimaryStatusReasonEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdGroupCriterionPrimaryStatusReasonEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupCriterionPrimaryStatusReasonEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupCriterionPrimaryStatusReasonEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.class, com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing the possible Ad Group Criterion primary status reasons.
   * Provides insight into why an Ad Group Criterion is not serving or not
   * serving optimally. These reasons are aggregated to determine an overall
   * Ad Group Criterion primary status.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.AdGroupCriterionPrimaryStatusReason}
   */
  public enum AdGroupCriterionPrimaryStatusReason
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
     * Used for return value only. Represents unknown value in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The user-specified time for this campaign to start is in the future.
     * Contributes to AdGroupCriterionPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>CAMPAIGN_PENDING = 2;</code>
     */
    CAMPAIGN_PENDING(2),
    /**
     * <pre>
     * The ad group criterion is overridden by negative campaign criterion.
     * Contributes to AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_CRITERION_NEGATIVE = 3;</code>
     */
    CAMPAIGN_CRITERION_NEGATIVE(3),
    /**
     * <pre>
     * The user-specified campaign status is paused. Contributes to
     * AdGroupCriterionPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>CAMPAIGN_PAUSED = 4;</code>
     */
    CAMPAIGN_PAUSED(4),
    /**
     * <pre>
     * The user-specified campaign status is removed. Contributes to
     * AdGroupCriterionPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>CAMPAIGN_REMOVED = 5;</code>
     */
    CAMPAIGN_REMOVED(5),
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed. Contributes
     * to AdGroupCriterionPrimaryStatus.ENDED.
     * </pre>
     *
     * <code>CAMPAIGN_ENDED = 6;</code>
     */
    CAMPAIGN_ENDED(6),
    /**
     * <pre>
     * The user-specified ad group status is paused. Contributes to
     * AdGroupCriterionPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_PAUSED = 7;</code>
     */
    AD_GROUP_PAUSED(7),
    /**
     * <pre>
     * The user-specified ad group status is removed. Contributes to
     * AdGroupCriterionPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>AD_GROUP_REMOVED = 8;</code>
     */
    AD_GROUP_REMOVED(8),
    /**
     * <pre>
     * The ad group criterion is disapproved by the ads approval system.
     * Contributes to AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_DISAPPROVED = 9;</code>
     */
    AD_GROUP_CRITERION_DISAPPROVED(9),
    /**
     * <pre>
     * The ad group criterion is rarely served. Contributes to
     * AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_RARELY_SERVED = 10;</code>
     */
    AD_GROUP_CRITERION_RARELY_SERVED(10),
    /**
     * <pre>
     * The ad group criterion has a low quality score. Contributes to
     * AdGroupCriterionPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_LOW_QUALITY = 11;</code>
     */
    AD_GROUP_CRITERION_LOW_QUALITY(11),
    /**
     * <pre>
     * The ad group criterion is under review. Contributes to
     * AdGroupCriterionPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_UNDER_REVIEW = 12;</code>
     */
    AD_GROUP_CRITERION_UNDER_REVIEW(12),
    /**
     * <pre>
     * The ad group criterion is pending review. Contributes to
     * AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_PENDING_REVIEW = 13;</code>
     */
    AD_GROUP_CRITERION_PENDING_REVIEW(13),
    /**
     * <pre>
     * The ad group criterion's bid is below the value necessary to serve on the
     * first page. Contributes to AdGroupCriterionPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_BELOW_FIRST_PAGE_BID = 14;</code>
     */
    AD_GROUP_CRITERION_BELOW_FIRST_PAGE_BID(14),
    /**
     * <pre>
     * The ad group criterion is negative. Contributes to
     * AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_NEGATIVE = 15;</code>
     */
    AD_GROUP_CRITERION_NEGATIVE(15),
    /**
     * <pre>
     * The ad group criterion is restricted. Contributes to
     * AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_RESTRICTED = 16;</code>
     */
    AD_GROUP_CRITERION_RESTRICTED(16),
    /**
     * <pre>
     * The user-specified ad group criterion status is paused. Contributes to
     * AdGroupCriterionPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_PAUSED = 17;</code>
     */
    AD_GROUP_CRITERION_PAUSED(17),
    /**
     * <pre>
     * The ad group criterion has been paused due to prolonged low activity in
     * serving. Contributes to AdGroupCriterionPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_PAUSED_DUE_TO_LOW_ACTIVITY = 18;</code>
     */
    AD_GROUP_CRITERION_PAUSED_DUE_TO_LOW_ACTIVITY(18),
    /**
     * <pre>
     * The user-specified ad group criterion status is removed. Contributes to
     * AdGroupCriterionPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_REMOVED = 19;</code>
     */
    AD_GROUP_CRITERION_REMOVED(19),
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
     * Used for return value only. Represents unknown value in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The user-specified time for this campaign to start is in the future.
     * Contributes to AdGroupCriterionPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>CAMPAIGN_PENDING = 2;</code>
     */
    public static final int CAMPAIGN_PENDING_VALUE = 2;
    /**
     * <pre>
     * The ad group criterion is overridden by negative campaign criterion.
     * Contributes to AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>CAMPAIGN_CRITERION_NEGATIVE = 3;</code>
     */
    public static final int CAMPAIGN_CRITERION_NEGATIVE_VALUE = 3;
    /**
     * <pre>
     * The user-specified campaign status is paused. Contributes to
     * AdGroupCriterionPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>CAMPAIGN_PAUSED = 4;</code>
     */
    public static final int CAMPAIGN_PAUSED_VALUE = 4;
    /**
     * <pre>
     * The user-specified campaign status is removed. Contributes to
     * AdGroupCriterionPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>CAMPAIGN_REMOVED = 5;</code>
     */
    public static final int CAMPAIGN_REMOVED_VALUE = 5;
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed. Contributes
     * to AdGroupCriterionPrimaryStatus.ENDED.
     * </pre>
     *
     * <code>CAMPAIGN_ENDED = 6;</code>
     */
    public static final int CAMPAIGN_ENDED_VALUE = 6;
    /**
     * <pre>
     * The user-specified ad group status is paused. Contributes to
     * AdGroupCriterionPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_PAUSED = 7;</code>
     */
    public static final int AD_GROUP_PAUSED_VALUE = 7;
    /**
     * <pre>
     * The user-specified ad group status is removed. Contributes to
     * AdGroupCriterionPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>AD_GROUP_REMOVED = 8;</code>
     */
    public static final int AD_GROUP_REMOVED_VALUE = 8;
    /**
     * <pre>
     * The ad group criterion is disapproved by the ads approval system.
     * Contributes to AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_DISAPPROVED = 9;</code>
     */
    public static final int AD_GROUP_CRITERION_DISAPPROVED_VALUE = 9;
    /**
     * <pre>
     * The ad group criterion is rarely served. Contributes to
     * AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_RARELY_SERVED = 10;</code>
     */
    public static final int AD_GROUP_CRITERION_RARELY_SERVED_VALUE = 10;
    /**
     * <pre>
     * The ad group criterion has a low quality score. Contributes to
     * AdGroupCriterionPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_LOW_QUALITY = 11;</code>
     */
    public static final int AD_GROUP_CRITERION_LOW_QUALITY_VALUE = 11;
    /**
     * <pre>
     * The ad group criterion is under review. Contributes to
     * AdGroupCriterionPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_UNDER_REVIEW = 12;</code>
     */
    public static final int AD_GROUP_CRITERION_UNDER_REVIEW_VALUE = 12;
    /**
     * <pre>
     * The ad group criterion is pending review. Contributes to
     * AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_PENDING_REVIEW = 13;</code>
     */
    public static final int AD_GROUP_CRITERION_PENDING_REVIEW_VALUE = 13;
    /**
     * <pre>
     * The ad group criterion's bid is below the value necessary to serve on the
     * first page. Contributes to AdGroupCriterionPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_BELOW_FIRST_PAGE_BID = 14;</code>
     */
    public static final int AD_GROUP_CRITERION_BELOW_FIRST_PAGE_BID_VALUE = 14;
    /**
     * <pre>
     * The ad group criterion is negative. Contributes to
     * AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_NEGATIVE = 15;</code>
     */
    public static final int AD_GROUP_CRITERION_NEGATIVE_VALUE = 15;
    /**
     * <pre>
     * The ad group criterion is restricted. Contributes to
     * AdGroupCriterionPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_RESTRICTED = 16;</code>
     */
    public static final int AD_GROUP_CRITERION_RESTRICTED_VALUE = 16;
    /**
     * <pre>
     * The user-specified ad group criterion status is paused. Contributes to
     * AdGroupCriterionPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_PAUSED = 17;</code>
     */
    public static final int AD_GROUP_CRITERION_PAUSED_VALUE = 17;
    /**
     * <pre>
     * The ad group criterion has been paused due to prolonged low activity in
     * serving. Contributes to AdGroupCriterionPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_PAUSED_DUE_TO_LOW_ACTIVITY = 18;</code>
     */
    public static final int AD_GROUP_CRITERION_PAUSED_DUE_TO_LOW_ACTIVITY_VALUE = 18;
    /**
     * <pre>
     * The user-specified ad group criterion status is removed. Contributes to
     * AdGroupCriterionPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>AD_GROUP_CRITERION_REMOVED = 19;</code>
     */
    public static final int AD_GROUP_CRITERION_REMOVED_VALUE = 19;


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
    public static AdGroupCriterionPrimaryStatusReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdGroupCriterionPrimaryStatusReason forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CAMPAIGN_PENDING;
        case 3: return CAMPAIGN_CRITERION_NEGATIVE;
        case 4: return CAMPAIGN_PAUSED;
        case 5: return CAMPAIGN_REMOVED;
        case 6: return CAMPAIGN_ENDED;
        case 7: return AD_GROUP_PAUSED;
        case 8: return AD_GROUP_REMOVED;
        case 9: return AD_GROUP_CRITERION_DISAPPROVED;
        case 10: return AD_GROUP_CRITERION_RARELY_SERVED;
        case 11: return AD_GROUP_CRITERION_LOW_QUALITY;
        case 12: return AD_GROUP_CRITERION_UNDER_REVIEW;
        case 13: return AD_GROUP_CRITERION_PENDING_REVIEW;
        case 14: return AD_GROUP_CRITERION_BELOW_FIRST_PAGE_BID;
        case 15: return AD_GROUP_CRITERION_NEGATIVE;
        case 16: return AD_GROUP_CRITERION_RESTRICTED;
        case 17: return AD_GROUP_CRITERION_PAUSED;
        case 18: return AD_GROUP_CRITERION_PAUSED_DUE_TO_LOW_ACTIVITY;
        case 19: return AD_GROUP_CRITERION_REMOVED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdGroupCriterionPrimaryStatusReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdGroupCriterionPrimaryStatusReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdGroupCriterionPrimaryStatusReason>() {
            public AdGroupCriterionPrimaryStatusReason findValueByNumber(int number) {
              return AdGroupCriterionPrimaryStatusReason.forNumber(number);
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
      return com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdGroupCriterionPrimaryStatusReason[] VALUES = values();

    public static AdGroupCriterionPrimaryStatusReason valueOf(
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

    private AdGroupCriterionPrimaryStatusReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.AdGroupCriterionPrimaryStatusReason)
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
    if (!(obj instanceof com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum other = (com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum) obj;

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

  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum prototype) {
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
   * Container for enum describing possible ad group criterion primary status
   * reasons.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum)
      com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupCriterionPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupCriterionPrimaryStatusReasonEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.class, com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.newBuilder()
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
      return com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupCriterionPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum build() {
      com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum buildPartial() {
      com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum result = new com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum(this);
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
      if (other instanceof com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum) {
        return mergeFrom((com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum other) {
      if (other == com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum)
  private static final com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum();
  }

  public static com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupCriterionPrimaryStatusReasonEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupCriterionPrimaryStatusReasonEnum>() {
    @java.lang.Override
    public AdGroupCriterionPrimaryStatusReasonEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdGroupCriterionPrimaryStatusReasonEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupCriterionPrimaryStatusReasonEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.enums.AdGroupCriterionPrimaryStatusReasonEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

