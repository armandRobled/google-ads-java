// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/keyword_plan_idea_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public interface GenerateAdGroupThemesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.services.GenerateAdGroupThemesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of suggested AdGroup/keyword pairings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.AdGroupKeywordSuggestion ad_group_keyword_suggestions = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v16.services.AdGroupKeywordSuggestion> 
      getAdGroupKeywordSuggestionsList();
  /**
   * <pre>
   * A list of suggested AdGroup/keyword pairings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.AdGroupKeywordSuggestion ad_group_keyword_suggestions = 1;</code>
   */
  com.google.ads.googleads.v16.services.AdGroupKeywordSuggestion getAdGroupKeywordSuggestions(int index);
  /**
   * <pre>
   * A list of suggested AdGroup/keyword pairings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.AdGroupKeywordSuggestion ad_group_keyword_suggestions = 1;</code>
   */
  int getAdGroupKeywordSuggestionsCount();
  /**
   * <pre>
   * A list of suggested AdGroup/keyword pairings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.AdGroupKeywordSuggestion ad_group_keyword_suggestions = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v16.services.AdGroupKeywordSuggestionOrBuilder> 
      getAdGroupKeywordSuggestionsOrBuilderList();
  /**
   * <pre>
   * A list of suggested AdGroup/keyword pairings.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.AdGroupKeywordSuggestion ad_group_keyword_suggestions = 1;</code>
   */
  com.google.ads.googleads.v16.services.AdGroupKeywordSuggestionOrBuilder getAdGroupKeywordSuggestionsOrBuilder(
      int index);

  /**
   * <pre>
   * A list of provided AdGroups that could not be used as suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.UnusableAdGroup unusable_ad_groups = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v16.services.UnusableAdGroup> 
      getUnusableAdGroupsList();
  /**
   * <pre>
   * A list of provided AdGroups that could not be used as suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.UnusableAdGroup unusable_ad_groups = 2;</code>
   */
  com.google.ads.googleads.v16.services.UnusableAdGroup getUnusableAdGroups(int index);
  /**
   * <pre>
   * A list of provided AdGroups that could not be used as suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.UnusableAdGroup unusable_ad_groups = 2;</code>
   */
  int getUnusableAdGroupsCount();
  /**
   * <pre>
   * A list of provided AdGroups that could not be used as suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.UnusableAdGroup unusable_ad_groups = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v16.services.UnusableAdGroupOrBuilder> 
      getUnusableAdGroupsOrBuilderList();
  /**
   * <pre>
   * A list of provided AdGroups that could not be used as suggestions.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v16.services.UnusableAdGroup unusable_ad_groups = 2;</code>
   */
  com.google.ads.googleads.v16.services.UnusableAdGroupOrBuilder getUnusableAdGroupsOrBuilder(
      int index);
}
