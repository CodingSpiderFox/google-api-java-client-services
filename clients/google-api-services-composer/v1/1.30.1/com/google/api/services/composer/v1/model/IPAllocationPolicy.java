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

package com.google.api.services.composer.v1.model;

/**
 * Configuration for controlling how IPs are allocated in the GKE cluster running the Apache Airflow
 * software.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IPAllocationPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterIpv4CidrBlock;

  /**
   * Optional. The name of the GKE cluster's secondary range used to allocate IP addresses to pods.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterSecondaryRangeName;

  /**
   * Optional. The IP address range of the services IP addresses in this GKE cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servicesIpv4CidrBlock;

  /**
   * Optional. The name of the services' secondary range used to allocate IP addresses to the GKE
   * cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servicesSecondaryRangeName;

  /**
   * Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native
   * cluster is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useIpAliases;

  /**
   * Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterIpv4CidrBlock() {
    return clusterIpv4CidrBlock;
  }

  /**
   * Optional. The IP address range used to allocate IP addresses to pods in the GKE cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @param clusterIpv4CidrBlock clusterIpv4CidrBlock or {@code null} for none
   */
  public IPAllocationPolicy setClusterIpv4CidrBlock(java.lang.String clusterIpv4CidrBlock) {
    this.clusterIpv4CidrBlock = clusterIpv4CidrBlock;
    return this;
  }

  /**
   * Optional. The name of the GKE cluster's secondary range used to allocate IP addresses to pods.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterSecondaryRangeName() {
    return clusterSecondaryRangeName;
  }

  /**
   * Optional. The name of the GKE cluster's secondary range used to allocate IP addresses to pods.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   * @param clusterSecondaryRangeName clusterSecondaryRangeName or {@code null} for none
   */
  public IPAllocationPolicy setClusterSecondaryRangeName(java.lang.String clusterSecondaryRangeName) {
    this.clusterSecondaryRangeName = clusterSecondaryRangeName;
    return this;
  }

  /**
   * Optional. The IP address range of the services IP addresses in this GKE cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @return value or {@code null} for none
   */
  public java.lang.String getServicesIpv4CidrBlock() {
    return servicesIpv4CidrBlock;
  }

  /**
   * Optional. The IP address range of the services IP addresses in this GKE cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   *
   * Set to blank to have GKE choose a range with the default size.
   *
   * Set to /netmask (e.g. `/14`) to have GKE choose a range with a specific netmask.
   *
   * Set to a [CIDR](http://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing) notation (e.g.
   * `10.96.0.0/14`) from the RFC-1918 private networks (e.g. `10.0.0.0/8`, `172.16.0.0/12`,
   * `192.168.0.0/16`) to pick a specific range to use.
   * @param servicesIpv4CidrBlock servicesIpv4CidrBlock or {@code null} for none
   */
  public IPAllocationPolicy setServicesIpv4CidrBlock(java.lang.String servicesIpv4CidrBlock) {
    this.servicesIpv4CidrBlock = servicesIpv4CidrBlock;
    return this;
  }

  /**
   * Optional. The name of the services' secondary range used to allocate IP addresses to the GKE
   * cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   * @return value or {@code null} for none
   */
  public java.lang.String getServicesSecondaryRangeName() {
    return servicesSecondaryRangeName;
  }

  /**
   * Optional. The name of the services' secondary range used to allocate IP addresses to the GKE
   * cluster.
   *
   * This field is applicable only when `use_ip_aliases` is true.
   * @param servicesSecondaryRangeName servicesSecondaryRangeName or {@code null} for none
   */
  public IPAllocationPolicy setServicesSecondaryRangeName(java.lang.String servicesSecondaryRangeName) {
    this.servicesSecondaryRangeName = servicesSecondaryRangeName;
    return this;
  }

  /**
   * Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native
   * cluster is created.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseIpAliases() {
    return useIpAliases;
  }

  /**
   * Optional. Whether or not to enable Alias IPs in the GKE cluster. If `true`, a VPC-native
   * cluster is created.
   * @param useIpAliases useIpAliases or {@code null} for none
   */
  public IPAllocationPolicy setUseIpAliases(java.lang.Boolean useIpAliases) {
    this.useIpAliases = useIpAliases;
    return this;
  }

  @Override
  public IPAllocationPolicy set(String fieldName, Object value) {
    return (IPAllocationPolicy) super.set(fieldName, value);
  }

  @Override
  public IPAllocationPolicy clone() {
    return (IPAllocationPolicy) super.clone();
  }

}