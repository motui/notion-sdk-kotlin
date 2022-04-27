package com.mt.notion.common.request.file

import com.mt.notion.common.file.FileType

/**
 * Emoji
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/emoji-object">emoji-object</a>
 */
data class EmojiRequest(
    override var type: FileType = FileType.Emoji,
    var emoji: String
) : IconRequest
