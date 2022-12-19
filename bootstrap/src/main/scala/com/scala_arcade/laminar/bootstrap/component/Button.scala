package com.scala_arcade.laminar.bootstrap.component

import com.raquo.domtypes.generic.Modifier
import com.raquo.laminar.api.L.*
import com.raquo.laminar.nodes.ReactiveHtmlElement
import com.scala_arcade.laminar.bootstrap.component.Button.Button
import org.scalajs.dom

extension (b: Button) {

  def Large: Button =
    b.amend(className := "btn-lg")

  def Large(modifiers: Modifier[Button]*): Button =
    b.amend(className := "btn-lg", modifiers)

  def Small: Button =
    b.amend(className := "btn-sm")

  def Small(modifiers: Modifier[Button]*): Button =
    b.amend(className := "btn-sm", modifiers)
    
}

object Button {
  type Button = ReactiveHtmlElement[dom.html.Button]

  def apply(modifiers: Modifier[Button]*): Button =
    button(className := "btn", `type` := "button", modifiers)

  def Primary(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-primary", modifiers)

  def PrimaryOutline(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-outline-primary", modifiers)

  def Secondary(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-secondary", modifiers)

  def SecondaryOutline(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-outline-secondary", modifiers)

  def Success(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-success", modifiers)

  def SuccessOutline(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-outline-success", modifiers)

  def Danger(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-danger", modifiers)

  def DangerOutline(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-outline-danger", modifiers)

  def Warning(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-warning", modifiers)

  def WarningOutline(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-outline-warning", modifiers)

  def Info(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-info", modifiers)

  def InfoOutline(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-outline-info", modifiers)

  def Light(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-light", modifiers)

  def LightOutline(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-outline-light", modifiers)

  def Dark(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-dark", modifiers)

  def DarkOutline(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-outline-dark", modifiers)

  def Link(modifiers: Modifier[Button]*): Button =
    Button.apply(className := "btn-link", modifiers)

}
