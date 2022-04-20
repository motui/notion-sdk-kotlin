package com.mt.notion.api.database.request.filter.condition.common

import com.mt.notion.api.database.request.filter.condition.MultiSelectCondition
import com.mt.notion.api.database.request.filter.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class ContainsCondition(
    val contains: String
) : TextCondition, MultiSelectCondition
