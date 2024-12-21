package com.example.evaluacion1yanitzacv.modelo

class CuentaMesa(val mesa: Int) {
    private val _items = mutableListOf<ItemMesa>()
    var aceptaPropina: Boolean = true

    fun agregarItem(itemMenu: ItemMenu, cantidad: Int) {
        _items.add(ItemMesa(itemMenu, cantidad))
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

    fun main() {
        val itemMenu1 = ItemMenu("Cazuela", 10000)
        val itemMenu2 = ItemMenu("Pastel de Choclo", 12000)
        val cuentaMesa1 = CuentaMesa(1)
        cuentaMesa1.agregarItem(itemMenu1, 2)
        cuentaMesa1.agregarItem(itemMenu2, 1)

        val itemMesa3 = ItemMesa(itemMenu1, 3)
        cuentaMesa1.agregarItem(itemMesa3)

        val totalSinPropina = cuentaMesa1.calcularTotalSinPropina()
        val propina = cuentaMesa1.calcularPropina()
        val totalConPropina = cuentaMesa1.calcularTotalConPropina()
    }
}