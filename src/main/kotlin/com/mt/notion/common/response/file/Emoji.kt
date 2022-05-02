package com.mt.notion.common.response.file

/**
 * Emoji
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/emoji-object">emoji-object</a>
 */
data class Emoji(
    /**
     * Type of page icon. Possible values are: "emoji".
     */
    override var type: FileType,
    /**
     * Emoji character.
     */
    var emoji: String
) : Icon
