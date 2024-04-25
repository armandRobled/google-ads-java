// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/travel_asset_suggestion_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public final class TravelAssetSuggestionServiceProto {
  private TravelAssetSuggestionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_HotelAssetSuggestion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_HotelAssetSuggestion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_HotelTextAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_HotelTextAsset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_HotelImageAsset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_HotelImageAsset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/ads/googleads/v16/services/trav" +
      "el_asset_suggestion_service.proto\022!googl" +
      "e.ads.googleads.v16.services\0325google/ads" +
      "/googleads/v16/enums/asset_field_type.pr" +
      "oto\0328google/ads/googleads/v16/enums/call" +
      "_to_action_type.proto\032Bgoogle/ads/google" +
      "ads/v16/enums/hotel_asset_suggestion_sta" +
      "tus.proto\032\034google/api/annotations.proto\032" +
      "\027google/api/client.proto\032\037google/api/fie" +
      "ld_behavior.proto\"g\n\032SuggestTravelAssets" +
      "Request\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022\034\n\017lan" +
      "guage_option\030\002 \001(\tB\003\340A\002\022\021\n\tplace_ids\030\004 \003" +
      "(\t\"w\n\033SuggestTravelAssetsResponse\022X\n\027hot" +
      "el_asset_suggestions\030\001 \003(\01327.google.ads." +
      "googleads.v16.services.HotelAssetSuggest" +
      "ion\"\253\003\n\024HotelAssetSuggestion\022\020\n\010place_id" +
      "\030\001 \001(\t\022\021\n\tfinal_url\030\002 \001(\t\022\022\n\nhotel_name\030" +
      "\003 \001(\t\022]\n\016call_to_action\030\004 \001(\0162E.google.a" +
      "ds.googleads.v16.enums.CallToActionTypeE" +
      "num.CallToActionType\022F\n\013text_assets\030\005 \003(" +
      "\01321.google.ads.googleads.v16.services.Ho" +
      "telTextAsset\022H\n\014image_assets\030\006 \003(\01322.goo" +
      "gle.ads.googleads.v16.services.HotelImag" +
      "eAsset\022i\n\006status\030\007 \001(\0162Y.google.ads.goog" +
      "leads.v16.enums.HotelAssetSuggestionStat" +
      "usEnum.HotelAssetSuggestionStatus\"{\n\016Hot" +
      "elTextAsset\022\014\n\004text\030\001 \001(\t\022[\n\020asset_field" +
      "_type\030\002 \001(\0162A.google.ads.googleads.v16.e" +
      "nums.AssetFieldTypeEnum.AssetFieldType\"{" +
      "\n\017HotelImageAsset\022\013\n\003uri\030\001 \001(\t\022[\n\020asset_" +
      "field_type\030\002 \001(\0162A.google.ads.googleads." +
      "v16.enums.AssetFieldTypeEnum.AssetFieldT" +
      "ype2\331\002\n\034TravelAssetSuggestionService\022\361\001\n" +
      "\023SuggestTravelAssets\022=.google.ads.google" +
      "ads.v16.services.SuggestTravelAssetsRequ" +
      "est\032>.google.ads.googleads.v16.services." +
      "SuggestTravelAssetsResponse\"[\332A\033customer" +
      "_id,language_option\202\323\344\223\0027\"2/v16/customer" +
      "s/{customer_id=*}:suggestTravelAssets:\001*" +
      "\032E\312A\030googleads.googleapis.com\322A\'https://" +
      "www.googleapis.com/auth/adwordsB\215\002\n%com." +
      "google.ads.googleads.v16.servicesB!Trave" +
      "lAssetSuggestionServiceProtoP\001ZIgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v16/services;services\242\002\003GAA\252\002!Google" +
      ".Ads.GoogleAds.V16.Services\312\002!Google\\Ads" +
      "\\GoogleAds\\V16\\Services\352\002%Google::Ads::G" +
      "oogleAds::V16::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.AssetFieldTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.CallToActionTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.HotelAssetSuggestionStatusProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "LanguageOption", "PlaceIds", });
    internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_SuggestTravelAssetsResponse_descriptor,
        new java.lang.String[] { "HotelAssetSuggestions", });
    internal_static_google_ads_googleads_v16_services_HotelAssetSuggestion_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v16_services_HotelAssetSuggestion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_HotelAssetSuggestion_descriptor,
        new java.lang.String[] { "PlaceId", "FinalUrl", "HotelName", "CallToAction", "TextAssets", "ImageAssets", "Status", });
    internal_static_google_ads_googleads_v16_services_HotelTextAsset_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v16_services_HotelTextAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_HotelTextAsset_descriptor,
        new java.lang.String[] { "Text", "AssetFieldType", });
    internal_static_google_ads_googleads_v16_services_HotelImageAsset_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v16_services_HotelImageAsset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_HotelImageAsset_descriptor,
        new java.lang.String[] { "Uri", "AssetFieldType", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.enums.AssetFieldTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.CallToActionTypeProto.getDescriptor();
    com.google.ads.googleads.v16.enums.HotelAssetSuggestionStatusProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
