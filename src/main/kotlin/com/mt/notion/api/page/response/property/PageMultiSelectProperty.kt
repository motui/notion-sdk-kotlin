package com.mt.notion.api.page.response.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 *
 * @author it.motui
 */
data class PageMultiSelectProperty(
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("multi_select")
    val multiSelect: List<SelectPropertyResponse>
) : WithPageProperty
