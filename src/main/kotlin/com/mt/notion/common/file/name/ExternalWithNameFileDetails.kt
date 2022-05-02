package com.mt.notion.common.file.name

import com.mt.notion.common.Link
import com.mt.notion.common.file.FileType

/**
 * External file object
 *
 * @author it.motui
 */
data class ExternalWithNameFileDetails(
    override val type: FileType,
    override val name: String,
    var external: Link,
) : WithNameFile
