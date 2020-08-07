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

package com.google.api.services.datafusion.v1beta1.model;

/**
 * Represents a Data Fusion instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Fusion API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * List of accelerators enabled for this CDF instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Accelerator> accelerators;

  static {
    // hack to force ProGuard to consider Accelerator used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Accelerator.class);
  }

  /**
   * Output only. Endpoint on which the REST APIs is accessible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String apiEndpoint;

  /**
   * Available versions that the instance can be upgraded to using UpdateInstanceRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Version> availableVersion;

  /**
   * Output only. The time the instance was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A description of this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display name for an instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Option to enable Stackdriver Logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableStackdriverLogging;

  /**
   * Option to enable Stackdriver Monitoring.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableStackdriverMonitoring;

  /**
   * Output only. Cloud Storage bucket generated by Data Fusion in the customer project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gcsBucket;

  /**
   * The resource labels for instance to use to annotate any related underlying resources such as
   * Compute Engine VMs. The character '=' is not allowed to be used within the labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The name of this instance is in the form of
   * projects/{project}/locations/{location}/instances/{instance}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Network configuration options. These are required when a private Data Fusion instance is to be
   * created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkConfig networkConfig;

  /**
   * Map of additional options used to configure the behavior of Data Fusion instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> options;

  /**
   * Output only. P4 service account for the customer project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String p4ServiceAccount;

  /**
   * Specifies whether the Data Fusion instance should be private. If set to true, all Data Fusion
   * nodes will have private IP addresses and will not be able to access the public internet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean privateInstance;

  /**
   * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceEndpoint;

  /**
   * Output only. The current state of this Data Fusion instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Additional information about the current state of this Data Fusion instance if
   * available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateMessage;

  /**
   * Output only. The name of the tenant project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantProjectId;

  /**
   * Required. Instance type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The time the instance was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Current version of Data Fusion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * Name of the zone in which the Data Fusion instance will be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * List of accelerators enabled for this CDF instance.
   * @return value or {@code null} for none
   */
  public java.util.List<Accelerator> getAccelerators() {
    return accelerators;
  }

  /**
   * List of accelerators enabled for this CDF instance.
   * @param accelerators accelerators or {@code null} for none
   */
  public Instance setAccelerators(java.util.List<Accelerator> accelerators) {
    this.accelerators = accelerators;
    return this;
  }

  /**
   * Output only. Endpoint on which the REST APIs is accessible.
   * @return value or {@code null} for none
   */
  public java.lang.String getApiEndpoint() {
    return apiEndpoint;
  }

  /**
   * Output only. Endpoint on which the REST APIs is accessible.
   * @param apiEndpoint apiEndpoint or {@code null} for none
   */
  public Instance setApiEndpoint(java.lang.String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
    return this;
  }

  /**
   * Available versions that the instance can be upgraded to using UpdateInstanceRequest.
   * @return value or {@code null} for none
   */
  public java.util.List<Version> getAvailableVersion() {
    return availableVersion;
  }

  /**
   * Available versions that the instance can be upgraded to using UpdateInstanceRequest.
   * @param availableVersion availableVersion or {@code null} for none
   */
  public Instance setAvailableVersion(java.util.List<Version> availableVersion) {
    this.availableVersion = availableVersion;
    return this;
  }

  /**
   * Output only. The time the instance was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the instance was created.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A description of this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of this instance.
   * @param description description or {@code null} for none
   */
  public Instance setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display name for an instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name for an instance.
   * @param displayName displayName or {@code null} for none
   */
  public Instance setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Option to enable Stackdriver Logging.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableStackdriverLogging() {
    return enableStackdriverLogging;
  }

  /**
   * Option to enable Stackdriver Logging.
   * @param enableStackdriverLogging enableStackdriverLogging or {@code null} for none
   */
  public Instance setEnableStackdriverLogging(java.lang.Boolean enableStackdriverLogging) {
    this.enableStackdriverLogging = enableStackdriverLogging;
    return this;
  }

  /**
   * Option to enable Stackdriver Monitoring.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableStackdriverMonitoring() {
    return enableStackdriverMonitoring;
  }

  /**
   * Option to enable Stackdriver Monitoring.
   * @param enableStackdriverMonitoring enableStackdriverMonitoring or {@code null} for none
   */
  public Instance setEnableStackdriverMonitoring(java.lang.Boolean enableStackdriverMonitoring) {
    this.enableStackdriverMonitoring = enableStackdriverMonitoring;
    return this;
  }

  /**
   * Output only. Cloud Storage bucket generated by Data Fusion in the customer project.
   * @return value or {@code null} for none
   */
  public java.lang.String getGcsBucket() {
    return gcsBucket;
  }

  /**
   * Output only. Cloud Storage bucket generated by Data Fusion in the customer project.
   * @param gcsBucket gcsBucket or {@code null} for none
   */
  public Instance setGcsBucket(java.lang.String gcsBucket) {
    this.gcsBucket = gcsBucket;
    return this;
  }

  /**
   * The resource labels for instance to use to annotate any related underlying resources such as
   * Compute Engine VMs. The character '=' is not allowed to be used within the labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The resource labels for instance to use to annotate any related underlying resources such as
   * Compute Engine VMs. The character '=' is not allowed to be used within the labels.
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The name of this instance is in the form of
   * projects/{project}/locations/{location}/instances/{instance}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of this instance is in the form of
   * projects/{project}/locations/{location}/instances/{instance}.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Network configuration options. These are required when a private Data Fusion instance is to be
   * created.
   * @return value or {@code null} for none
   */
  public NetworkConfig getNetworkConfig() {
    return networkConfig;
  }

  /**
   * Network configuration options. These are required when a private Data Fusion instance is to be
   * created.
   * @param networkConfig networkConfig or {@code null} for none
   */
  public Instance setNetworkConfig(NetworkConfig networkConfig) {
    this.networkConfig = networkConfig;
    return this;
  }

  /**
   * Map of additional options used to configure the behavior of Data Fusion instance.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getOptions() {
    return options;
  }

  /**
   * Map of additional options used to configure the behavior of Data Fusion instance.
   * @param options options or {@code null} for none
   */
  public Instance setOptions(java.util.Map<String, java.lang.String> options) {
    this.options = options;
    return this;
  }

  /**
   * Output only. P4 service account for the customer project.
   * @return value or {@code null} for none
   */
  public java.lang.String getP4ServiceAccount() {
    return p4ServiceAccount;
  }

  /**
   * Output only. P4 service account for the customer project.
   * @param p4ServiceAccount p4ServiceAccount or {@code null} for none
   */
  public Instance setP4ServiceAccount(java.lang.String p4ServiceAccount) {
    this.p4ServiceAccount = p4ServiceAccount;
    return this;
  }

  /**
   * Specifies whether the Data Fusion instance should be private. If set to true, all Data Fusion
   * nodes will have private IP addresses and will not be able to access the public internet.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrivateInstance() {
    return privateInstance;
  }

  /**
   * Specifies whether the Data Fusion instance should be private. If set to true, all Data Fusion
   * nodes will have private IP addresses and will not be able to access the public internet.
   * @param privateInstance privateInstance or {@code null} for none
   */
  public Instance setPrivateInstance(java.lang.Boolean privateInstance) {
    this.privateInstance = privateInstance;
    return this;
  }

  /**
   * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Output only. Deprecated. Use tenant_project_id instead to extract the tenant project ID.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Instance setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceEndpoint() {
    return serviceEndpoint;
  }

  /**
   * Output only. Endpoint on which the Data Fusion UI is accessible.
   * @param serviceEndpoint serviceEndpoint or {@code null} for none
   */
  public Instance setServiceEndpoint(java.lang.String serviceEndpoint) {
    this.serviceEndpoint = serviceEndpoint;
    return this;
  }

  /**
   * Output only. The current state of this Data Fusion instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of this Data Fusion instance.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Additional information about the current state of this Data Fusion instance if
   * available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateMessage() {
    return stateMessage;
  }

  /**
   * Output only. Additional information about the current state of this Data Fusion instance if
   * available.
   * @param stateMessage stateMessage or {@code null} for none
   */
  public Instance setStateMessage(java.lang.String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  /**
   * Output only. The name of the tenant project.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantProjectId() {
    return tenantProjectId;
  }

  /**
   * Output only. The name of the tenant project.
   * @param tenantProjectId tenantProjectId or {@code null} for none
   */
  public Instance setTenantProjectId(java.lang.String tenantProjectId) {
    this.tenantProjectId = tenantProjectId;
    return this;
  }

  /**
   * Required. Instance type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. Instance type.
   * @param type type or {@code null} for none
   */
  public Instance setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. The time the instance was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time the instance was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Instance setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Current version of Data Fusion.
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * Current version of Data Fusion.
   * @param version version or {@code null} for none
   */
  public Instance setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  /**
   * Name of the zone in which the Data Fusion instance will be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Name of the zone in which the Data Fusion instance will be created.
   * @param zone zone or {@code null} for none
   */
  public Instance setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}
