package com.mt.notion.common.response.propertiy.rollup.array

import com.mt.notion.common.Id

/**
 *
 * @author it.motui
 */
data class RollupArrayRelation(
    override val type: RollupArrayType,
    val relation: List<Id>
) : WithRollupArray