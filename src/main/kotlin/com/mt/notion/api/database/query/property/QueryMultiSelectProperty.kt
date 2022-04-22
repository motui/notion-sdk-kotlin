package com.mt.notion.api.database.query.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.SelectPropertyResponse

/**
 * Multi-select
 *
 * @author it.motui
 */
data class QueryMultiSelectProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("multi_select")
    val multiSelect: List<SelectPropertyResponse>
) : QueryDatabaseProperty
