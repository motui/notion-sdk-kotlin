package com.mt.notion.api.database.request.query.filter.property

import com.mt.notion.api.database.request.query.filter.property.condition.ExistenceCondition

/**
 *
 * @author it.motui
 */
data class FilesPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Files,
    val files: ExistenceCondition,
) : PropertyFilter
