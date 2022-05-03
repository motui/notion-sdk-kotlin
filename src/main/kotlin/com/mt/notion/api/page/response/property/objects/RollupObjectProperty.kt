package com.mt.notion.api.page.response.property.objects

import com.mt.notion.common.ObjectType
import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.rollup.WithRollup

/**
 *
 * @author it.motui
 */
data class RollupObjectProperty(
    override val objectType: ObjectType?,
    override val type: PropertyType,
    override val id: String,
    val rollup: WithRollup
) : WithObjectProperty
