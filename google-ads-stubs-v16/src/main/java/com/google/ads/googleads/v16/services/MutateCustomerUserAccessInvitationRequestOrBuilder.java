// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/customer_user_access_invitation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface MutateCustomerUserAccessInvitationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.MutateCustomerUserAccessInvitationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose access invitation is being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose access invitation is being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The operation to perform on the access invitation
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the operation field is set.
   */
  boolean hasOperation();
  /**
   * <pre>
   * Required. The operation to perform on the access invitation
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The operation.
   */
  com.google.ads.googleads.v16.services.CustomerUserAccessInvitationOperation getOperation();
  /**
   * <pre>
   * Required. The operation to perform on the access invitation
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.CustomerUserAccessInvitationOperation operation = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v16.services.CustomerUserAccessInvitationOperationOrBuilder getOperationOrBuilder();
}
