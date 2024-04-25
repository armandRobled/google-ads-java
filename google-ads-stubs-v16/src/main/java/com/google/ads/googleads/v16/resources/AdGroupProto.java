// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/ad_group.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class AdGroupProto {
  private AdGroupProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_AdGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_AdGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_AdGroup_AudienceSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_AdGroup_AudienceSetting_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v16/resources/ad_" +
      "group.proto\022\"google.ads.googleads.v16.re" +
      "sources\0326google/ads/googleads/v16/common" +
      "/custom_parameter.proto\0327google/ads/goog" +
      "leads/v16/common/targeting_setting.proto" +
      "\032>google/ads/googleads/v16/enums/ad_grou" +
      "p_ad_rotation_mode.proto\032<google/ads/goo" +
      "gleads/v16/enums/ad_group_primary_status" +
      ".proto\032Cgoogle/ads/googleads/v16/enums/a" +
      "d_group_primary_status_reason.proto\0324goo" +
      "gle/ads/googleads/v16/enums/ad_group_sta" +
      "tus.proto\0322google/ads/googleads/v16/enum" +
      "s/ad_group_type.proto\0325google/ads/google" +
      "ads/v16/enums/asset_field_type.proto\0323go" +
      "ogle/ads/googleads/v16/enums/asset_set_t" +
      "ype.proto\0323google/ads/googleads/v16/enum" +
      "s/bidding_source.proto\0328google/ads/googl" +
      "eads/v16/enums/targeting_dimension.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\"\337\023\n\007AdGroup\022?\n\rreso" +
      "urce_name\030\001 \001(\tB(\340A\005\372A\"\n googleads.googl" +
      "eapis.com/AdGroup\022\024\n\002id\030\" \001(\003B\003\340A\003H\000\210\001\001\022" +
      "\021\n\004name\030# \001(\tH\001\210\001\001\022O\n\006status\030\005 \001(\0162?.goo" +
      "gle.ads.googleads.v16.enums.AdGroupStatu" +
      "sEnum.AdGroupStatus\022N\n\004type\030\014 \001(\0162;.goog" +
      "le.ads.googleads.v16.enums.AdGroupTypeEn" +
      "um.AdGroupTypeB\003\340A\005\022i\n\020ad_rotation_mode\030" +
      "\026 \001(\0162O.google.ads.googleads.v16.enums.A" +
      "dGroupAdRotationModeEnum.AdGroupAdRotati" +
      "onMode\022D\n\rbase_ad_group\030$ \001(\tB(\340A\003\372A\"\n g" +
      "oogleads.googleapis.com/AdGroupH\002\210\001\001\022\"\n\025" +
      "tracking_url_template\030% \001(\tH\003\210\001\001\022O\n\025url_" +
      "custom_parameters\030\006 \003(\01320.google.ads.goo" +
      "gleads.v16.common.CustomParameter\022@\n\010cam" +
      "paign\030& \001(\tB)\340A\005\372A#\n!googleads.googleapi" +
      "s.com/CampaignH\004\210\001\001\022\033\n\016cpc_bid_micros\030\' " +
      "\001(\003H\005\210\001\001\022*\n\030effective_cpc_bid_micros\0309 \001" +
      "(\003B\003\340A\003H\006\210\001\001\022\033\n\016cpm_bid_micros\030( \001(\003H\007\210\001" +
      "\001\022\036\n\021target_cpa_micros\030) \001(\003H\010\210\001\001\022\033\n\016cpv" +
      "_bid_micros\030* \001(\003H\t\210\001\001\022\036\n\021target_cpm_mic" +
      "ros\030+ \001(\003H\n\210\001\001\022\030\n\013target_roas\030, \001(\001H\013\210\001\001" +
      "\022#\n\026percent_cpc_bid_micros\030- \001(\003H\014\210\001\001\022#\n" +
      "\033optimized_targeting_enabled\030; \001(\010\022o\n\034di" +
      "splay_custom_bid_dimension\030\027 \001(\0162I.googl" +
      "e.ads.googleads.v16.enums.TargetingDimen" +
      "sionEnum.TargetingDimension\022\035\n\020final_url" +
      "_suffix\030. \001(\tH\r\210\001\001\022L\n\021targeting_setting\030" +
      "\031 \001(\01321.google.ads.googleads.v16.common." +
      "TargetingSetting\022Z\n\020audience_setting\0308 \001" +
      "(\0132;.google.ads.googleads.v16.resources." +
      "AdGroup.AudienceSettingB\003\340A\005\022-\n\033effectiv" +
      "e_target_cpa_micros\030/ \001(\003B\003\340A\003H\016\210\001\001\022i\n\033e" +
      "ffective_target_cpa_source\030\035 \001(\0162?.googl" +
      "e.ads.googleads.v16.enums.BiddingSourceE" +
      "num.BiddingSourceB\003\340A\003\022\'\n\025effective_targ" +
      "et_roas\0300 \001(\001B\003\340A\003H\017\210\001\001\022j\n\034effective_tar" +
      "get_roas_source\030  \001(\0162?.google.ads.googl" +
      "eads.v16.enums.BiddingSourceEnum.Bidding" +
      "SourceB\003\340A\003\022=\n\006labels\0301 \003(\tB-\340A\003\372A\'\n%goo" +
      "gleads.googleapis.com/AdGroupLabel\022l\n!ex" +
      "cluded_parent_asset_field_types\0306 \003(\0162A." +
      "google.ads.googleads.v16.enums.AssetFiel" +
      "dTypeEnum.AssetFieldType\022f\n\037excluded_par" +
      "ent_asset_set_types\030: \003(\0162=.google.ads.g" +
      "oogleads.v16.enums.AssetSetTypeEnum.Asse" +
      "tSetType\022j\n\016primary_status\030> \001(\0162M.googl" +
      "e.ads.googleads.v16.enums.AdGroupPrimary" +
      "StatusEnum.AdGroupPrimaryStatusB\003\340A\003\022~\n\026" +
      "primary_status_reasons\030? \003(\0162Y.google.ad" +
      "s.googleads.v16.enums.AdGroupPrimaryStat" +
      "usReasonEnum.AdGroupPrimaryStatusReasonB" +
      "\003\340A\003\0324\n\017AudienceSetting\022!\n\024use_audience_" +
      "grouped\030\001 \001(\010B\003\340A\005:U\352AR\n googleads.googl" +
      "eapis.com/AdGroup\022.customers/{customer_i" +
      "d}/adGroups/{ad_group_id}B\005\n\003_idB\007\n\005_nam" +
      "eB\020\n\016_base_ad_groupB\030\n\026_tracking_url_tem" +
      "plateB\013\n\t_campaignB\021\n\017_cpc_bid_microsB\033\n" +
      "\031_effective_cpc_bid_microsB\021\n\017_cpm_bid_m" +
      "icrosB\024\n\022_target_cpa_microsB\021\n\017_cpv_bid_" +
      "microsB\024\n\022_target_cpm_microsB\016\n\014_target_" +
      "roasB\031\n\027_percent_cpc_bid_microsB\023\n\021_fina" +
      "l_url_suffixB\036\n\034_effective_target_cpa_mi" +
      "crosB\030\n\026_effective_target_roasB\376\001\n&com.g" +
      "oogle.ads.googleads.v16.resourcesB\014AdGro" +
      "upProtoP\001ZKgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v16/resources;res" +
      "ources\242\002\003GAA\252\002\"Google.Ads.GoogleAds.V16." +
      "Resources\312\002\"Google\\Ads\\GoogleAds\\V16\\Res" +
      "ources\352\002&Google::Ads::GoogleAds::V16::Re" +
      "sourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v16.common.TargetingSettingProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdGroupAdRotationModeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdGroupPrimaryStatusProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdGroupPrimaryStatusReasonProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdGroupStatusProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AdGroupTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.AssetSetTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.BiddingSourceProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.TargetingDimensionProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_AdGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_AdGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_AdGroup_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "AdRotationMode", "BaseAdGroup", "TrackingUrlTemplate", "UrlCustomParameters", "Campaign", "CpcBidMicros", "EffectiveCpcBidMicros", "CpmBidMicros", "TargetCpaMicros", "CpvBidMicros", "TargetCpmMicros", "TargetRoas", "PercentCpcBidMicros", "OptimizedTargetingEnabled", "DisplayCustomBidDimension", "FinalUrlSuffix", "TargetingSetting", "AudienceSetting", "EffectiveTargetCpaMicros", "EffectiveTargetCpaSource", "EffectiveTargetRoas", "EffectiveTargetRoasSource", "Labels", "ExcludedParentAssetFieldTypes", "ExcludedParentAssetSetTypes", "PrimaryStatus", "PrimaryStatusReasons", });
    internal_static_google_ads_googleads_v16_resources_AdGroup_AudienceSetting_descriptor =
      internal_static_google_ads_googleads_v16_resources_AdGroup_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_AdGroup_AudienceSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_AdGroup_AudienceSetting_descriptor,
        new java.lang.String[] { "UseAudienceGrouped", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v16.common.TargetingSettingProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdGroupAdRotationModeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdGroupPrimaryStatusProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdGroupPrimaryStatusReasonProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdGroupStatusProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AdGroupTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.AssetSetTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.BiddingSourceProto.getDescriptor();
    com.google.ads.googleads.v16.enums.TargetingDimensionProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
