package com.scala_arcade.laminar.bootstrap.component

import com.raquo.domtypes.generic.Modifier
import com.raquo.laminar.api.L.*
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom

object Navbar {
  type Navbar = ReactiveHtmlElement[dom.html.Element]

  def apply(modifiers: Modifier[Navbar]*): Navbar =
    nav(className := "navbar", role := "navigation", modifiers)

  def Small(modifiers: Modifier[Navbar]*): Navbar =
    Navbar.apply("navbar-expand-sm", modifiers)

  def Medium(modifiers: Modifier[Navbar]*): Navbar =
    Navbar.apply("navbar-expand-md", modifiers)

  def Large(modifiers: Modifier[Navbar]*): Navbar =
    Navbar.apply("navbar-expand-lg", modifiers)

  def XLarge(modifiers: Modifier[Navbar]*): Navbar =
    Navbar.apply("navbar-expand-xl", modifiers)

  def XXLarge(modifiers: Modifier[Navbar]*): Navbar =
    Navbar.apply("navbar-expand-xxl", modifiers)

}
