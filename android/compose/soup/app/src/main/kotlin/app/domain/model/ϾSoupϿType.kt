package app.domain.model

import app.R

enum class ϾSoupϿType(val description: Int, val image: Int, val category: ϾSoupϿCategory) {
    tomato(R.string.tomato, R.drawable.tomato, ϾSoupϿCategory.ϾcreamyϿ),
    splitPea(R.string.split_pea, R.drawable.split_pea, ϾSoupϿCategory.ϾcreamyϿ),
    minestrone(R.string.minestrone, R.drawable.minestrone, ϾSoupϿCategory.ϾwateryϿ)
}

