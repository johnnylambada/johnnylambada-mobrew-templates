package app.domain.model

import java.time.LocalDateTime

data class ϾSoupϿSighting(
    val date: LocalDateTime,
    val type: ϾSoupϿType,
    val temperature: Int
)
