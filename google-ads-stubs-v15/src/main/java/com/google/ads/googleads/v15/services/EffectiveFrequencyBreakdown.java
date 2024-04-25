// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * A breakdown of the number of unique people reached at a given effective
 * frequency.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.EffectiveFrequencyBreakdown}
 */
public final class EffectiveFrequencyBreakdown extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.EffectiveFrequencyBreakdown)
    EffectiveFrequencyBreakdownOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EffectiveFrequencyBreakdown.newBuilder() to construct.
  private EffectiveFrequencyBreakdown(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EffectiveFrequencyBreakdown() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EffectiveFrequencyBreakdown();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyBreakdown_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyBreakdown_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown.class, com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown.Builder.class);
  }

  private int bitField0_;
  public static final int EFFECTIVE_FREQUENCY_FIELD_NUMBER = 1;
  private int effectiveFrequency_ = 0;
  /**
   * <pre>
   * The effective frequency [1-10].
   * </pre>
   *
   * <code>int32 effective_frequency = 1;</code>
   * @return The effectiveFrequency.
   */
  @java.lang.Override
  public int getEffectiveFrequency() {
    return effectiveFrequency_;
  }

  public static final int ON_TARGET_REACH_FIELD_NUMBER = 2;
  private long onTargetReach_ = 0L;
  /**
   * <pre>
   * The number of unique people reached at least effective_frequency times that
   * exactly matches the Targeting.
   *
   * Note that a minimum number of unique people must be reached in order for
   * data to be reported. If the minimum number is not met, the on_target_reach
   * value will be rounded to 0.
   * </pre>
   *
   * <code>int64 on_target_reach = 2;</code>
   * @return The onTargetReach.
   */
  @java.lang.Override
  public long getOnTargetReach() {
    return onTargetReach_;
  }

  public static final int TOTAL_REACH_FIELD_NUMBER = 3;
  private long totalReach_ = 0L;
  /**
   * <pre>
   * Total number of unique people reached at least effective_frequency times.
   * This includes people that may fall outside the specified Targeting.
   *
   * Note that a minimum number of unique people must be reached in order for
   * data to be reported. If the minimum number is not met, the total_reach
   * value will be rounded to 0.
   * </pre>
   *
   * <code>int64 total_reach = 3;</code>
   * @return The totalReach.
   */
  @java.lang.Override
  public long getTotalReach() {
    return totalReach_;
  }

  public static final int EFFECTIVE_COVIEW_REACH_FIELD_NUMBER = 4;
  private long effectiveCoviewReach_ = 0L;
  /**
   * <pre>
   * The number of users (including co-viewing users) reached for the associated
   * effective_frequency value.
   * </pre>
   *
   * <code>optional int64 effective_coview_reach = 4;</code>
   * @return Whether the effectiveCoviewReach field is set.
   */
  @java.lang.Override
  public boolean hasEffectiveCoviewReach() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The number of users (including co-viewing users) reached for the associated
   * effective_frequency value.
   * </pre>
   *
   * <code>optional int64 effective_coview_reach = 4;</code>
   * @return The effectiveCoviewReach.
   */
  @java.lang.Override
  public long getEffectiveCoviewReach() {
    return effectiveCoviewReach_;
  }

  public static final int ON_TARGET_EFFECTIVE_COVIEW_REACH_FIELD_NUMBER = 5;
  private long onTargetEffectiveCoviewReach_ = 0L;
  /**
   * <pre>
   * The number of users (including co-viewing users) reached for the associated
   * effective_frequency value within the specified plan demographic.
   * </pre>
   *
   * <code>optional int64 on_target_effective_coview_reach = 5;</code>
   * @return Whether the onTargetEffectiveCoviewReach field is set.
   */
  @java.lang.Override
  public boolean hasOnTargetEffectiveCoviewReach() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <pre>
   * The number of users (including co-viewing users) reached for the associated
   * effective_frequency value within the specified plan demographic.
   * </pre>
   *
   * <code>optional int64 on_target_effective_coview_reach = 5;</code>
   * @return The onTargetEffectiveCoviewReach.
   */
  @java.lang.Override
  public long getOnTargetEffectiveCoviewReach() {
    return onTargetEffectiveCoviewReach_;
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
    if (effectiveFrequency_ != 0) {
      output.writeInt32(1, effectiveFrequency_);
    }
    if (onTargetReach_ != 0L) {
      output.writeInt64(2, onTargetReach_);
    }
    if (totalReach_ != 0L) {
      output.writeInt64(3, totalReach_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(4, effectiveCoviewReach_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(5, onTargetEffectiveCoviewReach_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (effectiveFrequency_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, effectiveFrequency_);
    }
    if (onTargetReach_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, onTargetReach_);
    }
    if (totalReach_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, totalReach_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, effectiveCoviewReach_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, onTargetEffectiveCoviewReach_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown other = (com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown) obj;

    if (getEffectiveFrequency()
        != other.getEffectiveFrequency()) return false;
    if (getOnTargetReach()
        != other.getOnTargetReach()) return false;
    if (getTotalReach()
        != other.getTotalReach()) return false;
    if (hasEffectiveCoviewReach() != other.hasEffectiveCoviewReach()) return false;
    if (hasEffectiveCoviewReach()) {
      if (getEffectiveCoviewReach()
          != other.getEffectiveCoviewReach()) return false;
    }
    if (hasOnTargetEffectiveCoviewReach() != other.hasOnTargetEffectiveCoviewReach()) return false;
    if (hasOnTargetEffectiveCoviewReach()) {
      if (getOnTargetEffectiveCoviewReach()
          != other.getOnTargetEffectiveCoviewReach()) return false;
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
    hash = (37 * hash) + EFFECTIVE_FREQUENCY_FIELD_NUMBER;
    hash = (53 * hash) + getEffectiveFrequency();
    hash = (37 * hash) + ON_TARGET_REACH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getOnTargetReach());
    hash = (37 * hash) + TOTAL_REACH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalReach());
    if (hasEffectiveCoviewReach()) {
      hash = (37 * hash) + EFFECTIVE_COVIEW_REACH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEffectiveCoviewReach());
    }
    if (hasOnTargetEffectiveCoviewReach()) {
      hash = (37 * hash) + ON_TARGET_EFFECTIVE_COVIEW_REACH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getOnTargetEffectiveCoviewReach());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown prototype) {
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
   * A breakdown of the number of unique people reached at a given effective
   * frequency.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.EffectiveFrequencyBreakdown}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.EffectiveFrequencyBreakdown)
      com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdownOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyBreakdown_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyBreakdown_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown.class, com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown.newBuilder()
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
      effectiveFrequency_ = 0;
      onTargetReach_ = 0L;
      totalReach_ = 0L;
      effectiveCoviewReach_ = 0L;
      onTargetEffectiveCoviewReach_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyBreakdown_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown build() {
      com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown buildPartial() {
      com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown result = new com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.effectiveFrequency_ = effectiveFrequency_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.onTargetReach_ = onTargetReach_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.totalReach_ = totalReach_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.effectiveCoviewReach_ = effectiveCoviewReach_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.onTargetEffectiveCoviewReach_ = onTargetEffectiveCoviewReach_;
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
      if (other instanceof com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown) {
        return mergeFrom((com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown other) {
      if (other == com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown.getDefaultInstance()) return this;
      if (other.getEffectiveFrequency() != 0) {
        setEffectiveFrequency(other.getEffectiveFrequency());
      }
      if (other.getOnTargetReach() != 0L) {
        setOnTargetReach(other.getOnTargetReach());
      }
      if (other.getTotalReach() != 0L) {
        setTotalReach(other.getTotalReach());
      }
      if (other.hasEffectiveCoviewReach()) {
        setEffectiveCoviewReach(other.getEffectiveCoviewReach());
      }
      if (other.hasOnTargetEffectiveCoviewReach()) {
        setOnTargetEffectiveCoviewReach(other.getOnTargetEffectiveCoviewReach());
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
            case 8: {
              effectiveFrequency_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              onTargetReach_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              totalReach_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              effectiveCoviewReach_ = input.readInt64();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              onTargetEffectiveCoviewReach_ = input.readInt64();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
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

    private int effectiveFrequency_ ;
    /**
     * <pre>
     * The effective frequency [1-10].
     * </pre>
     *
     * <code>int32 effective_frequency = 1;</code>
     * @return The effectiveFrequency.
     */
    @java.lang.Override
    public int getEffectiveFrequency() {
      return effectiveFrequency_;
    }
    /**
     * <pre>
     * The effective frequency [1-10].
     * </pre>
     *
     * <code>int32 effective_frequency = 1;</code>
     * @param value The effectiveFrequency to set.
     * @return This builder for chaining.
     */
    public Builder setEffectiveFrequency(int value) {

      effectiveFrequency_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The effective frequency [1-10].
     * </pre>
     *
     * <code>int32 effective_frequency = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEffectiveFrequency() {
      bitField0_ = (bitField0_ & ~0x00000001);
      effectiveFrequency_ = 0;
      onChanged();
      return this;
    }

    private long onTargetReach_ ;
    /**
     * <pre>
     * The number of unique people reached at least effective_frequency times that
     * exactly matches the Targeting.
     *
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the on_target_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 on_target_reach = 2;</code>
     * @return The onTargetReach.
     */
    @java.lang.Override
    public long getOnTargetReach() {
      return onTargetReach_;
    }
    /**
     * <pre>
     * The number of unique people reached at least effective_frequency times that
     * exactly matches the Targeting.
     *
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the on_target_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 on_target_reach = 2;</code>
     * @param value The onTargetReach to set.
     * @return This builder for chaining.
     */
    public Builder setOnTargetReach(long value) {

      onTargetReach_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of unique people reached at least effective_frequency times that
     * exactly matches the Targeting.
     *
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the on_target_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 on_target_reach = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnTargetReach() {
      bitField0_ = (bitField0_ & ~0x00000002);
      onTargetReach_ = 0L;
      onChanged();
      return this;
    }

    private long totalReach_ ;
    /**
     * <pre>
     * Total number of unique people reached at least effective_frequency times.
     * This includes people that may fall outside the specified Targeting.
     *
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the total_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 total_reach = 3;</code>
     * @return The totalReach.
     */
    @java.lang.Override
    public long getTotalReach() {
      return totalReach_;
    }
    /**
     * <pre>
     * Total number of unique people reached at least effective_frequency times.
     * This includes people that may fall outside the specified Targeting.
     *
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the total_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 total_reach = 3;</code>
     * @param value The totalReach to set.
     * @return This builder for chaining.
     */
    public Builder setTotalReach(long value) {

      totalReach_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Total number of unique people reached at least effective_frequency times.
     * This includes people that may fall outside the specified Targeting.
     *
     * Note that a minimum number of unique people must be reached in order for
     * data to be reported. If the minimum number is not met, the total_reach
     * value will be rounded to 0.
     * </pre>
     *
     * <code>int64 total_reach = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalReach() {
      bitField0_ = (bitField0_ & ~0x00000004);
      totalReach_ = 0L;
      onChanged();
      return this;
    }

    private long effectiveCoviewReach_ ;
    /**
     * <pre>
     * The number of users (including co-viewing users) reached for the associated
     * effective_frequency value.
     * </pre>
     *
     * <code>optional int64 effective_coview_reach = 4;</code>
     * @return Whether the effectiveCoviewReach field is set.
     */
    @java.lang.Override
    public boolean hasEffectiveCoviewReach() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The number of users (including co-viewing users) reached for the associated
     * effective_frequency value.
     * </pre>
     *
     * <code>optional int64 effective_coview_reach = 4;</code>
     * @return The effectiveCoviewReach.
     */
    @java.lang.Override
    public long getEffectiveCoviewReach() {
      return effectiveCoviewReach_;
    }
    /**
     * <pre>
     * The number of users (including co-viewing users) reached for the associated
     * effective_frequency value.
     * </pre>
     *
     * <code>optional int64 effective_coview_reach = 4;</code>
     * @param value The effectiveCoviewReach to set.
     * @return This builder for chaining.
     */
    public Builder setEffectiveCoviewReach(long value) {

      effectiveCoviewReach_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of users (including co-viewing users) reached for the associated
     * effective_frequency value.
     * </pre>
     *
     * <code>optional int64 effective_coview_reach = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEffectiveCoviewReach() {
      bitField0_ = (bitField0_ & ~0x00000008);
      effectiveCoviewReach_ = 0L;
      onChanged();
      return this;
    }

    private long onTargetEffectiveCoviewReach_ ;
    /**
     * <pre>
     * The number of users (including co-viewing users) reached for the associated
     * effective_frequency value within the specified plan demographic.
     * </pre>
     *
     * <code>optional int64 on_target_effective_coview_reach = 5;</code>
     * @return Whether the onTargetEffectiveCoviewReach field is set.
     */
    @java.lang.Override
    public boolean hasOnTargetEffectiveCoviewReach() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * The number of users (including co-viewing users) reached for the associated
     * effective_frequency value within the specified plan demographic.
     * </pre>
     *
     * <code>optional int64 on_target_effective_coview_reach = 5;</code>
     * @return The onTargetEffectiveCoviewReach.
     */
    @java.lang.Override
    public long getOnTargetEffectiveCoviewReach() {
      return onTargetEffectiveCoviewReach_;
    }
    /**
     * <pre>
     * The number of users (including co-viewing users) reached for the associated
     * effective_frequency value within the specified plan demographic.
     * </pre>
     *
     * <code>optional int64 on_target_effective_coview_reach = 5;</code>
     * @param value The onTargetEffectiveCoviewReach to set.
     * @return This builder for chaining.
     */
    public Builder setOnTargetEffectiveCoviewReach(long value) {

      onTargetEffectiveCoviewReach_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of users (including co-viewing users) reached for the associated
     * effective_frequency value within the specified plan demographic.
     * </pre>
     *
     * <code>optional int64 on_target_effective_coview_reach = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOnTargetEffectiveCoviewReach() {
      bitField0_ = (bitField0_ & ~0x00000010);
      onTargetEffectiveCoviewReach_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.EffectiveFrequencyBreakdown)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.EffectiveFrequencyBreakdown)
  private static final com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown();
  }

  public static com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EffectiveFrequencyBreakdown>
      PARSER = new com.google.protobuf.AbstractParser<EffectiveFrequencyBreakdown>() {
    @java.lang.Override
    public EffectiveFrequencyBreakdown parsePartialFrom(
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

  public static com.google.protobuf.Parser<EffectiveFrequencyBreakdown> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EffectiveFrequencyBreakdown> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.EffectiveFrequencyBreakdown getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

