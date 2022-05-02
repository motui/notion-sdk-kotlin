package com.mt.notion.api.user

import com.mt.notion.common.ObjectType
import com.mt.notion.common.response.PaginationResponse
import com.mt.notion.common.response.WithListType

/**
 *
 * @author it.motui
 */
data class Users(
    override val objectType: ObjectType,
    override val nextCursor: String?,
    override val hasMore: Boolean?,
    /**
     * Type of the objects in results. Possible values include "block", "page", "user", "database", "property_item", "page_or_database".
     */
    override val type: String,
    val results: List<WithUser>
) : WithListType, PaginationResponse
