package com.example.evaluacion1yanitzacv.modelo

class ItemMesa(val itemMenu: ItemMenu, val cantidad: Int) {
    fun calcularSubtotal(): Int {
        return itemMenu.precio.toInt() * cantidad
    }
}