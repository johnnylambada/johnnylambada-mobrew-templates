package app.domain.model

import app.R

enum class SoupType(val description: Int, val image: Int, val category: SoupCategory) {
    tomato(R.string.tomato, R.drawable.tomato, SoupCategory.creamy),
    splitPea(R.string.split_pea, R.drawable.split_pea, SoupCategory.creamy),
    minestrone(R.string.minestrone, R.drawable.minestrone, SoupCategory.watery)
}

