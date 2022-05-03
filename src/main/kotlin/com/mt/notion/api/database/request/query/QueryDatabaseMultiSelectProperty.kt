package com.mt.notion.api.database.request.query

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 * Multi-select
 *
 * @author it.motui
 */
data class QueryDatabaseMultiSelectProperty(
    override val id: String,
    override val type: PropertyType,
    @JsonProperty("multi_select")
    val multiSelect: List<SelectPropertyResponse>
) : WithQueryDatabaseProperty
