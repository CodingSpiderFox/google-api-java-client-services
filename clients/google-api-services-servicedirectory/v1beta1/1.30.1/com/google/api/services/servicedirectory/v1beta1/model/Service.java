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

package com.google.api.services.servicedirectory.v1beta1.model;

/**
 * An individual service. A service contains a name and optional metadata. A service must exist
 * before endpoints can be added to it.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Directory API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Service extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Endpoints associated with this service. Returned on LookupService.Resolve. Control
   * plane clients should use RegistrationService.ListEndpoints.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Endpoint> endpoints;

  static {
    // hack to force ProGuard to consider Endpoint used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Endpoint.class);
  }

  /**
   * Optional. Metadata for the service. This data can be consumed by service clients.  The entire
   * metadata dictionary may contain up to 2000 characters, spread across all key-value pairs.
   * Metadata that goes beyond any these limits will be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Immutable. The resource name for the service in the format
   * 'projects/locations/namespaces/services'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Endpoints associated with this service. Returned on LookupService.Resolve. Control
   * plane clients should use RegistrationService.ListEndpoints.
   * @return value or {@code null} for none
   */
  public java.util.List<Endpoint> getEndpoints() {
    return endpoints;
  }

  /**
   * Output only. Endpoints associated with this service. Returned on LookupService.Resolve. Control
   * plane clients should use RegistrationService.ListEndpoints.
   * @param endpoints endpoints or {@code null} for none
   */
  public Service setEndpoints(java.util.List<Endpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  /**
   * Optional. Metadata for the service. This data can be consumed by service clients.  The entire
   * metadata dictionary may contain up to 2000 characters, spread across all key-value pairs.
   * Metadata that goes beyond any these limits will be rejected.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Optional. Metadata for the service. This data can be consumed by service clients.  The entire
   * metadata dictionary may contain up to 2000 characters, spread across all key-value pairs.
   * Metadata that goes beyond any these limits will be rejected.
   * @param metadata metadata or {@code null} for none
   */
  public Service setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Immutable. The resource name for the service in the format
   * 'projects/locations/namespaces/services'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name for the service in the format
   * 'projects/locations/namespaces/services'.
   * @param name name or {@code null} for none
   */
  public Service setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public Service set(String fieldName, Object value) {
    return (Service) super.set(fieldName, value);
  }

  @Override
  public Service clone() {
    return (Service) super.clone();
  }

}