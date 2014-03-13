/**
 * Copyright Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.familysearch.platform.ct;

import org.codehaus.enunciate.qname.XmlQNameEnum;
import org.codehaus.enunciate.qname.XmlQNameEnumValue;
import org.codehaus.enunciate.qname.XmlUnknownQNameEnumValue;
import org.gedcomx.common.URI;

/**
 * @deprecated replaced by {@link MatchCollection}
 * Identifiers for a system that might contain match results.
 */
@XmlQNameEnum (
  base = XmlQNameEnum.BaseType.URI,
  namespace = "https://familysearch.org/platform/collections/"
)
@Deprecated
public enum MatchSystem {

  /**
   * The FamilySearch Family Tree.
   * @deprecated replaced by {@link MatchCollection#tree}
   */
  @Deprecated tree,

  /**
   * The FamilySearch Record Set.
   * @deprecated replaced by {@link MatchCollection#records}
   */
  @Deprecated records,

  /**
   * The FamilySearch User-Submitted Trees.
   * @deprecated replaced by {@link MatchCollection#lls}
   */
  @XmlQNameEnumValue ( localPart = "trees" )
  @Deprecated lls,

  /**
   * The FamilySearch Temple System.
   * @deprecated replaced by {@link MatchCollection#tss}
   */
  @XmlQNameEnumValue ( localPart = "temple" )
  @Deprecated tss,

  /**
   * @deprecated replaced by {@link MatchCollection#OTHER}
   */
  @XmlUnknownQNameEnumValue
  @Deprecated OTHER;

  /**
   * Return the QName value for this enum.
   * @deprecated replaced by {@link MatchCollection#toQNameURI()}
   * @return The QName value for this enum.
   */
  @Deprecated public URI toQNameURI() {
    return URI.create(org.codehaus.enunciate.XmlQNameEnumUtil.toURIValue(this));
  }

  /**
   * Get the enumeration from the QName.
   * @deprecated replaced by {@link MatchCollection#fromQNameURI(URI)}
   *
   * @param qname The qname.
   * @return The enumeration.
   */
  @Deprecated public static MatchSystem fromQNameURI(URI qname) {
    return org.codehaus.enunciate.XmlQNameEnumUtil.fromURIValue(qname.toString(), MatchSystem.class);
  }
}
