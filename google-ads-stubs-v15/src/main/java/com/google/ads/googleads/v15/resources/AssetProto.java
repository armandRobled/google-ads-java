// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/asset.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class AssetProto {
  private AssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_Asset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AssetFieldTypePolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AssetFieldTypePolicySummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_AssetPolicySummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_AssetPolicySummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.google/ads/googleads/v15/resources/ass" +
      "et.proto\022\"google.ads.googleads.v15.resou" +
      "rces\0321google/ads/googleads/v15/common/as" +
      "set_types.proto\0326google/ads/googleads/v1" +
      "5/common/custom_parameter.proto\032,google/" +
      "ads/googleads/v15/common/policy.proto\0325g" +
      "oogle/ads/googleads/v15/enums/asset_fiel" +
      "d_type.proto\0321google/ads/googleads/v15/e" +
      "nums/asset_source.proto\032/google/ads/goog" +
      "leads/v15/enums/asset_type.proto\032;google" +
      "/ads/googleads/v15/enums/policy_approval" +
      "_status.proto\0329google/ads/googleads/v15/" +
      "enums/policy_review_status.proto\032\037google" +
      "/api/field_behavior.proto\032\031google/api/re" +
      "source.proto\"\354\027\n\005Asset\022=\n\rresource_name\030" +
      "\001 \001(\tB&\340A\005\372A \n\036googleads.googleapis.com/" +
      "Asset\022\024\n\002id\030\013 \001(\003B\003\340A\003H\001\210\001\001\022\021\n\004name\030\014 \001(" +
      "\tH\002\210\001\001\022J\n\004type\030\004 \001(\01627.google.ads.google" +
      "ads.v15.enums.AssetTypeEnum.AssetTypeB\003\340" +
      "A\003\022\022\n\nfinal_urls\030\016 \003(\t\022\031\n\021final_mobile_u" +
      "rls\030\020 \003(\t\022\"\n\025tracking_url_template\030\021 \001(\t" +
      "H\003\210\001\001\022O\n\025url_custom_parameters\030\022 \003(\01320.g" +
      "oogle.ads.googleads.v15.common.CustomPar" +
      "ameter\022\035\n\020final_url_suffix\030\023 \001(\tH\004\210\001\001\022P\n" +
      "\006source\030& \001(\0162;.google.ads.googleads.v15" +
      ".enums.AssetSourceEnum.AssetSourceB\003\340A\003\022" +
      "S\n\016policy_summary\030\r \001(\01326.google.ads.goo" +
      "gleads.v15.resources.AssetPolicySummaryB" +
      "\003\340A\003\022i\n\033field_type_policy_summaries\030( \003(" +
      "\0132?.google.ads.googleads.v15.resources.A" +
      "ssetFieldTypePolicySummaryB\003\340A\003\022V\n\023youtu" +
      "be_video_asset\030\005 \001(\01322.google.ads.google" +
      "ads.v15.common.YoutubeVideoAssetB\003\340A\005H\000\022" +
      "T\n\022media_bundle_asset\030\006 \001(\01321.google.ads" +
      ".googleads.v15.common.MediaBundleAssetB\003" +
      "\340A\005H\000\022G\n\013image_asset\030\007 \001(\0132+.google.ads." +
      "googleads.v15.common.ImageAssetB\003\340A\003H\000\022E" +
      "\n\ntext_asset\030\010 \001(\0132*.google.ads.googlead" +
      "s.v15.common.TextAssetB\003\340A\005H\000\022I\n\017lead_fo" +
      "rm_asset\030\t \001(\0132..google.ads.googleads.v1" +
      "5.common.LeadFormAssetH\000\022R\n\024book_on_goog" +
      "le_asset\030\n \001(\01322.google.ads.googleads.v1" +
      "5.common.BookOnGoogleAssetH\000\022J\n\017promotio" +
      "n_asset\030\017 \001(\0132/.google.ads.googleads.v15" +
      ".common.PromotionAssetH\000\022F\n\rcallout_asse" +
      "t\030\024 \001(\0132-.google.ads.googleads.v15.commo" +
      "n.CalloutAssetH\000\022[\n\030structured_snippet_a" +
      "sset\030\025 \001(\01327.google.ads.googleads.v15.co" +
      "mmon.StructuredSnippetAssetH\000\022H\n\016sitelin" +
      "k_asset\030\026 \001(\0132..google.ads.googleads.v15" +
      ".common.SitelinkAssetH\000\022I\n\017page_feed_ass" +
      "et\030\027 \001(\0132..google.ads.googleads.v15.comm" +
      "on.PageFeedAssetH\000\022Y\n\027dynamic_education_" +
      "asset\030\030 \001(\01326.google.ads.googleads.v15.c" +
      "ommon.DynamicEducationAssetH\000\022K\n\020mobile_" +
      "app_asset\030\031 \001(\0132/.google.ads.googleads.v" +
      "15.common.MobileAppAssetH\000\022Q\n\023hotel_call" +
      "out_asset\030\032 \001(\01322.google.ads.googleads.v" +
      "15.common.HotelCalloutAssetH\000\022@\n\ncall_as" +
      "set\030\033 \001(\0132*.google.ads.googleads.v15.com" +
      "mon.CallAssetH\000\022B\n\013price_asset\030\034 \001(\0132+.g" +
      "oogle.ads.googleads.v15.common.PriceAsse" +
      "tH\000\022W\n\024call_to_action_asset\030\035 \001(\01322.goog" +
      "le.ads.googleads.v15.common.CallToAction" +
      "AssetB\003\340A\005H\000\022\\\n\031dynamic_real_estate_asse" +
      "t\030\036 \001(\01327.google.ads.googleads.v15.commo" +
      "n.DynamicRealEstateAssetH\000\022S\n\024dynamic_cu" +
      "stom_asset\030\037 \001(\01323.google.ads.googleads." +
      "v15.common.DynamicCustomAssetH\000\022i\n dynam" +
      "ic_hotels_and_rentals_asset\030  \001(\0132=.goog" +
      "le.ads.googleads.v15.common.DynamicHotel" +
      "sAndRentalsAssetH\000\022U\n\025dynamic_flights_as" +
      "set\030! \001(\01324.google.ads.googleads.v15.com" +
      "mon.DynamicFlightsAssetH\000\022i\n\035discovery_c" +
      "arousel_card_asset\030\" \001(\0132;.google.ads.go" +
      "ogleads.v15.common.DiscoveryCarouselCard" +
      "AssetB\003\340A\005H\000\022S\n\024dynamic_travel_asset\030# \001" +
      "(\01323.google.ads.googleads.v15.common.Dyn" +
      "amicTravelAssetH\000\022Q\n\023dynamic_local_asset" +
      "\030$ \001(\01322.google.ads.googleads.v15.common" +
      ".DynamicLocalAssetH\000\022O\n\022dynamic_jobs_ass" +
      "et\030% \001(\01321.google.ads.googleads.v15.comm" +
      "on.DynamicJobsAssetH\000\022M\n\016location_asset\030" +
      "\' \001(\0132..google.ads.googleads.v15.common." +
      "LocationAssetB\003\340A\003H\000\022X\n\024hotel_property_a" +
      "sset\030) \001(\01323.google.ads.googleads.v15.co" +
      "mmon.HotelPropertyAssetB\003\340A\005H\000:N\352AK\n\036goo" +
      "gleads.googleapis.com/Asset\022)customers/{" +
      "customer_id}/assets/{asset_id}B\014\n\nasset_" +
      "dataB\005\n\003_idB\007\n\005_nameB\030\n\026_tracking_url_te" +
      "mplateB\023\n\021_final_url_suffix\"\376\002\n\033AssetFie" +
      "ldTypePolicySummary\022e\n\020asset_field_type\030" +
      "\001 \001(\0162A.google.ads.googleads.v15.enums.A" +
      "ssetFieldTypeEnum.AssetFieldTypeB\003\340A\003H\000\210" +
      "\001\001\022[\n\014asset_source\030\002 \001(\0162;.google.ads.go" +
      "ogleads.v15.enums.AssetSourceEnum.AssetS" +
      "ourceB\003\340A\003H\001\210\001\001\022]\n\023policy_summary_info\030\003" +
      " \001(\01326.google.ads.googleads.v15.resource" +
      "s.AssetPolicySummaryB\003\340A\003H\002\210\001\001B\023\n\021_asset" +
      "_field_typeB\017\n\r_asset_sourceB\026\n\024_policy_" +
      "summary_info\"\276\002\n\022AssetPolicySummary\022T\n\024p" +
      "olicy_topic_entries\030\001 \003(\01321.google.ads.g" +
      "oogleads.v15.common.PolicyTopicEntryB\003\340A" +
      "\003\022e\n\rreview_status\030\002 \001(\0162I.google.ads.go" +
      "ogleads.v15.enums.PolicyReviewStatusEnum" +
      ".PolicyReviewStatusB\003\340A\003\022k\n\017approval_sta" +
      "tus\030\003 \001(\0162M.google.ads.googleads.v15.enu" +
      "ms.PolicyApprovalStatusEnum.PolicyApprov" +
      "alStatusB\003\340A\003B\374\001\n&com.google.ads.googlea" +
      "ds.v15.resourcesB\nAssetProtoP\001ZKgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v15/resources;resources\242\002\003GAA\252\002\"Goog" +
      "le.Ads.GoogleAds.V15.Resources\312\002\"Google\\" +
      "Ads\\GoogleAds\\V15\\Resources\352\002&Google::Ad" +
      "s::GoogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.AssetTypesProto.getDescriptor(),
          com.google.ads.googleads.v15.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v15.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetSourceProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AssetTypeProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_Asset_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Type", "FinalUrls", "FinalMobileUrls", "TrackingUrlTemplate", "UrlCustomParameters", "FinalUrlSuffix", "Source", "PolicySummary", "FieldTypePolicySummaries", "YoutubeVideoAsset", "MediaBundleAsset", "ImageAsset", "TextAsset", "LeadFormAsset", "BookOnGoogleAsset", "PromotionAsset", "CalloutAsset", "StructuredSnippetAsset", "SitelinkAsset", "PageFeedAsset", "DynamicEducationAsset", "MobileAppAsset", "HotelCalloutAsset", "CallAsset", "PriceAsset", "CallToActionAsset", "DynamicRealEstateAsset", "DynamicCustomAsset", "DynamicHotelsAndRentalsAsset", "DynamicFlightsAsset", "DiscoveryCarouselCardAsset", "DynamicTravelAsset", "DynamicLocalAsset", "DynamicJobsAsset", "LocationAsset", "HotelPropertyAsset", "AssetData", });
    internal_static_google_ads_googleads_v15_resources_AssetFieldTypePolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_resources_AssetFieldTypePolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AssetFieldTypePolicySummary_descriptor,
        new java.lang.String[] { "AssetFieldType", "AssetSource", "PolicySummaryInfo", });
    internal_static_google_ads_googleads_v15_resources_AssetPolicySummary_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_resources_AssetPolicySummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_AssetPolicySummary_descriptor,
        new java.lang.String[] { "PolicyTopicEntries", "ReviewStatus", "ApprovalStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.AssetTypesProto.getDescriptor();
    com.google.ads.googleads.v15.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v15.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetSourceProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AssetTypeProto.getDescriptor();
    com.google.ads.googleads.v15.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
