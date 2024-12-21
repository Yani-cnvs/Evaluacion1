package com.example.evaluacion1yanitzacv.modelo

data class ItemMesa(val itemMenu: Int, val cantidad: ItemMenu) {
    fun calcularSubtotal(): Int {
        return itemMenu.precio.toInt() * cantidad
    }
}