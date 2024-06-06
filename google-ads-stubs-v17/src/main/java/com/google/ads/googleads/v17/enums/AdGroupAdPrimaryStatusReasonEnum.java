// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/enums/ad_group_ad_primary_status_reason.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.enums;

/**
 * <pre>
 * AdGroupAd Primary Status Reason. Provides insight into why an ad group ad is
 * not serving or not serving optimally. These reasons are aggregated to
 * determine an overall AdGroupAdPrimaryStatus.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum}
 */
public final class AdGroupAdPrimaryStatusReasonEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum)
    AdGroupAdPrimaryStatusReasonEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdGroupAdPrimaryStatusReasonEnum.newBuilder() to construct.
  private AdGroupAdPrimaryStatusReasonEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdGroupAdPrimaryStatusReasonEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdGroupAdPrimaryStatusReasonEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupAdPrimaryStatusReasonEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupAdPrimaryStatusReasonEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.class, com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.Builder.class);
  }

  /**
   * <pre>
   * Possible ad group ad status reasons.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason}
   */
  public enum AdGroupAdPrimaryStatusReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * No value has been specified.
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
     * The user-specified campaign status is removed. Contributes to
     * AdGroupAdPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>CAMPAIGN_REMOVED = 2;</code>
     */
    CAMPAIGN_REMOVED(2),
    /**
     * <pre>
     * The user-specified campaign status is paused. Contributes to
     * AdGroupAdPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>CAMPAIGN_PAUSED = 3;</code>
     */
    CAMPAIGN_PAUSED(3),
    /**
     * <pre>
     * The user-specified time for this campaign to start is in the future.
     * Contributes to AdGroupAdPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>CAMPAIGN_PENDING = 4;</code>
     */
    CAMPAIGN_PENDING(4),
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed. Contributes
     * to AdGroupAdPrimaryStatus.ENDED.
     * </pre>
     *
     * <code>CAMPAIGN_ENDED = 5;</code>
     */
    CAMPAIGN_ENDED(5),
    /**
     * <pre>
     * The user-specified ad group status is paused. Contributes to
     * AdGroupAdPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_PAUSED = 6;</code>
     */
    AD_GROUP_PAUSED(6),
    /**
     * <pre>
     * The user-specified ad group status is removed. Contributes to
     * AdGroupAdPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>AD_GROUP_REMOVED = 7;</code>
     */
    AD_GROUP_REMOVED(7),
    /**
     * <pre>
     * The user-specified ad status is paused. Contributes to
     * AdGroupAdPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_AD_PAUSED = 8;</code>
     */
    AD_GROUP_AD_PAUSED(8),
    /**
     * <pre>
     * The user-specified ad status is removed. Contributes to
     * AdGroupAdPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>AD_GROUP_AD_REMOVED = 9;</code>
     */
    AD_GROUP_AD_REMOVED(9),
    /**
     * <pre>
     * The ad is disapproved. Contributes to
     * AdGroupAdPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_AD_DISAPPROVED = 10;</code>
     */
    AD_GROUP_AD_DISAPPROVED(10),
    /**
     * <pre>
     * The ad is under review. Contributes to AdGroupAdPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>AD_GROUP_AD_UNDER_REVIEW = 11;</code>
     */
    AD_GROUP_AD_UNDER_REVIEW(11),
    /**
     * <pre>
     * The ad is poor quality. This is determined by the serving stack that
     * served the Ad. Contributes to AdGroupAdPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_AD_POOR_QUALITY = 12;</code>
     */
    AD_GROUP_AD_POOR_QUALITY(12),
    /**
     * <pre>
     * No eligible ads instances could be generated. Contributes to
     * AdGroupAdPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>AD_GROUP_AD_NO_ADS = 13;</code>
     */
    AD_GROUP_AD_NO_ADS(13),
    /**
     * <pre>
     * The ad is internally labeled with a limiting label. Contributes to
     * AdGroupAdPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_AD_APPROVED_LABELED = 14;</code>
     */
    AD_GROUP_AD_APPROVED_LABELED(14),
    /**
     * <pre>
     * The ad is only serving in the user-specified area of interest.
     * Contributes to AdGroupAdPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_AD_AREA_OF_INTEREST_ONLY = 15;</code>
     */
    AD_GROUP_AD_AREA_OF_INTEREST_ONLY(15),
    /**
     * <pre>
     * The ad is part of an ongoing appeal. This reason does not impact
     * AdGroupAdPrimaryStatus.
     * </pre>
     *
     * <code>AD_GROUP_AD_UNDER_APPEAL = 16;</code>
     */
    AD_GROUP_AD_UNDER_APPEAL(16),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * No value has been specified.
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
     * The user-specified campaign status is removed. Contributes to
     * AdGroupAdPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>CAMPAIGN_REMOVED = 2;</code>
     */
    public static final int CAMPAIGN_REMOVED_VALUE = 2;
    /**
     * <pre>
     * The user-specified campaign status is paused. Contributes to
     * AdGroupAdPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>CAMPAIGN_PAUSED = 3;</code>
     */
    public static final int CAMPAIGN_PAUSED_VALUE = 3;
    /**
     * <pre>
     * The user-specified time for this campaign to start is in the future.
     * Contributes to AdGroupAdPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>CAMPAIGN_PENDING = 4;</code>
     */
    public static final int CAMPAIGN_PENDING_VALUE = 4;
    /**
     * <pre>
     * The user-specified time for this campaign to end has passed. Contributes
     * to AdGroupAdPrimaryStatus.ENDED.
     * </pre>
     *
     * <code>CAMPAIGN_ENDED = 5;</code>
     */
    public static final int CAMPAIGN_ENDED_VALUE = 5;
    /**
     * <pre>
     * The user-specified ad group status is paused. Contributes to
     * AdGroupAdPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_PAUSED = 6;</code>
     */
    public static final int AD_GROUP_PAUSED_VALUE = 6;
    /**
     * <pre>
     * The user-specified ad group status is removed. Contributes to
     * AdGroupAdPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>AD_GROUP_REMOVED = 7;</code>
     */
    public static final int AD_GROUP_REMOVED_VALUE = 7;
    /**
     * <pre>
     * The user-specified ad status is paused. Contributes to
     * AdGroupAdPrimaryStatus.PAUSED.
     * </pre>
     *
     * <code>AD_GROUP_AD_PAUSED = 8;</code>
     */
    public static final int AD_GROUP_AD_PAUSED_VALUE = 8;
    /**
     * <pre>
     * The user-specified ad status is removed. Contributes to
     * AdGroupAdPrimaryStatus.REMOVED.
     * </pre>
     *
     * <code>AD_GROUP_AD_REMOVED = 9;</code>
     */
    public static final int AD_GROUP_AD_REMOVED_VALUE = 9;
    /**
     * <pre>
     * The ad is disapproved. Contributes to
     * AdGroupAdPrimaryStatus.NOT_ELIGIBLE.
     * </pre>
     *
     * <code>AD_GROUP_AD_DISAPPROVED = 10;</code>
     */
    public static final int AD_GROUP_AD_DISAPPROVED_VALUE = 10;
    /**
     * <pre>
     * The ad is under review. Contributes to AdGroupAdPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>AD_GROUP_AD_UNDER_REVIEW = 11;</code>
     */
    public static final int AD_GROUP_AD_UNDER_REVIEW_VALUE = 11;
    /**
     * <pre>
     * The ad is poor quality. This is determined by the serving stack that
     * served the Ad. Contributes to AdGroupAdPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_AD_POOR_QUALITY = 12;</code>
     */
    public static final int AD_GROUP_AD_POOR_QUALITY_VALUE = 12;
    /**
     * <pre>
     * No eligible ads instances could be generated. Contributes to
     * AdGroupAdPrimaryStatus.PENDING.
     * </pre>
     *
     * <code>AD_GROUP_AD_NO_ADS = 13;</code>
     */
    public static final int AD_GROUP_AD_NO_ADS_VALUE = 13;
    /**
     * <pre>
     * The ad is internally labeled with a limiting label. Contributes to
     * AdGroupAdPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_AD_APPROVED_LABELED = 14;</code>
     */
    public static final int AD_GROUP_AD_APPROVED_LABELED_VALUE = 14;
    /**
     * <pre>
     * The ad is only serving in the user-specified area of interest.
     * Contributes to AdGroupAdPrimaryStatus.LIMITED.
     * </pre>
     *
     * <code>AD_GROUP_AD_AREA_OF_INTEREST_ONLY = 15;</code>
     */
    public static final int AD_GROUP_AD_AREA_OF_INTEREST_ONLY_VALUE = 15;
    /**
     * <pre>
     * The ad is part of an ongoing appeal. This reason does not impact
     * AdGroupAdPrimaryStatus.
     * </pre>
     *
     * <code>AD_GROUP_AD_UNDER_APPEAL = 16;</code>
     */
    public static final int AD_GROUP_AD_UNDER_APPEAL_VALUE = 16;


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
    public static AdGroupAdPrimaryStatusReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AdGroupAdPrimaryStatusReason forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CAMPAIGN_REMOVED;
        case 3: return CAMPAIGN_PAUSED;
        case 4: return CAMPAIGN_PENDING;
        case 5: return CAMPAIGN_ENDED;
        case 6: return AD_GROUP_PAUSED;
        case 7: return AD_GROUP_REMOVED;
        case 8: return AD_GROUP_AD_PAUSED;
        case 9: return AD_GROUP_AD_REMOVED;
        case 10: return AD_GROUP_AD_DISAPPROVED;
        case 11: return AD_GROUP_AD_UNDER_REVIEW;
        case 12: return AD_GROUP_AD_POOR_QUALITY;
        case 13: return AD_GROUP_AD_NO_ADS;
        case 14: return AD_GROUP_AD_APPROVED_LABELED;
        case 15: return AD_GROUP_AD_AREA_OF_INTEREST_ONLY;
        case 16: return AD_GROUP_AD_UNDER_APPEAL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AdGroupAdPrimaryStatusReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        AdGroupAdPrimaryStatusReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<AdGroupAdPrimaryStatusReason>() {
            public AdGroupAdPrimaryStatusReason findValueByNumber(int number) {
              return AdGroupAdPrimaryStatusReason.forNumber(number);
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
      return com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final AdGroupAdPrimaryStatusReason[] VALUES = values();

    public static AdGroupAdPrimaryStatusReason valueOf(
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

    private AdGroupAdPrimaryStatusReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.AdGroupAdPrimaryStatusReason)
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
    if (!(obj instanceof com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum other = (com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum) obj;

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

  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum prototype) {
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
   * AdGroupAd Primary Status Reason. Provides insight into why an ad group ad is
   * not serving or not serving optimally. These reasons are aggregated to
   * determine an overall AdGroupAdPrimaryStatus.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum)
      com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupAdPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupAdPrimaryStatusReasonEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.class, com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.newBuilder()
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
      return com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonProto.internal_static_google_ads_googleads_v17_enums_AdGroupAdPrimaryStatusReasonEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum build() {
      com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum buildPartial() {
      com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum result = new com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum(this);
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
      if (other instanceof com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum) {
        return mergeFrom((com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum other) {
      if (other == com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum)
  private static final com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum();
  }

  public static com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdGroupAdPrimaryStatusReasonEnum>
      PARSER = new com.google.protobuf.AbstractParser<AdGroupAdPrimaryStatusReasonEnum>() {
    @java.lang.Override
    public AdGroupAdPrimaryStatusReasonEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdGroupAdPrimaryStatusReasonEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdGroupAdPrimaryStatusReasonEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.enums.AdGroupAdPrimaryStatusReasonEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

