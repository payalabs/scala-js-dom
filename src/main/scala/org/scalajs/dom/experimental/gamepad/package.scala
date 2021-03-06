package org.scalajs.dom.experimental

import language.implicitConversions

import org.scalajs.dom

/**
 * Implements the Gamepad API.
 *
 * [[https://www.w3.org/TR/2015/WD-gamepad-20151217/ W3C Working Draft]]
 */
package object gamepad {
  implicit def toGamepad(navigator: dom.raw.Navigator): GamepadNavigator =
    navigator.asInstanceOf[GamepadNavigator]

  final val `unknown` = "".asInstanceOf[GamepadMappingType]

  final val `standard` = "standard".asInstanceOf[GamepadMappingType]
}
