// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/campaign_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface MutateCampaignResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateCampaignResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Returned for successful operations.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated campaign with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Campaign campaign = 2;</code>
   * @return Whether the campaign field is set.
   */
  boolean hasCampaign();
  /**
   * <pre>
   * The mutated campaign with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Campaign campaign = 2;</code>
   * @return The campaign.
   */
  com.google.ads.googleads.v15.resources.Campaign getCampaign();
  /**
   * <pre>
   * The mutated campaign with only mutable fields after mutate. The field will
   * only be returned when response_content_type is set to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.Campaign campaign = 2;</code>
   */
  com.google.ads.googleads.v15.resources.CampaignOrBuilder getCampaignOrBuilder();
}
