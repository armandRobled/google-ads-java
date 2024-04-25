// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/services/user_data_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.services;

public final class UserDataServiceProto {
  private UserDataServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_UploadUserDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_UploadUserDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_UserDataOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_UserDataOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_services_UploadUserDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_services_UploadUserDataResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v15/services/user" +
      "_data_service.proto\022!google.ads.googlead" +
      "s.v15.services\0327google/ads/googleads/v15" +
      "/common/offline_user_data.proto\032\034google/" +
      "api/annotations.proto\032\027google/api/client" +
      ".proto\032\037google/api/field_behavior.proto\"" +
      "\371\001\n\025UploadUserDataRequest\022\030\n\013customer_id" +
      "\030\001 \001(\tB\003\340A\002\022M\n\noperations\030\003 \003(\01324.google" +
      ".ads.googleads.v15.services.UserDataOper" +
      "ationB\003\340A\002\022k\n!customer_match_user_list_m" +
      "etadata\030\002 \001(\0132>.google.ads.googleads.v15" +
      ".common.CustomerMatchUserListMetadataH\000B" +
      "\n\n\010metadata\"\232\001\n\021UserDataOperation\022;\n\006cre" +
      "ate\030\001 \001(\0132).google.ads.googleads.v15.com" +
      "mon.UserDataH\000\022;\n\006remove\030\002 \001(\0132).google." +
      "ads.googleads.v15.common.UserDataH\000B\013\n\to" +
      "peration\"\222\001\n\026UploadUserDataResponse\022\035\n\020u" +
      "pload_date_time\030\003 \001(\tH\000\210\001\001\022&\n\031received_o" +
      "perations_count\030\004 \001(\005H\001\210\001\001B\023\n\021_upload_da" +
      "te_timeB\034\n\032_received_operations_count2\232\002" +
      "\n\017UserDataService\022\277\001\n\016UploadUserData\0228.g" +
      "oogle.ads.googleads.v15.services.UploadU" +
      "serDataRequest\0329.google.ads.googleads.v1" +
      "5.services.UploadUserDataResponse\"8\202\323\344\223\002" +
      "2\"-/v15/customers/{customer_id=*}:upload" +
      "UserData:\001*\032E\312A\030googleads.googleapis.com" +
      "\322A\'https://www.googleapis.com/auth/adwor" +
      "dsB\200\002\n%com.google.ads.googleads.v15.serv" +
      "icesB\024UserDataServiceProtoP\001ZIgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v15/services;services\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V15.Services\312\002!Google\\Ads\\G" +
      "oogleAds\\V15\\Services\352\002%Google::Ads::Goo" +
      "gleAds::V15::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.OfflineUserDataProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_services_UploadUserDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_services_UploadUserDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_UploadUserDataRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "CustomerMatchUserListMetadata", "Metadata", });
    internal_static_google_ads_googleads_v15_services_UserDataOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v15_services_UserDataOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_UserDataOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v15_services_UploadUserDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v15_services_UploadUserDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_services_UploadUserDataResponse_descriptor,
        new java.lang.String[] { "UploadDateTime", "ReceivedOperationsCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.OfflineUserDataProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
