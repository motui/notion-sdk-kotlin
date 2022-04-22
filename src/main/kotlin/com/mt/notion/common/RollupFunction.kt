package com.mt.notion.common

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
enum class RollupFunction constructor(private val value: String) {
    @JsonProperty("count_values")
    Count("count_values"),

    @JsonProperty("count_values")
    CountValues("count_values"),

    @JsonProperty("empty")
    Empty("empty"),

    @JsonProperty("not_empty")
    NotEmpty("not_empty"),

    @JsonProperty("unique")
    Unique("unique"),

    @JsonProperty("show_unique")
    ShowUnique("show_unique"),

    @JsonProperty("percent_empty")
    PercentEmpty("percent_empty"),

    @JsonProperty("percent_not_empty")
    PercentNotEmpty("percent_not_empty"),

    @JsonProperty("sum")
    Sum("sum"),

    @JsonProperty("average")
    Average("average"),

    @JsonProperty("median")
    Median("median"),

    @JsonProperty("min")
    Min("min"),

    @JsonProperty("max")
    Max("max"),

    @JsonProperty("earliest_date")
    EarliestDate("earliest_date"),

    @JsonProperty("latest_date")
    LatestDate("latest_date"),

    @JsonProperty("date_range")
    DateRange("date_range"),

    @JsonProperty("checked")
    Checked("checked"),

    @JsonProperty("unchecked")
    Unchecked("unchecked"),

    @JsonProperty("percent_checked")
    PercentChecked("percent_checked"),

    @JsonProperty("percent_unchecked")
    PercentUnchecked("percent_unchecked"),

    @JsonProperty("show_original")
    ShowOriginal("show_original"),

    ;

    override fun toString(): String = value

}