package com.mt.notion.api.page.request.propertiy

import com.mt.notion.common.Id
import com.mt.notion.common.PropertyType

/**
 *
 * @author it.motui
 */
data class CreatePageRelationProperty(
    override val type: PropertyType = PropertyType.Relation,
    val relation: List<Id>
) : WithCreatePageProperty
