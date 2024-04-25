// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/recommendation_subscription_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public interface MutateRecommendationSubscriptionResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.services.MutateRecommendationSubscriptionResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource name of the subscription that was modified.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Resource name of the subscription that was modified.
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The mutated recommendation subscription with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.RecommendationSubscription recommendation_subscription = 2;</code>
   * @return Whether the recommendationSubscription field is set.
   */
  boolean hasRecommendationSubscription();
  /**
   * <pre>
   * The mutated recommendation subscription with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.RecommendationSubscription recommendation_subscription = 2;</code>
   * @return The recommendationSubscription.
   */
  com.google.ads.googleads.v15.resources.RecommendationSubscription getRecommendationSubscription();
  /**
   * <pre>
   * The mutated recommendation subscription with only mutable fields after
   * mutate. The field will only be returned when response_content_type is set
   * to "MUTABLE_RESOURCE".
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.RecommendationSubscription recommendation_subscription = 2;</code>
   */
  com.google.ads.googleads.v15.resources.RecommendationSubscriptionOrBuilder getRecommendationSubscriptionOrBuilder();
}
