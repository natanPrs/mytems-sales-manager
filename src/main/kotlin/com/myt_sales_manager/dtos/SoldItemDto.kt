package com.myt_sales_manager.dtos

import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

data class SoldItemDto(
    val itemId: UUID,

    val sellerId: UUID,

    val buyerId: UUID,

    val amount: BigDecimal,

    val localStamp: LocalDateTime
)
