package com.mt.notion.common.response.propertiy.rollup

import com.mt.notion.common.RollupFunction
import com.mt.notion.common.response.DateResponse

/**
 *
 * @author it.motui
 */
data class DateRollup(
    override val type: RollupType,
    override val function: RollupFunction,
    val date: DateResponse?
) : WithRollup
