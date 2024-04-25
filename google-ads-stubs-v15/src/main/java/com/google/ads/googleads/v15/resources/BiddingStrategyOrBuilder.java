// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/bidding_strategy.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface BiddingStrategyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.BiddingStrategy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the bidding strategy.
   * Bidding strategy resource names have the form:
   *
   * `customers/{customer_id}/biddingStrategies/{bidding_strategy_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the bidding strategy.
   * Bidding strategy resource names have the form:
   *
   * `customers/{customer_id}/biddingStrategies/{bidding_strategy_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. The ID of the bidding strategy.
   * </pre>
   *
   * <code>optional int64 id = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the bidding strategy.
   * </pre>
   *
   * <code>optional int64 id = 16 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the bidding strategy.
   * All bidding strategies within an account must be named distinctly.
   *
   * The length of this string should be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>optional string name = 17;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the bidding strategy.
   * All bidding strategies within an account must be named distinctly.
   *
   * The length of this string should be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>optional string name = 17;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the bidding strategy.
   * All bidding strategies within an account must be named distinctly.
   *
   * The length of this string should be between 1 and 255, inclusive,
   * in UTF-8 bytes, (trimmed).
   * </pre>
   *
   * <code>optional string name = 17;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. The status of the bidding strategy.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BiddingStrategyStatusEnum.BiddingStrategyStatus status = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Output only. The status of the bidding strategy.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BiddingStrategyStatusEnum.BiddingStrategyStatus status = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The status.
   */
  com.google.ads.googleads.v15.enums.BiddingStrategyStatusEnum.BiddingStrategyStatus getStatus();

  /**
   * <pre>
   * Output only. The type of the bidding strategy.
   * Create a bidding strategy by setting the bidding scheme.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BiddingStrategyTypeEnum.BiddingStrategyType type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Output only. The type of the bidding strategy.
   * Create a bidding strategy by setting the bidding scheme.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.BiddingStrategyTypeEnum.BiddingStrategyType type = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The type.
   */
  com.google.ads.googleads.v15.enums.BiddingStrategyTypeEnum.BiddingStrategyType getType();

  /**
   * <pre>
   * Immutable. The currency used by the bidding strategy (ISO 4217 three-letter
   * code).
   *
   * For bidding strategies in manager customers, this currency can be set on
   * creation and defaults to the manager customer's currency. For serving
   * customers, this field cannot be set; all strategies in a serving customer
   * implicitly use the serving customer's currency. In all cases the
   * effective_currency_code field returns the currency used by the strategy.
   * </pre>
   *
   * <code>string currency_code = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   * <pre>
   * Immutable. The currency used by the bidding strategy (ISO 4217 three-letter
   * code).
   *
   * For bidding strategies in manager customers, this currency can be set on
   * creation and defaults to the manager customer's currency. For serving
   * customers, this field cannot be set; all strategies in a serving customer
   * implicitly use the serving customer's currency. In all cases the
   * effective_currency_code field returns the currency used by the strategy.
   * </pre>
   *
   * <code>string currency_code = 23 [(.google.api.field_behavior) = IMMUTABLE];</code>
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString
      getCurrencyCodeBytes();

  /**
   * <pre>
   * Output only. The currency used by the bidding strategy (ISO 4217
   * three-letter code).
   *
   * For bidding strategies in manager customers, this is the currency set by
   * the advertiser when creating the strategy. For serving customers, this is
   * the customer's currency_code.
   *
   * Bidding strategy metrics are reported in this currency.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>optional string effective_currency_code = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the effectiveCurrencyCode field is set.
   */
  boolean hasEffectiveCurrencyCode();
  /**
   * <pre>
   * Output only. The currency used by the bidding strategy (ISO 4217
   * three-letter code).
   *
   * For bidding strategies in manager customers, this is the currency set by
   * the advertiser when creating the strategy. For serving customers, this is
   * the customer's currency_code.
   *
   * Bidding strategy metrics are reported in this currency.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>optional string effective_currency_code = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The effectiveCurrencyCode.
   */
  java.lang.String getEffectiveCurrencyCode();
  /**
   * <pre>
   * Output only. The currency used by the bidding strategy (ISO 4217
   * three-letter code).
   *
   * For bidding strategies in manager customers, this is the currency set by
   * the advertiser when creating the strategy. For serving customers, this is
   * the customer's currency_code.
   *
   * Bidding strategy metrics are reported in this currency.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>optional string effective_currency_code = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for effectiveCurrencyCode.
   */
  com.google.protobuf.ByteString
      getEffectiveCurrencyCodeBytes();

  /**
   * <pre>
   * ID of the campaign budget that this portfolio bidding strategy
   * is aligned with. When a portfolio and a campaign budget are aligned, that
   * means that they are attached to the same set of campaigns. After a bidding
   * strategy is aligned with a campaign budget, campaigns that are added to the
   * bidding strategy must also use the aligned campaign budget.
   * </pre>
   *
   * <code>int64 aligned_campaign_budget_id = 25;</code>
   * @return The alignedCampaignBudgetId.
   */
  long getAlignedCampaignBudgetId();

  /**
   * <pre>
   * Output only. The number of campaigns attached to this bidding strategy.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 campaign_count = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the campaignCount field is set.
   */
  boolean hasCampaignCount();
  /**
   * <pre>
   * Output only. The number of campaigns attached to this bidding strategy.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 campaign_count = 18 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The campaignCount.
   */
  long getCampaignCount();

  /**
   * <pre>
   * Output only. The number of non-removed campaigns attached to this bidding
   * strategy.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 non_removed_campaign_count = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the nonRemovedCampaignCount field is set.
   */
  boolean hasNonRemovedCampaignCount();
  /**
   * <pre>
   * Output only. The number of non-removed campaigns attached to this bidding
   * strategy.
   *
   * This field is read-only.
   * </pre>
   *
   * <code>optional int64 non_removed_campaign_count = 19 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The nonRemovedCampaignCount.
   */
  long getNonRemovedCampaignCount();

  /**
   * <pre>
   * A bidding strategy that raises bids for clicks that seem more likely to
   * lead to a conversion and lowers them for clicks where they seem less
   * likely.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.EnhancedCpc enhanced_cpc = 7;</code>
   * @return Whether the enhancedCpc field is set.
   */
  boolean hasEnhancedCpc();
  /**
   * <pre>
   * A bidding strategy that raises bids for clicks that seem more likely to
   * lead to a conversion and lowers them for clicks where they seem less
   * likely.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.EnhancedCpc enhanced_cpc = 7;</code>
   * @return The enhancedCpc.
   */
  com.google.ads.googleads.v15.common.EnhancedCpc getEnhancedCpc();
  /**
   * <pre>
   * A bidding strategy that raises bids for clicks that seem more likely to
   * lead to a conversion and lowers them for clicks where they seem less
   * likely.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.EnhancedCpc enhanced_cpc = 7;</code>
   */
  com.google.ads.googleads.v15.common.EnhancedCpcOrBuilder getEnhancedCpcOrBuilder();

  /**
   * <pre>
   * An automated bidding strategy to help get the most conversion value for
   * your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MaximizeConversionValue maximize_conversion_value = 21;</code>
   * @return Whether the maximizeConversionValue field is set.
   */
  boolean hasMaximizeConversionValue();
  /**
   * <pre>
   * An automated bidding strategy to help get the most conversion value for
   * your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MaximizeConversionValue maximize_conversion_value = 21;</code>
   * @return The maximizeConversionValue.
   */
  com.google.ads.googleads.v15.common.MaximizeConversionValue getMaximizeConversionValue();
  /**
   * <pre>
   * An automated bidding strategy to help get the most conversion value for
   * your campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MaximizeConversionValue maximize_conversion_value = 21;</code>
   */
  com.google.ads.googleads.v15.common.MaximizeConversionValueOrBuilder getMaximizeConversionValueOrBuilder();

  /**
   * <pre>
   * An automated bidding strategy to help get the most conversions for your
   * campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MaximizeConversions maximize_conversions = 22;</code>
   * @return Whether the maximizeConversions field is set.
   */
  boolean hasMaximizeConversions();
  /**
   * <pre>
   * An automated bidding strategy to help get the most conversions for your
   * campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MaximizeConversions maximize_conversions = 22;</code>
   * @return The maximizeConversions.
   */
  com.google.ads.googleads.v15.common.MaximizeConversions getMaximizeConversions();
  /**
   * <pre>
   * An automated bidding strategy to help get the most conversions for your
   * campaigns while spending your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.MaximizeConversions maximize_conversions = 22;</code>
   */
  com.google.ads.googleads.v15.common.MaximizeConversionsOrBuilder getMaximizeConversionsOrBuilder();

  /**
   * <pre>
   * A bidding strategy that sets bids to help get as many conversions as
   * possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetCpa target_cpa = 9;</code>
   * @return Whether the targetCpa field is set.
   */
  boolean hasTargetCpa();
  /**
   * <pre>
   * A bidding strategy that sets bids to help get as many conversions as
   * possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetCpa target_cpa = 9;</code>
   * @return The targetCpa.
   */
  com.google.ads.googleads.v15.common.TargetCpa getTargetCpa();
  /**
   * <pre>
   * A bidding strategy that sets bids to help get as many conversions as
   * possible at the target cost-per-acquisition (CPA) you set.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetCpa target_cpa = 9;</code>
   */
  com.google.ads.googleads.v15.common.TargetCpaOrBuilder getTargetCpaOrBuilder();

  /**
   * <pre>
   * A bidding strategy that automatically optimizes towards a chosen
   * percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetImpressionShare target_impression_share = 48;</code>
   * @return Whether the targetImpressionShare field is set.
   */
  boolean hasTargetImpressionShare();
  /**
   * <pre>
   * A bidding strategy that automatically optimizes towards a chosen
   * percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetImpressionShare target_impression_share = 48;</code>
   * @return The targetImpressionShare.
   */
  com.google.ads.googleads.v15.common.TargetImpressionShare getTargetImpressionShare();
  /**
   * <pre>
   * A bidding strategy that automatically optimizes towards a chosen
   * percentage of impressions.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetImpressionShare target_impression_share = 48;</code>
   */
  com.google.ads.googleads.v15.common.TargetImpressionShareOrBuilder getTargetImpressionShareOrBuilder();

  /**
   * <pre>
   * A bidding strategy that helps you maximize revenue while averaging a
   * specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetRoas target_roas = 11;</code>
   * @return Whether the targetRoas field is set.
   */
  boolean hasTargetRoas();
  /**
   * <pre>
   * A bidding strategy that helps you maximize revenue while averaging a
   * specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetRoas target_roas = 11;</code>
   * @return The targetRoas.
   */
  com.google.ads.googleads.v15.common.TargetRoas getTargetRoas();
  /**
   * <pre>
   * A bidding strategy that helps you maximize revenue while averaging a
   * specific target Return On Ad Spend (ROAS).
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetRoas target_roas = 11;</code>
   */
  com.google.ads.googleads.v15.common.TargetRoasOrBuilder getTargetRoasOrBuilder();

  /**
   * <pre>
   * A bid strategy that sets your bids to help get as many clicks as
   * possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetSpend target_spend = 12;</code>
   * @return Whether the targetSpend field is set.
   */
  boolean hasTargetSpend();
  /**
   * <pre>
   * A bid strategy that sets your bids to help get as many clicks as
   * possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetSpend target_spend = 12;</code>
   * @return The targetSpend.
   */
  com.google.ads.googleads.v15.common.TargetSpend getTargetSpend();
  /**
   * <pre>
   * A bid strategy that sets your bids to help get as many clicks as
   * possible within your budget.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.common.TargetSpend target_spend = 12;</code>
   */
  com.google.ads.googleads.v15.common.TargetSpendOrBuilder getTargetSpendOrBuilder();

  com.google.ads.googleads.v15.resources.BiddingStrategy.SchemeCase getSchemeCase();
}
