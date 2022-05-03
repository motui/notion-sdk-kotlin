package com.mt.notion.common.response.parent

import com.mt.notion.common.request.parent.ParentType

/**
 * Workspace parent
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/database">Database</a>
 */
data class WorkspaceParent(
    override val type: ParentType,
    val workspace: Boolean = true
) : WithParent
