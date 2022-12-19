package com.scala_arcade.laminar.bootstrap.utilities

import com.raquo.domtypes.generic.Modifier
import com.raquo.laminar.api.L.*
import com.raquo.laminar.nodes.ReactiveHtmlElement
import org.scalajs.dom

object Spacing {
  
  private val csApply: String => Setter[HtmlElement] =
    css => className := css

  val m_0: Setter[HtmlElement]    = csApply("m-0")
  val m_1: Setter[HtmlElement]    = csApply("m-1")
  val m_2: Setter[HtmlElement]    = csApply("m-2")
  val m_3: Setter[HtmlElement]    = csApply("m-3")
  val m_4: Setter[HtmlElement]    = csApply("m-4")
  val m_5: Setter[HtmlElement]    = csApply("m-5")
  val m_auto: Setter[HtmlElement] = csApply("m-auto")

}
