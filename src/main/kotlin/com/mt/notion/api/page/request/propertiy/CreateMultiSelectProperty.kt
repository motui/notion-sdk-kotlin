package com.mt.notion.api.page.request.propertiy

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType
import com.mt.notion.common.request.select.WithSelectPropertyRequest

/**
 *
 * @author it.motui
 */
data class CreateMultiSelectProperty(
    override val type: PropertyType = PropertyType.MultiSelect,
    @JsonProperty("multi_select")
    val multiSelect: List<WithSelectPropertyRequest>? = null
) : WithCreateProperty
