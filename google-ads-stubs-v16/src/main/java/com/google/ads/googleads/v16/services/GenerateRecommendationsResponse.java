// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/recommendation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

/**
 * <pre>
 * Response message for
 * [RecommendationService.GenerateRecommendations][google.ads.googleads.v16.services.RecommendationService.GenerateRecommendations].
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v16.services.GenerateRecommendationsResponse}
 */
public final class GenerateRecommendationsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v16.services.GenerateRecommendationsResponse)
    GenerateRecommendationsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenerateRecommendationsResponse.newBuilder() to construct.
  private GenerateRecommendationsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenerateRecommendationsResponse() {
    recommendations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenerateRecommendationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v16.services.RecommendationServiceProto.internal_static_google_ads_googleads_v16_services_GenerateRecommendationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v16.services.RecommendationServiceProto.internal_static_google_ads_googleads_v16_services_GenerateRecommendationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v16.services.GenerateRecommendationsResponse.class, com.google.ads.googleads.v16.services.GenerateRecommendationsResponse.Builder.class);
  }

  public static final int RECOMMENDATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v16.resources.Recommendation> recommendations_;
  /**
   * <pre>
   * List of generated recommendations from the passed in set of requested
   * recommendation_types. If there isn't sufficient data to generate a
   * recommendation for the requested recommendation_types, the result set won't
   * contain a recommendation for that type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v16.resources.Recommendation> getRecommendationsList() {
    return recommendations_;
  }
  /**
   * <pre>
   * List of generated recommendations from the passed in set of requested
   * recommendation_types. If there isn't sufficient data to generate a
   * recommendation for the requested recommendation_types, the result set won't
   * contain a recommendation for that type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v16.resources.RecommendationOrBuilder> 
      getRecommendationsOrBuilderList() {
    return recommendations_;
  }
  /**
   * <pre>
   * List of generated recommendations from the passed in set of requested
   * recommendation_types. If there isn't sufficient data to generate a
   * recommendation for the requested recommendation_types, the result set won't
   * contain a recommendation for that type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public int getRecommendationsCount() {
    return recommendations_.size();
  }
  /**
   * <pre>
   * List of generated recommendations from the passed in set of requested
   * recommendation_types. If there isn't sufficient data to generate a
   * recommendation for the requested recommendation_types, the result set won't
   * contain a recommendation for that type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.resources.Recommendation getRecommendations(int index) {
    return recommendations_.get(index);
  }
  /**
   * <pre>
   * List of generated recommendations from the passed in set of requested
   * recommendation_types. If there isn't sufficient data to generate a
   * recommendation for the requested recommendation_types, the result set won't
   * contain a recommendation for that type.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v16.resources.RecommendationOrBuilder getRecommendationsOrBuilder(
      int index) {
    return recommendations_.get(index);
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
    for (int i = 0; i < recommendations_.size(); i++) {
      output.writeMessage(1, recommendations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < recommendations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, recommendations_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v16.services.GenerateRecommendationsResponse)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v16.services.GenerateRecommendationsResponse other = (com.google.ads.googleads.v16.services.GenerateRecommendationsResponse) obj;

    if (!getRecommendationsList()
        .equals(other.getRecommendationsList())) return false;
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
    if (getRecommendationsCount() > 0) {
      hash = (37 * hash) + RECOMMENDATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getRecommendationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v16.services.GenerateRecommendationsResponse prototype) {
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
   * [RecommendationService.GenerateRecommendations][google.ads.googleads.v16.services.RecommendationService.GenerateRecommendations].
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v16.services.GenerateRecommendationsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v16.services.GenerateRecommendationsResponse)
      com.google.ads.googleads.v16.services.GenerateRecommendationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v16.services.RecommendationServiceProto.internal_static_google_ads_googleads_v16_services_GenerateRecommendationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v16.services.RecommendationServiceProto.internal_static_google_ads_googleads_v16_services_GenerateRecommendationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v16.services.GenerateRecommendationsResponse.class, com.google.ads.googleads.v16.services.GenerateRecommendationsResponse.Builder.class);
    }

    // Construct using com.google.ads.googleads.v16.services.GenerateRecommendationsResponse.newBuilder()
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
      if (recommendationsBuilder_ == null) {
        recommendations_ = java.util.Collections.emptyList();
      } else {
        recommendations_ = null;
        recommendationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v16.services.RecommendationServiceProto.internal_static_google_ads_googleads_v16_services_GenerateRecommendationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GenerateRecommendationsResponse getDefaultInstanceForType() {
      return com.google.ads.googleads.v16.services.GenerateRecommendationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GenerateRecommendationsResponse build() {
      com.google.ads.googleads.v16.services.GenerateRecommendationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v16.services.GenerateRecommendationsResponse buildPartial() {
      com.google.ads.googleads.v16.services.GenerateRecommendationsResponse result = new com.google.ads.googleads.v16.services.GenerateRecommendationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v16.services.GenerateRecommendationsResponse result) {
      if (recommendationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          recommendations_ = java.util.Collections.unmodifiableList(recommendations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.recommendations_ = recommendations_;
      } else {
        result.recommendations_ = recommendationsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v16.services.GenerateRecommendationsResponse result) {
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
      if (other instanceof com.google.ads.googleads.v16.services.GenerateRecommendationsResponse) {
        return mergeFrom((com.google.ads.googleads.v16.services.GenerateRecommendationsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v16.services.GenerateRecommendationsResponse other) {
      if (other == com.google.ads.googleads.v16.services.GenerateRecommendationsResponse.getDefaultInstance()) return this;
      if (recommendationsBuilder_ == null) {
        if (!other.recommendations_.isEmpty()) {
          if (recommendations_.isEmpty()) {
            recommendations_ = other.recommendations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRecommendationsIsMutable();
            recommendations_.addAll(other.recommendations_);
          }
          onChanged();
        }
      } else {
        if (!other.recommendations_.isEmpty()) {
          if (recommendationsBuilder_.isEmpty()) {
            recommendationsBuilder_.dispose();
            recommendationsBuilder_ = null;
            recommendations_ = other.recommendations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            recommendationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRecommendationsFieldBuilder() : null;
          } else {
            recommendationsBuilder_.addAllMessages(other.recommendations_);
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
              com.google.ads.googleads.v16.resources.Recommendation m =
                  input.readMessage(
                      com.google.ads.googleads.v16.resources.Recommendation.parser(),
                      extensionRegistry);
              if (recommendationsBuilder_ == null) {
                ensureRecommendationsIsMutable();
                recommendations_.add(m);
              } else {
                recommendationsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v16.resources.Recommendation> recommendations_ =
      java.util.Collections.emptyList();
    private void ensureRecommendationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        recommendations_ = new java.util.ArrayList<com.google.ads.googleads.v16.resources.Recommendation>(recommendations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v16.resources.Recommendation, com.google.ads.googleads.v16.resources.Recommendation.Builder, com.google.ads.googleads.v16.resources.RecommendationOrBuilder> recommendationsBuilder_;

    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v16.resources.Recommendation> getRecommendationsList() {
      if (recommendationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(recommendations_);
      } else {
        return recommendationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public int getRecommendationsCount() {
      if (recommendationsBuilder_ == null) {
        return recommendations_.size();
      } else {
        return recommendationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public com.google.ads.googleads.v16.resources.Recommendation getRecommendations(int index) {
      if (recommendationsBuilder_ == null) {
        return recommendations_.get(index);
      } else {
        return recommendationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder setRecommendations(
        int index, com.google.ads.googleads.v16.resources.Recommendation value) {
      if (recommendationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendationsIsMutable();
        recommendations_.set(index, value);
        onChanged();
      } else {
        recommendationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder setRecommendations(
        int index, com.google.ads.googleads.v16.resources.Recommendation.Builder builderForValue) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        recommendations_.set(index, builderForValue.build());
        onChanged();
      } else {
        recommendationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder addRecommendations(com.google.ads.googleads.v16.resources.Recommendation value) {
      if (recommendationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendationsIsMutable();
        recommendations_.add(value);
        onChanged();
      } else {
        recommendationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder addRecommendations(
        int index, com.google.ads.googleads.v16.resources.Recommendation value) {
      if (recommendationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRecommendationsIsMutable();
        recommendations_.add(index, value);
        onChanged();
      } else {
        recommendationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder addRecommendations(
        com.google.ads.googleads.v16.resources.Recommendation.Builder builderForValue) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        recommendations_.add(builderForValue.build());
        onChanged();
      } else {
        recommendationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder addRecommendations(
        int index, com.google.ads.googleads.v16.resources.Recommendation.Builder builderForValue) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        recommendations_.add(index, builderForValue.build());
        onChanged();
      } else {
        recommendationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder addAllRecommendations(
        java.lang.Iterable<? extends com.google.ads.googleads.v16.resources.Recommendation> values) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, recommendations_);
        onChanged();
      } else {
        recommendationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder clearRecommendations() {
      if (recommendationsBuilder_ == null) {
        recommendations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        recommendationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public Builder removeRecommendations(int index) {
      if (recommendationsBuilder_ == null) {
        ensureRecommendationsIsMutable();
        recommendations_.remove(index);
        onChanged();
      } else {
        recommendationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public com.google.ads.googleads.v16.resources.Recommendation.Builder getRecommendationsBuilder(
        int index) {
      return getRecommendationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public com.google.ads.googleads.v16.resources.RecommendationOrBuilder getRecommendationsOrBuilder(
        int index) {
      if (recommendationsBuilder_ == null) {
        return recommendations_.get(index);  } else {
        return recommendationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v16.resources.RecommendationOrBuilder> 
         getRecommendationsOrBuilderList() {
      if (recommendationsBuilder_ != null) {
        return recommendationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(recommendations_);
      }
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public com.google.ads.googleads.v16.resources.Recommendation.Builder addRecommendationsBuilder() {
      return getRecommendationsFieldBuilder().addBuilder(
          com.google.ads.googleads.v16.resources.Recommendation.getDefaultInstance());
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public com.google.ads.googleads.v16.resources.Recommendation.Builder addRecommendationsBuilder(
        int index) {
      return getRecommendationsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v16.resources.Recommendation.getDefaultInstance());
    }
    /**
     * <pre>
     * List of generated recommendations from the passed in set of requested
     * recommendation_types. If there isn't sufficient data to generate a
     * recommendation for the requested recommendation_types, the result set won't
     * contain a recommendation for that type.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v16.resources.Recommendation recommendations = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v16.resources.Recommendation.Builder> 
         getRecommendationsBuilderList() {
      return getRecommendationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v16.resources.Recommendation, com.google.ads.googleads.v16.resources.Recommendation.Builder, com.google.ads.googleads.v16.resources.RecommendationOrBuilder> 
        getRecommendationsFieldBuilder() {
      if (recommendationsBuilder_ == null) {
        recommendationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v16.resources.Recommendation, com.google.ads.googleads.v16.resources.Recommendation.Builder, com.google.ads.googleads.v16.resources.RecommendationOrBuilder>(
                recommendations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        recommendations_ = null;
      }
      return recommendationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v16.services.GenerateRecommendationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v16.services.GenerateRecommendationsResponse)
  private static final com.google.ads.googleads.v16.services.GenerateRecommendationsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v16.services.GenerateRecommendationsResponse();
  }

  public static com.google.ads.googleads.v16.services.GenerateRecommendationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateRecommendationsResponse>
      PARSER = new com.google.protobuf.AbstractParser<GenerateRecommendationsResponse>() {
    @java.lang.Override
    public GenerateRecommendationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateRecommendationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateRecommendationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v16.services.GenerateRecommendationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

