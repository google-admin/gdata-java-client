/* Copyright (c) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.gdata.util;

import com.google.gdata.util.common.xml.XmlWriter;
import com.google.gdata.client.Service;


/** Collection of various namespace URIs. */
public final class Namespaces {

  // Not instantiable
  private Namespaces() {}

  /**
   * Standard XML namespace used for {@code xml:lang}, {@code xml:base},
   * ...
   */
  public static final String xml =
    "http://www.w3.org/XML/1998/namespace";
  
  /** XML writer namespace */
  public static final XmlWriter.Namespace xmlNs =
    new XmlWriter.Namespace("xml", xml);


  /** Atom namespace. */
  public static final String atom =
    "http://www.w3.org/2005/Atom";

  /** Atom XML writer namespace, for assigning {@code atom:} prefix. */
  public static final XmlWriter.Namespace atomNs =
    new XmlWriter.Namespace("atom", atom);


  /**
   * Atom Publishing Protocol (draft) namespace.
   *
   * @deprecated Use {@code getAtomPubNs().getUri()} instead.
   */
  @Deprecated
  public static final String atomPub =
    "http://purl.org/atom/app#";

  /**
   * Atom Publishing Protocol (draft) XML writer namespace.
   *
   * @deprecated Use {@link #getAtomPubNs()} instead.
   */
  @Deprecated
  public static final XmlWriter.Namespace atomPubNs =
    new XmlWriter.Namespace("app", atomPub);

  /**
   * Atom Publishing Protocol (final) namespace.
   *
   * @deprecated Use {@code getAtomPubNs().getUri()} instead.
   */
  @Deprecated
  public static final String atomPubStandard =
    "http://www.w3.org/2007/app";

  /**
   * Atom Publishing Protocol (final) XML writer namespace.
   *
   * @deprecated Use {@link #getAtomPubNs()} instead.
   */
  @Deprecated
  public static final XmlWriter.Namespace atomPubStandardNs =
    new XmlWriter.Namespace("app", atomPubStandard);

  /**
   * Returns the XML writer namespace associated with the Atom Publishing
   * Protocol.
   */
  public static final XmlWriter.Namespace getAtomPubNs() {
    return Service.getVersion().isCompatible(Service.Versions.V1) ?
        atomPubNs :
        atomPubStandardNs;
  }

  /** RSS XML writer namespace. */
  public static final XmlWriter.Namespace rssNs = null;

  /**
   * Amazon OpenSearch/RSS namespace.
   *
   * @deprecated Use {@code getOpenSearchNs().getUri()} instead.
   */
  @Deprecated
  public static final String openSearch =
    "http://a9.com/-/spec/opensearchrss/1.0/";

  /**
   * Amazon OpenSearch/RSS XML writer namespace.
   *
   * @deprecated Use {@link #getOpenSearchNs()} instead.
   */
  @Deprecated
  public static final XmlWriter.Namespace openSearchNs =
    new XmlWriter.Namespace("openSearch", openSearch);

  /**
   * Amazon OpenSearch 1.1 namespace.
   *
   * @deprecated Use {@code getOpenSearchNs().getUri()} instead.
   */
  @Deprecated
  public static final String openSearch1_1 =
    "http://a9.com/-/spec/opensearch/1.1/";

  /**
   * Amazon OpenSearch 1.1 XML writer namespace.
   *
   * @deprecated Use {@link #getOpenSearchNs()} instead.
   */
  @Deprecated
  public static final XmlWriter.Namespace openSearch1_1Ns =
    new XmlWriter.Namespace("openSearch", openSearch1_1);

  /**
   * Returns the XML writer namespace associated with OpenSearch.
   */
  public static final XmlWriter.Namespace getOpenSearchNs() {
    return Service.getVersion().isCompatible(Service.Versions.V1) ?
        openSearchNs :
        openSearch1_1Ns;
  }

  /**
   * Amazon OpenSearch/RSS Description Document namespace.
   *
   * @deprecated Use {@code getOpenSearchDescNs().getUri()} instead.
   */
  @Deprecated
  public static final String openSearchDesc =
    "http://a9.com/-/spec/opensearchdescription/1.0/";

  /**
   * Amazon OpenSearch/RSS Description Document XML writer namespace.
   *
   * @deprecated Use {@link #getOpenSearchDescNs()} instead.
   */
  @Deprecated
  public static final XmlWriter.Namespace openSearchDescNs =
    new XmlWriter.Namespace("openSearchDesc", openSearchDesc);

  /**
   * Amazon OpenSearch 1.1 Description Document namespace.
   *
   * @deprecated Use {@code getOpenSearchDescNs().getUri()} instead.
   */
  @Deprecated
  public static final String openSearchDesc1_1 =
    "http://a9.com/-/spec/opensearchdescription/1.1/";

  /**
   * Amazon OpenSearch 1.1 Description Document XML writer namespace.
   *
   * @deprecated Use {@link #getOpenSearchDescNs()} instead.
   */
  @Deprecated
  public static final XmlWriter.Namespace openSearchDesc1_1Ns =
    new XmlWriter.Namespace("openSearchDesc", openSearchDesc1_1);

  /**
   * Returns the XML writer namespace associated with OpenSearch Description.
   */
  public static final XmlWriter.Namespace getOpenSearchDescNs() {
    return Service.getVersion().isCompatible(Service.Versions.V1) ?
        openSearchDescNs :
        openSearchDesc1_1Ns;
  }

  /** XHTML namespace. */
  public static final String xhtml = "http://www.w3.org/1999/xhtml";

  /** XHTML XML writer namespace. */
  public static final XmlWriter.Namespace xhtmlNs =
    new XmlWriter.Namespace("xh", xhtml);


  /** GData configuration namespace. */
  public static final String gdataConfig =
    "http://schemas.google.com/gdata/config/2005";

  /** GData XML writer namespace. */
  public static final XmlWriter.Namespace gdataConfigNs =
    new XmlWriter.Namespace("gc", gdataConfig);


  /** Google data (GD) namespace */
  public static final String g = "http://schemas.google.com/g/2005";
  public static final String gPrefix = g + "#";
  public static final String gAlias = "gd";

  /** Google data XML writer namespace. */
  public static final XmlWriter.Namespace gNs =
    new XmlWriter.Namespace(gAlias, g);


  /** Google data runtime namespace. */
  public static final String gr = gPrefix + "runtime";

  /** Google data runtime XML writer namespace. */
  public static final XmlWriter.Namespace grNs =
    new XmlWriter.Namespace("gr", gr);


  /** Google data kind scheme. */
  public static final String gKind = gPrefix + "kind";

  /** Google data batch feeds namespace. */
  public static final String batch = "http://schemas.google.com/gdata/batch";
  public static final String batchAlias = "batch";
  public static final XmlWriter.Namespace batchNs =
      new XmlWriter.Namespace(batchAlias, batch);

  // Inflation and deflation methods.
  // These allow short names to be used instead of full URIs.

  /**
   * Inflate a short name into a full URI.
   * Names that already look like URIs are left alone.
   * 
   * @param name the name
   * @param namespace the base namespace for the name
   * @return the full URI
   */
   public static String inflate(String name, String namespace) {
     if (name == null || "".equals(name)) return name;
     if (name.contains("://")) return name;
     return namespace + name;
   }

  /**
   * Inflate a short name into a full GData URI using gPrefix (ending in "#").
   * Names that already look like URIs are left alone.
   * For example, "foo" becomes "http://schemas.google.com/g/2005#foo".
   *
   * @param name the name
   * @return the full URI
   */
   public static String inflate(String name) {
     return inflate(name, gPrefix);
   }

  /**
   * Deflate a full URI into a short name if possible.
   * URIs that belong to a different namespace are left alone.
   *
   * @param uri the full URI
   * @param namespace the namespace name
   * @returns the short name or full URI
   */
   public static String deflate(String uri, String namespace) {
     if (uri == null) return uri;
     if (uri.startsWith(namespace)) return uri.substring(namespace.length());
     return uri;
   }

  /**
   * Deflate a full GData URI using gPrefix (with "#") into a short name if possible.
   * Names that belong to a non-GData namespace are left alone.
   * For example, "http://schemas.google.com/g/2005#foo" becomes "foo".
   *
   * @param uri the full URI
   * @return the short name or full URI
   */
   public static String deflate(String uri) {
     return deflate(uri, gPrefix);
   }

}
