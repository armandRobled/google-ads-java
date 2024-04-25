// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/asset_usage.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * Contains the usage information of the asset.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.AssetUsage}
 */
public final class AssetUsage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.AssetUsage)
    AssetUsageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetUsage.newBuilder() to construct.
  private AssetUsage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetUsage() {
    asset_ = "";
    servedAssetFieldType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetUsage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.AssetUsageProto.internal_static_google_ads_googleads_v16_common_AssetUsage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.AssetUsageProto.internal_static_google_ads_googleads_v16_common_AssetUsage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.AssetUsage.class, com.google.ads.googleads.v16.common.AssetUsage.Builder.class);
  }

  public static final int ASSET_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object asset_ = "";
  /**
   * <pre>
   * Resource name of the asset.
   * </pre>
   *
   * <code>string asset = 1;</code>
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
   * Resource name of the asset.
   * </pre>
   *
   * <code>string asset = 1;</code>
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

  public static final int SERVED_ASSET_FIELD_TYPE_FIELD_NUMBER = 2;
  private int servedAssetFieldType_ = 0;
  /**
   * <pre>
   * The served field type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
   * @return The enum numeric value on the wire for servedAssetFieldType.
   */
  @java.lang.Override public int getServedAssetFieldTypeValue() {
    return servedAssetFieldType_;
  }
  /**
   * <pre>
   * The served field type of the asset.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
   * @return The servedAssetFieldType.
   */
  @java.lang.Override public com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType getServedAssetFieldType() {
    com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType result = com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType.forNumber(servedAssetFieldType_);
    return result == null ? com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, asset_);
    }
    if (servedAssetFieldType_ != com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType.UNSPECIFIED.getNumber()) {
      output.writeEnum(2, servedAssetFieldType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, asset_);
    }
    if (servedAssetFieldType_ != com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, servedAssetFieldType_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.AssetUsage)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.AssetUsage other = (com.google.ads.googleads.v16.common.AssetUsage) obj;

    if (!getAsset()
        .equals(other.getAsset())) return false;
    if (servedAssetFieldType_ != other.servedAssetFieldType_) return false;
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
    hash = (37 * hash) + ASSET_FIELD_NUMBER;
    hash = (53 * hash) + getAsset().hashCode();
    hash = (37 * hash) + SERVED_ASSET_FIELD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + servedAssetFieldType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.AssetUsage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.AssetUsage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.AssetUsage parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.AssetUsage prototype) {
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
   * Contains the usage information of the asset.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.AssetUsage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.AssetUsage)
      com.google.ads.googleads.v16.common.AssetUsageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.AssetUsageProto.internal_static_google_ads_googleads_v16_common_AssetUsage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.AssetUsageProto.internal_static_google_ads_googleads_v16_common_AssetUsage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.AssetUsage.class, com.google.ads.googleads.v16.common.AssetUsage.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.AssetUsage.newBuilder()
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
      servedAssetFieldType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.AssetUsageProto.internal_static_google_ads_googleads_v16_common_AssetUsage_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AssetUsage getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.AssetUsage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AssetUsage build() {
      com.google.ads.googleads.v16.common.AssetUsage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.AssetUsage buildPartial() {
      com.google.ads.googleads.v16.common.AssetUsage result = new com.google.ads.googleads.v16.common.AssetUsage(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.AssetUsage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.asset_ = asset_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.servedAssetFieldType_ = servedAssetFieldType_;
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
      if (other instanceof com.google.ads.googleads.v16.common.AssetUsage) {
        return mergeFrom((com.google.ads.googleads.v16.common.AssetUsage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.AssetUsage other) {
      if (other == com.google.ads.googleads.v16.common.AssetUsage.getDefaultInstance()) return this;
      if (!other.getAsset().isEmpty()) {
        asset_ = other.asset_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.servedAssetFieldType_ != 0) {
        setServedAssetFieldTypeValue(other.getServedAssetFieldTypeValue());
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
            case 16: {
              servedAssetFieldType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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
     * Resource name of the asset.
     * </pre>
     *
     * <code>string asset = 1;</code>
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
     * Resource name of the asset.
     * </pre>
     *
     * <code>string asset = 1;</code>
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
     * Resource name of the asset.
     * </pre>
     *
     * <code>string asset = 1;</code>
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
     * Resource name of the asset.
     * </pre>
     *
     * <code>string asset = 1;</code>
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
     * Resource name of the asset.
     * </pre>
     *
     * <code>string asset = 1;</code>
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

    private int servedAssetFieldType_ = 0;
    /**
     * <pre>
     * The served field type of the asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
     * @return The enum numeric value on the wire for servedAssetFieldType.
     */
    @java.lang.Override public int getServedAssetFieldTypeValue() {
      return servedAssetFieldType_;
    }
    /**
     * <pre>
     * The served field type of the asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
     * @param value The enum numeric value on the wire for servedAssetFieldType to set.
     * @return This builder for chaining.
     */
    public Builder setServedAssetFieldTypeValue(int value) {
      servedAssetFieldType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The served field type of the asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
     * @return The servedAssetFieldType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType getServedAssetFieldType() {
      com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType result = com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType.forNumber(servedAssetFieldType_);
      return result == null ? com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The served field type of the asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
     * @param value The servedAssetFieldType to set.
     * @return This builder for chaining.
     */
    public Builder setServedAssetFieldType(com.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      servedAssetFieldType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The served field type of the asset.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.ServedAssetFieldTypeEnum.ServedAssetFieldType served_asset_field_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearServedAssetFieldType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      servedAssetFieldType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.AssetUsage)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.AssetUsage)
  private static final com.google.ads.googleads.v16.common.AssetUsage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.AssetUsage();
  }

  public static com.google.ads.googleads.v16.common.AssetUsage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetUsage>
      PARSER = new com.google.protobuf.AbstractParser<AssetUsage>() {
    @java.lang.Override
    public AssetUsage parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetUsage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetUsage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.AssetUsage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

