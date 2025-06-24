package com.myt_sales_manager.consumer

import com.myt_sales_manager.dtos.SoldItemDto
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class SoldItemListener {

    @KafkaListener(topics = ["savePurchase"], groupId = "sales-group", containerFactory = "soldItemFactory")
    fun soldItemListener(soldItemDto: SoldItemDto){
        println("Deu certo!")
    }
}