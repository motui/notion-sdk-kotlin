package com.mt.notion.api.block.objects

import com.fasterxml.jackson.annotation.JsonProperty

/**
 *
 * @author it.motui
 */
enum class Language constructor(val value: String) {
    @JsonProperty("abap")
    Abap("abap"),

    @JsonProperty("arduino")
    Arduino("arduino"),

    @JsonProperty("bash")
    Bash("bash"),

    @JsonProperty("basic")
    Basic("basic"),

    @JsonProperty("c")
    C("c"),

    @JsonProperty("clojure")
    Clojure("clojure"),

    @JsonProperty("coffeescript")
    Coffeescript("coffeescript"),

    @JsonProperty("c++")
    C__("c++"),

    @JsonProperty("c#")
    CSharp("c#"),

    @JsonProperty("css")
    Css("css"),

    @JsonProperty("dart")
    Dart("dart"),

    @JsonProperty("diff")
    Diff("diff"),

    @JsonProperty("docker")
    Docker("docker"),

    @JsonProperty("elixir")
    Elixir("elixir"),

    @JsonProperty("elm")
    Elm("elm"),

    @JsonProperty("erlang")
    Erlang("erlang"),

    @JsonProperty("flow")
    Flow("flow"),

    @JsonProperty("fortran")
    Fortran("fortran"),

    @JsonProperty("f#")
    FSharp("f#"),

    @JsonProperty("gherkin")
    Gherkin("gherkin"),

    @JsonProperty("glsl")
    Glsl("glsl"),

    @JsonProperty("go")
    Go("go"),

    @JsonProperty("graphql")
    Graphql("graphql"),

    @JsonProperty("groovy")
    Groovy("groovy"),

    @JsonProperty("haskell")
    Haskell("haskell"),

    @JsonProperty("html")
    Html("html"),

    @JsonProperty("java")
    Java("java"),

    @JsonProperty("javascript")
    Javascript("javascript"),

    @JsonProperty("json")
    Json("json"),

    @JsonProperty("julia")
    Julia("julia"),

    @JsonProperty("kotlin")
    Kotlin("kotlin"),

    @JsonProperty("latex")
    Latex("latex"),

    @JsonProperty("less")
    Less("less"),

    @JsonProperty("lisp")
    Lisp("lisp"),

    @JsonProperty("livescript")
    Livescript("livescript"),

    @JsonProperty("lua")
    Lua("lua"),

    @JsonProperty("makefile")
    Makefile("makefile"),

    @JsonProperty("markdown")
    Markdown("markdown"),

    @JsonProperty("markup")
    Markup("markup"),

    @JsonProperty("matlab")
    Matlab("matlab"),

    @JsonProperty("mermaid")
    Mermaid("mermaid"),

    @JsonProperty("nix")
    Nix("nix"),

    @JsonProperty("objective-c")
    ObjectiveC("objective-c"),

    @JsonProperty("ocaml")
    Ocaml("ocaml"),

    @JsonProperty("pascal")
    Pascal("pascal"),

    @JsonProperty("perl")
    Perl("perl"),

    @JsonProperty("php")
    Php("php"),

    @JsonProperty("plaintext")
    Plaintext("plaintext"),

    @JsonProperty("powershell")
    Powershell("powershell"),

    @JsonProperty("prolog")
    Prolog("prolog"),

    @JsonProperty("protobuf")
    Protobuf("protobuf"),

    @JsonProperty("python")
    Python("python"),

    @JsonProperty("r")
    R("r"),

    @JsonProperty("reason")
    Reason("reason"),

    @JsonProperty("ruby")
    Ruby("ruby"),

    @JsonProperty("rust")
    Rust("rust"),

    @JsonProperty("sass")
    Sass("sass"),

    @JsonProperty("scala")
    Scala("scala"),

    @JsonProperty("scheme")
    Scheme("scheme"),

    @JsonProperty("scss")
    Scss("scss"),

    @JsonProperty("shell")
    Shell("shell"),

    @JsonProperty("solidity")
    Solidity("solidity"),

    @JsonProperty("sql")
    Sql("sql"),

    @JsonProperty("swift")
    Swift("swift"),

    @JsonProperty("typescript")
    Typescript("typescript"),

    @JsonProperty("vb.net")
    VbNet("vb.net"),

    @JsonProperty("verilog")
    Verilog("verilog"),

    @JsonProperty("vhdl")
    Vhdl("vhdl"),

    @JsonProperty("visualbasic")
    VisualBasic("visualbasic"),

    @JsonProperty("webassembly")
    Webassembly("webassembly"),

    @JsonProperty("xml")
    Xml("xml"),

    @JsonProperty("yaml")
    Yaml("yaml"),

    @JsonProperty("java/c/c++/c#")
    Combination("java/c/c++/c#"),
    ;

    override fun toString(): String = value
}