import com.raquo.laminar.api.L.*
import com.raquo.laminar.nodes.ReactiveHtmlElement
import com.scala_arcade.laminar.bootstrap.component.*
import com.scala_arcade.laminar.bootstrap.layout.Container
import com.scala_arcade.laminar.bootstrap.utilities.Spacing.*
import org.scalajs.dom
import org.scalajs.dom.html

object Example {

  def main(args: Array[String]): Unit = {

    val btnExample: ReactiveHtmlElement[html.Div] = Container(
      m_5,
      textAlign := "center",
      Button("Button"),
      Button.Primary("Primary"),
      Button.Secondary("Secondary"),
      Button.Success("Success"),
      Button.Danger("Danger"),
      Button.Warning("Warning"),
      Button.Info("Info"),
      Button.Light("Light"),
      Button.Dark("Dark"),
      Button.Link("Link")
    )

    val btnOutlineExample: ReactiveHtmlElement[html.Div] = Container(
      m_5,
      textAlign := "center",
      Button.PrimaryOutline("Primary"),
      Button.SecondaryOutline("Secondary"),
      Button.SuccessOutline("Success"),
      Button.DangerOutline("Danger"),
      Button.WarningOutline("Warning"),
      Button.InfoOutline("Info"),
      Button.LightOutline("Light"),
      Button.DarkOutline("Dark")
    )

    val btnSizeExample = Container(
      m_5,
      textAlign := "center",
      Button.Primary("Small").Small,
      Button.Primary("Button"),
      Button.Primary("Large").Large
    )

    val example = Container(
      btnExample,
      btnOutlineExample,
      btnSizeExample
    )

    val containerNode: dom.Element =
      dom.document.querySelector("#app")

    render(containerNode, example)

  }
}
