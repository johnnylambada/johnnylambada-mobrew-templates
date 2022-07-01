package app.presentation.main

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import app.R

@Preview
@Composable
fun MainScreen(
    vm: MainViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(stringResource(R.string.my_jokes))
                },
                elevation = 0.dp,
                backgroundColor = colorResource(id = android.R.color.white)) },
        content = {
            JokeListScreen()
        }
    )
}

