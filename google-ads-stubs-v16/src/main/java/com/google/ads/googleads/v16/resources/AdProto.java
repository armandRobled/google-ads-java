// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/ad.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class AdProto {
  private AdProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_Ad_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_Ad_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+google/ads/googleads/v16/resources/ad." +
      "proto\022\"google.ads.googleads.v16.resource" +
      "s\0323google/ads/googleads/v16/common/ad_ty" +
      "pe_infos.proto\0326google/ads/googleads/v16" +
      "/common/custom_parameter.proto\0323google/a" +
      "ds/googleads/v16/common/final_app_url.pr" +
      "oto\0324google/ads/googleads/v16/common/url" +
      "_collection.proto\032,google/ads/googleads/" +
      "v16/enums/ad_type.proto\032+google/ads/goog" +
      "leads/v16/enums/device.proto\032Agoogle/ads" +
      "/googleads/v16/enums/system_managed_enti" +
      "ty_source.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\"\345\030\n\002" +
      "Ad\022:\n\rresource_name\030% \001(\tB#\340A\005\372A\035\n\033googl" +
      "eads.googleapis.com/Ad\022\024\n\002id\030( \001(\003B\003\340A\003H" +
      "\001\210\001\001\022\022\n\nfinal_urls\030) \003(\t\022D\n\016final_app_ur" +
      "ls\030# \003(\0132,.google.ads.googleads.v16.comm" +
      "on.FinalAppUrl\022\031\n\021final_mobile_urls\030* \003(" +
      "\t\022\"\n\025tracking_url_template\030+ \001(\tH\002\210\001\001\022\035\n" +
      "\020final_url_suffix\030, \001(\tH\003\210\001\001\022O\n\025url_cust" +
      "om_parameters\030\n \003(\01320.google.ads.googlea" +
      "ds.v16.common.CustomParameter\022\030\n\013display" +
      "_url\030- \001(\tH\004\210\001\001\022D\n\004type\030\005 \001(\01621.google.a" +
      "ds.googleads.v16.enums.AdTypeEnum.AdType" +
      "B\003\340A\003\022%\n\023added_by_google_ads\030. \001(\010B\003\340A\003H" +
      "\005\210\001\001\022L\n\021device_preference\030\024 \001(\01621.google" +
      ".ads.googleads.v16.enums.DeviceEnum.Devi" +
      "ce\022G\n\017url_collections\030\032 \003(\0132..google.ads" +
      ".googleads.v16.common.UrlCollection\022\026\n\004n" +
      "ame\030/ \001(\tB\003\340A\005H\006\210\001\001\022\210\001\n\036system_managed_r" +
      "esource_source\030\033 \001(\0162[.google.ads.google" +
      "ads.v16.enums.SystemManagedResourceSourc" +
      "eEnum.SystemManagedResourceSourceB\003\340A\003\022C" +
      "\n\007text_ad\030\006 \001(\0132+.google.ads.googleads.v" +
      "16.common.TextAdInfoB\003\340A\005H\000\022O\n\020expanded_" +
      "text_ad\030\007 \001(\01323.google.ads.googleads.v16" +
      ".common.ExpandedTextAdInfoH\000\022>\n\007call_ad\030" +
      "1 \001(\0132+.google.ads.googleads.v16.common." +
      "CallAdInfoH\000\022g\n\032expanded_dynamic_search_" +
      "ad\030\016 \001(\0132<.google.ads.googleads.v16.comm" +
      "on.ExpandedDynamicSearchAdInfoB\003\340A\005H\000\022@\n" +
      "\010hotel_ad\030\017 \001(\0132,.google.ads.googleads.v" +
      "16.common.HotelAdInfoH\000\022Q\n\021shopping_smar" +
      "t_ad\030\021 \001(\01324.google.ads.googleads.v16.co" +
      "mmon.ShoppingSmartAdInfoH\000\022U\n\023shopping_p" +
      "roduct_ad\030\022 \001(\01326.google.ads.googleads.v" +
      "16.common.ShoppingProductAdInfoH\000\022E\n\010ima" +
      "ge_ad\030\026 \001(\0132,.google.ads.googleads.v16.c" +
      "ommon.ImageAdInfoB\003\340A\005H\000\022@\n\010video_ad\030\030 \001" +
      "(\0132,.google.ads.googleads.v16.common.Vid" +
      "eoAdInfoH\000\022U\n\023video_responsive_ad\030\' \001(\0132" +
      "6.google.ads.googleads.v16.common.VideoR" +
      "esponsiveAdInfoH\000\022W\n\024responsive_search_a" +
      "d\030\031 \001(\01327.google.ads.googleads.v16.commo" +
      "n.ResponsiveSearchAdInfoH\000\022f\n\034legacy_res" +
      "ponsive_display_ad\030\034 \001(\0132>.google.ads.go" +
      "ogleads.v16.common.LegacyResponsiveDispl" +
      "ayAdInfoH\000\022<\n\006app_ad\030\035 \001(\0132*.google.ads." +
      "googleads.v16.common.AppAdInfoH\000\022]\n\025lega" +
      "cy_app_install_ad\030\036 \001(\01327.google.ads.goo" +
      "gleads.v16.common.LegacyAppInstallAdInfo" +
      "B\003\340A\005H\000\022Y\n\025responsive_display_ad\030\037 \001(\01328" +
      ".google.ads.googleads.v16.common.Respons" +
      "iveDisplayAdInfoH\000\022@\n\010local_ad\030  \001(\0132,.g" +
      "oogle.ads.googleads.v16.common.LocalAdIn" +
      "foH\000\022Q\n\021display_upload_ad\030! \001(\01324.google" +
      ".ads.googleads.v16.common.DisplayUploadA" +
      "dInfoH\000\022Q\n\021app_engagement_ad\030\" \001(\01324.goo" +
      "gle.ads.googleads.v16.common.AppEngageme" +
      "ntAdInfoH\000\022j\n\036shopping_comparison_listin" +
      "g_ad\030$ \001(\0132@.google.ads.googleads.v16.co" +
      "mmon.ShoppingComparisonListingAdInfoH\000\022Q" +
      "\n\021smart_campaign_ad\0300 \001(\01324.google.ads.g" +
      "oogleads.v16.common.SmartCampaignAdInfoH" +
      "\000\022\\\n\027app_pre_registration_ad\0302 \001(\01329.goo" +
      "gle.ads.googleads.v16.common.AppPreRegis" +
      "trationAdInfoH\000\022^\n\030discovery_multi_asset" +
      "_ad\0303 \001(\0132:.google.ads.googleads.v16.com" +
      "mon.DiscoveryMultiAssetAdInfoH\000\022Y\n\025disco" +
      "very_carousel_ad\0304 \001(\01328.google.ads.goog" +
      "leads.v16.common.DiscoveryCarouselAdInfo" +
      "H\000\022h\n\035discovery_video_responsive_ad\030< \001(" +
      "\0132?.google.ads.googleads.v16.common.Disc" +
      "overyVideoResponsiveAdInfoH\000\022X\n\025demand_g" +
      "en_product_ad\030= \001(\01327.google.ads.googlea" +
      "ds.v16.common.DemandGenProductAdInfoH\000\022B" +
      "\n\ttravel_ad\0306 \001(\0132-.google.ads.googleads" +
      ".v16.common.TravelAdInfoH\000:E\352AB\n\033googlea" +
      "ds.googleapis.com/Ad\022#customers/{custome" +
      "r_id}/ads/{ad_id}B\t\n\007ad_dataB\005\n\003_idB\030\n\026_" +
      "tracking_url_templateB\023\n\021_final_url_suff" +
      "ixB\016\n\014_display_urlB\026\n\024_added_by_google_a" +
      "dsB\007\n\005_nameB\371\001\n&com.google.ads.googleads" +
      ".v16.resourcesB\007AdProtoP\001ZKgoogle.golang" +
      ".org/genproto/googleapis/ads/googleads/v" +
      "16/resources;resources\242\002\003GAA\252\002\"Google.Ad" +
      "s.GoogleAds.V16.Resources\312\002\"Google\\Ads\\G" +
      "oogleAds\\V16\\Resources\352\002&Google::Ads::Go" +
      "ogleAds::V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.AdTypeInfosProto.getDescriptor(),
          com.google.ads.googleads.v16.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v16.common.FinalAppUrlProto.getDescriptor(),
          com.google.ads.googleads.v16.common.UrlCollectionProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.DeviceProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.SystemManagedEntitySourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_Ad_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_Ad_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_Ad_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "FinalUrls", "FinalAppUrls", "FinalMobileUrls", "TrackingUrlTemplate", "FinalUrlSuffix", "UrlCustomParameters", "DisplayUrl", "Type", "AddedByGoogleAds", "DevicePreference", "UrlCollections", "Name", "SystemManagedResourceSource", "TextAd", "ExpandedTextAd", "CallAd", "ExpandedDynamicSearchAd", "HotelAd", "ShoppingSmartAd", "ShoppingProductAd", "ImageAd", "VideoAd", "VideoResponsiveAd", "ResponsiveSearchAd", "LegacyResponsiveDisplayAd", "AppAd", "LegacyAppInstallAd", "ResponsiveDisplayAd", "LocalAd", "DisplayUploadAd", "AppEngagementAd", "ShoppingComparisonListingAd", "SmartCampaignAd", "AppPreRegistrationAd", "DiscoveryMultiAssetAd", "DiscoveryCarouselAd", "DiscoveryVideoResponsiveAd", "DemandGenProductAd", "TravelAd", "AdData", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.AdTypeInfosProto.getDescriptor();
    com.google.ads.googleads.v16.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v16.common.FinalAppUrlProto.getDescriptor();
    com.google.ads.googleads.v16.common.UrlCollectionProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.DeviceProto.getDescriptor();
    com.google.ads.googleads.v16.enums.SystemManagedEntitySourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
