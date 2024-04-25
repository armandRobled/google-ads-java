// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * The response message for
 * [AudienceInsightsService.GenerateInsightsFinderReport][google.ads.googleads.v15.services.AudienceInsightsService.GenerateInsightsFinderReport],
 * containing the shareable URL for the report.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse}
 */
public final class GenerateInsightsFinderReportResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse)
    GenerateInsightsFinderReportResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateInsightsFinderReportResponse.newBuilder() to construct.
  private GenerateInsightsFinderReportResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateInsightsFinderReportResponse() {
    savedReportUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateInsightsFinderReportResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v15_services_GenerateInsightsFinderReportResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v15_services_GenerateInsightsFinderReportResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse.class, com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse.Builder.class);
  }

  public static final int SAVED_REPORT_URL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object savedReportUrl_ = "";
  /**
   * <pre>
   * An HTTPS URL providing a deep link into the Insights Finder UI with the
   * report inputs filled in according to the request.
   * </pre>
   *
   * <code>string saved_report_url = 1;</code>
   * @return The savedReportUrl.
   */
  @java.lang.Override
  public java.lang.String getSavedReportUrl() {
    java.lang.Object ref = savedReportUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      savedReportUrl_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * An HTTPS URL providing a deep link into the Insights Finder UI with the
   * report inputs filled in according to the request.
   * </pre>
   *
   * <code>string saved_report_url = 1;</code>
   * @return The bytes for savedReportUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSavedReportUrlBytes() {
    java.lang.Object ref = savedReportUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      savedReportUrl_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(savedReportUrl_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, savedReportUrl_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(savedReportUrl_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, savedReportUrl_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse other = (com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse) obj;

    if (!getSavedReportUrl()
        .equals(other.getSavedReportUrl())) return false;
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
    hash = (37 * hash) + SAVED_REPORT_URL_FIELD_NUMBER;
    hash = (53 * hash) + getSavedReportUrl().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse prototype) {
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
   * The response message for
   * [AudienceInsightsService.GenerateInsightsFinderReport][google.ads.googleads.v15.services.AudienceInsightsService.GenerateInsightsFinderReport],
   * containing the shareable URL for the report.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse)
      com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v15_services_GenerateInsightsFinderReportResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v15_services_GenerateInsightsFinderReportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse.class, com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse.newBuilder()
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
      savedReportUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v15_services_GenerateInsightsFinderReportResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse build() {
      com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse buildPartial() {
      com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse result = new com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.savedReportUrl_ = savedReportUrl_;
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
      if (other instanceof com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse) {
        return mergeFrom((com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse other) {
      if (other == com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse.getDefaultInstance()) return this;
      if (!other.getSavedReportUrl().isEmpty()) {
        savedReportUrl_ = other.savedReportUrl_;
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
              savedReportUrl_ = input.readStringRequireUtf8();
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

    private java.lang.Object savedReportUrl_ = "";
    /**
     * <pre>
     * An HTTPS URL providing a deep link into the Insights Finder UI with the
     * report inputs filled in according to the request.
     * </pre>
     *
     * <code>string saved_report_url = 1;</code>
     * @return The savedReportUrl.
     */
    public java.lang.String getSavedReportUrl() {
      java.lang.Object ref = savedReportUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        savedReportUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * An HTTPS URL providing a deep link into the Insights Finder UI with the
     * report inputs filled in according to the request.
     * </pre>
     *
     * <code>string saved_report_url = 1;</code>
     * @return The bytes for savedReportUrl.
     */
    public com.google.protobuf.ByteString
        getSavedReportUrlBytes() {
      java.lang.Object ref = savedReportUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        savedReportUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * An HTTPS URL providing a deep link into the Insights Finder UI with the
     * report inputs filled in according to the request.
     * </pre>
     *
     * <code>string saved_report_url = 1;</code>
     * @param value The savedReportUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSavedReportUrl(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      savedReportUrl_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An HTTPS URL providing a deep link into the Insights Finder UI with the
     * report inputs filled in according to the request.
     * </pre>
     *
     * <code>string saved_report_url = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSavedReportUrl() {
      savedReportUrl_ = getDefaultInstance().getSavedReportUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * An HTTPS URL providing a deep link into the Insights Finder UI with the
     * report inputs filled in according to the request.
     * </pre>
     *
     * <code>string saved_report_url = 1;</code>
     * @param value The bytes for savedReportUrl to set.
     * @return This builder for chaining.
     */
    public Builder setSavedReportUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      savedReportUrl_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse)
  private static final com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse();
  }

  public static com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateInsightsFinderReportResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateInsightsFinderReportResponse>() {
    @java.lang.Override
    public GenerateInsightsFinderReportResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateInsightsFinderReportResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateInsightsFinderReportResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.GenerateInsightsFinderReportResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

