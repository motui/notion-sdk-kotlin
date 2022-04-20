package com.mt.notion.api.database.request.filter.condition.common

import com.mt.notion.api.database.request.filter.condition.SelectCondition
import com.mt.notion.api.database.request.filter.condition.text.TextCondition

/**
 *
 * @author it.motui
 */
data class EqualsCondition(
    val equals: String
) : TextCondition, SelectCondition