package app.presentation.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import app.domain.model.Joke

@Composable
fun JokeListScreen(
    vm: MainViewModel = viewModel()
) {
    val state by vm.state.collectAsState()

    LaunchedEffect(key1 = Unit) {
        vm.update()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = android.R.color.white))
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            reverseLayout = true
        ) {
            val list = state.jokeList
            items(list) { SightingRow(it) }
        }
    }
}

@Composable
fun SightingRow(joke: Joke) {
    Column(
        modifier = Modifier.padding(8.dp,0.dp,8.dp,0.dp)
    ) {
        Text(
            modifier = Modifier.padding(0.dp,8.dp,0.dp,0.dp),
            text = joke.setup,
            fontSize = 16.sp
        )
        Text(
            modifier = Modifier.padding(0.dp,0.dp,0.dp,8.dp),
            text = joke.delivery,
            fontSize = 14.sp
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .height(1.dp)
        ) {
            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(colorResource(id = android.R.color.darker_gray)))
        }
    }
}
