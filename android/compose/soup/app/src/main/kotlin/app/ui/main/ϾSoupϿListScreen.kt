package app.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import app.R
import app.domain.model.ϾSoupϿSighting
import app.domain.model.ϾSoupϿCategory
import java.time.format.DateTimeFormatter

@Composable
fun ϾSoupϿListScreen(
    category: ϾSoupϿCategory,
    vm: MainViewModel = viewModel()
) {
    val state by vm.state.collectAsState()

    LaunchedEffect(key1 = Unit) {
        vm.update()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white_f8))
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            reverseLayout = true
        ) {
            val list = state.ϾsoupϿSightings
                .filter { it.type.category == category }
            items(list) { SightingRow(it) }
        }
    }
}

@Composable
fun SightingRow(ϾsoupϿSighting: ϾSoupϿSighting) {
    val dateFormatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy @ h:mm a")
    Column {
        Row(modifier = Modifier,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .width(64.dp)
                .wrapContentSize(Alignment.Center)
            ) {
                Image(
                    modifier = Modifier
//                      .scale(0.75f)
                        .padding(10.dp),
                    painter = painterResource(
                        id = ϾsoupϿSighting.type.image,
                    ),
                    contentDescription = stringResource(id = ϾsoupϿSighting.type.description),
//                  colorFilter = ColorFilter.tint(colorResource(id = R.color.green_500))
                )
            }
            Column(modifier = Modifier
                .padding(0.dp, 10.dp)
            ) {
                Text(
                    text = ϾsoupϿSighting.date.format(dateFormatter),
                    fontSize = 16.sp
                )
                Text(
                    text = "${ϾsoupϿSighting.temperature}°F · ${stringResource(id = ϾsoupϿSighting.type.description)}",
                    fontSize = 14.sp
                )

            }
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
        ) {
            Spacer(modifier = Modifier.width(64.dp))
            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(colorResource(id = R.color.gray_21_8)))
        }
    }
}
