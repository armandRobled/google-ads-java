// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

/**
 * <pre>
 * Audience metrics for the planned products.
 * These metrics consider the following targeting dimensions:
 *
 * - Location
 * - PlannableAgeRange
 * - Gender
 * - AudienceTargeting (only for youtube_audience_size)
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.services.OnTargetAudienceMetrics}
 */
public final class OnTargetAudienceMetrics extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.services.OnTargetAudienceMetrics)
    OnTargetAudienceMetricsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OnTargetAudienceMetrics.newBuilder() to construct.
  private OnTargetAudienceMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OnTargetAudienceMetrics() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OnTargetAudienceMetrics();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v17_services_OnTargetAudienceMetrics_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v17_services_OnTargetAudienceMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.services.OnTargetAudienceMetrics.class, com.google.ads.googleads.v17.services.OnTargetAudienceMetrics.Builder.class);
  }

  private int bitField0_;
  public static final int YOUTUBE_AUDIENCE_SIZE_FIELD_NUMBER = 3;
  private long youtubeAudienceSize_ = 0L;
  /**
   * <pre>
   * Reference audience size matching the considered targeting for YouTube.
   * </pre>
   *
   * <code>optional int64 youtube_audience_size = 3;</code>
   * @return Whether the youtubeAudienceSize field is set.
   */
  @java.lang.Override
  public boolean hasYoutubeAudienceSize() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Reference audience size matching the considered targeting for YouTube.
   * </pre>
   *
   * <code>optional int64 youtube_audience_size = 3;</code>
   * @return The youtubeAudienceSize.
   */
  @java.lang.Override
  public long getYoutubeAudienceSize() {
    return youtubeAudienceSize_;
  }

  public static final int CENSUS_AUDIENCE_SIZE_FIELD_NUMBER = 4;
  private long censusAudienceSize_ = 0L;
  /**
   * <pre>
   * Reference audience size matching the considered targeting for Census.
   * </pre>
   *
   * <code>optional int64 census_audience_size = 4;</code>
   * @return Whether the censusAudienceSize field is set.
   */
  @java.lang.Override
  public boolean hasCensusAudienceSize() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * Reference audience size matching the considered targeting for Census.
   * </pre>
   *
   * <code>optional int64 census_audience_size = 4;</code>
   * @return The censusAudienceSize.
   */
  @java.lang.Override
  public long getCensusAudienceSize() {
    return censusAudienceSize_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(3, youtubeAudienceSize_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(4, censusAudienceSize_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, youtubeAudienceSize_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, censusAudienceSize_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v17.services.OnTargetAudienceMetrics)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.services.OnTargetAudienceMetrics other = (com.google.ads.googleads.v17.services.OnTargetAudienceMetrics) obj;

    if (hasYoutubeAudienceSize() != other.hasYoutubeAudienceSize()) return false;
    if (hasYoutubeAudienceSize()) {
      if (getYoutubeAudienceSize()
          != other.getYoutubeAudienceSize()) return false;
    }
    if (hasCensusAudienceSize() != other.hasCensusAudienceSize()) return false;
    if (hasCensusAudienceSize()) {
      if (getCensusAudienceSize()
          != other.getCensusAudienceSize()) return false;
    }
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
    if (hasYoutubeAudienceSize()) {
      hash = (37 * hash) + YOUTUBE_AUDIENCE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getYoutubeAudienceSize());
    }
    if (hasCensusAudienceSize()) {
      hash = (37 * hash) + CENSUS_AUDIENCE_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getCensusAudienceSize());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.services.OnTargetAudienceMetrics prototype) {
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
   * Audience metrics for the planned products.
   * These metrics consider the following targeting dimensions:
   *
   * - Location
   * - PlannableAgeRange
   * - Gender
   * - AudienceTargeting (only for youtube_audience_size)
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.services.OnTargetAudienceMetrics}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.services.OnTargetAudienceMetrics)
      com.google.ads.googleads.v17.services.OnTargetAudienceMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v17_services_OnTargetAudienceMetrics_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v17_services_OnTargetAudienceMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.services.OnTargetAudienceMetrics.class, com.google.ads.googleads.v17.services.OnTargetAudienceMetrics.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.services.OnTargetAudienceMetrics.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      youtubeAudienceSize_ = 0L;
      censusAudienceSize_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v17_services_OnTargetAudienceMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.OnTargetAudienceMetrics getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.services.OnTargetAudienceMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.OnTargetAudienceMetrics build() {
      com.google.ads.googleads.v17.services.OnTargetAudienceMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.OnTargetAudienceMetrics buildPartial() {
      com.google.ads.googleads.v17.services.OnTargetAudienceMetrics result = new com.google.ads.googleads.v17.services.OnTargetAudienceMetrics(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v17.services.OnTargetAudienceMetrics result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.youtubeAudienceSize_ = youtubeAudienceSize_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.censusAudienceSize_ = censusAudienceSize_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.ads.googleads.v17.services.OnTargetAudienceMetrics) {
        return mergeFrom((com.google.ads.googleads.v17.services.OnTargetAudienceMetrics)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.services.OnTargetAudienceMetrics other) {
      if (other == com.google.ads.googleads.v17.services.OnTargetAudienceMetrics.getDefaultInstance()) return this;
      if (other.hasYoutubeAudienceSize()) {
        setYoutubeAudienceSize(other.getYoutubeAudienceSize());
      }
      if (other.hasCensusAudienceSize()) {
        setCensusAudienceSize(other.getCensusAudienceSize());
      }
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
            case 24: {
              youtubeAudienceSize_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 24
            case 32: {
              censusAudienceSize_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 32
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
    private int bitField0_;

    private long youtubeAudienceSize_ ;
    /**
     * <pre>
     * Reference audience size matching the considered targeting for YouTube.
     * </pre>
     *
     * <code>optional int64 youtube_audience_size = 3;</code>
     * @return Whether the youtubeAudienceSize field is set.
     */
    @java.lang.Override
    public boolean hasYoutubeAudienceSize() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Reference audience size matching the considered targeting for YouTube.
     * </pre>
     *
     * <code>optional int64 youtube_audience_size = 3;</code>
     * @return The youtubeAudienceSize.
     */
    @java.lang.Override
    public long getYoutubeAudienceSize() {
      return youtubeAudienceSize_;
    }
    /**
     * <pre>
     * Reference audience size matching the considered targeting for YouTube.
     * </pre>
     *
     * <code>optional int64 youtube_audience_size = 3;</code>
     * @param value The youtubeAudienceSize to set.
     * @return This builder for chaining.
     */
    public Builder setYoutubeAudienceSize(long value) {

      youtubeAudienceSize_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reference audience size matching the considered targeting for YouTube.
     * </pre>
     *
     * <code>optional int64 youtube_audience_size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearYoutubeAudienceSize() {
      bitField0_ = (bitField0_ & ~0x00000001);
      youtubeAudienceSize_ = 0L;
      onChanged();
      return this;
    }

    private long censusAudienceSize_ ;
    /**
     * <pre>
     * Reference audience size matching the considered targeting for Census.
     * </pre>
     *
     * <code>optional int64 census_audience_size = 4;</code>
     * @return Whether the censusAudienceSize field is set.
     */
    @java.lang.Override
    public boolean hasCensusAudienceSize() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * Reference audience size matching the considered targeting for Census.
     * </pre>
     *
     * <code>optional int64 census_audience_size = 4;</code>
     * @return The censusAudienceSize.
     */
    @java.lang.Override
    public long getCensusAudienceSize() {
      return censusAudienceSize_;
    }
    /**
     * <pre>
     * Reference audience size matching the considered targeting for Census.
     * </pre>
     *
     * <code>optional int64 census_audience_size = 4;</code>
     * @param value The censusAudienceSize to set.
     * @return This builder for chaining.
     */
    public Builder setCensusAudienceSize(long value) {

      censusAudienceSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Reference audience size matching the considered targeting for Census.
     * </pre>
     *
     * <code>optional int64 census_audience_size = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearCensusAudienceSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      censusAudienceSize_ = 0L;
      onChanged();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.services.OnTargetAudienceMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.services.OnTargetAudienceMetrics)
  private static final com.google.ads.googleads.v17.services.OnTargetAudienceMetrics DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.services.OnTargetAudienceMetrics();
  }

  public static com.google.ads.googleads.v17.services.OnTargetAudienceMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnTargetAudienceMetrics>
      PARSER = new com.google.protobuf.AbstractParser<OnTargetAudienceMetrics>() {
    @java.lang.Override
    public OnTargetAudienceMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<OnTargetAudienceMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnTargetAudienceMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.services.OnTargetAudienceMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

