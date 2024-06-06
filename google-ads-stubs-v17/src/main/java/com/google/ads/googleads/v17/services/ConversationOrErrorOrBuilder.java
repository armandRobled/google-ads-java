// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/local_services_lead_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface ConversationOrErrorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.ConversationOrError)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the appended local services lead conversation.
   * </pre>
   *
   * <code>string local_services_lead_conversation = 1;</code>
   * @return Whether the localServicesLeadConversation field is set.
   */
  boolean hasLocalServicesLeadConversation();
  /**
   * <pre>
   * The resource name of the appended local services lead conversation.
   * </pre>
   *
   * <code>string local_services_lead_conversation = 1;</code>
   * @return The localServicesLeadConversation.
   */
  java.lang.String getLocalServicesLeadConversation();
  /**
   * <pre>
   * The resource name of the appended local services lead conversation.
   * </pre>
   *
   * <code>string local_services_lead_conversation = 1;</code>
   * @return The bytes for localServicesLeadConversation.
   */
  com.google.protobuf.ByteString
      getLocalServicesLeadConversationBytes();

  /**
   * <pre>
   * Failure status when the request could not be processed.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return Whether the partialFailureError field is set.
   */
  boolean hasPartialFailureError();
  /**
   * <pre>
   * Failure status when the request could not be processed.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   * @return The partialFailureError.
   */
  com.google.rpc.Status getPartialFailureError();
  /**
   * <pre>
   * Failure status when the request could not be processed.
   * </pre>
   *
   * <code>.google.rpc.Status partial_failure_error = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getPartialFailureErrorOrBuilder();

  com.google.ads.googleads.v17.services.ConversationOrError.AppendLeadConversationResponseCase getAppendLeadConversationResponseCase();
}
