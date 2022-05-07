package com.mt.notion.api.database.request.update.property

import com.mt.notion.api.database.request.create.property.WithUpdateDatabaseProperty
import com.mt.notion.api.database.request.rollup.WithRollupRequest
import com.mt.notion.common.PropertyType

/**
 * Rollup
 *
 * @author it.motui
 */
data class UpdateDatabaseRollupPropertyRequest(
    override val type: PropertyType = PropertyType.Rollup,
    override val name: String? = null,
    val rollup: WithRollupRequest
) : WithUpdateDatabaseProperty
