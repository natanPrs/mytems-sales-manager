package com.myt_sales_manager.models

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = "tb_sold_items")
data class SoldItemModel(

    @Id
    val id: UUID = UUID.randomUUID(),

    val itemId: UUID,

    val sellerId: UUID,

    val buyerId: UUID,

    val amount: BigDecimal,

    val localStamp: LocalDateTime
)
