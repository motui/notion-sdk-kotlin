package com.mt.notion.api.database.request.update.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.select.SelectPropertyRequest

/**
 * Multi-select
 *
 * @author it.motui
 */
data class UpdateDatabaseMultiSelectPropertyRequest(
    override val type: PropertyType = PropertyType.MultiSelect,
    override val name: String? = null,
    @JsonProperty("multi_select")
    val multiSelect: Select
) : WithUpdateDatabaseProperty {
    data class Select(
        val options: List<SelectPropertyRequest>? = null
    )
}
