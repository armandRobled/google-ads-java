// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/experiment.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public interface ExperimentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.Experiment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the experiment.
   * Experiment resource names have the form:
   *
   * `customers/{customer_id}/experiments/{experiment_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the experiment.
   * Experiment resource names have the form:
   *
   * `customers/{customer_id}/experiments/{experiment_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the experiment. Read only.
   * </pre>
   *
   * <code>optional int64 experiment_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the experimentId field is set.
   */
  boolean hasExperimentId();
  /**
   * <pre>
   * Output only. The ID of the experiment. Read only.
   * </pre>
   *
   * <code>optional int64 experiment_id = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The experimentId.
   */
  long getExperimentId();

  /**
   * <pre>
   * Required. The name of the experiment. It must have a minimum length of 1
   * and maximum length of 1024. It must be unique under a customer.
   * </pre>
   *
   * <code>string name = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The name of the experiment. It must have a minimum length of 1
   * and maximum length of 1024. It must be unique under a customer.
   * </pre>
   *
   * <code>string name = 10 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The description of the experiment. It must have a minimum length of 1 and
   * maximum length of 2048.
   * </pre>
   *
   * <code>string description = 11;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the experiment. It must have a minimum length of 1 and
   * maximum length of 2048.
   * </pre>
   *
   * <code>string description = 11;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * For system managed experiments, the advertiser must provide a suffix during
   * construction, in the setup stage before moving to initiated. The suffix
   * will be appended to the in-design and experiment campaign names so that the
   * name is base campaign name + suffix.
   * </pre>
   *
   * <code>string suffix = 12;</code>
   * @return The suffix.
   */
  java.lang.String getSuffix();
  /**
   * <pre>
   * For system managed experiments, the advertiser must provide a suffix during
   * construction, in the setup stage before moving to initiated. The suffix
   * will be appended to the in-design and experiment campaign names so that the
   * name is base campaign name + suffix.
   * </pre>
   *
   * <code>string suffix = 12;</code>
   * @return The bytes for suffix.
   */
  com.google.protobuf.ByteString
      getSuffixBytes();

  /**
   * <pre>
   * Required. The product/feature that uses this experiment.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ExperimentTypeEnum.ExperimentType type = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Required. The product/feature that uses this experiment.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ExperimentTypeEnum.ExperimentType type = 13 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The type.
   */
  com.google.ads.googleads.v16.enums.ExperimentTypeEnum.ExperimentType getType();

  /**
   * <pre>
   * The Advertiser-chosen status of this experiment.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ExperimentStatusEnum.ExperimentStatus status = 14;</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * The Advertiser-chosen status of this experiment.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.ExperimentStatusEnum.ExperimentStatus status = 14;</code>
   * @return The status.
   */
  com.google.ads.googleads.v16.enums.ExperimentStatusEnum.ExperimentStatus getStatus();

  /**
   * <pre>
   * Date when the experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone.
   *
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>optional string start_date = 15;</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * Date when the experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone.
   *
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>optional string start_date = 15;</code>
   * @return The startDate.
   */
  java.lang.String getStartDate();
  /**
   * <pre>
   * Date when the experiment starts. By default, the experiment starts
   * now or on the campaign's start date, whichever is later. If this field is
   * set, then the experiment starts at the beginning of the specified date in
   * the customer's time zone.
   *
   * Format: YYYY-MM-DD
   * Example: 2019-03-14
   * </pre>
   *
   * <code>optional string start_date = 15;</code>
   * @return The bytes for startDate.
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <pre>
   * Date when the experiment ends. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   *
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>optional string end_date = 16;</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * Date when the experiment ends. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   *
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>optional string end_date = 16;</code>
   * @return The endDate.
   */
  java.lang.String getEndDate();
  /**
   * <pre>
   * Date when the experiment ends. By default, the experiment ends on
   * the campaign's end date. If this field is set, then the experiment ends at
   * the end of the specified date in the customer's time zone.
   *
   * Format: YYYY-MM-DD
   * Example: 2019-04-18
   * </pre>
   *
   * <code>optional string end_date = 16;</code>
   * @return The bytes for endDate.
   */
  com.google.protobuf.ByteString
      getEndDateBytes();

  /**
   * <pre>
   * The goals of this experiment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.MetricGoal goals = 17;</code>
   */
  java.util.List<com.google.ads.googleads.v16.common.MetricGoal> 
      getGoalsList();
  /**
   * <pre>
   * The goals of this experiment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.MetricGoal goals = 17;</code>
   */
  com.google.ads.googleads.v16.common.MetricGoal getGoals(int index);
  /**
   * <pre>
   * The goals of this experiment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.MetricGoal goals = 17;</code>
   */
  int getGoalsCount();
  /**
   * <pre>
   * The goals of this experiment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.MetricGoal goals = 17;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v16.common.MetricGoalOrBuilder> 
      getGoalsOrBuilderList();
  /**
   * <pre>
   * The goals of this experiment.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.common.MetricGoal goals = 17;</code>
   */
  com.google.ads.googleads.v16.common.MetricGoalOrBuilder getGoalsOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be
   * used to poll for completion of experiment schedule or promote. The most
   * recent long running operation is returned.
   * </pre>
   *
   * <code>optional string long_running_operation = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the longRunningOperation field is set.
   */
  boolean hasLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be
   * used to poll for completion of experiment schedule or promote. The most
   * recent long running operation is returned.
   * </pre>
   *
   * <code>optional string long_running_operation = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The longRunningOperation.
   */
  java.lang.String getLongRunningOperation();
  /**
   * <pre>
   * Output only. The resource name of the long-running operation that can be
   * used to poll for completion of experiment schedule or promote. The most
   * recent long running operation is returned.
   * </pre>
   *
   * <code>optional string long_running_operation = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for longRunningOperation.
   */
  com.google.protobuf.ByteString
      getLongRunningOperationBytes();

  /**
   * <pre>
   * Output only. The status of the experiment promotion process.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AsyncActionStatusEnum.AsyncActionStatus promote_status = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for promoteStatus.
   */
  int getPromoteStatusValue();
  /**
   * <pre>
   * Output only. The status of the experiment promotion process.
   * </pre>
   *
   * <code>.google.ads.googleads.v16.enums.AsyncActionStatusEnum.AsyncActionStatus promote_status = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The promoteStatus.
   */
  com.google.ads.googleads.v16.enums.AsyncActionStatusEnum.AsyncActionStatus getPromoteStatus();

  /**
   * <pre>
   * Immutable. Set to true if changes to base campaigns should be synced to the
   * trial campaigns. Any changes made directly to trial campaigns will be
   * preserved. This field can only be set when the experiment is being created.
   * </pre>
   *
   * <code>optional bool sync_enabled = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return Whether the syncEnabled field is set.
   */
  boolean hasSyncEnabled();
  /**
   * <pre>
   * Immutable. Set to true if changes to base campaigns should be synced to the
   * trial campaigns. Any changes made directly to trial campaigns will be
   * preserved. This field can only be set when the experiment is being created.
   * </pre>
   *
   * <code>optional bool sync_enabled = 20 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The syncEnabled.
   */
  boolean getSyncEnabled();
}
