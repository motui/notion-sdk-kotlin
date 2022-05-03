package com.mt.notion.api.page.response.property.objects

import com.mt.notion.common.Id
import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class RelationObjectProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    val relation: List<Id>?
) : WithObjectProperty
