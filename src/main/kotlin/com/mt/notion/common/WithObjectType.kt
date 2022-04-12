package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.mt.notion.api.user.WithUserType

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
    JsonSubTypes.Type(WithUserType::class, name = "user"),
    JsonSubTypes.Type(WithListType::class, name = "list")
)
interface WithObjectType {
    @get:JsonProperty("object")
    val objectType: ObjectType
}