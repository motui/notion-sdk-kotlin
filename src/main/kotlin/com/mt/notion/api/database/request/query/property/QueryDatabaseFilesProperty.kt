package com.mt.notion.api.database.request.query.property

import com.mt.notion.common.PropertyType
import com.mt.notion.common.response.file.name.WithNameFile

/**
 * Files
 *
 * @author it.motui
 */
data class QueryDatabaseFilesProperty(
    override val id: String,
    override val type: PropertyType,
    val files: List<WithNameFile>?
) : WithQueryDatabaseProperty