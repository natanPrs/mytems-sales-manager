package com.myt_sales_manager.mappers

import com.myt_sales_manager.dtos.SoldItemDto
import com.myt_sales_manager.models.SoldItemModel

fun SoldItemDto.toEntity(): SoldItemModel =
    SoldItemModel(
        globalItemId = this.globalItemId,
        sellerId = this.sellerId,
        buyerId = this.buyerId,
        amount = this.amount,
        localStamp = this.localStamp
    )
