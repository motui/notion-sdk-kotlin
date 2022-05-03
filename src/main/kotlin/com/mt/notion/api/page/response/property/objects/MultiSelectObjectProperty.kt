package com.mt.notion.api.page.response.property.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.SelectPropertyResponse

/**
 *
 * @author it.motui
 */
data class MultiSelectObjectProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    @JsonProperty("multi_select")
    val multiSelect: List<SelectPropertyResponse>
) : WithObjectProperty
