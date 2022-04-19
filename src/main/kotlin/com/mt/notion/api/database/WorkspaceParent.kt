package com.mt.notion.api.database

/**
 * Workspace parent
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/database">Database</a>
 */
data class WorkspaceParent(
    override val type: DatabaseParentType,
    val workspace: Boolean = true
) : WithDatabaseParent
