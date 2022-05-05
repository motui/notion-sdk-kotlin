package com.mt.notion.api.database.request.query.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.richText.RichText

/**
 * Title
 *
 * @author it.motui
 */
data class QueryDatabaseTitleProperty(
    override val id: String,
    override val type: PropertyType,
    val title: List<RichText>
) : WithQueryDatabaseProperty
