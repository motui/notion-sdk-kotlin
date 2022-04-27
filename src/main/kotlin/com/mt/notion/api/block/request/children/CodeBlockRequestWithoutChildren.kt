package com.mt.notion.api.block.request.children

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.common.Language
import com.mt.notion.common.ObjectType
import com.mt.notion.common.response.richText.RichText

/**
 *
 * @author it.motui
 */
data class CodeBlockRequestWithoutChildren(
    override val type: BlockObjectType = BlockObjectType.Code,
    override val objectType: ObjectType = ObjectType.Block,
    val code: Code,
) : BlockObjectRequestWithoutChildren {

    data class Code(
        @JsonProperty("rich_text")
        val richText: List<RichText>,
        val caption: List<RichText>,
        val language: Language
    )
}