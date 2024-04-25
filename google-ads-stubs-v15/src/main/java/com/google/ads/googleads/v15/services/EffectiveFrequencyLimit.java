// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * Effective frequency limit.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.EffectiveFrequencyLimit}
 */
public final class EffectiveFrequencyLimit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.EffectiveFrequencyLimit)
    EffectiveFrequencyLimitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EffectiveFrequencyLimit.newBuilder() to construct.
  private EffectiveFrequencyLimit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EffectiveFrequencyLimit() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EffectiveFrequencyLimit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyLimit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyLimit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.EffectiveFrequencyLimit.class, com.google.ads.googleads.v15.services.EffectiveFrequencyLimit.Builder.class);
  }

  public static final int EFFECTIVE_FREQUENCY_BREAKDOWN_LIMIT_FIELD_NUMBER = 1;
  private int effectiveFrequencyBreakdownLimit_ = 0;
  /**
   * <pre>
   * The highest effective frequency value to include in
   * Forecast.effective_frequency_breakdowns.
   * This field supports frequencies 1-10, inclusive.
   * </pre>
   *
   * <code>int32 effective_frequency_breakdown_limit = 1;</code>
   * @return The effectiveFrequencyBreakdownLimit.
   */
  @java.lang.Override
  public int getEffectiveFrequencyBreakdownLimit() {
    return effectiveFrequencyBreakdownLimit_;
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
    if (effectiveFrequencyBreakdownLimit_ != 0) {
      output.writeInt32(1, effectiveFrequencyBreakdownLimit_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (effectiveFrequencyBreakdownLimit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, effectiveFrequencyBreakdownLimit_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.services.EffectiveFrequencyLimit)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.EffectiveFrequencyLimit other = (com.google.ads.googleads.v15.services.EffectiveFrequencyLimit) obj;

    if (getEffectiveFrequencyBreakdownLimit()
        != other.getEffectiveFrequencyBreakdownLimit()) return false;
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
    hash = (37 * hash) + EFFECTIVE_FREQUENCY_BREAKDOWN_LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getEffectiveFrequencyBreakdownLimit();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.EffectiveFrequencyLimit prototype) {
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
   * Effective frequency limit.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.EffectiveFrequencyLimit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.EffectiveFrequencyLimit)
      com.google.ads.googleads.v15.services.EffectiveFrequencyLimitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyLimit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyLimit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.EffectiveFrequencyLimit.class, com.google.ads.googleads.v15.services.EffectiveFrequencyLimit.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.EffectiveFrequencyLimit.newBuilder()
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
      effectiveFrequencyBreakdownLimit_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.ReachPlanServiceProto.internal_static_google_ads_googleads_v15_services_EffectiveFrequencyLimit_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.EffectiveFrequencyLimit getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.EffectiveFrequencyLimit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.EffectiveFrequencyLimit build() {
      com.google.ads.googleads.v15.services.EffectiveFrequencyLimit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.EffectiveFrequencyLimit buildPartial() {
      com.google.ads.googleads.v15.services.EffectiveFrequencyLimit result = new com.google.ads.googleads.v15.services.EffectiveFrequencyLimit(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.EffectiveFrequencyLimit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.effectiveFrequencyBreakdownLimit_ = effectiveFrequencyBreakdownLimit_;
      }
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
      if (other instanceof com.google.ads.googleads.v15.services.EffectiveFrequencyLimit) {
        return mergeFrom((com.google.ads.googleads.v15.services.EffectiveFrequencyLimit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.EffectiveFrequencyLimit other) {
      if (other == com.google.ads.googleads.v15.services.EffectiveFrequencyLimit.getDefaultInstance()) return this;
      if (other.getEffectiveFrequencyBreakdownLimit() != 0) {
        setEffectiveFrequencyBreakdownLimit(other.getEffectiveFrequencyBreakdownLimit());
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
              effectiveFrequencyBreakdownLimit_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private int effectiveFrequencyBreakdownLimit_ ;
    /**
     * <pre>
     * The highest effective frequency value to include in
     * Forecast.effective_frequency_breakdowns.
     * This field supports frequencies 1-10, inclusive.
     * </pre>
     *
     * <code>int32 effective_frequency_breakdown_limit = 1;</code>
     * @return The effectiveFrequencyBreakdownLimit.
     */
    @java.lang.Override
    public int getEffectiveFrequencyBreakdownLimit() {
      return effectiveFrequencyBreakdownLimit_;
    }
    /**
     * <pre>
     * The highest effective frequency value to include in
     * Forecast.effective_frequency_breakdowns.
     * This field supports frequencies 1-10, inclusive.
     * </pre>
     *
     * <code>int32 effective_frequency_breakdown_limit = 1;</code>
     * @param value The effectiveFrequencyBreakdownLimit to set.
     * @return This builder for chaining.
     */
    public Builder setEffectiveFrequencyBreakdownLimit(int value) {

      effectiveFrequencyBreakdownLimit_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The highest effective frequency value to include in
     * Forecast.effective_frequency_breakdowns.
     * This field supports frequencies 1-10, inclusive.
     * </pre>
     *
     * <code>int32 effective_frequency_breakdown_limit = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEffectiveFrequencyBreakdownLimit() {
      bitField0_ = (bitField0_ & ~0x00000001);
      effectiveFrequencyBreakdownLimit_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.EffectiveFrequencyLimit)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.EffectiveFrequencyLimit)
  private static final com.google.ads.googleads.v15.services.EffectiveFrequencyLimit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.EffectiveFrequencyLimit();
  }

  public static com.google.ads.googleads.v15.services.EffectiveFrequencyLimit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EffectiveFrequencyLimit>
      PARSER = new com.google.protobuf.AbstractParser<EffectiveFrequencyLimit>() {
    @java.lang.Override
    public EffectiveFrequencyLimit parsePartialFrom(
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

  public static com.google.protobuf.Parser<EffectiveFrequencyLimit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EffectiveFrequencyLimit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.EffectiveFrequencyLimit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

