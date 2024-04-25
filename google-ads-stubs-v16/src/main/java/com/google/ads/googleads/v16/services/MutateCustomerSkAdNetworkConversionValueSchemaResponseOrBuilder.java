// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/customer_sk_ad_network_conversion_value_schema_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface MutateCustomerSkAdNetworkConversionValueSchemaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.MutateCustomerSkAdNetworkConversionValueSchemaResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.MutateCustomerSkAdNetworkConversionValueSchemaResult result = 1;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.MutateCustomerSkAdNetworkConversionValueSchemaResult result = 1;</code>
   * @return The result.
   */
  com.google.ads.googleads.v16.services.MutateCustomerSkAdNetworkConversionValueSchemaResult getResult();
  /**
   * <pre>
   * All results for the mutate.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.services.MutateCustomerSkAdNetworkConversionValueSchemaResult result = 1;</code>
   */
  com.google.ads.googleads.v16.services.MutateCustomerSkAdNetworkConversionValueSchemaResultOrBuilder getResultOrBuilder();

  /**
   * <pre>
   * Non blocking errors that provides schema validation failure details.
   * Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   * @return Whether the warning field is set.
   */
  boolean hasWarning();
  /**
   * <pre>
   * Non blocking errors that provides schema validation failure details.
   * Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   * @return The warning.
   */
  com.google.rpc.Status getWarning();
  /**
   * <pre>
   * Non blocking errors that provides schema validation failure details.
   * Returned only when enable_warnings = true.
   * </pre>
   *
   * <code>.google.rpc.Status warning = 2;</code>
   */
  com.google.rpc.StatusOrBuilder getWarningOrBuilder();
}
