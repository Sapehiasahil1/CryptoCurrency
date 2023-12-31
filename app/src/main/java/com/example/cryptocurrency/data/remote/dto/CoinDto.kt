package com.example.cryptocurrency.data.remote.dto

import com.example.cryptocurrency.domain.model.Coin

data class CoinDto(
    val id: String,
    val isActive: Boolean,
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin() : Coin {
    return Coin(
        id = id,
        isActive = isActive,
        name = name,
        rank = rank,
        symbol = symbol
    )
}