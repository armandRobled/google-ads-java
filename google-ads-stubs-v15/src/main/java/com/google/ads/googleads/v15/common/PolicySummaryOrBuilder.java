// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/common/policy_summary.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.common;

public interface PolicySummaryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.common.PolicySummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of policy findings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v15.common.PolicyTopicEntry> 
      getPolicyTopicEntriesList();
  /**
   * <pre>
   * The list of policy findings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  com.google.ads.googleads.v15.common.PolicyTopicEntry getPolicyTopicEntries(int index);
  /**
   * <pre>
   * The list of policy findings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  int getPolicyTopicEntriesCount();
  /**
   * <pre>
   * The list of policy findings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v15.common.PolicyTopicEntryOrBuilder> 
      getPolicyTopicEntriesOrBuilderList();
  /**
   * <pre>
   * The list of policy findings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v15.common.PolicyTopicEntry policy_topic_entries = 1;</code>
   */
  com.google.ads.googleads.v15.common.PolicyTopicEntryOrBuilder getPolicyTopicEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Where in the review process the resource is.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2;</code>
   * @return The enum numeric value on the wire for reviewStatus.
   */
  int getReviewStatusValue();
  /**
   * <pre>
   * Where in the review process the resource is.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PolicyReviewStatusEnum.PolicyReviewStatus review_status = 2;</code>
   * @return The reviewStatus.
   */
  com.google.ads.googleads.v15.enums.PolicyReviewStatusEnum.PolicyReviewStatus getReviewStatus();

  /**
   * <pre>
   * The overall approval status, which is calculated based on
   * the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3;</code>
   * @return The enum numeric value on the wire for approvalStatus.
   */
  int getApprovalStatusValue();
  /**
   * <pre>
   * The overall approval status, which is calculated based on
   * the status of its individual policy topic entries.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus approval_status = 3;</code>
   * @return The approvalStatus.
   */
  com.google.ads.googleads.v15.enums.PolicyApprovalStatusEnum.PolicyApprovalStatus getApprovalStatus();
}
