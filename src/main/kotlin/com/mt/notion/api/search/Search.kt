package com.mt.notion.api.search

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.EmptyObject
import com.mt.notion.common.ObjectType
import com.mt.notion.common.response.PaginationResponse
import com.mt.notion.common.response.WithListType

/**
 *
 * @author it.motui
 */
data class Search(
    override val objectType: ObjectType,
    override val type: String,
    override val nextCursor: String?,
    override val hasMore: Boolean?,
    @JsonProperty("page_or_database")
    val pageOrDatabase: EmptyObject,
    val results: List<WithSearch>
) : WithListType, PaginationResponse
