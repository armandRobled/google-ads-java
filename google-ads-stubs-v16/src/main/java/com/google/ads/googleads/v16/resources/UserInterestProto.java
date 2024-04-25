// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/user_interest.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class UserInterestProto {
  private UserInterestProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_UserInterest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_UserInterest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v16/resources/use" +
      "r_interest.proto\022\"google.ads.googleads.v" +
      "16.resources\032Egoogle/ads/googleads/v16/c" +
      "ommon/criterion_category_availability.pr" +
      "oto\032@google/ads/googleads/v16/enums/user" +
      "_interest_taxonomy_type.proto\032\037google/ap" +
      "i/field_behavior.proto\032\031google/api/resou" +
      "rce.proto\"\206\005\n\014UserInterest\022D\n\rresource_n" +
      "ame\030\001 \001(\tB-\340A\003\372A\'\n%googleads.googleapis." +
      "com/UserInterest\022q\n\rtaxonomy_type\030\002 \001(\0162" +
      "U.google.ads.googleads.v16.enums.UserInt" +
      "erestTaxonomyTypeEnum.UserInterestTaxono" +
      "myTypeB\003\340A\003\022\"\n\020user_interest_id\030\010 \001(\003B\003\340" +
      "A\003H\000\210\001\001\022\026\n\004name\030\t \001(\tB\003\340A\003H\001\210\001\001\022P\n\024user_" +
      "interest_parent\030\n \001(\tB-\340A\003\372A\'\n%googleads" +
      ".googleapis.com/UserInterestH\002\210\001\001\022!\n\017lau" +
      "nched_to_all\030\013 \001(\010B\003\340A\003H\003\210\001\001\022[\n\016availabi" +
      "lities\030\007 \003(\0132>.google.ads.googleads.v16." +
      "common.CriterionCategoryAvailabilityB\003\340A" +
      "\003:d\352Aa\n%googleads.googleapis.com/UserInt" +
      "erest\0228customers/{customer_id}/userInter" +
      "ests/{user_interest_id}B\023\n\021_user_interes" +
      "t_idB\007\n\005_nameB\027\n\025_user_interest_parentB\022" +
      "\n\020_launched_to_allB\203\002\n&com.google.ads.go" +
      "ogleads.v16.resourcesB\021UserInterestProto" +
      "P\001ZKgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v16/resources;resources\242" +
      "\002\003GAA\252\002\"Google.Ads.GoogleAds.V16.Resourc" +
      "es\312\002\"Google\\Ads\\GoogleAds\\V16\\Resources\352" +
      "\002&Google::Ads::GoogleAds::V16::Resources" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.common.CriterionCategoryAvailabilityProto.getDescriptor(),
          com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_UserInterest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_UserInterest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_UserInterest_descriptor,
        new java.lang.String[] { "ResourceName", "TaxonomyType", "UserInterestId", "Name", "UserInterestParent", "LaunchedToAll", "Availabilities", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.common.CriterionCategoryAvailabilityProto.getDescriptor();
    com.google.ads.googleads.v16.enums.UserInterestTaxonomyTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
