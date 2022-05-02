package com.mt.notion.common.file

import com.mt.notion.common.Link

/**
 * External file object
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/file-object">File object</a>
 */
data class ExternalFileDetails(
    override val type: FileType,
    var external: Link,
) : File
