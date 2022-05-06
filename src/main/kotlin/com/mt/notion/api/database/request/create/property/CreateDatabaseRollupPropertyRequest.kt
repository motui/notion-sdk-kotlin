package com.mt.notion.api.database.request.create.property

import com.mt.notion.api.database.request.create.property.rollup.WithRollupRequest
import com.mt.notion.common.PropertyType

/**
 * Rollup
 *
 * @author it.motui
 */
data class CreateDatabaseRollupPropertyRequest(
    override val type: PropertyType = PropertyType.Rollup,
    val rollup: WithRollupRequest
) : WithCreateDatabaseProperty
