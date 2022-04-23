package com.mt.notion.api.block.update

/**
 *
 * @author it.motui
 */
data class EmptyUpdateBlockRequest(
    override val archived: Boolean? = false
) : UpdateBlockRequest