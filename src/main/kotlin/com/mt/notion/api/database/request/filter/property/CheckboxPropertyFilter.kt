package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class CheckboxPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Checkbox,
    val checkbox: com.mt.notion.api.database.request.filter.property.condition.checkbox.CheckboxCondition,
) : PropertyFilter
