package com.mt.notion.api.database.request.query

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.propertiy.rollup.WithRollup

/**
 * Rollup
 *
 * @author it.motui
 */
data class QueryDatabaseRollupProperty(
    override val id: String,
    override val type: PropertyType,
    val rollup: WithRollup
) : WithQueryDatabaseProperty
