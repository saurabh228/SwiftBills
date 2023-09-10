package app.swiftbills.ui.auth

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import app.swiftbills.ui.BaseActivity
import app.swiftbills.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AuthActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                AuthNavHost(rememberNavController())
            }
        }
    }
}