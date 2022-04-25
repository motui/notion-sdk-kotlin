package com.mt.notion.api.block.update

/**
 *
 * @author it.motui
 */
data class UpdateEmptyBlockRequest(
    override val archived: Boolean? = false
) : UpdateBlockRequest