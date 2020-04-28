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
 * Represents information about the transcoded audio or video file.
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
public final class Transcode extends com.google.api.client.json.GenericJson {

  /**
   * The bit rate for the audio stream of the transcoded video, or the bit rate for the transcoded
   * audio, in kilobits per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long audioBitRateKbps;

  /**
   * The sample rate for the audio stream of the transcoded video, or the sample rate for the
   * transcoded audio, in hertz.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long audioSampleRateHz;

  /**
   * The transcoding bit rate of the transcoded video, in kilobits per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bitRateKbps;

  /**
   * The dimensions of the transcoded video.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Dimensions dimensions;

  /**
   * The size of the transcoded file, in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long fileSizeBytes;

  /**
   * The frame rate of the transcoded video, in frames per second.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float frameRate;

  /**
   * The MIME type of the transcoded file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimeType;

  /**
   * The name of the transcoded file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Indicates if the transcoding was successful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean transcoded;

  /**
   * The bit rate for the audio stream of the transcoded video, or the bit rate for the transcoded
   * audio, in kilobits per second.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAudioBitRateKbps() {
    return audioBitRateKbps;
  }

  /**
   * The bit rate for the audio stream of the transcoded video, or the bit rate for the transcoded
   * audio, in kilobits per second.
   * @param audioBitRateKbps audioBitRateKbps or {@code null} for none
   */
  public Transcode setAudioBitRateKbps(java.lang.Long audioBitRateKbps) {
    this.audioBitRateKbps = audioBitRateKbps;
    return this;
  }

  /**
   * The sample rate for the audio stream of the transcoded video, or the sample rate for the
   * transcoded audio, in hertz.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAudioSampleRateHz() {
    return audioSampleRateHz;
  }

  /**
   * The sample rate for the audio stream of the transcoded video, or the sample rate for the
   * transcoded audio, in hertz.
   * @param audioSampleRateHz audioSampleRateHz or {@code null} for none
   */
  public Transcode setAudioSampleRateHz(java.lang.Long audioSampleRateHz) {
    this.audioSampleRateHz = audioSampleRateHz;
    return this;
  }

  /**
   * The transcoding bit rate of the transcoded video, in kilobits per second.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBitRateKbps() {
    return bitRateKbps;
  }

  /**
   * The transcoding bit rate of the transcoded video, in kilobits per second.
   * @param bitRateKbps bitRateKbps or {@code null} for none
   */
  public Transcode setBitRateKbps(java.lang.Long bitRateKbps) {
    this.bitRateKbps = bitRateKbps;
    return this;
  }

  /**
   * The dimensions of the transcoded video.
   * @return value or {@code null} for none
   */
  public Dimensions getDimensions() {
    return dimensions;
  }

  /**
   * The dimensions of the transcoded video.
   * @param dimensions dimensions or {@code null} for none
   */
  public Transcode setDimensions(Dimensions dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * The size of the transcoded file, in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFileSizeBytes() {
    return fileSizeBytes;
  }

  /**
   * The size of the transcoded file, in bytes.
   * @param fileSizeBytes fileSizeBytes or {@code null} for none
   */
  public Transcode setFileSizeBytes(java.lang.Long fileSizeBytes) {
    this.fileSizeBytes = fileSizeBytes;
    return this;
  }

  /**
   * The frame rate of the transcoded video, in frames per second.
   * @return value or {@code null} for none
   */
  public java.lang.Float getFrameRate() {
    return frameRate;
  }

  /**
   * The frame rate of the transcoded video, in frames per second.
   * @param frameRate frameRate or {@code null} for none
   */
  public Transcode setFrameRate(java.lang.Float frameRate) {
    this.frameRate = frameRate;
    return this;
  }

  /**
   * The MIME type of the transcoded file.
   * @return value or {@code null} for none
   */
  public java.lang.String getMimeType() {
    return mimeType;
  }

  /**
   * The MIME type of the transcoded file.
   * @param mimeType mimeType or {@code null} for none
   */
  public Transcode setMimeType(java.lang.String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

  /**
   * The name of the transcoded file.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the transcoded file.
   * @param name name or {@code null} for none
   */
  public Transcode setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Indicates if the transcoding was successful.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTranscoded() {
    return transcoded;
  }

  /**
   * Indicates if the transcoding was successful.
   * @param transcoded transcoded or {@code null} for none
   */
  public Transcode setTranscoded(java.lang.Boolean transcoded) {
    this.transcoded = transcoded;
    return this;
  }

  @Override
  public Transcode set(String fieldName, Object value) {
    return (Transcode) super.set(fieldName, value);
  }

  @Override
  public Transcode clone() {
    return (Transcode) super.clone();
  }

}