// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/simulation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * A container for simulation points for simulations of type PERCENT_CPC_BID.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.PercentCpcBidSimulationPointList}
 */
public final class PercentCpcBidSimulationPointList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.PercentCpcBidSimulationPointList)
    PercentCpcBidSimulationPointListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PercentCpcBidSimulationPointList.newBuilder() to construct.
  private PercentCpcBidSimulationPointList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PercentCpcBidSimulationPointList() {
    points_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PercentCpcBidSimulationPointList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.SimulationProto.internal_static_google_ads_googleads_v15_common_PercentCpcBidSimulationPointList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.SimulationProto.internal_static_google_ads_googleads_v15_common_PercentCpcBidSimulationPointList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList.class, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList.Builder.class);
  }

  public static final int POINTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint> points_;
  /**
   * <pre>
   * Projected metrics for a series of percent CPC bid amounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint> getPointsList() {
    return points_;
  }
  /**
   * <pre>
   * Projected metrics for a series of percent CPC bid amounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointOrBuilder> 
      getPointsOrBuilderList() {
    return points_;
  }
  /**
   * <pre>
   * Projected metrics for a series of percent CPC bid amounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
   */
  @java.lang.Override
  public int getPointsCount() {
    return points_.size();
  }
  /**
   * <pre>
   * Projected metrics for a series of percent CPC bid amounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint getPoints(int index) {
    return points_.get(index);
  }
  /**
   * <pre>
   * Projected metrics for a series of percent CPC bid amounts.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointOrBuilder getPointsOrBuilder(
      int index) {
    return points_.get(index);
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
    for (int i = 0; i < points_.size(); i++) {
      output.writeMessage(1, points_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < points_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, points_.get(i));
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
    if (!(obj instanceof com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList other = (com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList) obj;

    if (!getPointsList()
        .equals(other.getPointsList())) return false;
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
    if (getPointsCount() > 0) {
      hash = (37 * hash) + POINTS_FIELD_NUMBER;
      hash = (53 * hash) + getPointsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList prototype) {
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
   * A container for simulation points for simulations of type PERCENT_CPC_BID.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.PercentCpcBidSimulationPointList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.PercentCpcBidSimulationPointList)
      com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.SimulationProto.internal_static_google_ads_googleads_v15_common_PercentCpcBidSimulationPointList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.SimulationProto.internal_static_google_ads_googleads_v15_common_PercentCpcBidSimulationPointList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList.class, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList.newBuilder()
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
      if (pointsBuilder_ == null) {
        points_ = java.util.Collections.emptyList();
      } else {
        points_ = null;
        pointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.SimulationProto.internal_static_google_ads_googleads_v15_common_PercentCpcBidSimulationPointList_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList build() {
      com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList buildPartial() {
      com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList result = new com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList result) {
      if (pointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          points_ = java.util.Collections.unmodifiableList(points_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.points_ = points_;
      } else {
        result.points_ = pointsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList result) {
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
      if (other instanceof com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList) {
        return mergeFrom((com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList other) {
      if (other == com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList.getDefaultInstance()) return this;
      if (pointsBuilder_ == null) {
        if (!other.points_.isEmpty()) {
          if (points_.isEmpty()) {
            points_ = other.points_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePointsIsMutable();
            points_.addAll(other.points_);
          }
          onChanged();
        }
      } else {
        if (!other.points_.isEmpty()) {
          if (pointsBuilder_.isEmpty()) {
            pointsBuilder_.dispose();
            pointsBuilder_ = null;
            points_ = other.points_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pointsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPointsFieldBuilder() : null;
          } else {
            pointsBuilder_.addAllMessages(other.points_);
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
              com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint m =
                  input.readMessage(
                      com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.parser(),
                      extensionRegistry);
              if (pointsBuilder_ == null) {
                ensurePointsIsMutable();
                points_.add(m);
              } else {
                pointsBuilder_.addMessage(m);
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

    private java.util.List<com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint> points_ =
      java.util.Collections.emptyList();
    private void ensurePointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        points_ = new java.util.ArrayList<com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint>(points_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointOrBuilder> pointsBuilder_;

    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint> getPointsList() {
      if (pointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(points_);
      } else {
        return pointsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public int getPointsCount() {
      if (pointsBuilder_ == null) {
        return points_.size();
      } else {
        return pointsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint getPoints(int index) {
      if (pointsBuilder_ == null) {
        return points_.get(index);
      } else {
        return pointsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder setPoints(
        int index, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint value) {
      if (pointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointsIsMutable();
        points_.set(index, value);
        onChanged();
      } else {
        pointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder setPoints(
        int index, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder builderForValue) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        points_.set(index, builderForValue.build());
        onChanged();
      } else {
        pointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder addPoints(com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint value) {
      if (pointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointsIsMutable();
        points_.add(value);
        onChanged();
      } else {
        pointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder addPoints(
        int index, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint value) {
      if (pointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePointsIsMutable();
        points_.add(index, value);
        onChanged();
      } else {
        pointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder addPoints(
        com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder builderForValue) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        points_.add(builderForValue.build());
        onChanged();
      } else {
        pointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder addPoints(
        int index, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder builderForValue) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        points_.add(index, builderForValue.build());
        onChanged();
      } else {
        pointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder addAllPoints(
        java.lang.Iterable<? extends com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint> values) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, points_);
        onChanged();
      } else {
        pointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder clearPoints() {
      if (pointsBuilder_ == null) {
        points_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pointsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public Builder removePoints(int index) {
      if (pointsBuilder_ == null) {
        ensurePointsIsMutable();
        points_.remove(index);
        onChanged();
      } else {
        pointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder getPointsBuilder(
        int index) {
      return getPointsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointOrBuilder getPointsOrBuilder(
        int index) {
      if (pointsBuilder_ == null) {
        return points_.get(index);  } else {
        return pointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public java.util.List<? extends com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointOrBuilder> 
         getPointsOrBuilderList() {
      if (pointsBuilder_ != null) {
        return pointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(points_);
      }
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder addPointsBuilder() {
      return getPointsFieldBuilder().addBuilder(
          com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.getDefaultInstance());
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder addPointsBuilder(
        int index) {
      return getPointsFieldBuilder().addBuilder(
          index, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.getDefaultInstance());
    }
    /**
     * <pre>
     * Projected metrics for a series of percent CPC bid amounts.
     * </pre>
     *
     * <code>repeated .google.ads.googleads.v15.common.PercentCpcBidSimulationPoint points = 1;</code>
     */
    public java.util.List<com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder> 
         getPointsBuilderList() {
      return getPointsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointOrBuilder> 
        getPointsFieldBuilder() {
      if (pointsBuilder_ == null) {
        pointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPoint.Builder, com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointOrBuilder>(
                points_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        points_ = null;
      }
      return pointsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.PercentCpcBidSimulationPointList)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.PercentCpcBidSimulationPointList)
  private static final com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList();
  }

  public static com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PercentCpcBidSimulationPointList>
      PARSER = new com.google.protobuf.AbstractParser<PercentCpcBidSimulationPointList>() {
    @java.lang.Override
    public PercentCpcBidSimulationPointList parsePartialFrom(
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

  public static com.google.protobuf.Parser<PercentCpcBidSimulationPointList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PercentCpcBidSimulationPointList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.PercentCpcBidSimulationPointList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

