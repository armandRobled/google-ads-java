// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/common/user_lists.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.common;

/**
 * <pre>
 * Represents an action type used for building remarketing user lists.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.common.UserListActionInfo}
 */
public final class UserListActionInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.common.UserListActionInfo)
    UserListActionInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserListActionInfo.newBuilder() to construct.
  private UserListActionInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserListActionInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserListActionInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.common.UserListsProto.internal_static_google_ads_googleads_v17_common_UserListActionInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.common.UserListsProto.internal_static_google_ads_googleads_v17_common_UserListActionInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.common.UserListActionInfo.class, com.google.ads.googleads.v17.common.UserListActionInfo.Builder.class);
  }

  private int userListActionCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object userListAction_;
  public enum UserListActionCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONVERSION_ACTION(3),
    REMARKETING_ACTION(4),
    USERLISTACTION_NOT_SET(0);
    private final int value;
    private UserListActionCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UserListActionCase valueOf(int value) {
      return forNumber(value);
    }

    public static UserListActionCase forNumber(int value) {
      switch (value) {
        case 3: return CONVERSION_ACTION;
        case 4: return REMARKETING_ACTION;
        case 0: return USERLISTACTION_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public UserListActionCase
  getUserListActionCase() {
    return UserListActionCase.forNumber(
        userListActionCase_);
  }

  public static final int CONVERSION_ACTION_FIELD_NUMBER = 3;
  /**
   * <pre>
   * A conversion action that's not generated from remarketing.
   * </pre>
   *
   * <code>string conversion_action = 3;</code>
   * @return Whether the conversionAction field is set.
   */
  public boolean hasConversionAction() {
    return userListActionCase_ == 3;
  }
  /**
   * <pre>
   * A conversion action that's not generated from remarketing.
   * </pre>
   *
   * <code>string conversion_action = 3;</code>
   * @return The conversionAction.
   */
  public java.lang.String getConversionAction() {
    java.lang.Object ref = "";
    if (userListActionCase_ == 3) {
      ref = userListAction_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (userListActionCase_ == 3) {
        userListAction_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A conversion action that's not generated from remarketing.
   * </pre>
   *
   * <code>string conversion_action = 3;</code>
   * @return The bytes for conversionAction.
   */
  public com.google.protobuf.ByteString
      getConversionActionBytes() {
    java.lang.Object ref = "";
    if (userListActionCase_ == 3) {
      ref = userListAction_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (userListActionCase_ == 3) {
        userListAction_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REMARKETING_ACTION_FIELD_NUMBER = 4;
  /**
   * <pre>
   * A remarketing action.
   * </pre>
   *
   * <code>string remarketing_action = 4;</code>
   * @return Whether the remarketingAction field is set.
   */
  public boolean hasRemarketingAction() {
    return userListActionCase_ == 4;
  }
  /**
   * <pre>
   * A remarketing action.
   * </pre>
   *
   * <code>string remarketing_action = 4;</code>
   * @return The remarketingAction.
   */
  public java.lang.String getRemarketingAction() {
    java.lang.Object ref = "";
    if (userListActionCase_ == 4) {
      ref = userListAction_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (userListActionCase_ == 4) {
        userListAction_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * A remarketing action.
   * </pre>
   *
   * <code>string remarketing_action = 4;</code>
   * @return The bytes for remarketingAction.
   */
  public com.google.protobuf.ByteString
      getRemarketingActionBytes() {
    java.lang.Object ref = "";
    if (userListActionCase_ == 4) {
      ref = userListAction_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (userListActionCase_ == 4) {
        userListAction_ = b;
      }
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
    if (userListActionCase_ == 3) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, userListAction_);
    }
    if (userListActionCase_ == 4) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, userListAction_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userListActionCase_ == 3) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, userListAction_);
    }
    if (userListActionCase_ == 4) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, userListAction_);
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
    if (!(obj instanceof com.google.ads.googleads.v17.common.UserListActionInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.common.UserListActionInfo other = (com.google.ads.googleads.v17.common.UserListActionInfo) obj;

    if (!getUserListActionCase().equals(other.getUserListActionCase())) return false;
    switch (userListActionCase_) {
      case 3:
        if (!getConversionAction()
            .equals(other.getConversionAction())) return false;
        break;
      case 4:
        if (!getRemarketingAction()
            .equals(other.getRemarketingAction())) return false;
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
    switch (userListActionCase_) {
      case 3:
        hash = (37 * hash) + CONVERSION_ACTION_FIELD_NUMBER;
        hash = (53 * hash) + getConversionAction().hashCode();
        break;
      case 4:
        hash = (37 * hash) + REMARKETING_ACTION_FIELD_NUMBER;
        hash = (53 * hash) + getRemarketingAction().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.common.UserListActionInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.common.UserListActionInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.common.UserListActionInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.common.UserListActionInfo prototype) {
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
   * Represents an action type used for building remarketing user lists.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.common.UserListActionInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.common.UserListActionInfo)
      com.google.ads.googleads.v17.common.UserListActionInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.common.UserListsProto.internal_static_google_ads_googleads_v17_common_UserListActionInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.common.UserListsProto.internal_static_google_ads_googleads_v17_common_UserListActionInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.common.UserListActionInfo.class, com.google.ads.googleads.v17.common.UserListActionInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.common.UserListActionInfo.newBuilder()
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
      userListActionCase_ = 0;
      userListAction_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.common.UserListsProto.internal_static_google_ads_googleads_v17_common_UserListActionInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.common.UserListActionInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.common.UserListActionInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.common.UserListActionInfo build() {
      com.google.ads.googleads.v17.common.UserListActionInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.common.UserListActionInfo buildPartial() {
      com.google.ads.googleads.v17.common.UserListActionInfo result = new com.google.ads.googleads.v17.common.UserListActionInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v17.common.UserListActionInfo result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.ads.googleads.v17.common.UserListActionInfo result) {
      result.userListActionCase_ = userListActionCase_;
      result.userListAction_ = this.userListAction_;
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
      if (other instanceof com.google.ads.googleads.v17.common.UserListActionInfo) {
        return mergeFrom((com.google.ads.googleads.v17.common.UserListActionInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.common.UserListActionInfo other) {
      if (other == com.google.ads.googleads.v17.common.UserListActionInfo.getDefaultInstance()) return this;
      switch (other.getUserListActionCase()) {
        case CONVERSION_ACTION: {
          userListActionCase_ = 3;
          userListAction_ = other.userListAction_;
          onChanged();
          break;
        }
        case REMARKETING_ACTION: {
          userListActionCase_ = 4;
          userListAction_ = other.userListAction_;
          onChanged();
          break;
        }
        case USERLISTACTION_NOT_SET: {
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
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              userListActionCase_ = 3;
              userListAction_ = s;
              break;
            } // case 26
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();
              userListActionCase_ = 4;
              userListAction_ = s;
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
    private int userListActionCase_ = 0;
    private java.lang.Object userListAction_;
    public UserListActionCase
        getUserListActionCase() {
      return UserListActionCase.forNumber(
          userListActionCase_);
    }

    public Builder clearUserListAction() {
      userListActionCase_ = 0;
      userListAction_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <pre>
     * A conversion action that's not generated from remarketing.
     * </pre>
     *
     * <code>string conversion_action = 3;</code>
     * @return Whether the conversionAction field is set.
     */
    @java.lang.Override
    public boolean hasConversionAction() {
      return userListActionCase_ == 3;
    }
    /**
     * <pre>
     * A conversion action that's not generated from remarketing.
     * </pre>
     *
     * <code>string conversion_action = 3;</code>
     * @return The conversionAction.
     */
    @java.lang.Override
    public java.lang.String getConversionAction() {
      java.lang.Object ref = "";
      if (userListActionCase_ == 3) {
        ref = userListAction_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (userListActionCase_ == 3) {
          userListAction_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A conversion action that's not generated from remarketing.
     * </pre>
     *
     * <code>string conversion_action = 3;</code>
     * @return The bytes for conversionAction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getConversionActionBytes() {
      java.lang.Object ref = "";
      if (userListActionCase_ == 3) {
        ref = userListAction_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (userListActionCase_ == 3) {
          userListAction_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A conversion action that's not generated from remarketing.
     * </pre>
     *
     * <code>string conversion_action = 3;</code>
     * @param value The conversionAction to set.
     * @return This builder for chaining.
     */
    public Builder setConversionAction(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userListActionCase_ = 3;
      userListAction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A conversion action that's not generated from remarketing.
     * </pre>
     *
     * <code>string conversion_action = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearConversionAction() {
      if (userListActionCase_ == 3) {
        userListActionCase_ = 0;
        userListAction_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A conversion action that's not generated from remarketing.
     * </pre>
     *
     * <code>string conversion_action = 3;</code>
     * @param value The bytes for conversionAction to set.
     * @return This builder for chaining.
     */
    public Builder setConversionActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userListActionCase_ = 3;
      userListAction_ = value;
      onChanged();
      return this;
    }

    /**
     * <pre>
     * A remarketing action.
     * </pre>
     *
     * <code>string remarketing_action = 4;</code>
     * @return Whether the remarketingAction field is set.
     */
    @java.lang.Override
    public boolean hasRemarketingAction() {
      return userListActionCase_ == 4;
    }
    /**
     * <pre>
     * A remarketing action.
     * </pre>
     *
     * <code>string remarketing_action = 4;</code>
     * @return The remarketingAction.
     */
    @java.lang.Override
    public java.lang.String getRemarketingAction() {
      java.lang.Object ref = "";
      if (userListActionCase_ == 4) {
        ref = userListAction_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (userListActionCase_ == 4) {
          userListAction_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * A remarketing action.
     * </pre>
     *
     * <code>string remarketing_action = 4;</code>
     * @return The bytes for remarketingAction.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRemarketingActionBytes() {
      java.lang.Object ref = "";
      if (userListActionCase_ == 4) {
        ref = userListAction_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (userListActionCase_ == 4) {
          userListAction_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * A remarketing action.
     * </pre>
     *
     * <code>string remarketing_action = 4;</code>
     * @param value The remarketingAction to set.
     * @return This builder for chaining.
     */
    public Builder setRemarketingAction(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userListActionCase_ = 4;
      userListAction_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A remarketing action.
     * </pre>
     *
     * <code>string remarketing_action = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRemarketingAction() {
      if (userListActionCase_ == 4) {
        userListActionCase_ = 0;
        userListAction_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * A remarketing action.
     * </pre>
     *
     * <code>string remarketing_action = 4;</code>
     * @param value The bytes for remarketingAction to set.
     * @return This builder for chaining.
     */
    public Builder setRemarketingActionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userListActionCase_ = 4;
      userListAction_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.common.UserListActionInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.common.UserListActionInfo)
  private static final com.google.ads.googleads.v17.common.UserListActionInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.common.UserListActionInfo();
  }

  public static com.google.ads.googleads.v17.common.UserListActionInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserListActionInfo>
      PARSER = new com.google.protobuf.AbstractParser<UserListActionInfo>() {
    @java.lang.Override
    public UserListActionInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserListActionInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserListActionInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.common.UserListActionInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

