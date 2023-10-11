import androidx.compose.ui.window.ComposeUIViewController

import platform.UIKit.UIDevice

actual fun getPlatformName(): String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion

fun MainViewController() = ComposeUIViewController { App() }