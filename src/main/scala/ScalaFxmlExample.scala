


//import scalaz._
//import scalaz.std.string._
//import scalaz.syntax.std._
//import scalaz.std.string._
//import Scalaz._


package com.github.nuriaion

import blub.Schubiud
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.{Pos, Orientation}
import scalafx.scene.control.{Label, TextArea, Button, SplitPane}
import scalafx.scene.layout.{Priority, BorderPane, AnchorPane}
import scalafx.scene.Scene

/*trait Sculu {
  val theButton = new Button {
    text = "Button"
    mnemonicParsing = false
    id = "theButton"
  }
  val theTop = new Label {
    BorderPane.setAlignment(this, Pos.CENTER)
    text = "Top!"
    id = "theTop"
  }
  val theBorderStuff = new BorderPane {
    AnchorPane.setTopAnchor(this, 0.0)
    prefWidth = 600.0
    id = "theBorderStuff"
    AnchorPane.setBottomAnchor(this, 0.0)
    prefHeight = 400.0
    AnchorPane.setRightAnchor(this, 0.0)
    AnchorPane.setLeftAnchor(this, 0.0)
  }
  val rootPane = new AnchorPane {
    prefWidth = 600.0
    id = "rootPane"
    prefHeight = 400.0
    content = List(theBorderStuff)
  }
}    */




/*trait SimpleFxml {
  println("SimpleFxml!")


  val theButton = new Button {
    id = "theButton"
    mnemonicParsing = false
    text = "Button"
  }

  val theTop = new Label {
    id = "theTop"
    text = "Top!"
    BorderPane.setAlignment(this, Pos.CENTER)
  }

  val theBorderStuff = new BorderPane {
    id = "theBorderStuff"
    prefHeight = 400
    prefWidth = 600

    AnchorPane.setBottomAnchor(this, 0)
    AnchorPane.setLeftAnchor(this, 0)
    AnchorPane.setRightAnchor(this, 0)
    AnchorPane.setTopAnchor(this, 0)
    center = theButton
    top = theTop
  }

  val rootPane = new AnchorPane {
    id = "topPane"
    prefHeight = 400
    prefWidth = 600
    content = List(theBorderStuff)
  }

}  */

//import blub.Schubiud
      /*
package blub3 {
trait Schubiud {
  val theButton = new Button {
    text = "Button"
    mnemonicParsing = false
    id = "theButton"
  }
  val theTop = new Label {
    BorderPane.setAlignment(this, Pos.CENTER)
    text = "Top!"
    id = "theTop"
  }
  val theBorderStuff = new BorderPane {
    AnchorPane.setTopAnchor(this, 0.0)
    prefWidth = 600.0
    id = "theBorderStuff"
    AnchorPane.setBottomAnchor(this, 0.0)
    prefHeight = 400.0
    AnchorPane.setRightAnchor(this, 0.0)
    AnchorPane.setLeftAnchor(this, 0.0)
  }
  val rootPane = new AnchorPane {
    prefWidth = 600.0
    id = "rootPane"
    prefHeight = 400.0
    content = List(theBorderStuff)
    maxHeight = Double.NegativeInfinity
    minHeight = Double.NegativeInfinity
    maxWidth = Double.NegativeInfinity
    minWidth = Double.NegativeInfinity
  }
}
}           */

object Simple extends JFXApp /*with SimpleFxml*/ with blub.Schubiud{
  println("First!")

  stage = new PrimaryStage {
    scene = new Scene(800,800) {
      root = rootPane

    }
  }
}

