package com.mt.notion.common.response.propertiy.rollup

import com.mt.notion.common.RollupFunction
import com.mt.notion.common.response.propertiy.rollup.array.WithRollupArray

/**
 *
 * @author it.motui
 */
data class ArrayRollup(
    override val type: RollupType,
    override val function: RollupFunction,
    val array: List<WithRollupArray>
) : WithRollup
