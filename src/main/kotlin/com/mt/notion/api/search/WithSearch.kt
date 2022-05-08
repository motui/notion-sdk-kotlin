package com.mt.notion.api.search

import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.api.database.response.retrieve.Database
import com.mt.notion.api.page.response.Page

/**
 *
 * @author it.motui
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "object",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(Database::class, name = "database"),
    JsonSubTypes.Type(Page::class, name = "page")
)
interface WithSearch