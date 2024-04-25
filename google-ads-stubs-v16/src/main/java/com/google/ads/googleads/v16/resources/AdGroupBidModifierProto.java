// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/ad_group_bid_modifier.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class AdGroupBidModifierProto {
  private AdGroupBidModifierProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_AdGroupBidModifier_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_AdGroupBidModifier_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>google/ads/googleads/v16/resources/ad_" +
      "group_bid_modifier.proto\022\"google.ads.goo" +
      "gleads.v16.resources\032.google/ads/googlea" +
      "ds/v16/common/criteria.proto\0328google/ads" +
      "/googleads/v16/enums/bid_modifier_source" +
      ".proto\032\037google/api/field_behavior.proto\032" +
      "\031google/api/resource.proto\"\213\t\n\022AdGroupBi" +
      "dModifier\022J\n\rresource_name\030\001 \001(\tB3\340A\005\372A-" +
      "\n+googleads.googleapis.com/AdGroupBidMod" +
      "ifier\022?\n\010ad_group\030\r \001(\tB(\340A\005\372A\"\n googlea" +
      "ds.googleapis.com/AdGroupH\001\210\001\001\022\036\n\014criter" +
      "ion_id\030\016 \001(\003B\003\340A\003H\002\210\001\001\022\031\n\014bid_modifier\030\017" +
      " \001(\001H\003\210\001\001\022D\n\rbase_ad_group\030\020 \001(\tB(\340A\003\372A\"" +
      "\n googleads.googleapis.com/AdGroupH\004\210\001\001\022" +
      "i\n\023bid_modifier_source\030\n \001(\0162G.google.ad" +
      "s.googleads.v16.enums.BidModifierSourceE" +
      "num.BidModifierSourceB\003\340A\003\022e\n\031hotel_date" +
      "_selection_type\030\005 \001(\0132;.google.ads.googl" +
      "eads.v16.common.HotelDateSelectionTypeIn" +
      "foB\003\340A\005H\000\022k\n\034hotel_advance_booking_windo" +
      "w\030\006 \001(\0132>.google.ads.googleads.v16.commo" +
      "n.HotelAdvanceBookingWindowInfoB\003\340A\005H\000\022[" +
      "\n\024hotel_length_of_stay\030\007 \001(\01326.google.ad" +
      "s.googleads.v16.common.HotelLengthOfStay" +
      "InfoB\003\340A\005H\000\022W\n\022hotel_check_in_day\030\010 \001(\0132" +
      "4.google.ads.googleads.v16.common.HotelC" +
      "heckInDayInfoB\003\340A\005H\000\022B\n\006device\030\013 \001(\0132+.g" +
      "oogle.ads.googleads.v16.common.DeviceInf" +
      "oB\003\340A\005H\000\022d\n\031hotel_check_in_date_range\030\021 " +
      "\001(\0132:.google.ads.googleads.v16.common.Ho" +
      "telCheckInDateRangeInfoB\003\340A\005H\000:z\352Aw\n+goo" +
      "gleads.googleapis.com/AdGroupBidModifier" +
      "\022Hcustomers/{customer_id}/adGroupBidModi" +
      "fiers/{ad_group_id}~{criterion_id}B\013\n\tcr" +
      "iterionB\013\n\t_ad_groupB\017\n\r_criterion_idB\017\n" +
      "\r_bid_modifierB\020\n\016_base_ad_groupB\211\002\n&com" +
      ".google.ads.googleads.v16.resourcesB\027AdG" +
      "roupBidModifierProtoP\001ZKgoogle.golang.or" +
      "g/genproto/googleapis/ads/googleads/v16/" +
      "resources;resources\242\002\003GAA\252\002\"Google.Ads.G" +
      "oogleAds.V16.Resources\312\002\"Google\\Ads\\Goog" +
      "leAds\\V16\\Resources\352\002&Google::Ads::Googl" +
      "eAds::V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.BidModifierSourceProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_AdGroupBidModifier_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_AdGroupBidModifier_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_AdGroupBidModifier_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "CriterionId", "BidModifier", "BaseAdGroup", "BidModifierSource", "HotelDateSelectionType", "HotelAdvanceBookingWindow", "HotelLengthOfStay", "HotelCheckInDay", "Device", "HotelCheckInDateRange", "Criterion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v16.enums.BidModifierSourceProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
