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
 * Flight
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
public final class Flight extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endDate;

  /**
   * Rate or cost of this flight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rateOrCost;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startDate;

  /**
   * Units of this flight.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long units;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public Flight setEndDate(com.google.api.client.util.DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Rate or cost of this flight.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRateOrCost() {
    return rateOrCost;
  }

  /**
   * Rate or cost of this flight.
   * @param rateOrCost rateOrCost or {@code null} for none
   */
  public Flight setRateOrCost(java.lang.Long rateOrCost) {
    this.rateOrCost = rateOrCost;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public Flight setStartDate(com.google.api.client.util.DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Units of this flight.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUnits() {
    return units;
  }

  /**
   * Units of this flight.
   * @param units units or {@code null} for none
   */
  public Flight setUnits(java.lang.Long units) {
    this.units = units;
    return this;
  }

  @Override
  public Flight set(String fieldName, Object value) {
    return (Flight) super.set(fieldName, value);
  }

  @Override
  public Flight clone() {
    return (Flight) super.clone();
  }

}
