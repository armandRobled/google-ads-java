// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/experiment_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface GraduateExperimentRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.GraduateExperimentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The experiment to be graduated.
   * </pre>
   *
   * <code>string experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The experiment.
   */
  java.lang.String getExperiment();
  /**
   * <pre>
   * Required. The experiment to be graduated.
   * </pre>
   *
   * <code>string experiment = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for experiment.
   */
  com.google.protobuf.ByteString
      getExperimentBytes();

  /**
   * <pre>
   * Required. List of campaign budget mappings for graduation. Each campaign
   * that appears here will graduate, and will be assigned a new budget that is
   * paired with it in the mapping. The maximum size is one.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.CampaignBudgetMapping campaign_budget_mappings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v15.services.CampaignBudgetMapping> 
      getCampaignBudgetMappingsList();
  /**
   * <pre>
   * Required. List of campaign budget mappings for graduation. Each campaign
   * that appears here will graduate, and will be assigned a new budget that is
   * paired with it in the mapping. The maximum size is one.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.CampaignBudgetMapping campaign_budget_mappings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.services.CampaignBudgetMapping getCampaignBudgetMappings(int index);
  /**
   * <pre>
   * Required. List of campaign budget mappings for graduation. Each campaign
   * that appears here will graduate, and will be assigned a new budget that is
   * paired with it in the mapping. The maximum size is one.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.CampaignBudgetMapping campaign_budget_mappings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getCampaignBudgetMappingsCount();
  /**
   * <pre>
   * Required. List of campaign budget mappings for graduation. Each campaign
   * that appears here will graduate, and will be assigned a new budget that is
   * paired with it in the mapping. The maximum size is one.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.CampaignBudgetMapping campaign_budget_mappings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.services.CampaignBudgetMappingOrBuilder> 
      getCampaignBudgetMappingsOrBuilderList();
  /**
   * <pre>
   * Required. List of campaign budget mappings for graduation. Each campaign
   * that appears here will graduate, and will be assigned a new budget that is
   * paired with it in the mapping. The maximum size is one.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.services.CampaignBudgetMapping campaign_budget_mappings = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v15.services.CampaignBudgetMappingOrBuilder getCampaignBudgetMappingsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
