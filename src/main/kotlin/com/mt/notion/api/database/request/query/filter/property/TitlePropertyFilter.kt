package com.mt.notion.api.database.request.query.filter.property

import com.mt.notion.api.database.request.query.filter.property.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class TitlePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Title,
    val title: TextCondition,
) : PropertyFilter
