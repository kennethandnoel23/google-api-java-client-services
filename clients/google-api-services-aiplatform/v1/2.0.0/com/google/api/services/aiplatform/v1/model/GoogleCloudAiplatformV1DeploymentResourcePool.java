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

package com.google.api.services.aiplatform.v1.model;

/**
 * A description of resources that can be shared by multiple DeployedModels, whose underlying
 * specification consists of a DedicatedResources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1DeploymentResourcePool extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1DedicatedResources dedicatedResources;

  /**
   * Immutable. The resource name of the DeploymentResourcePool. Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when this DeploymentResourcePool was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeploymentResourcePool setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1DedicatedResources getDedicatedResources() {
    return dedicatedResources;
  }

  /**
   * Required. The underlying DedicatedResources that the DeploymentResourcePool uses.
   * @param dedicatedResources dedicatedResources or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeploymentResourcePool setDedicatedResources(GoogleCloudAiplatformV1DedicatedResources dedicatedResources) {
    this.dedicatedResources = dedicatedResources;
    return this;
  }

  /**
   * Immutable. The resource name of the DeploymentResourcePool. Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name of the DeploymentResourcePool. Format:
   * `projects/{project}/locations/{location}/deploymentResourcePools/{deployment_resource_pool}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudAiplatformV1DeploymentResourcePool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1DeploymentResourcePool set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1DeploymentResourcePool) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1DeploymentResourcePool clone() {
    return (GoogleCloudAiplatformV1DeploymentResourcePool) super.clone();
  }

}
