package com.mt.notion.api.page.response.property

import com.mt.notion.common.Id
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class RelationProperty(
    override val type: PropertyType,
    override val id: String,
    val relation: List<Id>?
) : WithProperty
