/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.semconv.incubating;

import static io.opentelemetry.api.common.AttributeKey.stringKey;

import io.opentelemetry.api.common.AttributeKey;

// DO NOT EDIT, this is an Auto-generated file from
// buildscripts/templates/SemanticAttributes.java.j2
@SuppressWarnings("unused")
public final class VcsIncubatingAttributes {

  /**
   * The ID of the change (pull request/merge request) if applicable. This is usually a unique
   * (within repository) identifier generated by the VCS system.
   */
  public static final AttributeKey<String> VCS_REPOSITORY_CHANGE_ID =
      stringKey("vcs.repository.change.id");

  /**
   * The human readable title of the change (pull request/merge request). This title is often a
   * brief summary of the change and may get merged in to a ref as the commit summary.
   */
  public static final AttributeKey<String> VCS_REPOSITORY_CHANGE_TITLE =
      stringKey("vcs.repository.change.title");

  /**
   * The name of the <a href="https://git-scm.com/docs/gitglossary#def_ref">reference</a> such as
   * <strong>branch</strong> or <strong>tag</strong> in the repository.
   */
  public static final AttributeKey<String> VCS_REPOSITORY_REF_NAME =
      stringKey("vcs.repository.ref.name");

  /**
   * The revision, literally <a href="https://www.merriam-webster.com/dictionary/revision">revised
   * version</a>, The revision most often refers to a commit object in Git, or a revision number in
   * SVN.
   *
   * <p>Notes:
   *
   * <ul>
   *   <li>The revision can be a full <a
   *       href="https://nvlpubs.nist.gov/nistpubs/FIPS/NIST.FIPS.186-5.pdf">hash value (see
   *       glossary)</a>, of the recorded change to a ref within a repository pointing to a commit
   *       <a href="https://git-scm.com/docs/git-commit">commit</a> object. It does not necessarily
   *       have to be a hash; it can simply define a <a
   *       href="https://svnbook.red-bean.com/en/1.7/svn.tour.revs.specifiers.html">revision
   *       number</a> which is an integer that is monotonically increasing. In cases where it is
   *       identical to the {@code ref.name}, it SHOULD still be included. It is up to the
   *       implementer to decide which value to set as the revision based on the VCS system and
   *       situational context.
   * </ul>
   */
  public static final AttributeKey<String> VCS_REPOSITORY_REF_REVISION =
      stringKey("vcs.repository.ref.revision");

  /**
   * The type of the <a href="https://git-scm.com/docs/gitglossary#def_ref">reference</a> in the
   * repository.
   */
  public static final AttributeKey<String> VCS_REPOSITORY_REF_TYPE =
      stringKey("vcs.repository.ref.type");

  /**
   * The <a href="https://en.wikipedia.org/wiki/URL">URL</a> of the repository providing the
   * complete address in order to locate and identify the repository.
   */
  public static final AttributeKey<String> VCS_REPOSITORY_URL_FULL =
      stringKey("vcs.repository.url.full");

  // Enum definitions
  /** Values for {@link #VCS_REPOSITORY_REF_TYPE}. */
  public static final class VcsRepositoryRefTypeValues {
    /**
     * [branch](https://git-scm.com/docs/gitglossary#Documentation/gitglossary.txt-aiddefbranchabranch).
     */
    public static final String BRANCH = "branch";

    /** [tag](https://git-scm.com/docs/gitglossary#Documentation/gitglossary.txt-aiddeftagatag). */
    public static final String TAG = "tag";

    private VcsRepositoryRefTypeValues() {}
  }

  private VcsIncubatingAttributes() {}
}
