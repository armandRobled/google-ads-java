// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/common/local_services.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.common;

/**
 * <pre>
 * A Local Services Document with read only accessible data.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.common.LocalServicesDocumentReadOnly}
 */
public final class LocalServicesDocumentReadOnly extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.common.LocalServicesDocumentReadOnly)
    LocalServicesDocumentReadOnlyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalServicesDocumentReadOnly.newBuilder() to construct.
  private LocalServicesDocumentReadOnly(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalServicesDocumentReadOnly() {
    documentUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocalServicesDocumentReadOnly();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.common.LocalServicesProto.internal_static_google_ads_googleads_v16_common_LocalServicesDocumentReadOnly_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.common.LocalServicesProto.internal_static_google_ads_googleads_v16_common_LocalServicesDocumentReadOnly_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly.class, com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly.Builder.class);
  }

  private int bitField0_;
  public static final int DOCUMENT_URL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object documentUrl_ = "";
  /**
   * <pre>
   * URL to access an already uploaded Local Services document.
   * </pre>
   *
   * <code>optional string document_url = 1;</code>
   * @return Whether the documentUrl field is set.
   */
  @java.lang.Override
  public boolean hasDocumentUrl() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * URL to access an already uploaded Local Services document.
   * </pre>
   *
   * <code>optional string document_url = 1;</code>
   * @return The documentUrl.
   */
  @java.lang.Override
  public java.lang.String getDocumentUrl() {
    java.lang.Object ref = documentUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      documentUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * URL to access an already uploaded Local Services document.
   * </pre>
   *
   * <code>optional string document_url = 1;</code>
   * @return The bytes for documentUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDocumentUrlBytes() {
    java.lang.Object ref = documentUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      documentUrl_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, documentUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, documentUrl_);
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
    if (!(obj instanceof com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly other = (com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly) obj;

    if (hasDocumentUrl() != other.hasDocumentUrl()) return false;
    if (hasDocumentUrl()) {
      if (!getDocumentUrl()
          .equals(other.getDocumentUrl())) return false;
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
    if (hasDocumentUrl()) {
      hash = (37 * hash) + DOCUMENT_URL_FIELD_NUMBER;
      hash = (53 * hash) + getDocumentUrl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly prototype) {
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
   * A Local Services Document with read only accessible data.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.common.LocalServicesDocumentReadOnly}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.common.LocalServicesDocumentReadOnly)
      com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnlyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.common.LocalServicesProto.internal_static_google_ads_googleads_v16_common_LocalServicesDocumentReadOnly_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.common.LocalServicesProto.internal_static_google_ads_googleads_v16_common_LocalServicesDocumentReadOnly_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly.class, com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly.newBuilder()
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
      documentUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.common.LocalServicesProto.internal_static_google_ads_googleads_v16_common_LocalServicesDocumentReadOnly_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly build() {
      com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly buildPartial() {
      com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly result = new com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.documentUrl_ = documentUrl_;
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
      if (other instanceof com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly) {
        return mergeFrom((com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly other) {
      if (other == com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly.getDefaultInstance()) return this;
      if (other.hasDocumentUrl()) {
        documentUrl_ = other.documentUrl_;
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
              documentUrl_ = input.readStringRequireUtf8();
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

    private java.lang.Object documentUrl_ = "";
    /**
     * <pre>
     * URL to access an already uploaded Local Services document.
     * </pre>
     *
     * <code>optional string document_url = 1;</code>
     * @return Whether the documentUrl field is set.
     */
    public boolean hasDocumentUrl() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * URL to access an already uploaded Local Services document.
     * </pre>
     *
     * <code>optional string document_url = 1;</code>
     * @return The documentUrl.
     */
    public java.lang.String getDocumentUrl() {
      java.lang.Object ref = documentUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        documentUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * URL to access an already uploaded Local Services document.
     * </pre>
     *
     * <code>optional string document_url = 1;</code>
     * @return The bytes for documentUrl.
     */
    public com.google.protobuf.ByteString
        getDocumentUrlBytes() {
      java.lang.Object ref = documentUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        documentUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * URL to access an already uploaded Local Services document.
     * </pre>
     *
     * <code>optional string document_url = 1;</code>
     * @param value The documentUrl to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      documentUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL to access an already uploaded Local Services document.
     * </pre>
     *
     * <code>optional string document_url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDocumentUrl() {
      documentUrl_ = getDefaultInstance().getDocumentUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * URL to access an already uploaded Local Services document.
     * </pre>
     *
     * <code>optional string document_url = 1;</code>
     * @param value The bytes for documentUrl to set.
     * @return This builder for chaining.
     */
    public Builder setDocumentUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      documentUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.common.LocalServicesDocumentReadOnly)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.common.LocalServicesDocumentReadOnly)
  private static final com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly();
  }

  public static com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalServicesDocumentReadOnly>
      PARSER = new com.google.protobuf.AbstractParser<LocalServicesDocumentReadOnly>() {
    @java.lang.Override
    public LocalServicesDocumentReadOnly parsePartialFrom(
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

  public static com.google.protobuf.Parser<LocalServicesDocumentReadOnly> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalServicesDocumentReadOnly> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

