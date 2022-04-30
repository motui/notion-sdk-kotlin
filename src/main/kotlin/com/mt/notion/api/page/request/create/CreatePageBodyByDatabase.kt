package com.mt.notion.api.page.request.create

import com.mt.notion.api.block.objects.WithBlockObject
import com.mt.notion.common.request.file.CoverRequest
import com.mt.notion.common.request.file.IconRequest
import com.mt.notion.common.request.parent.DatabaseParentRequest

/**
 *
 * @author it.motui
 */
data class CreatePageBodyByDatabase(
    val parent: DatabaseParentRequest,
    // 待补充
    val properties: String,
    val icon: IconRequest? = null,
    val cover: CoverRequest? = null,
    val content: List<WithBlockObject>? = null,
    val children: List<WithBlockObject>? = null
) : WithCreatePageBody
