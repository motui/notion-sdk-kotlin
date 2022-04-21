package com.mt.notion.api.database.request.filter.property.condition.rollup.sub

/**
 *
 * @author it.motui
 */
data class RollupSubFilesCondition(
    val files: com.mt.notion.api.database.request.filter.property.condition.ExistenceCondition
) : com.mt.notion.api.database.request.filter.property.condition.rollup.sub.RollupSubCondition
