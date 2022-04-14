package com.mt.notion.common.richText.mention

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Mention
 *
 * Mention objects represent an inline mention of a user, page, database, or date.
 * In the app these are created by typing @ followed by the name of a user, page, database, or a date.
 *
 * Mention objects contain a type key. In addition, mention objects contain a key corresponding with the value of type.
 * The value is an object containing type-specific configuration. The type-specific configurations are described in the
 * sections below.
 *
 * todo Page mentions、Database mentions、Date mentions、Template mentions
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/rich-text">Rich text object</a>
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(UserMention::class, name = "user"),
    JsonSubTypes.Type(LinkPreviewMention::class, name = "link_preview"),
)
interface Mention {
    /**
     * Type of the inline mention
     */
    @get:JsonProperty("type")
    val type: MentionType
}