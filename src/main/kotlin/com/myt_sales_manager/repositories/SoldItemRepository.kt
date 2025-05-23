package com.myt_sales_manager.repositories

import com.myt_sales_manager.models.SoldItemModel
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface SoldItemRepository : JpaRepository<SoldItemModel, UUID> {}
