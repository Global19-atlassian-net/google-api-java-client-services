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

package com.google.api.services.youtube.model;

/**
 * Model definition for MembershipsDetails.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MembershipsDetails extends com.google.api.client.json.GenericJson {

  /**
   * All levels that the user has access to. This includes the purchased level and all other levels
   * that are included because of a higher purchase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> accessibleLevels;

  /**
   * The date and time when the user became a continuous member across all levels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String memberSince;

  /**
   * The date and time when the user started to continuously have access to the currently highest
   * level.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String memberSinceCurrentLevel;

  /**
   * The cumulative time the user has been a member across all levels in complete months (the time
   * is rounded down to the nearest integer).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memberTotalDuration;

  /**
   * The cumulative time the user has had access to the currently highest level in complete months
   * (the time is rounded down to the nearest integer).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memberTotalDurationCurrentLevel;

  /**
   * The highest level the user has access to at the moment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchasedLevel;

  /**
   * All levels that the user has access to. This includes the purchased level and all other levels
   * that are included because of a higher purchase.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAccessibleLevels() {
    return accessibleLevels;
  }

  /**
   * All levels that the user has access to. This includes the purchased level and all other levels
   * that are included because of a higher purchase.
   * @param accessibleLevels accessibleLevels or {@code null} for none
   */
  public MembershipsDetails setAccessibleLevels(java.util.List<java.lang.String> accessibleLevels) {
    this.accessibleLevels = accessibleLevels;
    return this;
  }

  /**
   * The date and time when the user became a continuous member across all levels.
   * @return value or {@code null} for none
   */
  public java.lang.String getMemberSince() {
    return memberSince;
  }

  /**
   * The date and time when the user became a continuous member across all levels.
   * @param memberSince memberSince or {@code null} for none
   */
  public MembershipsDetails setMemberSince(java.lang.String memberSince) {
    this.memberSince = memberSince;
    return this;
  }

  /**
   * The date and time when the user started to continuously have access to the currently highest
   * level.
   * @return value or {@code null} for none
   */
  public java.lang.String getMemberSinceCurrentLevel() {
    return memberSinceCurrentLevel;
  }

  /**
   * The date and time when the user started to continuously have access to the currently highest
   * level.
   * @param memberSinceCurrentLevel memberSinceCurrentLevel or {@code null} for none
   */
  public MembershipsDetails setMemberSinceCurrentLevel(java.lang.String memberSinceCurrentLevel) {
    this.memberSinceCurrentLevel = memberSinceCurrentLevel;
    return this;
  }

  /**
   * The cumulative time the user has been a member across all levels in complete months (the time
   * is rounded down to the nearest integer).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemberTotalDuration() {
    return memberTotalDuration;
  }

  /**
   * The cumulative time the user has been a member across all levels in complete months (the time
   * is rounded down to the nearest integer).
   * @param memberTotalDuration memberTotalDuration or {@code null} for none
   */
  public MembershipsDetails setMemberTotalDuration(java.lang.Integer memberTotalDuration) {
    this.memberTotalDuration = memberTotalDuration;
    return this;
  }

  /**
   * The cumulative time the user has had access to the currently highest level in complete months
   * (the time is rounded down to the nearest integer).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemberTotalDurationCurrentLevel() {
    return memberTotalDurationCurrentLevel;
  }

  /**
   * The cumulative time the user has had access to the currently highest level in complete months
   * (the time is rounded down to the nearest integer).
   * @param memberTotalDurationCurrentLevel memberTotalDurationCurrentLevel or {@code null} for none
   */
  public MembershipsDetails setMemberTotalDurationCurrentLevel(java.lang.Integer memberTotalDurationCurrentLevel) {
    this.memberTotalDurationCurrentLevel = memberTotalDurationCurrentLevel;
    return this;
  }

  /**
   * The highest level the user has access to at the moment.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchasedLevel() {
    return purchasedLevel;
  }

  /**
   * The highest level the user has access to at the moment.
   * @param purchasedLevel purchasedLevel or {@code null} for none
   */
  public MembershipsDetails setPurchasedLevel(java.lang.String purchasedLevel) {
    this.purchasedLevel = purchasedLevel;
    return this;
  }

  @Override
  public MembershipsDetails set(String fieldName, Object value) {
    return (MembershipsDetails) super.set(fieldName, value);
  }

  @Override
  public MembershipsDetails clone() {
    return (MembershipsDetails) super.clone();
  }

}