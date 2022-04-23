package com.mt.notion.common.parent

import com.mt.notion.api.database.DatabaseParentType

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
