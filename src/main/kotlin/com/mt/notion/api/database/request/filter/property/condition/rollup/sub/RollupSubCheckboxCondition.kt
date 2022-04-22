package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

import com.mt.notion.api.database.request.filter.property.condition.checkbox.CheckboxCondition

/**
 *
 * @author it.motui
 */
data class RollupSubCheckboxCondition(
    val checkbox: CheckboxCondition
) : RollupSubCondition
