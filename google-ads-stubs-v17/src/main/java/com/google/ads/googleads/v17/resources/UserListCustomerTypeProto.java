// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v17/resources/user_list_customer_type.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v17.resources;

public final class UserListCustomerTypeProto {
  private UserListCustomerTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v17_resources_UserListCustomerType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v17_resources_UserListCustomerType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v17/resources/use" +
      "r_list_customer_type.proto\022\"google.ads.g" +
      "oogleads.v17.resources\032Egoogle/ads/googl" +
      "eads/v17/enums/user_list_customer_type_c" +
      "ategory.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\"\253\003\n\024Us" +
      "erListCustomerType\022L\n\rresource_name\030\001 \001(" +
      "\tB5\340A\005\372A/\n-googleads.googleapis.com/User" +
      "ListCustomerType\022<\n\tuser_list\030\002 \001(\tB)\340A\005" +
      "\372A#\n!googleads.googleapis.com/UserList\022\202" +
      "\001\n\026customer_type_category\030\003 \001(\0162].google" +
      ".ads.googleads.v17.enums.UserListCustome" +
      "rTypeCategoryEnum.UserListCustomerTypeCa" +
      "tegoryB\003\340A\005:\201\001\352A~\n-googleads.googleapis." +
      "com/UserListCustomerType\022Mcustomers/{cus" +
      "tomer_id}/userListCustomerTypes/{user_li" +
      "st_id}~{semantic_label}B\213\002\n&com.google.a" +
      "ds.googleads.v17.resourcesB\031UserListCust" +
      "omerTypeProtoP\001ZKgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v17/resourc" +
      "es;resources\242\002\003GAA\252\002\"Google.Ads.GoogleAd" +
      "s.V17.Resources\312\002\"Google\\Ads\\GoogleAds\\V" +
      "17\\Resources\352\002&Google::Ads::GoogleAds::V" +
      "17::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v17.enums.UserListCustomerTypeCategoryProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v17_resources_UserListCustomerType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v17_resources_UserListCustomerType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v17_resources_UserListCustomerType_descriptor,
        new java.lang.String[] { "ResourceName", "UserList", "CustomerTypeCategory", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v17.enums.UserListCustomerTypeCategoryProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
