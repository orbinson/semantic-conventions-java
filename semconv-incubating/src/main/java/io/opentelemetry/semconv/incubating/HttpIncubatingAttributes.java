/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.longKey;
import static io.opentelemetry.api.common.AttributeKey.stringKey;
import static io.opentelemetry.semconv.AttributeKeyTemplate.stringArrayKeyTemplate;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.semconv.AttributeKeyTemplate;
import java.util.List;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class HttpIncubatingAttributes {

  /** Deprecated, use {@code http.request.method} instead. */
  public static final AttributeKey<String> HTTP_METHOD = stringKey("http.method");

  /**
   * The size of the request payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_REQUEST_BODY_SIZE = longKey("http.request.body.size");

  /**
   * HTTP request headers, {@code <key>} being the normalized HTTP Header name (lowercase), the
   * value being the header values.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD require an explicit configuration of which headers are to be
   *       captured. Including all request headers can be a security risk - explicit configuration
   *       helps avoid leaking sensitive information. The {@code User-Agent} header is already
   *       captured in the {@code user_agent.original} attribute. Users MAY explicitly configure
   *       instrumentations to capture them even though it is not recommended. The attribute value
   *       MUST consist of either multiple header values as an array of strings or a single-item
   *       array containing a possibly comma-concatenated string, depending on the way the HTTP
   *       library provides access to headers.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_HEADER} attribute.
   */
  @Deprecated
  public static final AttributeKeyTemplate<List<String>> HTTP_REQUEST_HEADER =
      stringArrayKeyTemplate("http.request.header");

  /**
   * HTTP request method.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>HTTP request method value SHOULD be &quot;known&quot; to the instrumentation. By default,
   *       this convention defines &quot;known&quot; methods as the ones listed in <a
   *       href="https://www.rfc-editor.org/rfc/rfc9110.html#name-methods">RFC9110</a> and the PATCH
   *       method defined in <a href="https://www.rfc-editor.org/rfc/rfc5789.html">RFC5789</a>.
   *   <li>If the HTTP request method is not known to instrumentation, it MUST set the {@code
   *       http.request.method} attribute to {@code _OTHER}.
   *   <li>If the HTTP instrumentation could end up converting valid HTTP request methods to {@code
   *       _OTHER}, then it MUST provide a way to override the list of known HTTP methods. If this
   *       override is done via environment variable, then the environment variable MUST be named
   *       OTEL_INSTRUMENTATION_HTTP_KNOWN_METHODS and support a comma-separated list of
   *       case-sensitive known HTTP methods (this list MUST be a full override of the default known
   *       method, it is not a list of known methods in addition to the defaults).
   *   <li>HTTP method names are case-sensitive and {@code http.request.method} attribute value MUST
   *       match a known HTTP method name exactly. Instrumentations for specific web frameworks that
   *       consider HTTP methods to be case insensitive, SHOULD populate a canonical equivalent.
   *       Tracing instrumentations that do so, MUST also set {@code http.request.method_original}
   *       to the original value.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_METHOD} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_REQUEST_METHOD = stringKey("http.request.method");

  /**
   * Original HTTP method sent by the client in the request line.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_METHOD_ORIGINAL} attribute.
   */
  @Deprecated
  public static final AttributeKey<String> HTTP_REQUEST_METHOD_ORIGINAL =
      stringKey("http.request.method_original");

  /**
   * The ordinal number of request resending attempt (for any reason, including redirects).
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The resend count SHOULD be updated each time an HTTP request gets resent by the client,
   *       regardless of what was the cause of the resending (e.g. redirection, authorization
   *       failure, 503 Server Unavailable, network issues, or any other).
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_REQUEST_RESEND_COUNT} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_REQUEST_RESEND_COUNT =
      longKey("http.request.resend_count");

  /** Deprecated, use {@code http.request.header.content-length} instead. */
  public static final AttributeKey<Long> HTTP_REQUEST_CONTENT_LENGTH =
      longKey("http.request_content_length");

  /**
   * The size of the response payload body in bytes. This is the number of bytes transferred
   * excluding headers and is often, but not always, present as the <a
   * href="https://www.rfc-editor.org/rfc/rfc9110.html#field.content-length">Content-Length</a>
   * header. For requests using transport encoding, this should be the compressed size.
   */
  public static final AttributeKey<Long> HTTP_RESPONSE_BODY_SIZE =
      longKey("http.response.body.size");

  /**
   * HTTP response headers, {@code <key>} being the normalized HTTP Header name (lowercase), the
   * value being the header values.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>Instrumentations SHOULD require an explicit configuration of which headers are to be
   *       captured. Including all response headers can be a security risk - explicit configuration
   *       helps avoid leaking sensitive information. Users MAY explicitly configure
   *       instrumentations to capture them even though it is not recommended. The attribute value
   *       MUST consist of either multiple header values as an array of strings or a single-item
   *       array containing a possibly comma-concatenated string, depending on the way the HTTP
   *       library provides access to headers.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_RESPONSE_HEADER} attribute.
   */
  @Deprecated
  public static final AttributeKeyTemplate<List<String>> HTTP_RESPONSE_HEADER =
      stringArrayKeyTemplate("http.response.header");

  /**
   * <a href="https://tools.ietf.org/html/rfc7231#section-6">HTTP response status code</a>.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_RESPONSE_STATUS_CODE} attribute.
   */
  @Deprecated
  public static final AttributeKey<Long> HTTP_RESPONSE_STATUS_CODE =
      longKey("http.response.status_code");

  /** Deprecated, use {@code http.response.header.content-length} instead. */
  public static final AttributeKey<Long> HTTP_RESPONSE_CONTENT_LENGTH =
      longKey("http.response_content_length");

  /**
   * The matched route, that is, the path template in the format used by the respective server
   * framework.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>MUST NOT be populated when this is not supported by the HTTP server framework as the
   *       route attribute should have low-cardinality and the URI path can NOT substitute it.
   *       SHOULD include the <a href="/docs/http/http-spans.md#http-server-definitions">application
   *       root</a> if there is one.
   * </ul>
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes#HTTP_ROUTE} attribute.
   */
  @Deprecated public static final AttributeKey<String> HTTP_ROUTE = stringKey("http.route");

  /** Deprecated, use {@code url.scheme} instead. */
  public static final AttributeKey<String> HTTP_SCHEME = stringKey("http.scheme");

  /** Deprecated, use {@code http.response.status_code} instead. */
  public static final AttributeKey<Long> HTTP_STATUS_CODE = longKey("http.status_code");

  /** Deprecated, use {@code url.path} and {@code url.query} instead. */
  public static final AttributeKey<String> HTTP_TARGET = stringKey("http.target");

  /** Deprecated, use {@code url.full} instead. */
  public static final AttributeKey<String> HTTP_URL = stringKey("http.url");

  // Enum definitions
  /**
   * Values for {@link #HTTP_REQUEST_METHOD}.
   *
   * @deprecated deprecated in favor of stable {@link
   *     io.opentelemetry.semconv.HttpAttributes.HttpRequestMethodValues} attribute.
   */
  @Deprecated
  public static final class HttpRequestMethodValues {
    /** CONNECT method. */
    public static final String CONNECT = "CONNECT";

    /** DELETE method. */
    public static final String DELETE = "DELETE";

    /** GET method. */
    public static final String GET = "GET";

    /** HEAD method. */
    public static final String HEAD = "HEAD";

    /** OPTIONS method. */
    public static final String OPTIONS = "OPTIONS";

    /** PATCH method. */
    public static final String PATCH = "PATCH";

    /** POST method. */
    public static final String POST = "POST";

    /** PUT method. */
    public static final String PUT = "PUT";

    /** TRACE method. */
    public static final String TRACE = "TRACE";

    /** Any HTTP method that the instrumentation has no prior knowledge of. */
    public static final String OTHER = "_OTHER";

    private HttpRequestMethodValues() {}
  }

  private HttpIncubatingAttributes() {}
}