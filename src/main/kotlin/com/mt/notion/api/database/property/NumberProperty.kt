package com.mt.notion.api.database.property

import com.fasterxml.jackson.annotation.JsonProperty
import com.mt.notion.common.PropertyType

/**
 * Number
 *
 * @author it.motui
 * @see <a href="https://developers.notion.com/reference/property-object">Property object</a>
 */
data class NumberProperty(
    override val id: String,
    override val type: PropertyType,
    override val name: String,
    val number: Number
) : DatabaseProperty {

    data class Number(val format: NumberType)

    enum class NumberType constructor(private val value: String) {
        @JsonProperty("number")
        Number("number"),

        @JsonProperty("number_with_commas")
        NumberWithCommas("number_with_commas"),

        @JsonProperty("percent")
        Percent("percent"),

        @JsonProperty("dollar")
        Dollar("dollar"),

        @JsonProperty("canadian_dollar")
        CanadianDollar("canadian_dollar"),

        @JsonProperty("euro")
        Euro("euro"),

        @JsonProperty("pound")
        Pound("pound"),

        @JsonProperty("yen")
        Yen("yen"),

        @JsonProperty("ruble")
        Ruble("ruble"),

        @JsonProperty("rupee")
        Rupee("rupee"),

        @JsonProperty("won")
        Won("won"),

        @JsonProperty("yuan")
        Yuan("yuan"),

        @JsonProperty("real")
        Real("real"),

        @JsonProperty("lira")
        Lira("lira"),

        @JsonProperty("rupiah")
        Rupiah("rupiah"),

        @JsonProperty("franc")
        Franc("franc"),

        @JsonProperty("hong_kong_dollar")
        HongKongDollar("hong_kong_dollar"),

        @JsonProperty("new_zealand_dollar")
        NewZealandDollar("new_zealand_dollar"),

        @JsonProperty("krona")
        Krona("krona"),

        @JsonProperty("norwegian_krone")
        NorwegianKrone("norwegian_krone"),

        @JsonProperty("mexican_peso")
        MexicanPeso("mexican_peso"),

        @JsonProperty("rand")
        Rand("rand"),

        @JsonProperty("new_taiwan_dollar")
        NewTaiwanDollar("new_taiwan_dollar"),

        @JsonProperty("danish_krone")
        DanishKrone("danish_krone"),

        @JsonProperty("zloty")
        Zloty("zloty"),

        @JsonProperty("baht")
        Baht("baht"),

        @JsonProperty("forint")
        Forint("forint"),

        @JsonProperty("koruna")
        Koruna("koruna"),

        @JsonProperty("shekel")
        Shekel("shekel"),

        @JsonProperty("chilean_peso")
        ChileanPeso("chilean_peso"),

        @JsonProperty("philippine_peso")
        PhilippinePeso("philippine_peso"),

        @JsonProperty("dirham")
        Dirham("dirham"),

        @JsonProperty("colombian_peso")
        ColombianPeso("colombian_peso"),

        @JsonProperty("riyal")
        Riyal("riyal"),

        @JsonProperty("ringgit")
        Ringgit("ringgit"),

        @JsonProperty("leu")
        Leu("leu"),

        @JsonProperty("argentine_peso")
        ArgentinePeso("argentine_peso"),

        @JsonProperty("uruguayan_peso")
        Uruguayan_Peso("uruguayan_peso"),
        ;

        override fun toString(): String = value
    }
}
