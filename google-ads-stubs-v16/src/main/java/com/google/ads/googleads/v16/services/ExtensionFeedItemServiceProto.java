// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/services/extension_feed_item_service.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.services;

public final class ExtensionFeedItemServiceProto {
  private ExtensionFeedItemServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_ExtensionFeedItemOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_ExtensionFeedItemOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nCgoogle/ads/googleads/v16/services/exte" +
      "nsion_feed_item_service.proto\022!google.ad" +
      "s.googleads.v16.services\032:google/ads/goo" +
      "gleads/v16/enums/response_content_type.p" +
      "roto\032<google/ads/googleads/v16/resources" +
      "/extension_feed_item.proto\032\034google/api/a" +
      "nnotations.proto\032\027google/api/client.prot" +
      "o\032\037google/api/field_behavior.proto\032\031goog" +
      "le/api/resource.proto\032 google/protobuf/f" +
      "ield_mask.proto\032\027google/rpc/status.proto" +
      "\"\257\002\n\037MutateExtensionFeedItemsRequest\022\030\n\013" +
      "customer_id\030\001 \001(\tB\003\340A\002\022V\n\noperations\030\002 \003" +
      "(\0132=.google.ads.googleads.v16.services.E" +
      "xtensionFeedItemOperationB\003\340A\002\022\027\n\017partia" +
      "l_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022j" +
      "\n\025response_content_type\030\005 \001(\0162K.google.a" +
      "ds.googleads.v16.enums.ResponseContentTy" +
      "peEnum.ResponseContentType\"\257\002\n\032Extension" +
      "FeedItemOperation\022/\n\013update_mask\030\004 \001(\0132\032" +
      ".google.protobuf.FieldMask\022G\n\006create\030\001 \001" +
      "(\01325.google.ads.googleads.v16.resources." +
      "ExtensionFeedItemH\000\022G\n\006update\030\002 \001(\01325.go" +
      "ogle.ads.googleads.v16.resources.Extensi" +
      "onFeedItemH\000\022A\n\006remove\030\003 \001(\tB/\372A,\n*googl" +
      "eads.googleapis.com/ExtensionFeedItemH\000B" +
      "\013\n\toperation\"\250\001\n MutateExtensionFeedItem" +
      "sResponse\0221\n\025partial_failure_error\030\003 \001(\013" +
      "2\022.google.rpc.Status\022Q\n\007results\030\002 \003(\0132@." +
      "google.ads.googleads.v16.services.Mutate" +
      "ExtensionFeedItemResult\"\273\001\n\035MutateExtens" +
      "ionFeedItemResult\022F\n\rresource_name\030\001 \001(\t" +
      "B/\372A,\n*googleads.googleapis.com/Extensio" +
      "nFeedItem\022R\n\023extension_feed_item\030\002 \001(\01325" +
      ".google.ads.googleads.v16.resources.Exte" +
      "nsionFeedItem2\345\002\n\030ExtensionFeedItemServi" +
      "ce\022\201\002\n\030MutateExtensionFeedItems\022B.google" +
      ".ads.googleads.v16.services.MutateExtens" +
      "ionFeedItemsRequest\032C.google.ads.googlea" +
      "ds.v16.services.MutateExtensionFeedItems" +
      "Response\"\\\332A\026customer_id,operations\202\323\344\223\002" +
      "=\"8/v16/customers/{customer_id=*}/extens" +
      "ionFeedItems:mutate:\001*\032E\312A\030googleads.goo" +
      "gleapis.com\322A\'https://www.googleapis.com" +
      "/auth/adwordsB\211\002\n%com.google.ads.googlea" +
      "ds.v16.servicesB\035ExtensionFeedItemServic" +
      "eProtoP\001ZIgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v16/services;servi" +
      "ces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V16.Ser" +
      "vices\312\002!Google\\Ads\\GoogleAds\\V16\\Service" +
      "s\352\002%Google::Ads::GoogleAds::V16::Service" +
      "sb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v16.resources.ExtensionFeedItemProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v16_services_ExtensionFeedItemOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v16_services_ExtensionFeedItemOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_ExtensionFeedItemOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemResult_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_services_MutateExtensionFeedItemResult_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionFeedItem", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v16.resources.ExtensionFeedItemProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
