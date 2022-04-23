package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.ObjectType
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class CodeBlockObject(
    override val id: String,
    override val type: BlockObjectType,
    override val objectType: ObjectType,
    override val createdTime: String,
    override val createdBy: User,
    override val lastEditedTime: String,
    override val lastEditedBy: User,
    override val hasChildren: Boolean,
    override val archived: Boolean,
    val code: Code,
) : WithBlockObject {

    data class Code(
        @JsonProperty("rich_text")
        val richText: List<RichText>,
        val caption: List<RichText>,
        val language: Language
    )
}