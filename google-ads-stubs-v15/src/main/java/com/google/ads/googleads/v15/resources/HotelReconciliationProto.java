// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/hotel_reconciliation.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class HotelReconciliationProto {
  private HotelReconciliationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_HotelReconciliation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_HotelReconciliation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v15/resources/hot" +
      "el_reconciliation.proto\022\"google.ads.goog" +
      "leads.v15.resources\032@google/ads/googlead" +
      "s/v15/enums/hotel_reconciliation_status." +
      "proto\032\037google/api/field_behavior.proto\032\031" +
      "google/api/resource.proto\"\343\004\n\023HotelRecon" +
      "ciliation\022K\n\rresource_name\030\001 \001(\tB4\340A\005\372A." +
      "\n,googleads.googleapis.com/HotelReconcil" +
      "iation\022\035\n\rcommission_id\030\002 \001(\tB\006\340A\002\340A\003\022\025\n" +
      "\010order_id\030\003 \001(\tB\003\340A\003\022;\n\010campaign\030\013 \001(\tB)" +
      "\340A\003\372A#\n!googleads.googleapis.com/Campaig" +
      "n\022\034\n\017hotel_center_id\030\004 \001(\003B\003\340A\003\022\025\n\010hotel" +
      "_id\030\005 \001(\tB\003\340A\003\022\032\n\rcheck_in_date\030\006 \001(\tB\003\340" +
      "A\003\022\033\n\016check_out_date\030\007 \001(\tB\003\340A\003\022\'\n\027recon" +
      "ciled_value_micros\030\010 \001(\003B\006\340A\002\340A\003\022\023\n\006bill" +
      "ed\030\t \001(\010B\003\340A\003\022o\n\006status\030\n \001(\0162W.google.a" +
      "ds.googleads.v15.enums.HotelReconciliati" +
      "onStatusEnum.HotelReconciliationStatusB\006" +
      "\340A\002\340A\003:o\352Al\n,googleads.googleapis.com/Ho" +
      "telReconciliation\022<customers/{customer_i" +
      "d}/hotelReconciliations/{commission_id}B" +
      "\212\002\n&com.google.ads.googleads.v15.resourc" +
      "esB\030HotelReconciliationProtoP\001ZKgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v15/resources;resources\242\002\003GAA\252\002\"Goog" +
      "le.Ads.GoogleAds.V15.Resources\312\002\"Google\\" +
      "Ads\\GoogleAds\\V15\\Resources\352\002&Google::Ad" +
      "s::GoogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.enums.HotelReconciliationStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_HotelReconciliation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_HotelReconciliation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_HotelReconciliation_descriptor,
        new java.lang.String[] { "ResourceName", "CommissionId", "OrderId", "Campaign", "HotelCenterId", "HotelId", "CheckInDate", "CheckOutDate", "ReconciledValueMicros", "Billed", "Status", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.enums.HotelReconciliationStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
