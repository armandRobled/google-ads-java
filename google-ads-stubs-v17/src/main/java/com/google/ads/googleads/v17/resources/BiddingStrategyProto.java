// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/bidding_strategy.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class BiddingStrategyProto {
  private BiddingStrategyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_BiddingStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_BiddingStrategy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v17/resources/bid" +
      "ding_strategy.proto\022\"google.ads.googlead" +
      "s.v17.resources\032-google/ads/googleads/v1" +
      "7/common/bidding.proto\032<google/ads/googl" +
      "eads/v17/enums/bidding_strategy_status.p" +
      "roto\032:google/ads/googleads/v17/enums/bid" +
      "ding_strategy_type.proto\032\037google/api/fie" +
      "ld_behavior.proto\032\031google/api/resource.p" +
      "roto\"\376\t\n\017BiddingStrategy\022G\n\rresource_nam" +
      "e\030\001 \001(\tB0\340A\005\372A*\n(googleads.googleapis.co" +
      "m/BiddingStrategy\022\024\n\002id\030\020 \001(\003B\003\340A\003H\001\210\001\001\022" +
      "\021\n\004name\030\021 \001(\tH\002\210\001\001\022d\n\006status\030\017 \001(\0162O.goo" +
      "gle.ads.googleads.v17.enums.BiddingStrat" +
      "egyStatusEnum.BiddingStrategyStatusB\003\340A\003" +
      "\022^\n\004type\030\005 \001(\0162K.google.ads.googleads.v1" +
      "7.enums.BiddingStrategyTypeEnum.BiddingS" +
      "trategyTypeB\003\340A\003\022\032\n\rcurrency_code\030\027 \001(\tB" +
      "\003\340A\005\022)\n\027effective_currency_code\030\024 \001(\tB\003\340" +
      "A\003H\003\210\001\001\022\"\n\032aligned_campaign_budget_id\030\031 " +
      "\001(\003\022 \n\016campaign_count\030\022 \001(\003B\003\340A\003H\004\210\001\001\022,\n" +
      "\032non_removed_campaign_count\030\023 \001(\003B\003\340A\003H\005" +
      "\210\001\001\022D\n\014enhanced_cpc\030\007 \001(\0132,.google.ads.g" +
      "oogleads.v17.common.EnhancedCpcH\000\022]\n\031max" +
      "imize_conversion_value\030\025 \001(\01328.google.ad" +
      "s.googleads.v17.common.MaximizeConversio" +
      "nValueH\000\022T\n\024maximize_conversions\030\026 \001(\01324" +
      ".google.ads.googleads.v17.common.Maximiz" +
      "eConversionsH\000\022@\n\ntarget_cpa\030\t \001(\0132*.goo" +
      "gle.ads.googleads.v17.common.TargetCpaH\000" +
      "\022Y\n\027target_impression_share\0300 \001(\01326.goog" +
      "le.ads.googleads.v17.common.TargetImpres" +
      "sionShareH\000\022B\n\013target_roas\030\013 \001(\0132+.googl" +
      "e.ads.googleads.v17.common.TargetRoasH\000\022" +
      "D\n\014target_spend\030\014 \001(\0132,.google.ads.googl" +
      "eads.v17.common.TargetSpendH\000:n\352Ak\n(goog" +
      "leads.googleapis.com/BiddingStrategy\022?cu" +
      "stomers/{customer_id}/biddingStrategies/" +
      "{bidding_strategy_id}B\010\n\006schemeB\005\n\003_idB\007" +
      "\n\005_nameB\032\n\030_effective_currency_codeB\021\n\017_" +
      "campaign_countB\035\n\033_non_removed_campaign_" +
      "countB\206\002\n&com.google.ads.googleads.v17.r" +
      "esourcesB\024BiddingStrategyProtoP\001ZKgoogle" +
      ".golang.org/genproto/googleapis/ads/goog" +
      "leads/v17/resources;resources\242\002\003GAA\252\002\"Go" +
      "ogle.Ads.GoogleAds.V17.Resources\312\002\"Googl" +
      "e\\Ads\\GoogleAds\\V17\\Resources\352\002&Google::" +
      "Ads::GoogleAds::V17::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.common.BiddingProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.BiddingStrategyStatusProto.getDescriptor(),
          com.google.ads.googleads.v17.enums.BiddingStrategyTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_BiddingStrategy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_BiddingStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_BiddingStrategy_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "CurrencyCode", "EffectiveCurrencyCode", "AlignedCampaignBudgetId", "CampaignCount", "NonRemovedCampaignCount", "EnhancedCpc", "MaximizeConversionValue", "MaximizeConversions", "TargetCpa", "TargetImpressionShare", "TargetRoas", "TargetSpend", "Scheme", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.common.BiddingProto.getDescriptor();
    com.google.ads.googleads.v17.enums.BiddingStrategyStatusProto.getDescriptor();
    com.google.ads.googleads.v17.enums.BiddingStrategyTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
