package com.mt.notion.common

/**
 * Emoji
 *
 * @author it.motui
 * @since 0.1
 * @see <a href="https://developers.notion.com/reference/emoji-object">emoji-object</a>
 */
data class Emoji(
    /**
     * Type of page icon. Possible values are: "emoji".
     */
    var type: String,
    /**
     * Emoji character.
     */
    var emoji: String
) : Icon