package com.mt.notion.common.response.propertiy.rollup

import com.mt.notion.common.RollupFunction

/**
 *
 * @author it.motui
 */
interface WithRollup {
    val type: RollupType
    val function: RollupFunction
}