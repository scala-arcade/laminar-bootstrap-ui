package com.scala_arcade.laminar.bootstrap.layout

import com.raquo.domtypes.generic.Modifier
import com.raquo.laminar.api.L.*
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom

object Container {
  type Container = ReactiveHtmlElement[dom.html.Div]

  def apply(modifiers: Modifier[Container]*): Container =
    div(className := "container", modifiers)

  private def csApply(css: String)(
      modifiers: Modifier[Container]*
  ): Container =
    Container.apply(className := css, modifiers)

  def Small(modifiers: Modifier[Container]*): Container =
    csApply("container-sm")(modifiers)

  def Medium(modifiers: Modifier[Container]*): Container =
    csApply("container-md")(modifiers)

  def Large(modifiers: Modifier[Container]*): Container =
    csApply("container-lg")(modifiers)

  def XLarge(modifiers: Modifier[Container]*): Container =
    csApply("container-xl")(modifiers)

  def XXLarge(modifiers: Modifier[Container]*): Container =
    csApply("container-xxl")(modifiers)

  def Fluid(modifiers: Modifier[Container]*): Container =
    csApply("container-fluid")(modifiers)
}
