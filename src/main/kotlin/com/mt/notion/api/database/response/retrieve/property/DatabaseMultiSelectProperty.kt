package com.mt.notion.api.database.response.retrieve.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 * Multi-select
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object#multi-select-options">Multi-select </a>
 */
data class DatabaseMultiSelectProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("multi_select")
    val multiSelect: MultiSelect
) : WithDatabaseProperty {

    data class MultiSelect(
        val options: List<SelectPropertyResponse>
    )
}
