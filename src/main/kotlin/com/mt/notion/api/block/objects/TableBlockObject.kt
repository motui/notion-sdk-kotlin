package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.api.user.User
import com.mt.notion.common.ObjectType

/**
 *
 * @author it.motui
 */
data class TableBlockObject(
    override val id: String,
    override val type: BlockObjectType,
    override val objectType: ObjectType,
    override val createdTime: String,
    override val createdBy: User,
    override val lastEditedTime: String,
    override val lastEditedBy: User,
    override val hasChildren: Boolean,
    override val archived: Boolean,
    val table: Table,
) : WithBlockObject {

    data class Table(
        @JsonProperty("has_column_header")
        val hasColumnHeader: Boolean,
        @JsonProperty("has_row_header")
        val hasRowHeader: Boolean,
        @JsonProperty("table_width")
        val tableWidth: Boolean
    )
}