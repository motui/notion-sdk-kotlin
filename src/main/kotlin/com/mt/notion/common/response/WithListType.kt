package com.mt.notion.common.response

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.api.block.Blocks
import com.mt.notion.api.database.response.Databases
import com.mt.notion.api.user.Users
import com.mt.notion.common.ObjectType

/**
 * list type
 *
 * @author it.motui
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "type",
    visible = true
)
@JsonSubTypes(
    JsonSubTypes.Type(Users::class, name = "user"),
    JsonSubTypes.Type(Databases::class, name = "page"),
    JsonSubTypes.Type(Blocks::class, name = "block")
)
interface WithListType {
    @get:JsonProperty("object")
    val objectType: ObjectType
    val type: String
}
