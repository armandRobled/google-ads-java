// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/ad_asset.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * A call to action asset used inside an ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.AdCallToActionAsset}
 */
public final class AdCallToActionAsset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.AdCallToActionAsset)
    AdCallToActionAssetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdCallToActionAsset.newBuilder() to construct.
  private AdCallToActionAsset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdCallToActionAsset() {
    asset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdCallToActionAsset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.AdAssetProto.internal_static_google_ads_googleads_v16_common_AdCallToActionAsset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.AdAssetProto.internal_static_google_ads_googleads_v16_common_AdCallToActionAsset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.AdCallToActionAsset.class, com.google.ads.googleads.v16.common.AdCallToActionAsset.Builder.class);
  }

  private int bitField0_;
  public static final int ASSET_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object asset_ = "";
  /**
   * <pre>
   * The Asset resource name of this call to action asset.
   * </pre>
   *
   * <code>optional string asset = 1;</code>
   * @return Whether the asset field is set.
   */
  @java.lang.Override
  public boolean hasAsset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * The Asset resource name of this call to action asset.
   * </pre>
   *
   * <code>optional string asset = 1;</code>
   * @return The asset.
   */
  @java.lang.Override
  public java.lang.String getAsset() {
    java.lang.Object ref = asset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      asset_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Asset resource name of this call to action asset.
   * </pre>
   *
   * <code>optional string asset = 1;</code>
   * @return The bytes for asset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetBytes() {
    java.lang.Object ref = asset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      asset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, asset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, asset_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.AdCallToActionAsset)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.AdCallToActionAsset other = (com.google.ads.googleads.v16.common.AdCallToActionAsset) obj;

    if (hasAsset() != other.hasAsset()) return false;
    if (hasAsset()) {
      if (!getAsset()
          .equals(other.getAsset())) return false;
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
    if (hasAsset()) {
      hash = (37 * hash) + ASSET_FIELD_NUMBER;
      hash = (53 * hash) + getAsset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.AdCallToActionAsset parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.AdCallToActionAsset prototype) {
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
   * A call to action asset used inside an ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.AdCallToActionAsset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.AdCallToActionAsset)
      com.google.ads.googleads.v16.common.AdCallToActionAssetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.AdAssetProto.internal_static_google_ads_googleads_v16_common_AdCallToActionAsset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.AdAssetProto.internal_static_google_ads_googleads_v16_common_AdCallToActionAsset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.AdCallToActionAsset.class, com.google.ads.googleads.v16.common.AdCallToActionAsset.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.AdCallToActionAsset.newBuilder()
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
      asset_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.AdAssetProto.internal_static_google_ads_googleads_v16_common_AdCallToActionAsset_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AdCallToActionAsset getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.AdCallToActionAsset.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AdCallToActionAsset build() {
      com.google.ads.googleads.v16.common.AdCallToActionAsset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AdCallToActionAsset buildPartial() {
      com.google.ads.googleads.v16.common.AdCallToActionAsset result = new com.google.ads.googleads.v16.common.AdCallToActionAsset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.AdCallToActionAsset result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.asset_ = asset_;
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
      if (other instanceof com.google.ads.googleads.v16.common.AdCallToActionAsset) {
        return mergeFrom((com.google.ads.googleads.v16.common.AdCallToActionAsset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.AdCallToActionAsset other) {
      if (other == com.google.ads.googleads.v16.common.AdCallToActionAsset.getDefaultInstance()) return this;
      if (other.hasAsset()) {
        asset_ = other.asset_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              asset_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object asset_ = "";
    /**
     * <pre>
     * The Asset resource name of this call to action asset.
     * </pre>
     *
     * <code>optional string asset = 1;</code>
     * @return Whether the asset field is set.
     */
    public boolean hasAsset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The Asset resource name of this call to action asset.
     * </pre>
     *
     * <code>optional string asset = 1;</code>
     * @return The asset.
     */
    public java.lang.String getAsset() {
      java.lang.Object ref = asset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        asset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Asset resource name of this call to action asset.
     * </pre>
     *
     * <code>optional string asset = 1;</code>
     * @return The bytes for asset.
     */
    public com.google.protobuf.ByteString
        getAssetBytes() {
      java.lang.Object ref = asset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        asset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Asset resource name of this call to action asset.
     * </pre>
     *
     * <code>optional string asset = 1;</code>
     * @param value The asset to set.
     * @return This builder for chaining.
     */
    public Builder setAsset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      asset_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Asset resource name of this call to action asset.
     * </pre>
     *
     * <code>optional string asset = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAsset() {
      asset_ = getDefaultInstance().getAsset();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Asset resource name of this call to action asset.
     * </pre>
     *
     * <code>optional string asset = 1;</code>
     * @param value The bytes for asset to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      asset_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.AdCallToActionAsset)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.AdCallToActionAsset)
  private static final com.google.ads.googleads.v16.common.AdCallToActionAsset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.AdCallToActionAsset();
  }

  public static com.google.ads.googleads.v16.common.AdCallToActionAsset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdCallToActionAsset>
      PARSER = new com.google.protobuf.AbstractParser<AdCallToActionAsset>() {
    @java.lang.Override
    public AdCallToActionAsset parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdCallToActionAsset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdCallToActionAsset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.AdCallToActionAsset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

