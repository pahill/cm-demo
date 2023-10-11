import androidx.compose.runtime.Composable

actual fun getPlatformName(): String = "Android ${android.os.Build.VERSION.SDK_INT}"

@Composable fun MainView() = App()
