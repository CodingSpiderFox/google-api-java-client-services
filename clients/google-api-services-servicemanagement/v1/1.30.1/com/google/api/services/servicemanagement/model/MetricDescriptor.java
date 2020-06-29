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

package com.google.api.services.servicemanagement.model;

/**
 * Defines a metric type and its schema. Once a metric descriptor is created, deleting or altering
 * it stops data collection and makes the metric type's existing data unusable.
 *
 * The following are specific rules for service defined Monitoring metric descriptors:
 *
 * * `type`, `metric_kind`, `value_type`, `description`, `display_name`,   `launch_stage` fields are
 * all required. The `unit` field must be specified   if the `value_type` is any of DOUBLE, INT64,
 * DISTRIBUTION. * Maximum of default 500 metric descriptors per service is allowed. * Maximum of
 * default 10 labels per metric descriptor is allowed.
 *
 * The default maximum limit can be overridden. Please follow
 * https://cloud.google.com/monitoring/quotas
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MetricDescriptor extends com.google.api.client.json.GenericJson {

  /**
   * A detailed description of the metric, which can be used in documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * A concise name for the metric, which can be displayed in user interfaces. Use sentence case
   * without an ending period, for example "Request count". This field is optional but it is
   * recommended to be set for any metrics associated with user-visible concepts, such as Quota.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The set of labels that can be used to describe a specific instance of this metric type.
   *
   * The label key name must follow:
   *
   * * Only upper and lower-case letters, digits and underscores (_) are   allowed. * Label name
   * must start with a letter or digit. * The maximum length of a label name is 100 characters.
   *
   * For example, the `appengine.googleapis.com/http/server/response_latencies` metric type has a
   * label for the HTTP response code, `response_code`, so you can look at latencies for successful
   * responses or just for responses that failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LabelDescriptor> labels;

  static {
    // hack to force ProGuard to consider LabelDescriptor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LabelDescriptor.class);
  }

  /**
   * Optional. The launch stage of the metric definition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String launchStage;

  /**
   * Optional. Metadata which can be used to guide usage of the metric.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MetricDescriptorMetadata metadata;

  /**
   * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of
   * `metric_kind` and `value_type` might not be supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metricKind;

  /**
   * Read-only. If present, then a time series, which is identified partially by a metric type and a
   * MonitoredResourceDescriptor, that is associated with this metric type can only be associated
   * with one of the monitored resource types listed here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> monitoredResourceTypes;

  /**
   * The resource name of the metric descriptor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The metric type, including its DNS name prefix. The type is not URL-encoded.
   *
   * All service defined metrics must be prefixed with the service name, in the format of `{service
   * name}/{relative metric name}`, such as `cloudsql.googleapis.com/database/cpu/utilization`. The
   * relative metric name must follow:
   *
   * * Only upper and lower-case letters, digits, '/' and underscores '_' are   allowed. * The
   * maximum number of characters allowed for the relative_metric_name is   100.
   *
   * All user-defined metric types have the DNS name `custom.googleapis.com`,
   * `external.googleapis.com`, or `logging.googleapis.com/user/`.
   *
   * Metric types should use a natural hierarchical grouping. For example:
   *
   *     "custom.googleapis.com/invoice/paid/amount"     "external.googleapis.com/prometheus/up"
   * "appengine.googleapis.com/http/server/response_latencies"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The units in which the metric value is reported. It is only applicable if the `value_type` is
   * `INT64`, `DOUBLE`, or `DISTRIBUTION`. The `unit` defines the representation of the stored
   * metric values.
   *
   * Different systems may scale the values to be more easily displayed (so a value of `0.02KBy`
   * _might_ be displayed as `20By`, and a value of `3523KBy` _might_ be displayed as `3.5MBy`).
   * However, if the `unit` is `KBy`, then the value of the metric is always in thousands of bytes,
   * no matter how it may be displayed..
   *
   * If you want a custom metric to record the exact number of CPU-seconds used by a job, you can
   * create an `INT64 CUMULATIVE` metric whose `unit` is `s{CPU}` (or equivalently `1s{CPU}` or just
   * `s`). If the job uses 12,005 CPU-seconds, then the value is written as `12005`.
   *
   * Alternatively, if you want a custom metric to record data in a more granular way, you can
   * create a `DOUBLE CUMULATIVE` metric whose `unit` is `ks{CPU}`, and then write the value
   * `12.005` (which is `12005/1000`), or use `Kis{CPU}` and write `11.723` (which is `12005/1024`).
   *
   * The supported units are a subset of [The Unified Code for Units of
   * Measure](http://unitsofmeasure.org/ucum.html) standard:
   *
   * **Basic units (UNIT)**
   *
   * * `bit`   bit * `By`    byte * `s`     second * `min`   minute * `h`     hour * `d`     day *
   * `1`     dimensionless
   *
   * **Prefixes (PREFIX)**
   *
   * * `k`     kilo    (10^3) * `M`     mega    (10^6) * `G`     giga    (10^9) * `T`     tera
   * (10^12) * `P`     peta    (10^15) * `E`     exa     (10^18) * `Z`     zetta   (10^21) * `Y`
   * yotta   (10^24)
   *
   * * `m`     milli   (10^-3) * `u`     micro   (10^-6) * `n`     nano    (10^-9) * `p`     pico
   * (10^-12) * `f`     femto   (10^-15) * `a`     atto    (10^-18) * `z`     zepto   (10^-21) * `y`
   * yocto   (10^-24)
   *
   * * `Ki`    kibi    (2^10) * `Mi`    mebi    (2^20) * `Gi`    gibi    (2^30) * `Ti`    tebi
   * (2^40) * `Pi`    pebi    (2^50)
   *
   * **Grammar**
   *
   * The grammar also includes these connectors:
   *
   * * `/`    division or ratio (as an infix operator). For examples,          `kBy/{email}` or
   * `MiBy/10ms` (although you should almost never          have `/s` in a metric `unit`; rates
   * should always be computed at          query time from the underlying cumulative or delta
   * value). * `.`    multiplication or composition (as an infix operator). For          examples,
   * `GBy.d` or `k{watt}.h`.
   *
   * The grammar for a unit is as follows:
   *
   *     Expression = Component { "." Component } { "/" Component } ;
   *
   *     Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]               | Annotation
   * | "1"               ;
   *
   *     Annotation = "{" NAME "}" ;
   *
   * Notes:
   *
   * * `Annotation` is just a comment if it follows a `UNIT`. If the annotation    is used alone,
   * then the unit is equivalent to `1`. For examples,    `{request}/s == 1/s`, `By{transmitted}/s
   * == By/s`. * `NAME` is a sequence of non-blank printable ASCII characters not    containing `{`
   * or `}`. * `1` represents a unitary [dimensionless
   * unit](https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such    as in `1/s`. It is
   * typically used when none of the basic units are    appropriate. For example, "new users per
   * day" can be represented as    `1/d` or `{new-users}/d` (and a metric value `5` would mean "5
   * new    users). Alternatively, "thousands of page views per day" would be    represented as
   * `1000/d` or `k1/d` or `k{page_views}/d` (and a metric    value of `5.3` would mean "5300 page
   * views per day"). * `%` represents dimensionless value of 1/100, and annotates values giving
   * a percentage (so the metric values are typically in the range of 0..100,    and a metric value
   * `3` means "3 percent"). * `10^2.%` indicates a metric contains a ratio, typically in the range
   * 0..1, that will be multiplied by 100 and displayed as a percentage    (so a metric value `0.03`
   * means "3 percent").
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Whether the measurement is an integer, a floating-point number, etc. Some combinations of
   * `metric_kind` and `value_type` might not be supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String valueType;

  /**
   * A detailed description of the metric, which can be used in documentation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A detailed description of the metric, which can be used in documentation.
   * @param description description or {@code null} for none
   */
  public MetricDescriptor setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * A concise name for the metric, which can be displayed in user interfaces. Use sentence case
   * without an ending period, for example "Request count". This field is optional but it is
   * recommended to be set for any metrics associated with user-visible concepts, such as Quota.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A concise name for the metric, which can be displayed in user interfaces. Use sentence case
   * without an ending period, for example "Request count". This field is optional but it is
   * recommended to be set for any metrics associated with user-visible concepts, such as Quota.
   * @param displayName displayName or {@code null} for none
   */
  public MetricDescriptor setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The set of labels that can be used to describe a specific instance of this metric type.
   *
   * The label key name must follow:
   *
   * * Only upper and lower-case letters, digits and underscores (_) are   allowed. * Label name
   * must start with a letter or digit. * The maximum length of a label name is 100 characters.
   *
   * For example, the `appengine.googleapis.com/http/server/response_latencies` metric type has a
   * label for the HTTP response code, `response_code`, so you can look at latencies for successful
   * responses or just for responses that failed.
   * @return value or {@code null} for none
   */
  public java.util.List<LabelDescriptor> getLabels() {
    return labels;
  }

  /**
   * The set of labels that can be used to describe a specific instance of this metric type.
   *
   * The label key name must follow:
   *
   * * Only upper and lower-case letters, digits and underscores (_) are   allowed. * Label name
   * must start with a letter or digit. * The maximum length of a label name is 100 characters.
   *
   * For example, the `appengine.googleapis.com/http/server/response_latencies` metric type has a
   * label for the HTTP response code, `response_code`, so you can look at latencies for successful
   * responses or just for responses that failed.
   * @param labels labels or {@code null} for none
   */
  public MetricDescriptor setLabels(java.util.List<LabelDescriptor> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. The launch stage of the metric definition.
   * @return value or {@code null} for none
   */
  public java.lang.String getLaunchStage() {
    return launchStage;
  }

  /**
   * Optional. The launch stage of the metric definition.
   * @param launchStage launchStage or {@code null} for none
   */
  public MetricDescriptor setLaunchStage(java.lang.String launchStage) {
    this.launchStage = launchStage;
    return this;
  }

  /**
   * Optional. Metadata which can be used to guide usage of the metric.
   * @return value or {@code null} for none
   */
  public MetricDescriptorMetadata getMetadata() {
    return metadata;
  }

  /**
   * Optional. Metadata which can be used to guide usage of the metric.
   * @param metadata metadata or {@code null} for none
   */
  public MetricDescriptor setMetadata(MetricDescriptorMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of
   * `metric_kind` and `value_type` might not be supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetricKind() {
    return metricKind;
  }

  /**
   * Whether the metric records instantaneous values, changes to a value, etc. Some combinations of
   * `metric_kind` and `value_type` might not be supported.
   * @param metricKind metricKind or {@code null} for none
   */
  public MetricDescriptor setMetricKind(java.lang.String metricKind) {
    this.metricKind = metricKind;
    return this;
  }

  /**
   * Read-only. If present, then a time series, which is identified partially by a metric type and a
   * MonitoredResourceDescriptor, that is associated with this metric type can only be associated
   * with one of the monitored resource types listed here.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMonitoredResourceTypes() {
    return monitoredResourceTypes;
  }

  /**
   * Read-only. If present, then a time series, which is identified partially by a metric type and a
   * MonitoredResourceDescriptor, that is associated with this metric type can only be associated
   * with one of the monitored resource types listed here.
   * @param monitoredResourceTypes monitoredResourceTypes or {@code null} for none
   */
  public MetricDescriptor setMonitoredResourceTypes(java.util.List<java.lang.String> monitoredResourceTypes) {
    this.monitoredResourceTypes = monitoredResourceTypes;
    return this;
  }

  /**
   * The resource name of the metric descriptor.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the metric descriptor.
   * @param name name or {@code null} for none
   */
  public MetricDescriptor setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The metric type, including its DNS name prefix. The type is not URL-encoded.
   *
   * All service defined metrics must be prefixed with the service name, in the format of `{service
   * name}/{relative metric name}`, such as `cloudsql.googleapis.com/database/cpu/utilization`. The
   * relative metric name must follow:
   *
   * * Only upper and lower-case letters, digits, '/' and underscores '_' are   allowed. * The
   * maximum number of characters allowed for the relative_metric_name is   100.
   *
   * All user-defined metric types have the DNS name `custom.googleapis.com`,
   * `external.googleapis.com`, or `logging.googleapis.com/user/`.
   *
   * Metric types should use a natural hierarchical grouping. For example:
   *
   *     "custom.googleapis.com/invoice/paid/amount"     "external.googleapis.com/prometheus/up"
   * "appengine.googleapis.com/http/server/response_latencies"
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The metric type, including its DNS name prefix. The type is not URL-encoded.
   *
   * All service defined metrics must be prefixed with the service name, in the format of `{service
   * name}/{relative metric name}`, such as `cloudsql.googleapis.com/database/cpu/utilization`. The
   * relative metric name must follow:
   *
   * * Only upper and lower-case letters, digits, '/' and underscores '_' are   allowed. * The
   * maximum number of characters allowed for the relative_metric_name is   100.
   *
   * All user-defined metric types have the DNS name `custom.googleapis.com`,
   * `external.googleapis.com`, or `logging.googleapis.com/user/`.
   *
   * Metric types should use a natural hierarchical grouping. For example:
   *
   *     "custom.googleapis.com/invoice/paid/amount"     "external.googleapis.com/prometheus/up"
   * "appengine.googleapis.com/http/server/response_latencies"
   * @param type type or {@code null} for none
   */
  public MetricDescriptor setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The units in which the metric value is reported. It is only applicable if the `value_type` is
   * `INT64`, `DOUBLE`, or `DISTRIBUTION`. The `unit` defines the representation of the stored
   * metric values.
   *
   * Different systems may scale the values to be more easily displayed (so a value of `0.02KBy`
   * _might_ be displayed as `20By`, and a value of `3523KBy` _might_ be displayed as `3.5MBy`).
   * However, if the `unit` is `KBy`, then the value of the metric is always in thousands of bytes,
   * no matter how it may be displayed..
   *
   * If you want a custom metric to record the exact number of CPU-seconds used by a job, you can
   * create an `INT64 CUMULATIVE` metric whose `unit` is `s{CPU}` (or equivalently `1s{CPU}` or just
   * `s`). If the job uses 12,005 CPU-seconds, then the value is written as `12005`.
   *
   * Alternatively, if you want a custom metric to record data in a more granular way, you can
   * create a `DOUBLE CUMULATIVE` metric whose `unit` is `ks{CPU}`, and then write the value
   * `12.005` (which is `12005/1000`), or use `Kis{CPU}` and write `11.723` (which is `12005/1024`).
   *
   * The supported units are a subset of [The Unified Code for Units of
   * Measure](http://unitsofmeasure.org/ucum.html) standard:
   *
   * **Basic units (UNIT)**
   *
   * * `bit`   bit * `By`    byte * `s`     second * `min`   minute * `h`     hour * `d`     day *
   * `1`     dimensionless
   *
   * **Prefixes (PREFIX)**
   *
   * * `k`     kilo    (10^3) * `M`     mega    (10^6) * `G`     giga    (10^9) * `T`     tera
   * (10^12) * `P`     peta    (10^15) * `E`     exa     (10^18) * `Z`     zetta   (10^21) * `Y`
   * yotta   (10^24)
   *
   * * `m`     milli   (10^-3) * `u`     micro   (10^-6) * `n`     nano    (10^-9) * `p`     pico
   * (10^-12) * `f`     femto   (10^-15) * `a`     atto    (10^-18) * `z`     zepto   (10^-21) * `y`
   * yocto   (10^-24)
   *
   * * `Ki`    kibi    (2^10) * `Mi`    mebi    (2^20) * `Gi`    gibi    (2^30) * `Ti`    tebi
   * (2^40) * `Pi`    pebi    (2^50)
   *
   * **Grammar**
   *
   * The grammar also includes these connectors:
   *
   * * `/`    division or ratio (as an infix operator). For examples,          `kBy/{email}` or
   * `MiBy/10ms` (although you should almost never          have `/s` in a metric `unit`; rates
   * should always be computed at          query time from the underlying cumulative or delta
   * value). * `.`    multiplication or composition (as an infix operator). For          examples,
   * `GBy.d` or `k{watt}.h`.
   *
   * The grammar for a unit is as follows:
   *
   *     Expression = Component { "." Component } { "/" Component } ;
   *
   *     Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]               | Annotation
   * | "1"               ;
   *
   *     Annotation = "{" NAME "}" ;
   *
   * Notes:
   *
   * * `Annotation` is just a comment if it follows a `UNIT`. If the annotation    is used alone,
   * then the unit is equivalent to `1`. For examples,    `{request}/s == 1/s`, `By{transmitted}/s
   * == By/s`. * `NAME` is a sequence of non-blank printable ASCII characters not    containing `{`
   * or `}`. * `1` represents a unitary [dimensionless
   * unit](https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such    as in `1/s`. It is
   * typically used when none of the basic units are    appropriate. For example, "new users per
   * day" can be represented as    `1/d` or `{new-users}/d` (and a metric value `5` would mean "5
   * new    users). Alternatively, "thousands of page views per day" would be    represented as
   * `1000/d` or `k1/d` or `k{page_views}/d` (and a metric    value of `5.3` would mean "5300 page
   * views per day"). * `%` represents dimensionless value of 1/100, and annotates values giving
   * a percentage (so the metric values are typically in the range of 0..100,    and a metric value
   * `3` means "3 percent"). * `10^2.%` indicates a metric contains a ratio, typically in the range
   * 0..1, that will be multiplied by 100 and displayed as a percentage    (so a metric value `0.03`
   * means "3 percent").
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * The units in which the metric value is reported. It is only applicable if the `value_type` is
   * `INT64`, `DOUBLE`, or `DISTRIBUTION`. The `unit` defines the representation of the stored
   * metric values.
   *
   * Different systems may scale the values to be more easily displayed (so a value of `0.02KBy`
   * _might_ be displayed as `20By`, and a value of `3523KBy` _might_ be displayed as `3.5MBy`).
   * However, if the `unit` is `KBy`, then the value of the metric is always in thousands of bytes,
   * no matter how it may be displayed..
   *
   * If you want a custom metric to record the exact number of CPU-seconds used by a job, you can
   * create an `INT64 CUMULATIVE` metric whose `unit` is `s{CPU}` (or equivalently `1s{CPU}` or just
   * `s`). If the job uses 12,005 CPU-seconds, then the value is written as `12005`.
   *
   * Alternatively, if you want a custom metric to record data in a more granular way, you can
   * create a `DOUBLE CUMULATIVE` metric whose `unit` is `ks{CPU}`, and then write the value
   * `12.005` (which is `12005/1000`), or use `Kis{CPU}` and write `11.723` (which is `12005/1024`).
   *
   * The supported units are a subset of [The Unified Code for Units of
   * Measure](http://unitsofmeasure.org/ucum.html) standard:
   *
   * **Basic units (UNIT)**
   *
   * * `bit`   bit * `By`    byte * `s`     second * `min`   minute * `h`     hour * `d`     day *
   * `1`     dimensionless
   *
   * **Prefixes (PREFIX)**
   *
   * * `k`     kilo    (10^3) * `M`     mega    (10^6) * `G`     giga    (10^9) * `T`     tera
   * (10^12) * `P`     peta    (10^15) * `E`     exa     (10^18) * `Z`     zetta   (10^21) * `Y`
   * yotta   (10^24)
   *
   * * `m`     milli   (10^-3) * `u`     micro   (10^-6) * `n`     nano    (10^-9) * `p`     pico
   * (10^-12) * `f`     femto   (10^-15) * `a`     atto    (10^-18) * `z`     zepto   (10^-21) * `y`
   * yocto   (10^-24)
   *
   * * `Ki`    kibi    (2^10) * `Mi`    mebi    (2^20) * `Gi`    gibi    (2^30) * `Ti`    tebi
   * (2^40) * `Pi`    pebi    (2^50)
   *
   * **Grammar**
   *
   * The grammar also includes these connectors:
   *
   * * `/`    division or ratio (as an infix operator). For examples,          `kBy/{email}` or
   * `MiBy/10ms` (although you should almost never          have `/s` in a metric `unit`; rates
   * should always be computed at          query time from the underlying cumulative or delta
   * value). * `.`    multiplication or composition (as an infix operator). For          examples,
   * `GBy.d` or `k{watt}.h`.
   *
   * The grammar for a unit is as follows:
   *
   *     Expression = Component { "." Component } { "/" Component } ;
   *
   *     Component = ( [ PREFIX ] UNIT | "%" ) [ Annotation ]               | Annotation
   * | "1"               ;
   *
   *     Annotation = "{" NAME "}" ;
   *
   * Notes:
   *
   * * `Annotation` is just a comment if it follows a `UNIT`. If the annotation    is used alone,
   * then the unit is equivalent to `1`. For examples,    `{request}/s == 1/s`, `By{transmitted}/s
   * == By/s`. * `NAME` is a sequence of non-blank printable ASCII characters not    containing `{`
   * or `}`. * `1` represents a unitary [dimensionless
   * unit](https://en.wikipedia.org/wiki/Dimensionless_quantity) of 1, such    as in `1/s`. It is
   * typically used when none of the basic units are    appropriate. For example, "new users per
   * day" can be represented as    `1/d` or `{new-users}/d` (and a metric value `5` would mean "5
   * new    users). Alternatively, "thousands of page views per day" would be    represented as
   * `1000/d` or `k1/d` or `k{page_views}/d` (and a metric    value of `5.3` would mean "5300 page
   * views per day"). * `%` represents dimensionless value of 1/100, and annotates values giving
   * a percentage (so the metric values are typically in the range of 0..100,    and a metric value
   * `3` means "3 percent"). * `10^2.%` indicates a metric contains a ratio, typically in the range
   * 0..1, that will be multiplied by 100 and displayed as a percentage    (so a metric value `0.03`
   * means "3 percent").
   * @param unit unit or {@code null} for none
   */
  public MetricDescriptor setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Whether the measurement is an integer, a floating-point number, etc. Some combinations of
   * `metric_kind` and `value_type` might not be supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getValueType() {
    return valueType;
  }

  /**
   * Whether the measurement is an integer, a floating-point number, etc. Some combinations of
   * `metric_kind` and `value_type` might not be supported.
   * @param valueType valueType or {@code null} for none
   */
  public MetricDescriptor setValueType(java.lang.String valueType) {
    this.valueType = valueType;
    return this;
  }

  @Override
  public MetricDescriptor set(String fieldName, Object value) {
    return (MetricDescriptor) super.set(fieldName, value);
  }

  @Override
  public MetricDescriptor clone() {
    return (MetricDescriptor) super.clone();
  }

}
