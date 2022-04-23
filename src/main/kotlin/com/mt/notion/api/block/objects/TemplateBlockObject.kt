package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.ObjectType
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class TemplateBlockObject(
    override val id: String,
    override val type: BlockObjectType,
    override val objectType: ObjectType,
    override val createdTime: String,
    override val createdBy: User,
    override val lastEditedTime: String,
    override val lastEditedBy: User,
    override val hasChildren: Boolean,
    override val archived: Boolean,
    val template: TemplateRichText,
) : WithBlockObject {
    data class TemplateRichText(
        @JsonProperty("rich_text")
        val richText: List<RichText>
    )
}