// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/audience_insights_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

/**
 * <pre>
 * Response message for
 * [AudienceInsightsService.GenerateSuggestedTargetingInsights][google.ads.googleads.v16.services.AudienceInsightsService.GenerateSuggestedTargetingInsights].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse}
 */
public final class GenerateSuggestedTargetingInsightsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse)
    GenerateSuggestedTargetingInsightsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateSuggestedTargetingInsightsResponse.newBuilder() to construct.
  private GenerateSuggestedTargetingInsightsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateSuggestedTargetingInsightsResponse() {
    suggestions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateSuggestedTargetingInsightsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_GenerateSuggestedTargetingInsightsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_GenerateSuggestedTargetingInsightsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse.class, com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse.Builder.class);
  }

  public static final int SUGGESTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v16.services.TargetingSuggestionMetrics> suggestions_;
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v16.services.TargetingSuggestionMetrics> getSuggestionsList() {
    return suggestions_;
  }
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v16.services.TargetingSuggestionMetricsOrBuilder> 
      getSuggestionsOrBuilderList() {
    return suggestions_;
  }
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  @java.lang.Override
  public int getSuggestionsCount() {
    return suggestions_.size();
  }
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.services.TargetingSuggestionMetrics getSuggestions(int index) {
    return suggestions_.get(index);
  }
  /**
   * <pre>
   * Suggested insights for targetable audiences.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.services.TargetingSuggestionMetricsOrBuilder getSuggestionsOrBuilder(
      int index) {
    return suggestions_.get(index);
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
    for (int i = 0; i < suggestions_.size(); i++) {
      output.writeMessage(1, suggestions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < suggestions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, suggestions_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse other = (com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse) obj;

    if (!getSuggestionsList()
        .equals(other.getSuggestionsList())) return false;
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
    if (getSuggestionsCount() > 0) {
      hash = (37 * hash) + SUGGESTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getSuggestionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse prototype) {
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
   * Response message for
   * [AudienceInsightsService.GenerateSuggestedTargetingInsights][google.ads.googleads.v16.services.AudienceInsightsService.GenerateSuggestedTargetingInsights].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse)
      com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_GenerateSuggestedTargetingInsightsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_GenerateSuggestedTargetingInsightsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse.class, com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse.newBuilder()
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
      if (suggestionsBuilder_ == null) {
        suggestions_ = java.util.Collections.emptyList();
      } else {
        suggestions_ = null;
        suggestionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.services.AudienceInsightsServiceProto.internal_static_google_ads_googleads_v16_services_GenerateSuggestedTargetingInsightsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse build() {
      com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse buildPartial() {
      com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse result = new com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse result) {
      if (suggestionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          suggestions_ = java.util.Collections.unmodifiableList(suggestions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.suggestions_ = suggestions_;
      } else {
        result.suggestions_ = suggestionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse) {
        return mergeFrom((com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse other) {
      if (other == com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse.getDefaultInstance()) return this;
      if (suggestionsBuilder_ == null) {
        if (!other.suggestions_.isEmpty()) {
          if (suggestions_.isEmpty()) {
            suggestions_ = other.suggestions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSuggestionsIsMutable();
            suggestions_.addAll(other.suggestions_);
          }
          onChanged();
        }
      } else {
        if (!other.suggestions_.isEmpty()) {
          if (suggestionsBuilder_.isEmpty()) {
            suggestionsBuilder_.dispose();
            suggestionsBuilder_ = null;
            suggestions_ = other.suggestions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            suggestionsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSuggestionsFieldBuilder() : null;
          } else {
            suggestionsBuilder_.addAllMessages(other.suggestions_);
          }
        }
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
              com.google.ads.googleads.v16.services.TargetingSuggestionMetrics m =
                  input.readMessage(
                      com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.parser(),
                      extensionRegistry);
              if (suggestionsBuilder_ == null) {
                ensureSuggestionsIsMutable();
                suggestions_.add(m);
              } else {
                suggestionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.google.ads.googleads.v16.services.TargetingSuggestionMetrics> suggestions_ =
      java.util.Collections.emptyList();
    private void ensureSuggestionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        suggestions_ = new java.util.ArrayList<com.google.ads.googleads.v16.services.TargetingSuggestionMetrics>(suggestions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v16.services.TargetingSuggestionMetrics, com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder, com.google.ads.googleads.v16.services.TargetingSuggestionMetricsOrBuilder> suggestionsBuilder_;

    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v16.services.TargetingSuggestionMetrics> getSuggestionsList() {
      if (suggestionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(suggestions_);
      } else {
        return suggestionsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public int getSuggestionsCount() {
      if (suggestionsBuilder_ == null) {
        return suggestions_.size();
      } else {
        return suggestionsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public com.google.ads.googleads.v16.services.TargetingSuggestionMetrics getSuggestions(int index) {
      if (suggestionsBuilder_ == null) {
        return suggestions_.get(index);
      } else {
        return suggestionsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder setSuggestions(
        int index, com.google.ads.googleads.v16.services.TargetingSuggestionMetrics value) {
      if (suggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSuggestionsIsMutable();
        suggestions_.set(index, value);
        onChanged();
      } else {
        suggestionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder setSuggestions(
        int index, com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder builderForValue) {
      if (suggestionsBuilder_ == null) {
        ensureSuggestionsIsMutable();
        suggestions_.set(index, builderForValue.build());
        onChanged();
      } else {
        suggestionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder addSuggestions(com.google.ads.googleads.v16.services.TargetingSuggestionMetrics value) {
      if (suggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSuggestionsIsMutable();
        suggestions_.add(value);
        onChanged();
      } else {
        suggestionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder addSuggestions(
        int index, com.google.ads.googleads.v16.services.TargetingSuggestionMetrics value) {
      if (suggestionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSuggestionsIsMutable();
        suggestions_.add(index, value);
        onChanged();
      } else {
        suggestionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder addSuggestions(
        com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder builderForValue) {
      if (suggestionsBuilder_ == null) {
        ensureSuggestionsIsMutable();
        suggestions_.add(builderForValue.build());
        onChanged();
      } else {
        suggestionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder addSuggestions(
        int index, com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder builderForValue) {
      if (suggestionsBuilder_ == null) {
        ensureSuggestionsIsMutable();
        suggestions_.add(index, builderForValue.build());
        onChanged();
      } else {
        suggestionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder addAllSuggestions(
        java.lang.Iterable<? extends com.google.ads.googleads.v16.services.TargetingSuggestionMetrics> values) {
      if (suggestionsBuilder_ == null) {
        ensureSuggestionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, suggestions_);
        onChanged();
      } else {
        suggestionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder clearSuggestions() {
      if (suggestionsBuilder_ == null) {
        suggestions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        suggestionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public Builder removeSuggestions(int index) {
      if (suggestionsBuilder_ == null) {
        ensureSuggestionsIsMutable();
        suggestions_.remove(index);
        onChanged();
      } else {
        suggestionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder getSuggestionsBuilder(
        int index) {
      return getSuggestionsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public com.google.ads.googleads.v16.services.TargetingSuggestionMetricsOrBuilder getSuggestionsOrBuilder(
        int index) {
      if (suggestionsBuilder_ == null) {
        return suggestions_.get(index);  } else {
        return suggestionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v16.services.TargetingSuggestionMetricsOrBuilder> 
         getSuggestionsOrBuilderList() {
      if (suggestionsBuilder_ != null) {
        return suggestionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(suggestions_);
      }
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder addSuggestionsBuilder() {
      return getSuggestionsFieldBuilder().addBuilder(
          com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.getDefaultInstance());
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder addSuggestionsBuilder(
        int index) {
      return getSuggestionsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.getDefaultInstance());
    }
    /**
     * <pre>
     * Suggested insights for targetable audiences.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.services.TargetingSuggestionMetrics suggestions = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder> 
         getSuggestionsBuilderList() {
      return getSuggestionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v16.services.TargetingSuggestionMetrics, com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder, com.google.ads.googleads.v16.services.TargetingSuggestionMetricsOrBuilder> 
        getSuggestionsFieldBuilder() {
      if (suggestionsBuilder_ == null) {
        suggestionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v16.services.TargetingSuggestionMetrics, com.google.ads.googleads.v16.services.TargetingSuggestionMetrics.Builder, com.google.ads.googleads.v16.services.TargetingSuggestionMetricsOrBuilder>(
                suggestions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        suggestions_ = null;
      }
      return suggestionsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse)
  private static final com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse();
  }

  public static com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateSuggestedTargetingInsightsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateSuggestedTargetingInsightsResponse>() {
    @java.lang.Override
    public GenerateSuggestedTargetingInsightsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateSuggestedTargetingInsightsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateSuggestedTargetingInsightsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.services.GenerateSuggestedTargetingInsightsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

