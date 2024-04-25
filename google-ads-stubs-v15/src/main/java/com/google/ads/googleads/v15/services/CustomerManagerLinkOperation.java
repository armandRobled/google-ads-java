// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/customer_manager_link_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

/**
 * <pre>
 * Updates the status of a CustomerManagerLink.
 * The following actions are possible:
 * 1. Update operation with status ACTIVE accepts a pending invitation.
 * 2. Update operation with status REFUSED declines a pending invitation.
 * 3. Update operation with status INACTIVE terminates link to manager.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.services.CustomerManagerLinkOperation}
 */
public final class CustomerManagerLinkOperation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.services.CustomerManagerLinkOperation)
    CustomerManagerLinkOperationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerManagerLinkOperation.newBuilder() to construct.
  private CustomerManagerLinkOperation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerManagerLinkOperation() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomerManagerLinkOperation();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v15_services_CustomerManagerLinkOperation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v15_services_CustomerManagerLinkOperation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.services.CustomerManagerLinkOperation.class, com.google.ads.googleads.v15.services.CustomerManagerLinkOperation.Builder.class);
  }

  private int bitField0_;
  private int operationCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object operation_;
  public enum OperationCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    UPDATE(2),
    OPERATION_NOT_SET(0);
    private final int value;
    private OperationCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OperationCase valueOf(int value) {
      return forNumber(value);
    }

    public static OperationCase forNumber(int value) {
      switch (value) {
        case 2: return UPDATE;
        case 0: return OPERATION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OperationCase
  getOperationCase() {
    return OperationCase.forNumber(
        operationCase_);
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 4;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  public static final int UPDATE_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
   * @return Whether the update field is set.
   */
  @java.lang.Override
  public boolean hasUpdate() {
    return operationCase_ == 2;
  }
  /**
   * <pre>
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
   * @return The update.
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.resources.CustomerManagerLink getUpdate() {
    if (operationCase_ == 2) {
       return (com.google.ads.googleads.v15.resources.CustomerManagerLink) operation_;
    }
    return com.google.ads.googleads.v15.resources.CustomerManagerLink.getDefaultInstance();
  }
  /**
   * <pre>
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
   */
  @java.lang.Override
  public com.google.ads.googleads.v15.resources.CustomerManagerLinkOrBuilder getUpdateOrBuilder() {
    if (operationCase_ == 2) {
       return (com.google.ads.googleads.v15.resources.CustomerManagerLink) operation_;
    }
    return com.google.ads.googleads.v15.resources.CustomerManagerLink.getDefaultInstance();
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
    if (operationCase_ == 2) {
      output.writeMessage(2, (com.google.ads.googleads.v15.resources.CustomerManagerLink) operation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (operationCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (com.google.ads.googleads.v15.resources.CustomerManagerLink) operation_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getUpdateMask());
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
    if (!(obj instanceof com.google.ads.googleads.v15.services.CustomerManagerLinkOperation)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.services.CustomerManagerLinkOperation other = (com.google.ads.googleads.v15.services.CustomerManagerLinkOperation) obj;

    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
    }
    if (!getOperationCase().equals(other.getOperationCase())) return false;
    switch (operationCase_) {
      case 2:
        if (!getUpdate()
            .equals(other.getUpdate())) return false;
        break;
      case 0:
      default:
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
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    switch (operationCase_) {
      case 2:
        hash = (37 * hash) + UPDATE_FIELD_NUMBER;
        hash = (53 * hash) + getUpdate().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.services.CustomerManagerLinkOperation prototype) {
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
   * Updates the status of a CustomerManagerLink.
   * The following actions are possible:
   * 1. Update operation with status ACTIVE accepts a pending invitation.
   * 2. Update operation with status REFUSED declines a pending invitation.
   * 3. Update operation with status INACTIVE terminates link to manager.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.services.CustomerManagerLinkOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.services.CustomerManagerLinkOperation)
      com.google.ads.googleads.v15.services.CustomerManagerLinkOperationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v15_services_CustomerManagerLinkOperation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v15_services_CustomerManagerLinkOperation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.services.CustomerManagerLinkOperation.class, com.google.ads.googleads.v15.services.CustomerManagerLinkOperation.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.services.CustomerManagerLinkOperation.newBuilder()
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
        getUpdateMaskFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      if (updateBuilder_ != null) {
        updateBuilder_.clear();
      }
      operationCase_ = 0;
      operation_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.services.CustomerManagerLinkServiceProto.internal_static_google_ads_googleads_v15_services_CustomerManagerLinkOperation_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.CustomerManagerLinkOperation getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.services.CustomerManagerLinkOperation.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.CustomerManagerLinkOperation build() {
      com.google.ads.googleads.v15.services.CustomerManagerLinkOperation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.services.CustomerManagerLinkOperation buildPartial() {
      com.google.ads.googleads.v15.services.CustomerManagerLinkOperation result = new com.google.ads.googleads.v15.services.CustomerManagerLinkOperation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.services.CustomerManagerLinkOperation result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null
            ? updateMask_
            : updateMaskBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v15.services.CustomerManagerLinkOperation result) {
      result.operationCase_ = operationCase_;
      result.operation_ = this.operation_;
      if (operationCase_ == 2 &&
          updateBuilder_ != null) {
        result.operation_ = updateBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v15.services.CustomerManagerLinkOperation) {
        return mergeFrom((com.google.ads.googleads.v15.services.CustomerManagerLinkOperation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.services.CustomerManagerLinkOperation other) {
      if (other == com.google.ads.googleads.v15.services.CustomerManagerLinkOperation.getDefaultInstance()) return this;
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
      }
      switch (other.getOperationCase()) {
        case UPDATE: {
          mergeUpdate(other.getUpdate());
          break;
        }
        case OPERATION_NOT_SET: {
          break;
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
            case 18: {
              input.readMessage(
                  getUpdateFieldBuilder().getBuilder(),
                  extensionRegistry);
              operationCase_ = 2;
              break;
            } // case 18
            case 34: {
              input.readMessage(
                  getUpdateMaskFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 34
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
    private int operationCase_ = 0;
    private java.lang.Object operation_;
    public OperationCase
        getOperationCase() {
      return OperationCase.forNumber(
          operationCase_);
    }

    public Builder clearOperation() {
      operationCase_ = 0;
      operation_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          updateMask_ != null &&
          updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000001);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * FieldMask that determines which resource fields are modified in an update.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v15.resources.CustomerManagerLink, com.google.ads.googleads.v15.resources.CustomerManagerLink.Builder, com.google.ads.googleads.v15.resources.CustomerManagerLinkOrBuilder> updateBuilder_;
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     * @return Whether the update field is set.
     */
    @java.lang.Override
    public boolean hasUpdate() {
      return operationCase_ == 2;
    }
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     * @return The update.
     */
    @java.lang.Override
    public com.google.ads.googleads.v15.resources.CustomerManagerLink getUpdate() {
      if (updateBuilder_ == null) {
        if (operationCase_ == 2) {
          return (com.google.ads.googleads.v15.resources.CustomerManagerLink) operation_;
        }
        return com.google.ads.googleads.v15.resources.CustomerManagerLink.getDefaultInstance();
      } else {
        if (operationCase_ == 2) {
          return updateBuilder_.getMessage();
        }
        return com.google.ads.googleads.v15.resources.CustomerManagerLink.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     */
    public Builder setUpdate(com.google.ads.googleads.v15.resources.CustomerManagerLink value) {
      if (updateBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        operation_ = value;
        onChanged();
      } else {
        updateBuilder_.setMessage(value);
      }
      operationCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     */
    public Builder setUpdate(
        com.google.ads.googleads.v15.resources.CustomerManagerLink.Builder builderForValue) {
      if (updateBuilder_ == null) {
        operation_ = builderForValue.build();
        onChanged();
      } else {
        updateBuilder_.setMessage(builderForValue.build());
      }
      operationCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     */
    public Builder mergeUpdate(com.google.ads.googleads.v15.resources.CustomerManagerLink value) {
      if (updateBuilder_ == null) {
        if (operationCase_ == 2 &&
            operation_ != com.google.ads.googleads.v15.resources.CustomerManagerLink.getDefaultInstance()) {
          operation_ = com.google.ads.googleads.v15.resources.CustomerManagerLink.newBuilder((com.google.ads.googleads.v15.resources.CustomerManagerLink) operation_)
              .mergeFrom(value).buildPartial();
        } else {
          operation_ = value;
        }
        onChanged();
      } else {
        if (operationCase_ == 2) {
          updateBuilder_.mergeFrom(value);
        } else {
          updateBuilder_.setMessage(value);
        }
      }
      operationCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     */
    public Builder clearUpdate() {
      if (updateBuilder_ == null) {
        if (operationCase_ == 2) {
          operationCase_ = 0;
          operation_ = null;
          onChanged();
        }
      } else {
        if (operationCase_ == 2) {
          operationCase_ = 0;
          operation_ = null;
        }
        updateBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     */
    public com.google.ads.googleads.v15.resources.CustomerManagerLink.Builder getUpdateBuilder() {
      return getUpdateFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     */
    @java.lang.Override
    public com.google.ads.googleads.v15.resources.CustomerManagerLinkOrBuilder getUpdateOrBuilder() {
      if ((operationCase_ == 2) && (updateBuilder_ != null)) {
        return updateBuilder_.getMessageOrBuilder();
      } else {
        if (operationCase_ == 2) {
          return (com.google.ads.googleads.v15.resources.CustomerManagerLink) operation_;
        }
        return com.google.ads.googleads.v15.resources.CustomerManagerLink.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Update operation: The link is expected to have a valid resource name.
     * </pre>
     *
     * <code>.google.ads.googleads.v15.resources.CustomerManagerLink update = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v15.resources.CustomerManagerLink, com.google.ads.googleads.v15.resources.CustomerManagerLink.Builder, com.google.ads.googleads.v15.resources.CustomerManagerLinkOrBuilder> 
        getUpdateFieldBuilder() {
      if (updateBuilder_ == null) {
        if (!(operationCase_ == 2)) {
          operation_ = com.google.ads.googleads.v15.resources.CustomerManagerLink.getDefaultInstance();
        }
        updateBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v15.resources.CustomerManagerLink, com.google.ads.googleads.v15.resources.CustomerManagerLink.Builder, com.google.ads.googleads.v15.resources.CustomerManagerLinkOrBuilder>(
                (com.google.ads.googleads.v15.resources.CustomerManagerLink) operation_,
                getParentForChildren(),
                isClean());
        operation_ = null;
      }
      operationCase_ = 2;
      onChanged();
      return updateBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.services.CustomerManagerLinkOperation)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.services.CustomerManagerLinkOperation)
  private static final com.google.ads.googleads.v15.services.CustomerManagerLinkOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.services.CustomerManagerLinkOperation();
  }

  public static com.google.ads.googleads.v15.services.CustomerManagerLinkOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerManagerLinkOperation>
      PARSER = new com.google.protobuf.AbstractParser<CustomerManagerLinkOperation>() {
    @java.lang.Override
    public CustomerManagerLinkOperation parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomerManagerLinkOperation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerManagerLinkOperation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.services.CustomerManagerLinkOperation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

