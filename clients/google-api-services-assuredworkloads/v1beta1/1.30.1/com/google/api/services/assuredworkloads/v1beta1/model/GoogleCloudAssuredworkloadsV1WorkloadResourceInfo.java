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

package com.google.api.services.assuredworkloads.v1beta1.model;

/**
 * Represent the resources that are children of this Workload.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsV1WorkloadResourceInfo extends com.google.api.client.json.GenericJson {

  /**
   * Resource identifier. For a project this represents project_number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long resourceId;

  /**
   * Indicates the type of resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceType;

  /**
   * Resource identifier. For a project this represents project_number.
   * @return value or {@code null} for none
   */
  public java.lang.Long getResourceId() {
    return resourceId;
  }

  /**
   * Resource identifier. For a project this represents project_number.
   * @param resourceId resourceId or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1WorkloadResourceInfo setResourceId(java.lang.Long resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  /**
   * Indicates the type of resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceType() {
    return resourceType;
  }

  /**
   * Indicates the type of resource.
   * @param resourceType resourceType or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1WorkloadResourceInfo setResourceType(java.lang.String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsV1WorkloadResourceInfo set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsV1WorkloadResourceInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsV1WorkloadResourceInfo clone() {
    return (GoogleCloudAssuredworkloadsV1WorkloadResourceInfo) super.clone();
  }

}
