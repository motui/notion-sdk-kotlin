package com.mt.notion.api.database.request.create.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Text
 *
 * @author it.motui
 */
data class CreateDatabaseRichTextPropertyRequest(
    override val type: PropertyType = PropertyType.RichText,
    @JsonProperty("rich_text")
    val richText: EmptyObject
) : WithCreateDatabaseProperty
