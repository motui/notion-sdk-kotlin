package com.mt.notion.api.database.request.filter.property

/**
 *
 * @author it.motui
 */
data class FilesPropertyFilter(
    override val property: String,
    override val type: PropertyFilterType? = PropertyFilterType.Files,
    val files: com.mt.notion.api.database.request.filter.property.condition.ExistenceCondition,
) : PropertyFilter
