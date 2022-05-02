package com.mt.notion.common.response.propertiy.rollup

import com.mt.notion.common.RollupFunction

/**
 *
 * @author it.motui
 */
data class NumberRollup(
    override val type: RollupType,
    override val function: RollupFunction,
    val number: Number?
) : WithRollup
