/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dfareporting.model;

/**
 * Contains properties of a Floodlight activity group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FloodlightActivityGroup extends com.google.api.client.json.GenericJson {

  /**
   * Account ID of this floodlight activity group. This is a read-only field that can be left blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long accountId;

  /**
   * Advertiser ID of this floodlight activity group. If this field is left blank, the value will be
   * copied over either from the floodlight configuration's advertiser or from the existing activity
   * group's advertiser.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue advertiserIdDimensionValue;

  /**
   * Floodlight configuration ID of this floodlight activity group. This is a required field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long floodlightConfigurationId;

  /**
   * Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated
   * field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue floodlightConfigurationIdDimensionValue;

  /**
   * ID of this floodlight activity group. This is a read-only, auto-generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Dimension value for the ID of this floodlight activity group. This is a read-only, auto-
   * generated field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DimensionValue idDimensionValue;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#floodlightActivityGroup".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of this floodlight activity group. This is a required field. Must be less than 65
   * characters long and cannot contain quotes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Subaccount ID of this floodlight activity group. This is a read-only field that can be left
   * blank.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long subaccountId;

  /**
   * Value of the type= parameter in the floodlight tag, which the ad servers use to identify the
   * activity group that the activity belongs to. This is optional: if empty, a new tag string will
   * be generated for you. This string must be 1 to 8 characters long, with valid characters being
   * a-z0-9[ _ ]. This tag string must also be unique among activity groups of the same floodlight
   * configuration. This field is read-only after insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagString;

  /**
   * Type of the floodlight activity group. This is a required field that is read-only after
   * insertion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Account ID of this floodlight activity group. This is a read-only field that can be left blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAccountId() {
    return accountId;
  }

  /**
   * Account ID of this floodlight activity group. This is a read-only field that can be left blank.
   * @param accountId accountId or {@code null} for none
   */
  public FloodlightActivityGroup setAccountId(java.lang.Long accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Advertiser ID of this floodlight activity group. If this field is left blank, the value will be
   * copied over either from the floodlight configuration's advertiser or from the existing activity
   * group's advertiser.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * Advertiser ID of this floodlight activity group. If this field is left blank, the value will be
   * copied over either from the floodlight configuration's advertiser or from the existing activity
   * group's advertiser.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public FloodlightActivityGroup setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getAdvertiserIdDimensionValue() {
    return advertiserIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the advertiser. This is a read-only, auto-generated field.
   * @param advertiserIdDimensionValue advertiserIdDimensionValue or {@code null} for none
   */
  public FloodlightActivityGroup setAdvertiserIdDimensionValue(DimensionValue advertiserIdDimensionValue) {
    this.advertiserIdDimensionValue = advertiserIdDimensionValue;
    return this;
  }

  /**
   * Floodlight configuration ID of this floodlight activity group. This is a required field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFloodlightConfigurationId() {
    return floodlightConfigurationId;
  }

  /**
   * Floodlight configuration ID of this floodlight activity group. This is a required field.
   * @param floodlightConfigurationId floodlightConfigurationId or {@code null} for none
   */
  public FloodlightActivityGroup setFloodlightConfigurationId(java.lang.Long floodlightConfigurationId) {
    this.floodlightConfigurationId = floodlightConfigurationId;
    return this;
  }

  /**
   * Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated
   * field.
   * @return value or {@code null} for none
   */
  public DimensionValue getFloodlightConfigurationIdDimensionValue() {
    return floodlightConfigurationIdDimensionValue;
  }

  /**
   * Dimension value for the ID of the floodlight configuration. This is a read-only, auto-generated
   * field.
   * @param floodlightConfigurationIdDimensionValue floodlightConfigurationIdDimensionValue or {@code null} for none
   */
  public FloodlightActivityGroup setFloodlightConfigurationIdDimensionValue(DimensionValue floodlightConfigurationIdDimensionValue) {
    this.floodlightConfigurationIdDimensionValue = floodlightConfigurationIdDimensionValue;
    return this;
  }

  /**
   * ID of this floodlight activity group. This is a read-only, auto-generated field.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this floodlight activity group. This is a read-only, auto-generated field.
   * @param id id or {@code null} for none
   */
  public FloodlightActivityGroup setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Dimension value for the ID of this floodlight activity group. This is a read-only, auto-
   * generated field.
   * @return value or {@code null} for none
   */
  public DimensionValue getIdDimensionValue() {
    return idDimensionValue;
  }

  /**
   * Dimension value for the ID of this floodlight activity group. This is a read-only, auto-
   * generated field.
   * @param idDimensionValue idDimensionValue or {@code null} for none
   */
  public FloodlightActivityGroup setIdDimensionValue(DimensionValue idDimensionValue) {
    this.idDimensionValue = idDimensionValue;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#floodlightActivityGroup".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dfareporting#floodlightActivityGroup".
   * @param kind kind or {@code null} for none
   */
  public FloodlightActivityGroup setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of this floodlight activity group. This is a required field. Must be less than 65
   * characters long and cannot contain quotes.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this floodlight activity group. This is a required field. Must be less than 65
   * characters long and cannot contain quotes.
   * @param name name or {@code null} for none
   */
  public FloodlightActivityGroup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Subaccount ID of this floodlight activity group. This is a read-only field that can be left
   * blank.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSubaccountId() {
    return subaccountId;
  }

  /**
   * Subaccount ID of this floodlight activity group. This is a read-only field that can be left
   * blank.
   * @param subaccountId subaccountId or {@code null} for none
   */
  public FloodlightActivityGroup setSubaccountId(java.lang.Long subaccountId) {
    this.subaccountId = subaccountId;
    return this;
  }

  /**
   * Value of the type= parameter in the floodlight tag, which the ad servers use to identify the
   * activity group that the activity belongs to. This is optional: if empty, a new tag string will
   * be generated for you. This string must be 1 to 8 characters long, with valid characters being
   * a-z0-9[ _ ]. This tag string must also be unique among activity groups of the same floodlight
   * configuration. This field is read-only after insertion.
   * @return value or {@code null} for none
   */
  public java.lang.String getTagString() {
    return tagString;
  }

  /**
   * Value of the type= parameter in the floodlight tag, which the ad servers use to identify the
   * activity group that the activity belongs to. This is optional: if empty, a new tag string will
   * be generated for you. This string must be 1 to 8 characters long, with valid characters being
   * a-z0-9[ _ ]. This tag string must also be unique among activity groups of the same floodlight
   * configuration. This field is read-only after insertion.
   * @param tagString tagString or {@code null} for none
   */
  public FloodlightActivityGroup setTagString(java.lang.String tagString) {
    this.tagString = tagString;
    return this;
  }

  /**
   * Type of the floodlight activity group. This is a required field that is read-only after
   * insertion.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of the floodlight activity group. This is a required field that is read-only after
   * insertion.
   * @param type type or {@code null} for none
   */
  public FloodlightActivityGroup setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public FloodlightActivityGroup set(String fieldName, Object value) {
    return (FloodlightActivityGroup) super.set(fieldName, value);
  }

  @Override
  public FloodlightActivityGroup clone() {
    return (FloodlightActivityGroup) super.clone();
  }

}
