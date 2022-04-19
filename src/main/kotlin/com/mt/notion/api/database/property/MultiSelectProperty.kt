package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.OptionColor
import com.mt.notion.common.PropertyType

/**
 * Multi-select
 *
* @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object#multi-select-options">Multi-select </a>
 */
data class MultiSelectProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    @JsonProperty("multi_select")
    val multiSelect: MultiSelect
) : DatabaseProperty {

    data class MultiSelect(
        val options: List<Option>
    )

    data class Option(
        /**
         * Identifier of the option, which does not change if the name is changed.
         * These are sometimes, but not always, UUIDs.
         */
        val id: String,
        /**
         * Name of the option as it appears in Notion.
         * Note: Commas (",") are not valid for select values.
         */
        val name: String,
        /**
         * Color of the option.
         */
        val color: OptionColor,
    )
}
