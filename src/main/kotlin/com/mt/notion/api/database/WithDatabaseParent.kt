package com.mt.notion.api.database

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo

/**
 * Database
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/database">Database</a>
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(PageParent::class, name = "page_id"),
    JsonSubTypes.Type(WorkspaceParent::class, name = "workspace"),
)
interface WithDatabaseParent {
    val type: DatabaseParentType

    companion object {

        fun page(pageId: String): PageParent {
            return PageParent(type = DatabaseParentType.PageId, pageId = pageId)
        }

        fun workspace(): WorkspaceParent {
            return WorkspaceParent(type = DatabaseParentType.Workspace, workspace = true)
        }
    }
}
