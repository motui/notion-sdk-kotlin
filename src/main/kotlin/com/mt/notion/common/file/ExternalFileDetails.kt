package com.mt.notion.common.file

/**
 * External file object
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/file-object">File object</a>
 */
data class ExternalFileDetails(
    override val type: FileType,
    /**
     * Link to the externally hosted content.
     */
    var url: String? = null,
) : File
