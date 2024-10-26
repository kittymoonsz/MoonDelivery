package com.queencard.moondelivery.ui.screen.components

import android.app.ActionBar
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.widget.ConstraintLayout
import com.queencard.moondelivery.R

@Composable
fun ProductPreviewSection(
    modifier: Modifier = Modifier
) {

}

@Composable
//fix it
//private fun Content(modifier: Modifier = Modifier) {
//    ConstraintLayout(
//        modifier = modifier.fillMaxWidth()
//    ) {
//        val (actionBar, highlights, productImg) = createRefs()
//
//        ActionBar(
//            headline = "Moon Cheezy",
//            modifier = Modifier
//                .padding(horizontal = 18.dp)
//                .constrainAs(actionBar) {
//                    top.linkTo(parent.top)
//                }
//        )
//    }
//}


private fun ActionBar(
    modifier: Modifier = Modifier,
    headline: String
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = headline
        )
        CloseButton(modifier = Modifier)
    }
}

@Composable
private fun CloseButton(
    modifier: Modifier
) {
    Surface(
        modifier = modifier,
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_close),
                contentDescription = null,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}