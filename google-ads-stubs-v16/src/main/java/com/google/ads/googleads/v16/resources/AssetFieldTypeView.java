// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/asset_field_type_view.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

/**
 * <pre>
 * An asset field type view.
 * This view reports non-overcounted metrics for each asset field type when the
 * asset is used as extension.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.resources.AssetFieldTypeView}
 */
public final class AssetFieldTypeView extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.resources.AssetFieldTypeView)
    AssetFieldTypeViewOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssetFieldTypeView.newBuilder() to construct.
  private AssetFieldTypeView(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssetFieldTypeView() {
    resourceName_ = "";
    fieldType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssetFieldTypeView();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.resources.AssetFieldTypeViewProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypeView_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.resources.AssetFieldTypeViewProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypeView_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.resources.AssetFieldTypeView.class, com.google.ads.googleads.v16.resources.AssetFieldTypeView.Builder.class);
  }

  public static final int RESOURCE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceName_ = "";
  /**
   * <pre>
   * Output only. The resource name of the asset field type view.
   * Asset field type view resource names have the form:
   *
   * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
   * Output only. The resource name of the asset field type view.
   * Asset field type view resource names have the form:
   *
   * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

  public static final int FIELD_TYPE_FIELD_NUMBER = 3;
  private int fieldType_ = 0;
  /**
   * <pre>
   * Output only. The asset field type of the asset field type view.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for fieldType.
   */
  @java.lang.Override public int getFieldTypeValue() {
    return fieldType_;
  }
  /**
   * <pre>
   * Output only. The asset field type of the asset field type view.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The fieldType.
   */
  @java.lang.Override public com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType getFieldType() {
    com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType result = com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.forNumber(fieldType_);
    return result == null ? com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.UNRECOGNIZED : result;
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
    if (fieldType_ != com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.UNSPECIFIED.getNumber()) {
      output.writeEnum(3, fieldType_);
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
    if (fieldType_ != com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, fieldType_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.resources.AssetFieldTypeView)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.resources.AssetFieldTypeView other = (com.google.ads.googleads.v16.resources.AssetFieldTypeView) obj;

    if (!getResourceName()
        .equals(other.getResourceName())) return false;
    if (fieldType_ != other.fieldType_) return false;
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
    hash = (37 * hash) + FIELD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + fieldType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.resources.AssetFieldTypeView prototype) {
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
   * An asset field type view.
   * This view reports non-overcounted metrics for each asset field type when the
   * asset is used as extension.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.resources.AssetFieldTypeView}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.resources.AssetFieldTypeView)
      com.google.ads.googleads.v16.resources.AssetFieldTypeViewOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.resources.AssetFieldTypeViewProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypeView_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.resources.AssetFieldTypeViewProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypeView_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.resources.AssetFieldTypeView.class, com.google.ads.googleads.v16.resources.AssetFieldTypeView.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.resources.AssetFieldTypeView.newBuilder()
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
      resourceName_ = "";
      fieldType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.resources.AssetFieldTypeViewProto.internal_static_google_ads_googleads_v16_resources_AssetFieldTypeView_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.AssetFieldTypeView getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.resources.AssetFieldTypeView.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.AssetFieldTypeView build() {
      com.google.ads.googleads.v16.resources.AssetFieldTypeView result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.AssetFieldTypeView buildPartial() {
      com.google.ads.googleads.v16.resources.AssetFieldTypeView result = new com.google.ads.googleads.v16.resources.AssetFieldTypeView(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.resources.AssetFieldTypeView result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceName_ = resourceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.fieldType_ = fieldType_;
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
      if (other instanceof com.google.ads.googleads.v16.resources.AssetFieldTypeView) {
        return mergeFrom((com.google.ads.googleads.v16.resources.AssetFieldTypeView)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.resources.AssetFieldTypeView other) {
      if (other == com.google.ads.googleads.v16.resources.AssetFieldTypeView.getDefaultInstance()) return this;
      if (!other.getResourceName().isEmpty()) {
        resourceName_ = other.resourceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.fieldType_ != 0) {
        setFieldTypeValue(other.getFieldTypeValue());
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
            case 24: {
              fieldType_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
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
     * Output only. The resource name of the asset field type view.
     * Asset field type view resource names have the form:
     *
     * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the asset field type view.
     * Asset field type view resource names have the form:
     *
     * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the asset field type view.
     * Asset field type view resource names have the form:
     *
     * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the asset field type view.
     * Asset field type view resource names have the form:
     *
     * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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
     * Output only. The resource name of the asset field type view.
     * Asset field type view resource names have the form:
     *
     * `customers/{customer_id}/assetFieldTypeViews/{field_type}`
     * </pre>
     *
     * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
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

    private int fieldType_ = 0;
    /**
     * <pre>
     * Output only. The asset field type of the asset field type view.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The enum numeric value on the wire for fieldType.
     */
    @java.lang.Override public int getFieldTypeValue() {
      return fieldType_;
    }
    /**
     * <pre>
     * Output only. The asset field type of the asset field type view.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The enum numeric value on the wire for fieldType to set.
     * @return This builder for chaining.
     */
    public Builder setFieldTypeValue(int value) {
      fieldType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The asset field type of the asset field type view.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The fieldType.
     */
    @java.lang.Override
    public com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType getFieldType() {
      com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType result = com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.forNumber(fieldType_);
      return result == null ? com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Output only. The asset field type of the asset field type view.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The fieldType to set.
     * @return This builder for chaining.
     */
    public Builder setFieldType(com.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      fieldType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. The asset field type of the asset field type view.
     * </pre>
     *
     * <code>.google.ads.googleads.v16.enums.AssetFieldTypeEnum.AssetFieldType field_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearFieldType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      fieldType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.resources.AssetFieldTypeView)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.resources.AssetFieldTypeView)
  private static final com.google.ads.googleads.v16.resources.AssetFieldTypeView DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.resources.AssetFieldTypeView();
  }

  public static com.google.ads.googleads.v16.resources.AssetFieldTypeView getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetFieldTypeView>
      PARSER = new com.google.protobuf.AbstractParser<AssetFieldTypeView>() {
    @java.lang.Override
    public AssetFieldTypeView parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetFieldTypeView> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetFieldTypeView> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.resources.AssetFieldTypeView getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

