laminar-bootstrap-ui
====================

This library mainly consists of "helpers" that set up some
Laminar types with the core css classed for Bootstrap. It does not intend to
"do anything fancy" in terms of hooking up any logic, and provides no
bindings to Bootstrap's JS library - it just
gives the look + feel one might be able to bang out some code quicker
if you're familiar with Bootstrap.

For example, here is a snippet stubbing out `Button` types:

```scala
object Button {
  type Button = ReactiveHtmlElement[dom.html.Button]

  def apply(modifiers: Modifier[Button]*): Button =
    button(className := "btn", `type` := "button", modifiers)

  def Primary(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-primary", modifiers)

  def Danger(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-danger", modifiers)
}
```

With this, we can turn something like this

```scala
val example = div(
  className := "container m-3",
  button(
    className := "btn btn-primary",
    "Submit"
  ),
  button(
    className := "btn btn-danger",
    "Reset"
  )
)
```

into this

```scala
val example = Container(
  m_3,
  Button.Primary("Submit"),
  Button.Danger("Reset")
)
```

without attempting to add any new wrappers over Laminar.