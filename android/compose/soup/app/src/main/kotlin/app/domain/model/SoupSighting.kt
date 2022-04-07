package app.domain.model

import java.time.LocalDateTime

data class SoupSighting(
    val date: LocalDateTime,
    val type: SoupType,
    val temperature: Int
)