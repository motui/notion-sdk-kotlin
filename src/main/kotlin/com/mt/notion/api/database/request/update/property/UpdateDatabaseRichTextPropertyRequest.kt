package com.mt.notion.api.database.request.update.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.PropertyType

/**
 * Text
 *
 * @author it.motui
 */
data class UpdateDatabaseRichTextPropertyRequest(
    override val type: PropertyType = PropertyType.RichText,
    override val name: String? = null,
    @JsonProperty("rich_text")
    val richText: EmptyObject
) : WithUpdateDatabaseProperty
