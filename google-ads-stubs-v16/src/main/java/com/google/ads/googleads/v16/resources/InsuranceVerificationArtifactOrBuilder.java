// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v16/resources/local_services_verification_artifact.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v16.resources;

public interface InsuranceVerificationArtifactOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v16.resources.InsuranceVerificationArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. Insurance amount. This is measured in "micros" of the currency
   * mentioned in the insurance document.
   * </pre>
   *
   * <code>optional int64 amount_micros = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the amountMicros field is set.
   */
  boolean hasAmountMicros();
  /**
   * <pre>
   * Output only. Insurance amount. This is measured in "micros" of the currency
   * mentioned in the insurance document.
   * </pre>
   *
   * <code>optional int64 amount_micros = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The amountMicros.
   */
  long getAmountMicros();

  /**
   * <pre>
   * Output only. Insurance document's rejection reason.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.LocalServicesInsuranceRejectionReasonEnum.LocalServicesInsuranceRejectionReason rejection_reason = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the rejectionReason field is set.
   */
  boolean hasRejectionReason();
  /**
   * <pre>
   * Output only. Insurance document's rejection reason.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.LocalServicesInsuranceRejectionReasonEnum.LocalServicesInsuranceRejectionReason rejection_reason = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for rejectionReason.
   */
  int getRejectionReasonValue();
  /**
   * <pre>
   * Output only. Insurance document's rejection reason.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.enums.LocalServicesInsuranceRejectionReasonEnum.LocalServicesInsuranceRejectionReason rejection_reason = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The rejectionReason.
   */
  com.google.ads.googleads.v16.enums.LocalServicesInsuranceRejectionReasonEnum.LocalServicesInsuranceRejectionReason getRejectionReason();

  /**
   * <pre>
   * Output only. The readonly field containing the information for an uploaded
   * insurance document.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.common.LocalServicesDocumentReadOnly insurance_document_readonly = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the insuranceDocumentReadonly field is set.
   */
  boolean hasInsuranceDocumentReadonly();
  /**
   * <pre>
   * Output only. The readonly field containing the information for an uploaded
   * insurance document.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.common.LocalServicesDocumentReadOnly insurance_document_readonly = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The insuranceDocumentReadonly.
   */
  com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnly getInsuranceDocumentReadonly();
  /**
   * <pre>
   * Output only. The readonly field containing the information for an uploaded
   * insurance document.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v16.common.LocalServicesDocumentReadOnly insurance_document_readonly = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v16.common.LocalServicesDocumentReadOnlyOrBuilder getInsuranceDocumentReadonlyOrBuilder();
}
