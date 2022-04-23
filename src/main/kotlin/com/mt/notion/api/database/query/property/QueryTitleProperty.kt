package com.mt.notion.api.database.query.property

import com.mt.notion.common.PropertyType

/**
 * Title
 *
 * @author it.motui
 */
data class QueryTitleProperty(
    override val id: String,
    override val type: PropertyType,
    val title: List<com.mt.notion.common.response.richText.RichText>
) : QueryDatabaseProperty
