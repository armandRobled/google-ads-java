// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/services/reach_plan_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.services;

public interface AudienceTargetingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v17.services.AudienceTargeting)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * List of audiences based on user interests to be targeted.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.UserInterestInfo user_interest = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v17.common.UserInterestInfo> 
      getUserInterestList();
  /**
   * <pre>
   * List of audiences based on user interests to be targeted.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.UserInterestInfo user_interest = 1;</code>
   */
  com.google.ads.googleads.v17.common.UserInterestInfo getUserInterest(int index);
  /**
   * <pre>
   * List of audiences based on user interests to be targeted.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.UserInterestInfo user_interest = 1;</code>
   */
  int getUserInterestCount();
  /**
   * <pre>
   * List of audiences based on user interests to be targeted.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.UserInterestInfo user_interest = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v17.common.UserInterestInfoOrBuilder> 
      getUserInterestOrBuilderList();
  /**
   * <pre>
   * List of audiences based on user interests to be targeted.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v17.common.UserInterestInfo user_interest = 1;</code>
   */
  com.google.ads.googleads.v17.common.UserInterestInfoOrBuilder getUserInterestOrBuilder(
      int index);
}
