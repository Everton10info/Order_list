fun main() {
    val orderList = mutableListOf<Order>()

    val order1 = Order(1)
    order1.addItem(Noodles())
    order1.print()

    println()

    val order2 = Order(2)
    order2.addItem(Vegetables("Carrots", "Beans", "Celery"))
    order2.addItem(Noodles())
    order2.print()

    println()

    val order3= Order(3)
    val items = listOf(Noodles(), Vegetables("Beans", "Celery"))
    order3.addAll(items)
    order3.print()

    println()

    val order4 = Order(4)
        .addItem(Noodles())
        .addItem(Vegetables("Cabbage", "onion"))
    orderList.add(order4)

    orderList.add(
        Order(5)
            .addItem(Noodles())
            .addItem(Noodles())
            .addItem(Vegetables("Spinach")))

    for(order in orderList){
        order.print()
        println()
    }
}