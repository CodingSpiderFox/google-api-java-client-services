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
 * A single asset.
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
public final class Asset extends com.google.api.client.json.GenericJson {

  /**
   * The asset content. For uploaded assets, the content is the serving path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String content;

  /**
   * Media ID of the uploaded asset. This is a unique identifier for the asset. This ID can be
   * passed to other API calls, e.g. CreateCreative to associate the asset with a creative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long mediaId;

  /**
   * The asset content. For uploaded assets, the content is the serving path.
   * @return value or {@code null} for none
   */
  public java.lang.String getContent() {
    return content;
  }

  /**
   * The asset content. For uploaded assets, the content is the serving path.
   * @param content content or {@code null} for none
   */
  public Asset setContent(java.lang.String content) {
    this.content = content;
    return this;
  }

  /**
   * Media ID of the uploaded asset. This is a unique identifier for the asset. This ID can be
   * passed to other API calls, e.g. CreateCreative to associate the asset with a creative.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMediaId() {
    return mediaId;
  }

  /**
   * Media ID of the uploaded asset. This is a unique identifier for the asset. This ID can be
   * passed to other API calls, e.g. CreateCreative to associate the asset with a creative.
   * @param mediaId mediaId or {@code null} for none
   */
  public Asset setMediaId(java.lang.Long mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  @Override
  public Asset set(String fieldName, Object value) {
    return (Asset) super.set(fieldName, value);
  }

  @Override
  public Asset clone() {
    return (Asset) super.clone();
  }

}