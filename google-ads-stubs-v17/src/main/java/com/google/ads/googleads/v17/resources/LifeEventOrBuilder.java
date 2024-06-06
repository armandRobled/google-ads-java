// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/life_event.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public interface LifeEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.resources.LifeEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the life event.
   * Life event resource names have the form:
   *
   * `customers/{customer_id}/lifeEvents/{life_event_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the life event.
   * Life event resource names have the form:
   *
   * `customers/{customer_id}/lifeEvents/{life_event_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the life event.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. The name of the life event, for example,"Recently Moved"
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the life event, for example,"Recently Moved"
   * </pre>
   *
   * <code>string name = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The parent of the life_event.
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Output only. The parent of the life_event.
   * </pre>
   *
   * <code>string parent = 4 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Output only. True if the life event is launched to all channels and
   * locales.
   * </pre>
   *
   * <code>bool launched_to_all = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The launchedToAll.
   */
  boolean getLaunchedToAll();

  /**
   * <pre>
   * Output only. Availability information of the life event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.CriterionCategoryAvailability availabilities = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.ads.googleads.v17.common.CriterionCategoryAvailability> 
      getAvailabilitiesList();
  /**
   * <pre>
   * Output only. Availability information of the life event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.CriterionCategoryAvailability availabilities = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v17.common.CriterionCategoryAvailability getAvailabilities(int index);
  /**
   * <pre>
   * Output only. Availability information of the life event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.CriterionCategoryAvailability availabilities = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getAvailabilitiesCount();
  /**
   * <pre>
   * Output only. Availability information of the life event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.CriterionCategoryAvailability availabilities = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v17.common.CriterionCategoryAvailabilityOrBuilder> 
      getAvailabilitiesOrBuilderList();
  /**
   * <pre>
   * Output only. Availability information of the life event.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.CriterionCategoryAvailability availabilities = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v17.common.CriterionCategoryAvailabilityOrBuilder getAvailabilitiesOrBuilder(
      int index);
}
