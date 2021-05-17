class Order(private val orderNumber:Int){
    private val itemList = mutableListOf<Item>()

    fun addItem(newItem:Item):Order{
        itemList.add(newItem)
        return this
    }
    fun addAll(newItems:List<Item>):Order{
        itemList.addAll(newItems)
        return this
    }
    fun print(){
        println("order #${orderNumber}")
        var total = 0
        for(item in itemList){
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Total : $${total}")
    }
}
