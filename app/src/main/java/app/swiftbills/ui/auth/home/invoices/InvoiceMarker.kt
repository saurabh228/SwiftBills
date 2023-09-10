package app.swiftbills.ui.auth.home.invoices

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import app.swiftbills.R
import app.swiftbills.ui.theme.AppTheme
import app.swiftbills.ui.theme.spacing

@Composable
fun InvoiceMarker(isPaid: Boolean) {
    val spacing = MaterialTheme.spacing
    val stringRes = if (isPaid) R.string.paid else R.string.pending
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(spacing.small))
            .width(70.dp)
            .background(if (isPaid) MaterialTheme.colorScheme.secondary else MaterialTheme.colorScheme.errorContainer)
    ) {
        Text(
            text = stringResource(stringRes),
            style = MaterialTheme.typography.bodySmall,
            color = if (isPaid) MaterialTheme.colorScheme.onSecondary else MaterialTheme.colorScheme.onErrorContainer,
            modifier = Modifier.padding(top = spacing.extraSmall, bottom = spacing.extraSmall, start = spacing.small, end = spacing.small)
        )
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun InvoiceMarkerPreviewLight() {
    AppTheme {
        InvoiceMarker(isPaid = true)
    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun InvoiceMarkerPreviewDark() {
    AppTheme {
        InvoiceMarker(isPaid = false)
    }
}