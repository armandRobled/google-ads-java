// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/errors/customer_manager_link_error.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.errors;

/**
 * <pre>
 * Container for enum describing possible CustomerManagerLink errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum}
 */
public final class CustomerManagerLinkErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum)
    CustomerManagerLinkErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CustomerManagerLinkErrorEnum.newBuilder() to construct.
  private CustomerManagerLinkErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CustomerManagerLinkErrorEnum() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CustomerManagerLinkErrorEnum();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorProto.internal_static_google_ads_googleads_v17_errors_CustomerManagerLinkErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorProto.internal_static_google_ads_googleads_v17_errors_CustomerManagerLinkErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.class, com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible CustomerManagerLink errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.CustomerManagerLinkError}
   */
  public enum CustomerManagerLinkError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * No pending invitation.
     * </pre>
     *
     * <code>NO_PENDING_INVITE = 2;</code>
     */
    NO_PENDING_INVITE(2),
    /**
     * <pre>
     * Attempt to operate on the same client more than once in the same call.
     * </pre>
     *
     * <code>SAME_CLIENT_MORE_THAN_ONCE_PER_CALL = 3;</code>
     */
    SAME_CLIENT_MORE_THAN_ONCE_PER_CALL(3),
    /**
     * <pre>
     * Manager account has the maximum number of linked accounts.
     * </pre>
     *
     * <code>MANAGER_HAS_MAX_NUMBER_OF_LINKED_ACCOUNTS = 4;</code>
     */
    MANAGER_HAS_MAX_NUMBER_OF_LINKED_ACCOUNTS(4),
    /**
     * <pre>
     * If no active user on account it cannot be unlinked from its manager.
     * </pre>
     *
     * <code>CANNOT_UNLINK_ACCOUNT_WITHOUT_ACTIVE_USER = 5;</code>
     */
    CANNOT_UNLINK_ACCOUNT_WITHOUT_ACTIVE_USER(5),
    /**
     * <pre>
     * Account should have at least one active owner on it before being
     * unlinked.
     * </pre>
     *
     * <code>CANNOT_REMOVE_LAST_CLIENT_ACCOUNT_OWNER = 6;</code>
     */
    CANNOT_REMOVE_LAST_CLIENT_ACCOUNT_OWNER(6),
    /**
     * <pre>
     * Only account owners may change their permission role.
     * </pre>
     *
     * <code>CANNOT_CHANGE_ROLE_BY_NON_ACCOUNT_OWNER = 7;</code>
     */
    CANNOT_CHANGE_ROLE_BY_NON_ACCOUNT_OWNER(7),
    /**
     * <pre>
     * When a client's link to its manager is not active, the link role cannot
     * be changed.
     * </pre>
     *
     * <code>CANNOT_CHANGE_ROLE_FOR_NON_ACTIVE_LINK_ACCOUNT = 8;</code>
     */
    CANNOT_CHANGE_ROLE_FOR_NON_ACTIVE_LINK_ACCOUNT(8),
    /**
     * <pre>
     * Attempt to link a child to a parent that contains or will contain
     * duplicate children.
     * </pre>
     *
     * <code>DUPLICATE_CHILD_FOUND = 9;</code>
     */
    DUPLICATE_CHILD_FOUND(9),
    /**
     * <pre>
     * The authorized customer is a test account. It can add no more than the
     * allowed number of accounts
     * </pre>
     *
     * <code>TEST_ACCOUNT_LINKS_TOO_MANY_CHILD_ACCOUNTS = 10;</code>
     */
    TEST_ACCOUNT_LINKS_TOO_MANY_CHILD_ACCOUNTS(10),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * No pending invitation.
     * </pre>
     *
     * <code>NO_PENDING_INVITE = 2;</code>
     */
    public static final int NO_PENDING_INVITE_VALUE = 2;
    /**
     * <pre>
     * Attempt to operate on the same client more than once in the same call.
     * </pre>
     *
     * <code>SAME_CLIENT_MORE_THAN_ONCE_PER_CALL = 3;</code>
     */
    public static final int SAME_CLIENT_MORE_THAN_ONCE_PER_CALL_VALUE = 3;
    /**
     * <pre>
     * Manager account has the maximum number of linked accounts.
     * </pre>
     *
     * <code>MANAGER_HAS_MAX_NUMBER_OF_LINKED_ACCOUNTS = 4;</code>
     */
    public static final int MANAGER_HAS_MAX_NUMBER_OF_LINKED_ACCOUNTS_VALUE = 4;
    /**
     * <pre>
     * If no active user on account it cannot be unlinked from its manager.
     * </pre>
     *
     * <code>CANNOT_UNLINK_ACCOUNT_WITHOUT_ACTIVE_USER = 5;</code>
     */
    public static final int CANNOT_UNLINK_ACCOUNT_WITHOUT_ACTIVE_USER_VALUE = 5;
    /**
     * <pre>
     * Account should have at least one active owner on it before being
     * unlinked.
     * </pre>
     *
     * <code>CANNOT_REMOVE_LAST_CLIENT_ACCOUNT_OWNER = 6;</code>
     */
    public static final int CANNOT_REMOVE_LAST_CLIENT_ACCOUNT_OWNER_VALUE = 6;
    /**
     * <pre>
     * Only account owners may change their permission role.
     * </pre>
     *
     * <code>CANNOT_CHANGE_ROLE_BY_NON_ACCOUNT_OWNER = 7;</code>
     */
    public static final int CANNOT_CHANGE_ROLE_BY_NON_ACCOUNT_OWNER_VALUE = 7;
    /**
     * <pre>
     * When a client's link to its manager is not active, the link role cannot
     * be changed.
     * </pre>
     *
     * <code>CANNOT_CHANGE_ROLE_FOR_NON_ACTIVE_LINK_ACCOUNT = 8;</code>
     */
    public static final int CANNOT_CHANGE_ROLE_FOR_NON_ACTIVE_LINK_ACCOUNT_VALUE = 8;
    /**
     * <pre>
     * Attempt to link a child to a parent that contains or will contain
     * duplicate children.
     * </pre>
     *
     * <code>DUPLICATE_CHILD_FOUND = 9;</code>
     */
    public static final int DUPLICATE_CHILD_FOUND_VALUE = 9;
    /**
     * <pre>
     * The authorized customer is a test account. It can add no more than the
     * allowed number of accounts
     * </pre>
     *
     * <code>TEST_ACCOUNT_LINKS_TOO_MANY_CHILD_ACCOUNTS = 10;</code>
     */
    public static final int TEST_ACCOUNT_LINKS_TOO_MANY_CHILD_ACCOUNTS_VALUE = 10;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CustomerManagerLinkError valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CustomerManagerLinkError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return NO_PENDING_INVITE;
        case 3: return SAME_CLIENT_MORE_THAN_ONCE_PER_CALL;
        case 4: return MANAGER_HAS_MAX_NUMBER_OF_LINKED_ACCOUNTS;
        case 5: return CANNOT_UNLINK_ACCOUNT_WITHOUT_ACTIVE_USER;
        case 6: return CANNOT_REMOVE_LAST_CLIENT_ACCOUNT_OWNER;
        case 7: return CANNOT_CHANGE_ROLE_BY_NON_ACCOUNT_OWNER;
        case 8: return CANNOT_CHANGE_ROLE_FOR_NON_ACTIVE_LINK_ACCOUNT;
        case 9: return DUPLICATE_CHILD_FOUND;
        case 10: return TEST_ACCOUNT_LINKS_TOO_MANY_CHILD_ACCOUNTS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CustomerManagerLinkError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CustomerManagerLinkError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CustomerManagerLinkError>() {
            public CustomerManagerLinkError findValueByNumber(int number) {
              return CustomerManagerLinkError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final CustomerManagerLinkError[] VALUES = values();

    public static CustomerManagerLinkError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CustomerManagerLinkError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.CustomerManagerLinkError)
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum other = (com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum prototype) {
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
   * Container for enum describing possible CustomerManagerLink errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum)
      com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorProto.internal_static_google_ads_googleads_v17_errors_CustomerManagerLinkErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorProto.internal_static_google_ads_googleads_v17_errors_CustomerManagerLinkErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.class, com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorProto.internal_static_google_ads_googleads_v17_errors_CustomerManagerLinkErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum build() {
      com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum buildPartial() {
      com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum result = new com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum(this);
      onBuilt();
      return result;
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
      if (other instanceof com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum other) {
      if (other == com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum.getDefaultInstance()) return this;
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum)
  private static final com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum();
  }

  public static com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerManagerLinkErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<CustomerManagerLinkErrorEnum>() {
    @java.lang.Override
    public CustomerManagerLinkErrorEnum parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomerManagerLinkErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerManagerLinkErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v17.errors.CustomerManagerLinkErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

