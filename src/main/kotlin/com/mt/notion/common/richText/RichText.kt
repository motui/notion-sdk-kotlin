package com.mt.notion.common.richText

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.common.richText.mention.Mention

/**
 * Rich text
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
    JsonSubTypes.Type(Text::class, name = "text"),
    JsonSubTypes.Type(Mention::class, name = "mention"),
)
interface RichText {
    /**
     * The plain text without annotations
     */
    @get:JsonProperty("plain_text")
    val plainText: String

    /**
     * The URL of any link or internal Notion mention in this text, if any.
     */
    val href: String?

    /**
     * All annotations that apply to this rich text. Annotations include colors and bold/italics/underline/strikethrough.
     */
    val annotations: Annotations

    /**
     * Type of this rich text object. Possible values are: "text", "mention", "equation".
     */
    val type: RichTextType
}