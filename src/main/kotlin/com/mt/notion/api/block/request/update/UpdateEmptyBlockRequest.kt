package com.mt.notion.api.block.request.update

/**
 *
 * @author it.motui
 */
data class UpdateEmptyBlockRequest(
    override val archived: Boolean? = false
) : com.mt.notion.api.block.request.update.UpdateBlockRequest