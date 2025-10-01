package com.example.projetofx

import javafx.application.Application
import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.geometry.Pos
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import javafx.scene.layout.GridPane
import javafx.scene.layout.HBox
import javafx.scene.paint.Color
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import javafx.scene.text.Text
import javafx.stage.Stage

class App : Application() {

    override fun start(stage: Stage) {

        // Grid

        val grid = GridPane()

        grid.alignment = Pos.CENTER
        grid.hgap = 10.0
        grid.vgap = 10.0
        grid.vgap = 10.0
        grid.padding = Insets(25.0,25.0,25.0,25.0)

        // Componentes da interface

        val title = Text("Login")
        title.fill = Color.DARKCYAN
        title.font = Font.font("Arial", FontWeight.BOLD, 26.0)

        val actionTarget = Text()
        actionTarget.font = Font.font("Arial", FontWeight.BOLD, 14.0)

        val usernameLabel = Label("Usuário ")
        val usernameInput = TextField()

        val passwordLabel = Label("Senha ")
        val passwordInput = PasswordField()

        usernameLabel.font = Font.font("Arial", FontWeight.BOLD, 14.0)
        usernameLabel.textFill = Color.TEAL

        passwordLabel.font = Font.font("Arial", FontWeight.BOLD, 14.0)
        passwordLabel.textFill = Color.TEAL

        val sendBtn = Button("Enviar")
        sendBtn.font = Font.font("Verdana", FontWeight.BOLD, 14.0)
        sendBtn.onAction = (EventHandler<ActionEvent> {
            if(usernameInput.text=="admin" && passwordInput.text=="123"){
                actionTarget.fill = Color.DARKGREEN
                actionTarget.text = "Bem vindo!"
            }
            else {
                actionTarget.fill = Color.INDIANRED
                actionTarget.text = "Credenciais inválidas."
            }
        })
        val hboxBtn = HBox(10.0)
        hboxBtn.alignment = Pos.BOTTOM_CENTER
        hboxBtn.children.add(sendBtn)

        grid.add(title, 0, 0, 1, 1)
        grid.add(usernameLabel, 0, 2)
        grid.add(usernameInput, 1, 2)
        grid.add(passwordLabel, 0, 3)
        grid.add(passwordInput, 1, 3)
        grid.add(hboxBtn, 1, 4)
        grid.add(actionTarget, 1, 5)

        // Stage      
        stage.title = "Login"
        stage.scene = Scene(grid, 300.0, 300.0)
        stage.show()
    }
}

fun main() {
    Application.launch(App::class.java)
}
