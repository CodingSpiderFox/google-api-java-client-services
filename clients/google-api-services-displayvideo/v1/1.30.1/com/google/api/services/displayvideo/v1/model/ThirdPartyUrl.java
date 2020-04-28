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

package com.google.api.services.displayvideo.v1.model;

/**
 * Tracking URLs from third parties to track interactions with an audio or a video creative.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ThirdPartyUrl extends com.google.api.client.json.GenericJson {

  /**
   * The type of interaction needs to be tracked by the tracking URL
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Tracking URL used to track the interaction.
   *
   * Provide a URL with optional path or query string, beginning with `https:`. For example,
   * https://www.example.com/path
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The type of interaction needs to be tracked by the tracking URL
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of interaction needs to be tracked by the tracking URL
   * @param type type or {@code null} for none
   */
  public ThirdPartyUrl setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Tracking URL used to track the interaction.
   *
   * Provide a URL with optional path or query string, beginning with `https:`. For example,
   * https://www.example.com/path
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * Tracking URL used to track the interaction.
   *
   * Provide a URL with optional path or query string, beginning with `https:`. For example,
   * https://www.example.com/path
   * @param url url or {@code null} for none
   */
  public ThirdPartyUrl setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ThirdPartyUrl set(String fieldName, Object value) {
    return (ThirdPartyUrl) super.set(fieldName, value);
  }

  @Override
  public ThirdPartyUrl clone() {
    return (ThirdPartyUrl) super.clone();
  }

}