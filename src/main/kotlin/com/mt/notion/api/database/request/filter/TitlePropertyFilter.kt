package com.mt.notion.api.database.request.filter

import com.mt.notion.api.database.request.filter.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class TitlePropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Title,
    val title: TextCondition,
) : PropertyFilter
