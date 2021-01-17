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

package com.google.api.services.managedidentities.v1alpha1.model;

/**
 * If the domain is being changed, it will be placed into the UPDATING state, which indicates that
 * the resource is being reconciled. At this point, Get will reflect an intermediate state.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Managed Service for Microsoft Active Directory API.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Domain extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is
   * audit logs disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean auditLogsEnabled;

  /**
   * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. Network can be added using UpdateDomain
   * later. Domain is only available on network part of authorized_networks. Caller needs to make
   * sure that CIDR subnets do not overlap between networks, else domain creation will fail.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> authorizedNetworks;

  /**
   * Output only. The time the instance was created. Synthetic field is populated automatically by
   * CCFE. go/ccfe-synthetic-field-user-guide
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Fully-qualified domain name of the exposed domain used by clients to connect to
   * the service. Similar to what would be chosen for an Active Directory that is set up on an
   * internal network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fqdn;

  /**
   * Optional. Resource labels to represent user provided metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4
   * Service supports up to 4 locations at once. Each location will use a /26 block.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> locations;

  /**
   * Optional. Name of customer-visible admin used to perform Active Directory operations. If not
   * specified `setupadmin` would be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String managedIdentitiesAdminName;

  /**
   * Output only. Unique name of the domain in this scope including projects and location using the
   * form: `projects/{project_id}/locations/global/domains/{domain_name}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The CIDR range of internal addresses that are reserved for this domain. Reserved
   * networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets
   * in [Domain].[authorized_networks].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reservedIpRange;

  /**
   * Output only. The current state of this domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Additional information about the current status of this domain, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * Output only. The current trusts associated with the domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Trust> trusts;

  /**
   * Output only. Last update time. Synthetic field is populated automatically by CCFE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is
   * audit logs disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAuditLogsEnabled() {
    return auditLogsEnabled;
  }

  /**
   * Optional. Configuration for audit logs. True if audit logs are enabled, else false. Default is
   * audit logs disabled.
   * @param auditLogsEnabled auditLogsEnabled or {@code null} for none
   */
  public Domain setAuditLogsEnabled(java.lang.Boolean auditLogsEnabled) {
    this.auditLogsEnabled = auditLogsEnabled;
    return this;
  }

  /**
   * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. Network can be added using UpdateDomain
   * later. Domain is only available on network part of authorized_networks. Caller needs to make
   * sure that CIDR subnets do not overlap between networks, else domain creation will fail.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAuthorizedNetworks() {
    return authorizedNetworks;
  }

  /**
   * Optional. The full names of the Google Compute Engine [networks](/compute/docs/networks-and-
   * firewalls#networks) to which the instance is connected. Network can be added using UpdateDomain
   * later. Domain is only available on network part of authorized_networks. Caller needs to make
   * sure that CIDR subnets do not overlap between networks, else domain creation will fail.
   * @param authorizedNetworks authorizedNetworks or {@code null} for none
   */
  public Domain setAuthorizedNetworks(java.util.List<java.lang.String> authorizedNetworks) {
    this.authorizedNetworks = authorizedNetworks;
    return this;
  }

  /**
   * Output only. The time the instance was created. Synthetic field is populated automatically by
   * CCFE. go/ccfe-synthetic-field-user-guide
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the instance was created. Synthetic field is populated automatically by
   * CCFE. go/ccfe-synthetic-field-user-guide
   * @param createTime createTime or {@code null} for none
   */
  public Domain setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Fully-qualified domain name of the exposed domain used by clients to connect to
   * the service. Similar to what would be chosen for an Active Directory that is set up on an
   * internal network.
   * @return value or {@code null} for none
   */
  public java.lang.String getFqdn() {
    return fqdn;
  }

  /**
   * Output only. Fully-qualified domain name of the exposed domain used by clients to connect to
   * the service. Similar to what would be chosen for an Active Directory that is set up on an
   * internal network.
   * @param fqdn fqdn or {@code null} for none
   */
  public Domain setFqdn(java.lang.String fqdn) {
    this.fqdn = fqdn;
    return this;
  }

  /**
   * Optional. Resource labels to represent user provided metadata
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user provided metadata
   * @param labels labels or {@code null} for none
   */
  public Domain setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4
   * Service supports up to 4 locations at once. Each location will use a /26 block.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLocations() {
    return locations;
  }

  /**
   * Required. Locations where domain needs to be provisioned. regions e.g. us-west1 or us-east4
   * Service supports up to 4 locations at once. Each location will use a /26 block.
   * @param locations locations or {@code null} for none
   */
  public Domain setLocations(java.util.List<java.lang.String> locations) {
    this.locations = locations;
    return this;
  }

  /**
   * Optional. Name of customer-visible admin used to perform Active Directory operations. If not
   * specified `setupadmin` would be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getManagedIdentitiesAdminName() {
    return managedIdentitiesAdminName;
  }

  /**
   * Optional. Name of customer-visible admin used to perform Active Directory operations. If not
   * specified `setupadmin` would be used.
   * @param managedIdentitiesAdminName managedIdentitiesAdminName or {@code null} for none
   */
  public Domain setManagedIdentitiesAdminName(java.lang.String managedIdentitiesAdminName) {
    this.managedIdentitiesAdminName = managedIdentitiesAdminName;
    return this;
  }

  /**
   * Output only. Unique name of the domain in this scope including projects and location using the
   * form: `projects/{project_id}/locations/global/domains/{domain_name}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Unique name of the domain in this scope including projects and location using the
   * form: `projects/{project_id}/locations/global/domains/{domain_name}`.
   * @param name name or {@code null} for none
   */
  public Domain setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The CIDR range of internal addresses that are reserved for this domain. Reserved
   * networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets
   * in [Domain].[authorized_networks].
   * @return value or {@code null} for none
   */
  public java.lang.String getReservedIpRange() {
    return reservedIpRange;
  }

  /**
   * Required. The CIDR range of internal addresses that are reserved for this domain. Reserved
   * networks must be /24 or larger. Ranges must be unique and non-overlapping with existing subnets
   * in [Domain].[authorized_networks].
   * @param reservedIpRange reservedIpRange or {@code null} for none
   */
  public Domain setReservedIpRange(java.lang.String reservedIpRange) {
    this.reservedIpRange = reservedIpRange;
    return this;
  }

  /**
   * Output only. The current state of this domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of this domain.
   * @param state state or {@code null} for none
   */
  public Domain setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Additional information about the current status of this domain, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Output only. Additional information about the current status of this domain, if available.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Domain setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Output only. The current trusts associated with the domain.
   * @return value or {@code null} for none
   */
  public java.util.List<Trust> getTrusts() {
    return trusts;
  }

  /**
   * Output only. The current trusts associated with the domain.
   * @param trusts trusts or {@code null} for none
   */
  public Domain setTrusts(java.util.List<Trust> trusts) {
    this.trusts = trusts;
    return this;
  }

  /**
   * Output only. Last update time. Synthetic field is populated automatically by CCFE.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Last update time. Synthetic field is populated automatically by CCFE.
   * @param updateTime updateTime or {@code null} for none
   */
  public Domain setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Domain set(String fieldName, Object value) {
    return (Domain) super.set(fieldName, value);
  }

  @Override
  public Domain clone() {
    return (Domain) super.clone();
  }

}
