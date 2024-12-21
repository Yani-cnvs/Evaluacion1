package com.example.evaluacion1yanitzacv.modelo

data class ItemMesa(val itemMenu: ItemMenu, val cantidad: Int) {
    fun calcularSubtotal(): Int {
        return itemMenu.precio * cantidad
    }
}