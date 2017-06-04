package com.github.tonybaines.view

import com.github.tonybaines.app.Styles
import tornadofx.*

class MainView : View("Hello TornadoFX Application") {
    override val root = hbox {
        label(title) {
            addClass(Styles.heading)
        }
    }
}