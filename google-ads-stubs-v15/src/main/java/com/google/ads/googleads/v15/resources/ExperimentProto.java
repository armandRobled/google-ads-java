// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/experiment.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public final class ExperimentProto {
  private ExperimentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v15_resources_Experiment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v15_resources_Experiment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3google/ads/googleads/v15/resources/exp" +
      "eriment.proto\022\"google.ads.googleads.v15." +
      "resources\0321google/ads/googleads/v15/comm" +
      "on/metric_goal.proto\0328google/ads/googlea" +
      "ds/v15/enums/async_action_status.proto\0326" +
      "google/ads/googleads/v15/enums/experimen" +
      "t_status.proto\0324google/ads/googleads/v15" +
      "/enums/experiment_type.proto\032\037google/api" +
      "/field_behavior.proto\032\031google/api/resour" +
      "ce.proto\"\365\005\n\nExperiment\022B\n\rresource_name" +
      "\030\001 \001(\tB+\340A\005\372A%\n#googleads.googleapis.com" +
      "/Experiment\022\037\n\rexperiment_id\030\t \001(\003B\003\340A\003H" +
      "\000\210\001\001\022\021\n\004name\030\n \001(\tB\003\340A\002\022\023\n\013description\030\013" +
      " \001(\t\022\016\n\006suffix\030\014 \001(\t\022T\n\004type\030\r \001(\0162A.goo" +
      "gle.ads.googleads.v15.enums.ExperimentTy" +
      "peEnum.ExperimentTypeB\003\340A\002\022U\n\006status\030\016 \001" +
      "(\0162E.google.ads.googleads.v15.enums.Expe" +
      "rimentStatusEnum.ExperimentStatus\022\027\n\nsta" +
      "rt_date\030\017 \001(\tH\001\210\001\001\022\025\n\010end_date\030\020 \001(\tH\002\210\001" +
      "\001\022:\n\005goals\030\021 \003(\0132+.google.ads.googleads." +
      "v15.common.MetricGoal\022(\n\026long_running_op" +
      "eration\030\022 \001(\tB\003\340A\003H\003\210\001\001\022d\n\016promote_statu" +
      "s\030\023 \001(\0162G.google.ads.googleads.v15.enums" +
      ".AsyncActionStatusEnum.AsyncActionStatus" +
      "B\003\340A\003:X\352AU\n#googleads.googleapis.com/Exp" +
      "eriment\022.customers/{customer_id}/experim" +
      "ents/{trial_id}B\020\n\016_experiment_idB\r\n\013_st" +
      "art_dateB\013\n\t_end_dateB\031\n\027_long_running_o" +
      "perationB\201\002\n&com.google.ads.googleads.v1" +
      "5.resourcesB\017ExperimentProtoP\001ZKgoogle.g" +
      "olang.org/genproto/googleapis/ads/google" +
      "ads/v15/resources;resources\242\002\003GAA\252\002\"Goog" +
      "le.Ads.GoogleAds.V15.Resources\312\002\"Google\\" +
      "Ads\\GoogleAds\\V15\\Resources\352\002&Google::Ad" +
      "s::GoogleAds::V15::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v15.common.MetricGoalProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.AsyncActionStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.ExperimentStatusProto.getDescriptor(),
          com.google.ads.googleads.v15.enums.ExperimentTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v15_resources_Experiment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v15_resources_Experiment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v15_resources_Experiment_descriptor,
        new java.lang.String[] { "ResourceName", "ExperimentId", "Name", "Description", "Suffix", "Type", "Status", "StartDate", "EndDate", "Goals", "LongRunningOperation", "PromoteStatus", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v15.common.MetricGoalProto.getDescriptor();
    com.google.ads.googleads.v15.enums.AsyncActionStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.ExperimentStatusProto.getDescriptor();
    com.google.ads.googleads.v15.enums.ExperimentTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
