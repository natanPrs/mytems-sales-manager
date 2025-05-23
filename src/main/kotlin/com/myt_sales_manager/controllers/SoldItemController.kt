package com.myt_sales_manager.controllers

import com.myt_sales_manager.dtos.SoldItemDto
import com.myt_sales_manager.models.SoldItemModel
import com.myt_sales_manager.services.SoldItemService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sold")
class SoldItemController(
    private val soldItemService: SoldItemService) {

    @PostMapping
    fun saveNewSold(soldItemDto: SoldItemDto): ResponseEntity<SoldItemModel> {
        val newSold = soldItemService.saveNewSold(soldItemDto)
        return ResponseEntity(newSold, HttpStatus.OK)
    }

    @GetMapping
    fun getAllSold(): ResponseEntity<List<SoldItemModel>> = ResponseEntity(soldItemService.getAllSold(), HttpStatus.OK)
}
