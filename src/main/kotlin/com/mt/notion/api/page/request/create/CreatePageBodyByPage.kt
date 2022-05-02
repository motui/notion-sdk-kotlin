package com.mt.notion.api.page.request.create

import com.mt.notion.api.block.objects.WithBlockObject
import com.mt.notion.api.page.request.propertiy.CreateTitleProperty
import com.mt.notion.common.request.file.CoverRequest
import com.mt.notion.common.request.file.IconRequest
import com.mt.notion.common.request.parent.PageParentRequest

/**
 *
 * @author it.motui
 */
data class CreatePageBodyByPage(
    val parent: PageParentRequest,
    val properties: Properties,
    val icon: IconRequest? = null,
    val cover: CoverRequest? = null,
    val children: List<WithBlockObject>? = null
) : WithCreatePageBody {

    /**
     * todo 兼容
     * ```
     * Array<RichTextRequest>
     * ```
     */
    data class Properties(
        val title: CreateTitleProperty? = null
    )
}
