// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/customer_client_link_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface CustomerClientLinkOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.CustomerClientLinkOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   * <pre>
   * Create operation: No resource name is expected for the new link.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerClientLink create = 1;</code>
   * @return Whether the create field is set.
   */
  boolean hasCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new link.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerClientLink create = 1;</code>
   * @return The create.
   */
  com.google.ads.googleads.v17.resources.CustomerClientLink getCreate();
  /**
   * <pre>
   * Create operation: No resource name is expected for the new link.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerClientLink create = 1;</code>
   */
  com.google.ads.googleads.v17.resources.CustomerClientLinkOrBuilder getCreateOrBuilder();

  /**
   * <pre>
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerClientLink update = 2;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerClientLink update = 2;</code>
   * @return The update.
   */
  com.google.ads.googleads.v17.resources.CustomerClientLink getUpdate();
  /**
   * <pre>
   * Update operation: The link is expected to have a valid resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.CustomerClientLink update = 2;</code>
   */
  com.google.ads.googleads.v17.resources.CustomerClientLinkOrBuilder getUpdateOrBuilder();

  com.google.ads.googleads.v17.services.CustomerClientLinkOperation.OperationCase getOperationCase();
}
