package app.swiftbills.ui.auth.home

import android.os.Bundle
import androidx.activity.compose.setContent
import app.swiftbills.ui.BaseActivity
import app.swiftbills.ui.auth.home.nav.HomeNavHost
import app.swiftbills.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                HomeNavHost()
            }
        }
    }
}