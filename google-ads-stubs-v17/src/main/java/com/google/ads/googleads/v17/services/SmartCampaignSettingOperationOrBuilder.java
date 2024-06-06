// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/smart_campaign_setting_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface SmartCampaignSettingOperationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.SmartCampaignSettingOperation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Update operation: The Smart campaign setting must specify a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.SmartCampaignSetting update = 1;</code>
   * @return Whether the update field is set.
   */
  boolean hasUpdate();
  /**
   * <pre>
   * Update operation: The Smart campaign setting must specify a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.SmartCampaignSetting update = 1;</code>
   * @return The update.
   */
  com.google.ads.googleads.v17.resources.SmartCampaignSetting getUpdate();
  /**
   * <pre>
   * Update operation: The Smart campaign setting must specify a valid
   * resource name.
   * </pre>
   *
   * <code>.google.ads.googleads.v17.resources.SmartCampaignSetting update = 1;</code>
   */
  com.google.ads.googleads.v17.resources.SmartCampaignSettingOrBuilder getUpdateOrBuilder();

  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * FieldMask that determines which resource fields are modified in an update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
