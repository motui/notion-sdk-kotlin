package com.mt.notion.api.database.request.query.filter.property.condition.rollup.sub

import com.mt.notion.api.database.request.query.filter.property.condition.ExistenceCondition

/**
 *
 * @author it.motui
 */
data class RollupSubFilesCondition(
    val files: ExistenceCondition
) : RollupSubCondition
