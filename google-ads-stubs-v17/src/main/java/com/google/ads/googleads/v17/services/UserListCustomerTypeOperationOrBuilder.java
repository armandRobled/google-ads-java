// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/user_list_customer_type_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface UserListCustomerTypeOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.UserListCustomerTypeOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Attach a user list customer type to a user list.
   * No resource name is expected for the new user list customer type.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.UserListCustomerType create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Attach a user list customer type to a user list.
   * No resource name is expected for the new user list customer type.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.UserListCustomerType create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v17.resources.UserListCustomerType getCreate();
  /**
   * <pre>
   * Attach a user list customer type to a user list.
   * No resource name is expected for the new user list customer type.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.UserListCustomerType create = 1;</code>
   */
  com.google.ads.googleads.v17.resources.UserListCustomerTypeOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Remove an existing user list customer type.
   * A resource name for the removed user list customer type is
   * expected, in this format:
   *
   * `customers/{customer_id}/userListCustomerTypes/{user_list_id}~{customer_type_category}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the remove field is set.
   */
  boolean hasRemove();
  /**
   * <pre>
   * Remove an existing user list customer type.
   * A resource name for the removed user list customer type is
   * expected, in this format:
   *
   * `customers/{customer_id}/userListCustomerTypes/{user_list_id}~{customer_type_category}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The remove.
   */
  java.lang.String getRemove();
  /**
   * <pre>
   * Remove an existing user list customer type.
   * A resource name for the removed user list customer type is
   * expected, in this format:
   *
   * `customers/{customer_id}/userListCustomerTypes/{user_list_id}~{customer_type_category}`
   * </pre>
   *
   * <code>string remove = 2 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for remove.
   */
  com.google.protobuf.ByteString
      getRemoveBytes();

  com.google.ads.googleads.v17.services.UserListCustomerTypeOperation.OperationCase getOperationCase();
}
