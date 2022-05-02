package com.mt.notion.common.response.propertiy.rollup.array

import com.mt.notion.common.response.richText.RichText

/**
 *
 * @author it.motui
 */
data class RollupArrayTitle(
    override val type: RollupArrayType,
    val title: List<RichText>
) : WithRollupArray