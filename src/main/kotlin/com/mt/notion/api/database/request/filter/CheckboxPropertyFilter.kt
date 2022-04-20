package com.mt.notion.api.database.request.filter

import com.mt.notion.api.database.request.filter.condition.checkbox.CheckboxCondition

/**
 *
 * @author it.motui
 */
data class CheckboxPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Checkbox,
    val checkbox: CheckboxCondition,
) : PropertyFilter
