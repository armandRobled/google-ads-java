// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/local_services_lead_conversation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

/**
 * <pre>
 * Represents details of text message in case of email, message or SMS.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.resources.MessageDetails}
 */
public final class MessageDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.resources.MessageDetails)
    MessageDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageDetails.newBuilder() to construct.
  private MessageDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageDetails() {
    text_ = "";
    attachmentUrls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MessageDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.resources.LocalServicesLeadConversationProto.internal_static_google_ads_googleads_v16_resources_MessageDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.resources.LocalServicesLeadConversationProto.internal_static_google_ads_googleads_v16_resources_MessageDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.resources.MessageDetails.class, com.google.ads.googleads.v16.resources.MessageDetails.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object text_ = "";
  /**
   * <pre>
   * Output only. Textual content of the message.
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Output only. Textual content of the message.
   * </pre>
   *
   * <code>string text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTACHMENT_URLS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList attachmentUrls_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * Output only. URL to the SMS or email attachments. These URLs can be used to
   * download the contents of the attachment by using the developer token.
   * </pre>
   *
   * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return A list containing the attachmentUrls.
   */
  public com.google.protobuf.ProtocolStringList
      getAttachmentUrlsList() {
    return attachmentUrls_;
  }
  /**
   * <pre>
   * Output only. URL to the SMS or email attachments. These URLs can be used to
   * download the contents of the attachment by using the developer token.
   * </pre>
   *
   * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The count of attachmentUrls.
   */
  public int getAttachmentUrlsCount() {
    return attachmentUrls_.size();
  }
  /**
   * <pre>
   * Output only. URL to the SMS or email attachments. These URLs can be used to
   * download the contents of the attachment by using the developer token.
   * </pre>
   *
   * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the element to return.
   * @return The attachmentUrls at the given index.
   */
  public java.lang.String getAttachmentUrls(int index) {
    return attachmentUrls_.get(index);
  }
  /**
   * <pre>
   * Output only. URL to the SMS or email attachments. These URLs can be used to
   * download the contents of the attachment by using the developer token.
   * </pre>
   *
   * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @param index The index of the value to return.
   * @return The bytes of the attachmentUrls at the given index.
   */
  public com.google.protobuf.ByteString
      getAttachmentUrlsBytes(int index) {
    return attachmentUrls_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_);
    }
    for (int i = 0; i < attachmentUrls_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, attachmentUrls_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(text_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, text_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < attachmentUrls_.size(); i++) {
        dataSize += computeStringSizeNoTag(attachmentUrls_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAttachmentUrlsList().size();
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
    if (!(obj instanceof com.google.ads.googleads.v16.resources.MessageDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.resources.MessageDetails other = (com.google.ads.googleads.v16.resources.MessageDetails) obj;

    if (!getText()
        .equals(other.getText())) return false;
    if (!getAttachmentUrlsList()
        .equals(other.getAttachmentUrlsList())) return false;
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
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    if (getAttachmentUrlsCount() > 0) {
      hash = (37 * hash) + ATTACHMENT_URLS_FIELD_NUMBER;
      hash = (53 * hash) + getAttachmentUrlsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.resources.MessageDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.resources.MessageDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.resources.MessageDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.resources.MessageDetails prototype) {
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
   * Represents details of text message in case of email, message or SMS.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.resources.MessageDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.resources.MessageDetails)
      com.google.ads.googleads.v16.resources.MessageDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.resources.LocalServicesLeadConversationProto.internal_static_google_ads_googleads_v16_resources_MessageDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.resources.LocalServicesLeadConversationProto.internal_static_google_ads_googleads_v16_resources_MessageDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.resources.MessageDetails.class, com.google.ads.googleads.v16.resources.MessageDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.resources.MessageDetails.newBuilder()
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
      text_ = "";
      attachmentUrls_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.resources.LocalServicesLeadConversationProto.internal_static_google_ads_googleads_v16_resources_MessageDetails_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.MessageDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.resources.MessageDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.MessageDetails build() {
      com.google.ads.googleads.v16.resources.MessageDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.resources.MessageDetails buildPartial() {
      com.google.ads.googleads.v16.resources.MessageDetails result = new com.google.ads.googleads.v16.resources.MessageDetails(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v16.resources.MessageDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        attachmentUrls_.makeImmutable();
        result.attachmentUrls_ = attachmentUrls_;
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
      if (other instanceof com.google.ads.googleads.v16.resources.MessageDetails) {
        return mergeFrom((com.google.ads.googleads.v16.resources.MessageDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.resources.MessageDetails other) {
      if (other == com.google.ads.googleads.v16.resources.MessageDetails.getDefaultInstance()) return this;
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.attachmentUrls_.isEmpty()) {
        if (attachmentUrls_.isEmpty()) {
          attachmentUrls_ = other.attachmentUrls_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAttachmentUrlsIsMutable();
          attachmentUrls_.addAll(other.attachmentUrls_);
        }
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
              text_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAttachmentUrlsIsMutable();
              attachmentUrls_.add(s);
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

    private java.lang.Object text_ = "";
    /**
     * <pre>
     * Output only. Textual content of the message.
     * </pre>
     *
     * <code>string text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Output only. Textual content of the message.
     * </pre>
     *
     * <code>string text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Output only. Textual content of the message.
     * </pre>
     *
     * <code>string text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Textual content of the message.
     * </pre>
     *
     * <code>string text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = getDefaultInstance().getText();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. Textual content of the message.
     * </pre>
     *
     * <code>string text = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      text_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList attachmentUrls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAttachmentUrlsIsMutable() {
      if (!attachmentUrls_.isModifiable()) {
        attachmentUrls_ = new com.google.protobuf.LazyStringArrayList(attachmentUrls_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return A list containing the attachmentUrls.
     */
    public com.google.protobuf.ProtocolStringList
        getAttachmentUrlsList() {
      attachmentUrls_.makeImmutable();
      return attachmentUrls_;
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return The count of attachmentUrls.
     */
    public int getAttachmentUrlsCount() {
      return attachmentUrls_.size();
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the element to return.
     * @return The attachmentUrls at the given index.
     */
    public java.lang.String getAttachmentUrls(int index) {
      return attachmentUrls_.get(index);
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index of the value to return.
     * @return The bytes of the attachmentUrls at the given index.
     */
    public com.google.protobuf.ByteString
        getAttachmentUrlsBytes(int index) {
      return attachmentUrls_.getByteString(index);
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param index The index to set the value at.
     * @param value The attachmentUrls to set.
     * @return This builder for chaining.
     */
    public Builder setAttachmentUrls(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAttachmentUrlsIsMutable();
      attachmentUrls_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The attachmentUrls to add.
     * @return This builder for chaining.
     */
    public Builder addAttachmentUrls(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAttachmentUrlsIsMutable();
      attachmentUrls_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param values The attachmentUrls to add.
     * @return This builder for chaining.
     */
    public Builder addAllAttachmentUrls(
        java.lang.Iterable<java.lang.String> values) {
      ensureAttachmentUrlsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, attachmentUrls_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @return This builder for chaining.
     */
    public Builder clearAttachmentUrls() {
      attachmentUrls_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Output only. URL to the SMS or email attachments. These URLs can be used to
     * download the contents of the attachment by using the developer token.
     * </pre>
     *
     * <code>repeated string attachment_urls = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     * @param value The bytes of the attachmentUrls to add.
     * @return This builder for chaining.
     */
    public Builder addAttachmentUrlsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAttachmentUrlsIsMutable();
      attachmentUrls_.add(value);
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.resources.MessageDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.resources.MessageDetails)
  private static final com.google.ads.googleads.v16.resources.MessageDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.resources.MessageDetails();
  }

  public static com.google.ads.googleads.v16.resources.MessageDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageDetails>
      PARSER = new com.google.protobuf.AbstractParser<MessageDetails>() {
    @java.lang.Override
    public MessageDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<MessageDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.resources.MessageDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

