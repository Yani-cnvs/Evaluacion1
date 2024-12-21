package com.example.evaluacion1yanitzacv.modelo

class CuentaMesa(val mesa: Int) {
    private val _items = mutableListOf<ItemMesa>()
    var aceptaPropina: Boolean = true

    fun agregarItem(itemMenu: ItemMenu, cantidad: Int) {
        _items.add(ItemMesa(cantidad, itemMenu))
    }

    fun agregarItem(itemMesa:ItemMesa) {
        _items.add(itemMesa)
    }

    fun calcularTotalSinPropina():Int {
        return _items.sumOf { it.calcularSubtotal() }
    }
    fun calcularPropina(porcentaje:Int = 10):Int {
        val totalSinPropina = calcularTotalSinPropina()
        return (totalSinPropina * porcentaje) / 100
    }

    fun calcularTotalConPropina(porcentaje:Int = 10):Int {
        return calcularTotalSinPropina() + calcularPropina(porcentaje)
    }
}