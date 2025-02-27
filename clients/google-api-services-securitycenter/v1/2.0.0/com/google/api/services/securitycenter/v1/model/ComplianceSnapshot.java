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

package com.google.api.services.securitycenter.v1.model;

/**
 * Result containing the properties and count of a ComplianceSnapshot request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ComplianceSnapshot extends com.google.api.client.json.GenericJson {

  /**
   * The category of Findings matching.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * The compliance standard (ie CIS).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complianceStandard;

  /**
   * The compliance version (ie 1.3) in CIS 1.3.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String complianceVersion;

  /**
   * Total count of findings for the given properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * The leaf container resource name that is closest to the snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String leafContainerResource;

  /**
   * The compliance snapshot name. Format: //sources//complianceSnapshots/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The CRM resource display name that is closest to the snapshot the Findings belong to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectDisplayName;

  /**
   * The snapshot time of the snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String snapshotTime;

  /**
   * The category of Findings matching.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The category of Findings matching.
   * @param category category or {@code null} for none
   */
  public ComplianceSnapshot setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * The compliance standard (ie CIS).
   * @return value or {@code null} for none
   */
  public java.lang.String getComplianceStandard() {
    return complianceStandard;
  }

  /**
   * The compliance standard (ie CIS).
   * @param complianceStandard complianceStandard or {@code null} for none
   */
  public ComplianceSnapshot setComplianceStandard(java.lang.String complianceStandard) {
    this.complianceStandard = complianceStandard;
    return this;
  }

  /**
   * The compliance version (ie 1.3) in CIS 1.3.
   * @return value or {@code null} for none
   */
  public java.lang.String getComplianceVersion() {
    return complianceVersion;
  }

  /**
   * The compliance version (ie 1.3) in CIS 1.3.
   * @param complianceVersion complianceVersion or {@code null} for none
   */
  public ComplianceSnapshot setComplianceVersion(java.lang.String complianceVersion) {
    this.complianceVersion = complianceVersion;
    return this;
  }

  /**
   * Total count of findings for the given properties.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * Total count of findings for the given properties.
   * @param count count or {@code null} for none
   */
  public ComplianceSnapshot setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  /**
   * The leaf container resource name that is closest to the snapshot.
   * @return value or {@code null} for none
   */
  public java.lang.String getLeafContainerResource() {
    return leafContainerResource;
  }

  /**
   * The leaf container resource name that is closest to the snapshot.
   * @param leafContainerResource leafContainerResource or {@code null} for none
   */
  public ComplianceSnapshot setLeafContainerResource(java.lang.String leafContainerResource) {
    this.leafContainerResource = leafContainerResource;
    return this;
  }

  /**
   * The compliance snapshot name. Format: //sources//complianceSnapshots/
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The compliance snapshot name. Format: //sources//complianceSnapshots/
   * @param name name or {@code null} for none
   */
  public ComplianceSnapshot setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The CRM resource display name that is closest to the snapshot the Findings belong to.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectDisplayName() {
    return projectDisplayName;
  }

  /**
   * The CRM resource display name that is closest to the snapshot the Findings belong to.
   * @param projectDisplayName projectDisplayName or {@code null} for none
   */
  public ComplianceSnapshot setProjectDisplayName(java.lang.String projectDisplayName) {
    this.projectDisplayName = projectDisplayName;
    return this;
  }

  /**
   * The snapshot time of the snapshot.
   * @return value or {@code null} for none
   */
  public String getSnapshotTime() {
    return snapshotTime;
  }

  /**
   * The snapshot time of the snapshot.
   * @param snapshotTime snapshotTime or {@code null} for none
   */
  public ComplianceSnapshot setSnapshotTime(String snapshotTime) {
    this.snapshotTime = snapshotTime;
    return this;
  }

  @Override
  public ComplianceSnapshot set(String fieldName, Object value) {
    return (ComplianceSnapshot) super.set(fieldName, value);
  }

  @Override
  public ComplianceSnapshot clone() {
    return (ComplianceSnapshot) super.clone();
  }

}
