package com.mt.notion.api.database.query.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.richText.RichText

/**
 * Title
 *
 * @author it.motui
 */
data class QueryTitleProperty(
    override val id: String,
    override val type: PropertyType,
    val title: List<RichText>
) : QueryDatabaseProperty
