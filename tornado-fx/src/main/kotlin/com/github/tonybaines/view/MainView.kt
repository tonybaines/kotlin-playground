package com.github.tonybaines.view

import com.github.tonybaines.app.Styles
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.scene.chart.CategoryAxis
import javafx.scene.chart.NumberAxis
import javafx.scene.chart.XYChart
import tornadofx.*
import java.time.Instant

class MainView : View("Hello TornadoFX Application") {
    val myData: ObservableList<XYChart.Data<String, Number>> = FXCollections.observableArrayList()
    var value = 1

    override val root = vbox {
        hbox {
            label(title) {
                addClass(Styles.heading)
            }
            button(text = "Click me") {
                setOnMouseClicked {
                    myData.add(XYChart.Data(Instant.now().toString(), value ++))
                }
            }
        }
        linechart(title = "Line Chart", x = CategoryAxis(), y = NumberAxis()) {
            series("Time") {
                data = myData
            }
        }
    }
}