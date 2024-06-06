// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/conversion_goal_campaign_config_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

/**
 * <pre>
 * The result for the conversion goal campaign config mutate.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult}
 */
public final class MutateConversionGoalCampaignConfigResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult)
    MutateConversionGoalCampaignConfigResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutateConversionGoalCampaignConfigResult.newBuilder() to construct.
  private MutateConversionGoalCampaignConfigResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutateConversionGoalCampaignConfigResult() {
    resourceName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutateConversionGoalCampaignConfigResult();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v17_services_MutateConversionGoalCampaignConfigResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v17_services_MutateConversionGoalCampaignConfigResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult.class, com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult.Builder.class);
  }

  private int bitField0_;
  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  @java.lang.Override
  public java.lang.String getResourceName() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResourceNameBytes() {
    java.lang.Object ref = resourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      resourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONVERSION_GOAL_CAMPAIGN_CONFIG_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversionGoalCampaignConfig_;
  /**
   * <pre>
   * The mutated ConversionGoalCampaignConfig with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
   * @return Whether the conversionGoalCampaignConfig field is set.
   */
  @java.lang.Override
  public boolean hasConversionGoalCampaignConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The mutated ConversionGoalCampaignConfig with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
   * @return The conversionGoalCampaignConfig.
   */
  @java.lang.Override
  public com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig getConversionGoalCampaignConfig() {
    return conversionGoalCampaignConfig_ == null ? com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.getDefaultInstance() : conversionGoalCampaignConfig_;
  }
  /**
   * <pre>
   * The mutated ConversionGoalCampaignConfig with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfigOrBuilder getConversionGoalCampaignConfigOrBuilder() {
    return conversionGoalCampaignConfig_ == null ? com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.getDefaultInstance() : conversionGoalCampaignConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getConversionGoalCampaignConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConversionGoalCampaignConfig());
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
    if (!(obj instanceof com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult other = (com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (hasConversionGoalCampaignConfig() != other.hasConversionGoalCampaignConfig()) return false;
    if (hasConversionGoalCampaignConfig()) {
      if (!getConversionGoalCampaignConfig()
          .equals(other.getConversionGoalCampaignConfig())) return false;
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
    hash = (37 * hash) + RESOURCE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getResourceName().hashCode();
    if (hasConversionGoalCampaignConfig()) {
      hash = (37 * hash) + CONVERSION_GOAL_CAMPAIGN_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConversionGoalCampaignConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult prototype) {
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
   * The result for the conversion goal campaign config mutate.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult)
      com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v17_services_MutateConversionGoalCampaignConfigResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v17_services_MutateConversionGoalCampaignConfigResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult.class, com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getConversionGoalCampaignConfigFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceName_ = "";
      conversionGoalCampaignConfig_ = null;
      if (conversionGoalCampaignConfigBuilder_ != null) {
        conversionGoalCampaignConfigBuilder_.dispose();
        conversionGoalCampaignConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.services.ConversionGoalCampaignConfigServiceProto.internal_static_google_ads_googleads_v17_services_MutateConversionGoalCampaignConfigResult_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult build() {
      com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult buildPartial() {
      com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult result = new com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.conversionGoalCampaignConfig_ = conversionGoalCampaignConfigBuilder_ == null
            ? conversionGoalCampaignConfig_
            : conversionGoalCampaignConfigBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult) {
        return mergeFrom((com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult other) {
      if (other == com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasConversionGoalCampaignConfig()) {
        mergeConversionGoalCampaignConfig(other.getConversionGoalCampaignConfig());
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
            case 10: {
              resourceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getConversionGoalCampaignConfigFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object resourceName_ = "";
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The resourceName.
     */
    public java.lang.String getResourceName() {
      java.lang.Object ref = resourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return The bytes for resourceName.
     */
    public com.google.protobuf.ByteString
        getResourceNameBytes() {
      java.lang.Object ref = resourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        resourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearResourceName() {
      resourceName_ = getDefaultInstance().getResourceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Returned for successful operations.
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
     * @param value The bytes for resourceName to set.
     * @return This builder for chaining.
     */
    public Builder setResourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      resourceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversionGoalCampaignConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig, com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.Builder, com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfigOrBuilder> conversionGoalCampaignConfigBuilder_;
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     * @return Whether the conversionGoalCampaignConfig field is set.
     */
    public boolean hasConversionGoalCampaignConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     * @return The conversionGoalCampaignConfig.
     */
    public com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig getConversionGoalCampaignConfig() {
      if (conversionGoalCampaignConfigBuilder_ == null) {
        return conversionGoalCampaignConfig_ == null ? com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.getDefaultInstance() : conversionGoalCampaignConfig_;
      } else {
        return conversionGoalCampaignConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     */
    public Builder setConversionGoalCampaignConfig(com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig value) {
      if (conversionGoalCampaignConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        conversionGoalCampaignConfig_ = value;
      } else {
        conversionGoalCampaignConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     */
    public Builder setConversionGoalCampaignConfig(
        com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.Builder builderForValue) {
      if (conversionGoalCampaignConfigBuilder_ == null) {
        conversionGoalCampaignConfig_ = builderForValue.build();
      } else {
        conversionGoalCampaignConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     */
    public Builder mergeConversionGoalCampaignConfig(com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig value) {
      if (conversionGoalCampaignConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          conversionGoalCampaignConfig_ != null &&
          conversionGoalCampaignConfig_ != com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.getDefaultInstance()) {
          getConversionGoalCampaignConfigBuilder().mergeFrom(value);
        } else {
          conversionGoalCampaignConfig_ = value;
        }
      } else {
        conversionGoalCampaignConfigBuilder_.mergeFrom(value);
      }
      if (conversionGoalCampaignConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     */
    public Builder clearConversionGoalCampaignConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      conversionGoalCampaignConfig_ = null;
      if (conversionGoalCampaignConfigBuilder_ != null) {
        conversionGoalCampaignConfigBuilder_.dispose();
        conversionGoalCampaignConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     */
    public com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.Builder getConversionGoalCampaignConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getConversionGoalCampaignConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     */
    public com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfigOrBuilder getConversionGoalCampaignConfigOrBuilder() {
      if (conversionGoalCampaignConfigBuilder_ != null) {
        return conversionGoalCampaignConfigBuilder_.getMessageOrBuilder();
      } else {
        return conversionGoalCampaignConfig_ == null ?
            com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.getDefaultInstance() : conversionGoalCampaignConfig_;
      }
    }
    /**
     * <pre>
     * The mutated ConversionGoalCampaignConfig with only mutable fields after
     * mutate. The field will only be returned when response_content_type is set
     * to "MUTABLE_RESOURCE".
     * </pre>
     *
     * <code>.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig conversion_goal_campaign_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig, com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.Builder, com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfigOrBuilder> 
        getConversionGoalCampaignConfigFieldBuilder() {
      if (conversionGoalCampaignConfigBuilder_ == null) {
        conversionGoalCampaignConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig, com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfig.Builder, com.google.ads.googleads.v17.resources.ConversionGoalCampaignConfigOrBuilder>(
                getConversionGoalCampaignConfig(),
                getParentForChildren(),
                isClean());
        conversionGoalCampaignConfig_ = null;
      }
      return conversionGoalCampaignConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult)
  private static final com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult();
  }

  public static com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutateConversionGoalCampaignConfigResult>
      PARSER = new com.google.protobuf.AbstractParser<MutateConversionGoalCampaignConfigResult>() {
    @java.lang.Override
    public MutateConversionGoalCampaignConfigResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<MutateConversionGoalCampaignConfigResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutateConversionGoalCampaignConfigResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.services.MutateConversionGoalCampaignConfigResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

