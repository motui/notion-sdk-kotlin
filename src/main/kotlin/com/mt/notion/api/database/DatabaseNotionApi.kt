package com.mt.notion.api.database

import com.mt.notion.api.NotionApi
import com.mt.notion.api.NotionApiConfig
import com.mt.notion.http.NotionHttpClient

/**
 * database api
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/database">database</a>
 */
class DatabaseNotionApi(
    override val config: NotionApiConfig,
    override val notionHttpClient: NotionHttpClient
) : NotionApi {

    /**
     * Retrieve a database
     *
     * @see <a href="https://developers.notion.com/reference/retrieve-a-database">Retrieve a database</a>
     */
    fun retrieve(databaseId: String): Database {
        return notionHttpClient.get(
            url = "${this.config.baseUrl}/databases/${databaseId}",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            responseClass = Database::class.java
        )
    }
}