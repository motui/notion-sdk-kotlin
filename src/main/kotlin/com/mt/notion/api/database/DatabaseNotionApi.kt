package com.mt.notion.api.database

import com.mt.notion.api.NotionApi
import com.mt.notion.api.NotionApiConfig
import com.mt.notion.api.database.request.create.CreateDatabaseRequest
import com.mt.notion.api.database.request.query.QueryDatabaseRequest
import com.mt.notion.api.database.request.update.UpdateDatabaseRequest
import com.mt.notion.api.database.response.query.Databases
import com.mt.notion.api.database.response.retrieve.Database
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

    /**
     * Query a database
     *
     * @see <a href="https://developers.notion.com/reference/post-database-query">Query a database</a>
     */
    fun query(databaseId: String, query: QueryDatabaseRequest): Databases {
        return notionHttpClient.post(
            url = "${this.config.baseUrl}/databases/${databaseId}/query",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            body = query,
            responseClass = Databases::class.java
        )
    }

    /**
     * Create a database
     *
     * @see <a href="https://developers.notion.com/reference/create-a-database">Create a database</a>
     */
    fun create(query: CreateDatabaseRequest): Database {
        return notionHttpClient.post(
            url = "${this.config.baseUrl}/databases",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            body = query,
            responseClass = Database::class.java
        )
    }

    /**
     * Update database
     *
     * @see <a href="https://developers.notion.com/reference/update-a-database">Update database</a>
     */
    fun update(databaseId: String, query: UpdateDatabaseRequest): Database {
        return notionHttpClient.patch(
            url = "${this.config.baseUrl}/databases/${databaseId}",
            headers = this.notionHttpClient.buildHeader(
                this.notionHttpClient.bearerAuthorization(this.config.token),
                this.config.notionVersion
            ),
            body = query,
            responseClass = Database::class.java
        )
    }
}