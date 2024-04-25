// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v15/resources/local_services_lead.proto

// Protobuf Java Version: 3.25.3
package com.google.ads.googleads.v15.resources;

public interface LocalServicesLeadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v15.resources.LocalServicesLead)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The resource name of the local services lead data.
   * Local Services Lead resource name have the form
   *
   * `customers/{customer_id}/localServicesLead/{local_services_lead_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Output only. The resource name of the local services lead data.
   * Local Services Lead resource name have the form
   *
   * `customers/{customer_id}/localServicesLead/{local_services_lead_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * Output only. ID of this Lead.
   * </pre>
   *
   * <code>int64 id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * Output only. Service category of the lead. For example:
   * `xcat:service_area_business_hvac`,
   * `xcat:service_area_business_real_estate_agent`, etc.
   * For more details see:
   * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
   * </pre>
   *
   * <code>string category_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The categoryId.
   */
  java.lang.String getCategoryId();
  /**
   * <pre>
   * Output only. Service category of the lead. For example:
   * `xcat:service_area_business_hvac`,
   * `xcat:service_area_business_real_estate_agent`, etc.
   * For more details see:
   * https://developers.google.com/google-ads/api/data/codes-formats#local_services_ids
   * </pre>
   *
   * <code>string category_id = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for categoryId.
   */
  com.google.protobuf.ByteString
      getCategoryIdBytes();

  /**
   * <pre>
   * Output only. Service for the  category. For example: `buyer_agent`,
   * `seller_agent` for the category of
   * `xcat:service_area_business_real_estate_agent`.
   * </pre>
   *
   * <code>string service_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The serviceId.
   */
  java.lang.String getServiceId();
  /**
   * <pre>
   * Output only. Service for the  category. For example: `buyer_agent`,
   * `seller_agent` for the category of
   * `xcat:service_area_business_real_estate_agent`.
   * </pre>
   *
   * <code>string service_id = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for serviceId.
   */
  com.google.protobuf.ByteString
      getServiceIdBytes();

  /**
   * <pre>
   * Output only. Lead's contact details.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.ContactDetails contact_details = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the contactDetails field is set.
   */
  boolean hasContactDetails();
  /**
   * <pre>
   * Output only. Lead's contact details.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.ContactDetails contact_details = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The contactDetails.
   */
  com.google.ads.googleads.v15.resources.ContactDetails getContactDetails();
  /**
   * <pre>
   * Output only. Lead's contact details.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.resources.ContactDetails contact_details = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v15.resources.ContactDetailsOrBuilder getContactDetailsOrBuilder();

  /**
   * <pre>
   * Output only. Type of Local Services lead: phone, message, booking, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LocalServicesLeadTypeEnum.LeadType lead_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for leadType.
   */
  int getLeadTypeValue();
  /**
   * <pre>
   * Output only. Type of Local Services lead: phone, message, booking, etc.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LocalServicesLeadTypeEnum.LeadType lead_type = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The leadType.
   */
  com.google.ads.googleads.v15.enums.LocalServicesLeadTypeEnum.LeadType getLeadType();

  /**
   * <pre>
   * Output only. Current status of lead.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LocalServicesLeadStatusEnum.LeadStatus lead_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The enum numeric value on the wire for leadStatus.
   */
  int getLeadStatusValue();
  /**
   * <pre>
   * Output only. Current status of lead.
   * </pre>
   *
   * <code>.google.ads.googleads.v15.enums.LocalServicesLeadStatusEnum.LeadStatus lead_status = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The leadStatus.
   */
  com.google.ads.googleads.v15.enums.LocalServicesLeadStatusEnum.LeadStatus getLeadStatus();

  /**
   * <pre>
   * Output only. The date time at which lead was created by Local Services Ads.
   * The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string creation_date_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creationDateTime.
   */
  java.lang.String getCreationDateTime();
  /**
   * <pre>
   * Output only. The date time at which lead was created by Local Services Ads.
   * The format is "YYYY-MM-DD HH:MM:SS" in the Google Ads account's timezone.
   * Examples: "2018-03-05 09:15:00" or "2018-02-01 14:34:30"
   * </pre>
   *
   * <code>string creation_date_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for creationDateTime.
   */
  com.google.protobuf.ByteString
      getCreationDateTimeBytes();

  /**
   * <pre>
   * Output only. Language used by the Local Services provider linked to lead.
   * See https://developers.google.com/google-ads/api/data/codes-formats#locales
   * </pre>
   *
   * <code>string locale = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * Output only. Language used by the Local Services provider linked to lead.
   * See https://developers.google.com/google-ads/api/data/codes-formats#locales
   * </pre>
   *
   * <code>string locale = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * Output only. Note added by advertiser for the lead.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.resources.Note note = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the note field is set.
   */
  boolean hasNote();
  /**
   * <pre>
   * Output only. Note added by advertiser for the lead.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.resources.Note note = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The note.
   */
  com.google.ads.googleads.v15.resources.Note getNote();
  /**
   * <pre>
   * Output only. Note added by advertiser for the lead.
   * </pre>
   *
   * <code>optional .google.ads.googleads.v15.resources.Note note = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.ads.googleads.v15.resources.NoteOrBuilder getNoteOrBuilder();

  /**
   * <pre>
   * Output only. True if the advertiser was charged for the lead.
   * </pre>
   *
   * <code>bool lead_charged = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The leadCharged.
   */
  boolean getLeadCharged();
}
