package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.block.BlockObjectType
import com.mt.notion.api.user.User
import com.mt.notion.common.ApiColor
import com.mt.notion.common.Icon
import com.mt.notion.common.ObjectType
import com.mt.notion.common.richText.RichText

/**
 *
 * @author it.motui
 */
data class CalloutBlockObject(
    override val id: String,
    override val type: BlockObjectType,
    override val objectType: ObjectType,
    override val createdTime: String,
    override val createdBy: User,
    override val lastEditedTime: String,
    override val lastEditedBy: User,
    override val hasChildren: Boolean,
    override val archived: Boolean,
    val callout: Callout,
) : WithBlockObject {

    data class Callout(
        @JsonProperty("rich_text")
        val richText: List<RichText>,
        val color: ApiColor,
        val icon: Icon?
    )
}