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

  val mt_0: Setter[HtmlElement]    = csApply("mt-0")
  val mt_1: Setter[HtmlElement]    = csApply("mt-1")
  val mt_2: Setter[HtmlElement]    = csApply("mt-2")
  val mt_3: Setter[HtmlElement]    = csApply("mt-3")
  val mt_4: Setter[HtmlElement]    = csApply("mt-4")
  val mt_5: Setter[HtmlElement]    = csApply("mt-5")
  val mt_auto: Setter[HtmlElement] = csApply("mt-auto")

  val mb_0: Setter[HtmlElement]    = csApply("mb-0")
  val mb_1: Setter[HtmlElement]    = csApply("mb-1")
  val mb_2: Setter[HtmlElement]    = csApply("mb-2")
  val mb_3: Setter[HtmlElement]    = csApply("mb-3")
  val mb_4: Setter[HtmlElement]    = csApply("mb-4")
  val mb_5: Setter[HtmlElement]    = csApply("mb-5")
  val mb_auto: Setter[HtmlElement] = csApply("mb-auto")

  val ms_0: Setter[HtmlElement]    = csApply("ms-0")
  val ms_1: Setter[HtmlElement]    = csApply("ms-1")
  val ms_2: Setter[HtmlElement]    = csApply("ms-2")
  val ms_3: Setter[HtmlElement]    = csApply("ms-3")
  val ms_4: Setter[HtmlElement]    = csApply("ms-4")
  val ms_5: Setter[HtmlElement]    = csApply("ms-5")
  val ms_auto: Setter[HtmlElement] = csApply("ms-auto")

  val me_0: Setter[HtmlElement]    = csApply("me-0")
  val me_1: Setter[HtmlElement]    = csApply("me-1")
  val me_2: Setter[HtmlElement]    = csApply("me-2")
  val me_3: Setter[HtmlElement]    = csApply("me-3")
  val me_4: Setter[HtmlElement]    = csApply("me-4")
  val me_5: Setter[HtmlElement]    = csApply("me-5")
  val me_auto: Setter[HtmlElement] = csApply("me-auto")

  val mx_0: Setter[HtmlElement]    = csApply("mx-0")
  val mx_1: Setter[HtmlElement]    = csApply("mx-1")
  val mx_2: Setter[HtmlElement]    = csApply("mx-2")
  val mx_3: Setter[HtmlElement]    = csApply("mx-3")
  val mx_4: Setter[HtmlElement]    = csApply("mx-4")
  val mx_5: Setter[HtmlElement]    = csApply("mx-5")
  val mx_auto: Setter[HtmlElement] = csApply("mx-auto")

  val my_0: Setter[HtmlElement]    = csApply("my-0")
  val my_1: Setter[HtmlElement]    = csApply("my-1")
  val my_2: Setter[HtmlElement]    = csApply("my-2")
  val my_3: Setter[HtmlElement]    = csApply("my-3")
  val my_4: Setter[HtmlElement]    = csApply("my-4")
  val my_5: Setter[HtmlElement]    = csApply("my-5")
  val my_auto: Setter[HtmlElement] = csApply("my-auto")

  val p_0: Setter[HtmlElement]    = csApply("p-0")
  val p_1: Setter[HtmlElement]    = csApply("p-1")
  val p_2: Setter[HtmlElement]    = csApply("p-2")
  val p_3: Setter[HtmlElement]    = csApply("p-3")
  val p_4: Setter[HtmlElement]    = csApply("p-4")
  val p_5: Setter[HtmlElement]    = csApply("p-5")
  val p_auto: Setter[HtmlElement] = csApply("p-auto")

  val pt_0: Setter[HtmlElement]    = csApply("pt-0")
  val pt_1: Setter[HtmlElement]    = csApply("pt-1")
  val pt_2: Setter[HtmlElement]    = csApply("pt-2")
  val pt_3: Setter[HtmlElement]    = csApply("pt-3")
  val pt_4: Setter[HtmlElement]    = csApply("pt-4")
  val pt_5: Setter[HtmlElement]    = csApply("pt-5")
  val pt_auto: Setter[HtmlElement] = csApply("pt-auto")

  val pb_0: Setter[HtmlElement]    = csApply("pb-0")
  val pb_1: Setter[HtmlElement]    = csApply("pb-1")
  val pb_2: Setter[HtmlElement]    = csApply("pb-2")
  val pb_3: Setter[HtmlElement]    = csApply("pb-3")
  val pb_4: Setter[HtmlElement]    = csApply("pb-4")
  val pb_5: Setter[HtmlElement]    = csApply("pb-5")
  val pb_auto: Setter[HtmlElement] = csApply("pb-auto")

  val ps_0: Setter[HtmlElement]    = csApply("ps-0")
  val ps_1: Setter[HtmlElement]    = csApply("ps-1")
  val ps_2: Setter[HtmlElement]    = csApply("ps-2")
  val ps_3: Setter[HtmlElement]    = csApply("ps-3")
  val ps_4: Setter[HtmlElement]    = csApply("ps-4")
  val ps_5: Setter[HtmlElement]    = csApply("ps-5")
  val ps_auto: Setter[HtmlElement] = csApply("ps-auto")

  val pe_0: Setter[HtmlElement]    = csApply("pe-0")
  val pe_1: Setter[HtmlElement]    = csApply("pe-1")
  val pe_2: Setter[HtmlElement]    = csApply("pe-2")
  val pe_3: Setter[HtmlElement]    = csApply("pe-3")
  val pe_4: Setter[HtmlElement]    = csApply("pe-4")
  val pe_5: Setter[HtmlElement]    = csApply("pe-5")
  val pe_auto: Setter[HtmlElement] = csApply("pe-auto")

  val px_0: Setter[HtmlElement]    = csApply("px-0")
  val px_1: Setter[HtmlElement]    = csApply("px-1")
  val px_2: Setter[HtmlElement]    = csApply("px-2")
  val px_3: Setter[HtmlElement]    = csApply("px-3")
  val px_4: Setter[HtmlElement]    = csApply("px-4")
  val px_5: Setter[HtmlElement]    = csApply("px-5")
  val px_auto: Setter[HtmlElement] = csApply("px-auto")

  val py_0: Setter[HtmlElement]    = csApply("py-0")
  val py_1: Setter[HtmlElement]    = csApply("py-1")
  val py_2: Setter[HtmlElement]    = csApply("py-2")
  val py_3: Setter[HtmlElement]    = csApply("py-3")
  val py_4: Setter[HtmlElement]    = csApply("py-4")
  val py_5: Setter[HtmlElement]    = csApply("py-5")
  val py_auto: Setter[HtmlElement] = csApply("py-auto")

}
