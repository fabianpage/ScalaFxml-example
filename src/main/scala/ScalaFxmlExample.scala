package com.github.nuriaion

import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.{Pos, Orientation}
import scalafx.scene.control.{Label, TextArea, Button, SplitPane}
import scalafx.scene.layout.{Priority, BorderPane, AnchorPane}
import scalafx.scene.Scene


object Simple extends JFXApp with FxmlFiles.Simple{
  println("First!")

  stage = new PrimaryStage {
    scene = new Scene(800,800) {
      root = rootPane

    }
  }
}

