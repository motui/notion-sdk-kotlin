package com.mt.notion.common.response.richText.mention

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Template mentions
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(TemplateMentionDateMention::class, name = "template_mention_date"),
    JsonSubTypes.Type(TemplateMentionUserMention::class, name = "template_mention_user"),
)
interface TemplateMention {
    val type: TemplateMentionType
}
