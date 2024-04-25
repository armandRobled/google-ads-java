// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/user_lists.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

/**
 * <pre>
 * Operand of logical user list that consists of a user list.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v15.common.LogicalUserListOperandInfo}
 */
public final class LogicalUserListOperandInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v15.common.LogicalUserListOperandInfo)
    LogicalUserListOperandInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogicalUserListOperandInfo.newBuilder() to construct.
  private LogicalUserListOperandInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogicalUserListOperandInfo() {
    userList_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LogicalUserListOperandInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListOperandInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListOperandInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v15.common.LogicalUserListOperandInfo.class, com.google.ads.googleads.v15.common.LogicalUserListOperandInfo.Builder.class);
  }

  private int bitField0_;
  public static final int USER_LIST_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userList_ = "";
  /**
   * <pre>
   * Resource name of a user list as an operand.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return Whether the userList field is set.
   */
  @java.lang.Override
  public boolean hasUserList() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Resource name of a user list as an operand.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return The userList.
   */
  @java.lang.Override
  public java.lang.String getUserList() {
    java.lang.Object ref = userList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userList_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Resource name of a user list as an operand.
   * </pre>
   *
   * <code>optional string user_list = 2;</code>
   * @return The bytes for userList.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserListBytes() {
    java.lang.Object ref = userList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userList_ = b;
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
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, userList_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, userList_);
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
    if (!(obj instanceof com.google.ads.googleads.v15.common.LogicalUserListOperandInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v15.common.LogicalUserListOperandInfo other = (com.google.ads.googleads.v15.common.LogicalUserListOperandInfo) obj;

    if (hasUserList() != other.hasUserList()) return false;
    if (hasUserList()) {
      if (!getUserList()
          .equals(other.getUserList())) return false;
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
    if (hasUserList()) {
      hash = (37 * hash) + USER_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getUserList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v15.common.LogicalUserListOperandInfo prototype) {
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
   * Operand of logical user list that consists of a user list.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v15.common.LogicalUserListOperandInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v15.common.LogicalUserListOperandInfo)
      com.google.ads.googleads.v15.common.LogicalUserListOperandInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListOperandInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListOperandInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v15.common.LogicalUserListOperandInfo.class, com.google.ads.googleads.v15.common.LogicalUserListOperandInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v15.common.LogicalUserListOperandInfo.newBuilder()
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
      userList_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v15.common.UserListsProto.internal_static_google_ads_googleads_v15_common_LogicalUserListOperandInfo_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.LogicalUserListOperandInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v15.common.LogicalUserListOperandInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.LogicalUserListOperandInfo build() {
      com.google.ads.googleads.v15.common.LogicalUserListOperandInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v15.common.LogicalUserListOperandInfo buildPartial() {
      com.google.ads.googleads.v15.common.LogicalUserListOperandInfo result = new com.google.ads.googleads.v15.common.LogicalUserListOperandInfo(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.ads.googleads.v15.common.LogicalUserListOperandInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userList_ = userList_;
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
      if (other instanceof com.google.ads.googleads.v15.common.LogicalUserListOperandInfo) {
        return mergeFrom((com.google.ads.googleads.v15.common.LogicalUserListOperandInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v15.common.LogicalUserListOperandInfo other) {
      if (other == com.google.ads.googleads.v15.common.LogicalUserListOperandInfo.getDefaultInstance()) return this;
      if (other.hasUserList()) {
        userList_ = other.userList_;
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
            case 18: {
              userList_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
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

    private java.lang.Object userList_ = "";
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>optional string user_list = 2;</code>
     * @return Whether the userList field is set.
     */
    public boolean hasUserList() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>optional string user_list = 2;</code>
     * @return The userList.
     */
    public java.lang.String getUserList() {
      java.lang.Object ref = userList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>optional string user_list = 2;</code>
     * @return The bytes for userList.
     */
    public com.google.protobuf.ByteString
        getUserListBytes() {
      java.lang.Object ref = userList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>optional string user_list = 2;</code>
     * @param value The userList to set.
     * @return This builder for chaining.
     */
    public Builder setUserList(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userList_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>optional string user_list = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserList() {
      userList_ = getDefaultInstance().getUserList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Resource name of a user list as an operand.
     * </pre>
     *
     * <code>optional string user_list = 2;</code>
     * @param value The bytes for userList to set.
     * @return This builder for chaining.
     */
    public Builder setUserListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userList_ = value;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v15.common.LogicalUserListOperandInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v15.common.LogicalUserListOperandInfo)
  private static final com.google.ads.googleads.v15.common.LogicalUserListOperandInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v15.common.LogicalUserListOperandInfo();
  }

  public static com.google.ads.googleads.v15.common.LogicalUserListOperandInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogicalUserListOperandInfo>
      PARSER = new com.google.protobuf.AbstractParser<LogicalUserListOperandInfo>() {
    @java.lang.Override
    public LogicalUserListOperandInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<LogicalUserListOperandInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogicalUserListOperandInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v15.common.LogicalUserListOperandInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

