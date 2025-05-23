package com.myt_sales_manager.services

import com.myt_sales_manager.dtos.SoldItemDto
import com.myt_sales_manager.mappers.toEntity
import com.myt_sales_manager.models.SoldItemModel
import com.myt_sales_manager.repositories.SoldItemRepository
import org.springframework.stereotype.Service

@Service
class SoldItemService(
    private val soldItemRepository: SoldItemRepository) {

    fun saveNewSold(soldItemDto: SoldItemDto): SoldItemModel{
        val newSold = soldItemDto.toEntity()
        return soldItemRepository.save(newSold)
    }

    fun getAllSold(): List<SoldItemModel> = soldItemRepository.findAll()

}
