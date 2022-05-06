package com.mt.notion.api.database.request.create.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.select.SelectPropertyRequest

/**
 * Multi-select
 *
 * @author it.motui
 */
data class CreateDatabaseMultiSelectPropertyRequest(
    override val type: PropertyType = PropertyType.MultiSelect,
    @JsonProperty("multi_select")
    val multiSelect: Select
) : WithCreateDatabaseProperty {
    data class Select(
        val options: List<SelectPropertyRequest>? = null
    )
}
