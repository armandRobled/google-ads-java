// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/geo_target_constant.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public final class GeoTargetConstantProto {
  private GeoTargetConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v16_resources_GeoTargetConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v16_resources_GeoTargetConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v16/resources/geo" +
      "_target_constant.proto\022\"google.ads.googl" +
      "eads.v16.resources\032?google/ads/googleads" +
      "/v16/enums/geo_target_constant_status.pr" +
      "oto\032\037google/api/field_behavior.proto\032\031go" +
      "ogle/api/resource.proto\"\331\004\n\021GeoTargetCon" +
      "stant\022I\n\rresource_name\030\001 \001(\tB2\340A\003\372A,\n*go" +
      "ogleads.googleapis.com/GeoTargetConstant" +
      "\022\024\n\002id\030\n \001(\003B\003\340A\003H\000\210\001\001\022\026\n\004name\030\013 \001(\tB\003\340A" +
      "\003H\001\210\001\001\022\036\n\014country_code\030\014 \001(\tB\003\340A\003H\002\210\001\001\022\035" +
      "\n\013target_type\030\r \001(\tB\003\340A\003H\003\210\001\001\022h\n\006status\030" +
      "\007 \001(\0162S.google.ads.googleads.v16.enums.G" +
      "eoTargetConstantStatusEnum.GeoTargetCons" +
      "tantStatusB\003\340A\003\022 \n\016canonical_name\030\016 \001(\tB" +
      "\003\340A\003H\004\210\001\001\022R\n\021parent_geo_target\030\t \001(\tB2\340A" +
      "\003\372A,\n*googleads.googleapis.com/GeoTarget" +
      "ConstantH\005\210\001\001:R\352AO\n*googleads.googleapis" +
      ".com/GeoTargetConstant\022!geoTargetConstan" +
      "ts/{criterion_id}B\005\n\003_idB\007\n\005_nameB\017\n\r_co" +
      "untry_codeB\016\n\014_target_typeB\021\n\017_canonical" +
      "_nameB\024\n\022_parent_geo_targetB\210\002\n&com.goog" +
      "le.ads.googleads.v16.resourcesB\026GeoTarge" +
      "tConstantProtoP\001ZKgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v16/resour" +
      "ces;resources\242\002\003GAA\252\002\"Google.Ads.GoogleA" +
      "ds.V16.Resources\312\002\"Google\\Ads\\GoogleAds\\" +
      "V16\\Resources\352\002&Google::Ads::GoogleAds::" +
      "V16::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v16.enums.GeoTargetConstantStatusProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v16_resources_GeoTargetConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v16_resources_GeoTargetConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v16_resources_GeoTargetConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "CountryCode", "TargetType", "Status", "CanonicalName", "ParentGeoTarget", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v16.enums.GeoTargetConstantStatusProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
