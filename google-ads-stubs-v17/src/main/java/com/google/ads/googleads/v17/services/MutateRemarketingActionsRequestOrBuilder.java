// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/remarketing_action_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface MutateRemarketingActionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.MutateRemarketingActionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose remarketing actions are being
   * modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose remarketing actions are being
   * modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on individual remarketing
   * actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.RemarketingActionOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v17.services.RemarketingActionOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual remarketing
   * actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.RemarketingActionOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v17.services.RemarketingActionOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on individual remarketing
   * actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.RemarketingActionOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on individual remarketing
   * actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.RemarketingActionOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v17.services.RemarketingActionOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual remarketing
   * actions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.services.RemarketingActionOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v17.services.RemarketingActionOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
   * @return The partialFailure.
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
