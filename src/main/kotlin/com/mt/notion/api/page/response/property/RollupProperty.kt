package com.mt.notion.api.page.response.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.rollup.WithRollup

/**
 *
 * @author it.motui
 */
data class RollupProperty(
    override val type: PropertyType,
    override val id: String,
    val rollup: WithRollup
) : WithProperty
