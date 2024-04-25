// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/smart_campaign_suggest_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public final class SmartCampaignSuggestServiceProto {
  private SmartCampaignSuggestServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_LocationList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_LocationList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_BusinessContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_BusinessContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_KeywordTheme_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_KeywordTheme_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nFgoogle/ads/googleads/v15/services/smar" +
      "t_campaign_suggest_service.proto\022!google" +
      ".ads.googleads.v15.services\0323google/ads/" +
      "googleads/v15/common/ad_type_infos.proto" +
      "\032.google/ads/googleads/v15/common/criter" +
      "ia.proto\032?google/ads/googleads/v15/resou" +
      "rces/keyword_theme_constant.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\"\366\001\n(Suggest" +
      "SmartCampaignBudgetOptionsRequest\022\030\n\013cus" +
      "tomer_id\030\001 \001(\tB\003\340A\002\022=\n\010campaign\030\002 \001(\tB)\340" +
      "A\002\372A#\n!googleads.googleapis.com/Campaign" +
      "H\000\022^\n\017suggestion_info\030\003 \001(\0132>.google.ads" +
      ".googleads.v15.services.SmartCampaignSug" +
      "gestionInfoB\003\340A\002H\000B\021\n\017suggestion_data\"\345\005" +
      "\n\033SmartCampaignSuggestionInfo\022\026\n\tfinal_u" +
      "rl\030\001 \001(\tB\003\340A\001\022\032\n\rlanguage_code\030\003 \001(\tB\003\340A" +
      "\001\022J\n\014ad_schedules\030\006 \003(\0132/.google.ads.goo" +
      "gleads.v15.common.AdScheduleInfoB\003\340A\001\022N\n" +
      "\016keyword_themes\030\007 \003(\01321.google.ads.googl" +
      "eads.v15.common.KeywordThemeInfoB\003\340A\001\022o\n" +
      "\020business_context\030\010 \001(\0132N.google.ads.goo" +
      "gleads.v15.services.SmartCampaignSuggest" +
      "ionInfo.BusinessContextB\003\340A\001H\000\022(\n\031busine" +
      "ss_profile_location\030\t \001(\tB\003\340A\001H\000\022i\n\rloca" +
      "tion_list\030\004 \001(\0132K.google.ads.googleads.v" +
      "15.services.SmartCampaignSuggestionInfo." +
      "LocationListB\003\340A\001H\001\022H\n\tproximity\030\005 \001(\0132." +
      ".google.ads.googleads.v15.common.Proximi" +
      "tyInfoB\003\340A\001H\001\032U\n\014LocationList\022E\n\tlocatio" +
      "ns\030\001 \003(\0132-.google.ads.googleads.v15.comm" +
      "on.LocationInfoB\003\340A\002\032-\n\017BusinessContext\022" +
      "\032\n\rbusiness_name\030\001 \001(\tB\003\340A\001B\022\n\020business_" +
      "settingB\014\n\ngeo_target\"\377\004\n)SuggestSmartCa" +
      "mpaignBudgetOptionsResponse\022p\n\003low\030\001 \001(\013" +
      "2Y.google.ads.googleads.v15.services.Sug" +
      "gestSmartCampaignBudgetOptionsResponse.B" +
      "udgetOptionB\003\340A\001H\000\210\001\001\022x\n\013recommended\030\002 \001" +
      "(\0132Y.google.ads.googleads.v15.services.S" +
      "uggestSmartCampaignBudgetOptionsResponse" +
      ".BudgetOptionB\003\340A\001H\001\210\001\001\022q\n\004high\030\003 \001(\0132Y." +
      "google.ads.googleads.v15.services.Sugges" +
      "tSmartCampaignBudgetOptionsResponse.Budg" +
      "etOptionB\003\340A\001H\002\210\001\001\032=\n\007Metrics\022\030\n\020min_dai" +
      "ly_clicks\030\001 \001(\003\022\030\n\020max_daily_clicks\030\002 \001(" +
      "\003\032\222\001\n\014BudgetOption\022\033\n\023daily_amount_micro" +
      "s\030\001 \001(\003\022e\n\007metrics\030\002 \001(\0132T.google.ads.go" +
      "ogleads.v15.services.SuggestSmartCampaig" +
      "nBudgetOptionsResponse.MetricsB\006\n\004_lowB\016" +
      "\n\014_recommendedB\007\n\005_high\"\227\001\n\035SuggestSmart" +
      "CampaignAdRequest\022\030\n\013customer_id\030\001 \001(\tB\003" +
      "\340A\002\022\\\n\017suggestion_info\030\002 \001(\0132>.google.ad" +
      "s.googleads.v15.services.SmartCampaignSu" +
      "ggestionInfoB\003\340A\002\"l\n\036SuggestSmartCampaig" +
      "nAdResponse\022J\n\007ad_info\030\001 \001(\01324.google.ad" +
      "s.googleads.v15.common.SmartCampaignAdIn" +
      "foB\003\340A\001\"\225\001\n\033SuggestKeywordThemesRequest\022" +
      "\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022\\\n\017suggestion_" +
      "info\030\002 \001(\0132>.google.ads.googleads.v15.se" +
      "rvices.SmartCampaignSuggestionInfoB\003\340A\002\"" +
      "\245\002\n\034SuggestKeywordThemesResponse\022d\n\016keyw" +
      "ord_themes\030\002 \003(\0132L.google.ads.googleads." +
      "v15.services.SuggestKeywordThemesRespons" +
      "e.KeywordTheme\032\236\001\n\014KeywordTheme\022Z\n\026keywo" +
      "rd_theme_constant\030\001 \001(\01328.google.ads.goo" +
      "gleads.v15.resources.KeywordThemeConstan" +
      "tH\000\022!\n\027free_form_keyword_theme\030\002 \001(\tH\000B\017" +
      "\n\rkeyword_theme2\256\006\n\033SmartCampaignSuggest" +
      "Service\022\213\002\n!SuggestSmartCampaignBudgetOp" +
      "tions\022K.google.ads.googleads.v15.service" +
      "s.SuggestSmartCampaignBudgetOptionsReque" +
      "st\032L.google.ads.googleads.v15.services.S" +
      "uggestSmartCampaignBudgetOptionsResponse" +
      "\"K\202\323\344\223\002E\"@/v15/customers/{customer_id=*}" +
      ":suggestSmartCampaignBudgetOptions:\001*\022\337\001" +
      "\n\026SuggestSmartCampaignAd\022@.google.ads.go" +
      "ogleads.v15.services.SuggestSmartCampaig" +
      "nAdRequest\032A.google.ads.googleads.v15.se" +
      "rvices.SuggestSmartCampaignAdResponse\"@\202" +
      "\323\344\223\002:\"5/v15/customers/{customer_id=*}:su" +
      "ggestSmartCampaignAd:\001*\022\327\001\n\024SuggestKeywo" +
      "rdThemes\022>.google.ads.googleads.v15.serv" +
      "ices.SuggestKeywordThemesRequest\032?.googl" +
      "e.ads.googleads.v15.services.SuggestKeyw" +
      "ordThemesResponse\">\202\323\344\223\0028\"3/v15/customer" +
      "s/{customer_id=*}:suggestKeywordThemes:\001" +
      "*\032E\312A\030googleads.googleapis.com\322A\'https:/" +
      "/www.googleapis.com/auth/adwordsB\214\002\n%com" +
      ".google.ads.googleads.v15.servicesB Smar" +
      "tCampaignSuggestServiceProtoP\001ZIgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v15/services;services\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V15.Services\312\002!Google\\Ads" +
      "\\GoogleAds\\V15\\Services\352\002%Google::Ads::G" +
      "oogleAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.AdTypeInfosProto.getDescriptor(),
          com.google.ads.googleads.v15.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v15.resources.KeywordThemeConstantProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Campaign", "SuggestionInfo", "SuggestionData", });
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_descriptor,
        new java.lang.String[] { "FinalUrl", "LanguageCode", "AdSchedules", "KeywordThemes", "BusinessContext", "BusinessProfileLocation", "LocationList", "Proximity", "BusinessSetting", "GeoTarget", });
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_LocationList_descriptor =
      internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_LocationList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_LocationList_descriptor,
        new java.lang.String[] { "Locations", });
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_BusinessContext_descriptor =
      internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_BusinessContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SmartCampaignSuggestionInfo_BusinessContext_descriptor,
        new java.lang.String[] { "BusinessName", });
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor,
        new java.lang.String[] { "Low", "Recommended", "High", });
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_descriptor =
      internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_Metrics_descriptor,
        new java.lang.String[] { "MinDailyClicks", "MaxDailyClicks", });
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_descriptor =
      internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignBudgetOptionsResponse_BudgetOption_descriptor,
        new java.lang.String[] { "DailyAmountMicros", "Metrics", });
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdRequest_descriptor,
        new java.lang.String[] { "CustomerId", "SuggestionInfo", });
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestSmartCampaignAdResponse_descriptor,
        new java.lang.String[] { "AdInfo", });
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesRequest_descriptor,
        new java.lang.String[] { "CustomerId", "SuggestionInfo", });
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_descriptor,
        new java.lang.String[] { "KeywordThemes", });
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_KeywordTheme_descriptor =
      internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_KeywordTheme_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_SuggestKeywordThemesResponse_KeywordTheme_descriptor,
        new java.lang.String[] { "KeywordThemeConstant", "FreeFormKeywordTheme", "KeywordTheme", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.AdTypeInfosProto.getDescriptor();
    com.google.ads.googleads.v15.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v15.resources.KeywordThemeConstantProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
