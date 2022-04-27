package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.ApiColor
import com.mt.notion.common.ObjectType
import com.mt.notion.common.request.file.IconRequest
import com.mt.notion.common.request.richText.RichTextRequest

/**
 *
 * @author it.motui
 */
data class CalloutBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Callout,
    override val objectType: ObjectType = ObjectType.Block,
    val callout: Callout,
) : BlockObjectRequestWithoutChildren {

    data class Callout(
        @JsonProperty("rich_text")
        val richText: List<RichTextRequest>,
        val color: ApiColor?,
        val icon: IconRequest?
    )
}