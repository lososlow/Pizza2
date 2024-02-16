class PizzaPeter (
    neapolitanPizzaPrice: Double, romanPizzaPrice: Double,
    sicilianPizzaPrice: Double, tyroleanPizzaPrice: Double
) : PizzaCity(
    neapolitanPizzaPrice, romanPizzaPrice,
    sicilianPizzaPrice, tyroleanPizzaPrice
), Drink {
    override fun drinkSale() {
        println("Вы будете кофе?")
        println("1. Да\n2. Нет")
        if (readln() == "1") {
            println("С вас 200 рублей")
            totalCoffeeRevenue += 200.0
            coffeeSoldCount++
        }
    }

    override fun neapolitanPizzaSale() {
        neapolitanPizzaCount++
        println("Спасибо за покупку неаполетанской пиццы в Санкт-Петербурге")
    }
    override fun romanPizzaSale() {
        romanPizzaCount++
        println("Спасибо за покупку римской пиццы в Санкт-Петербурге")
    }
    override fun sicilianPizzaSale() {
        sicilianPizzaCount++
        println("Спасибо за покупку Сицилийской пиццы в Санкт-Петербурге")
    }
    override fun tyroleanPizzaSale() {
        tyroleanPizzaCount++
        println("Спасибо за покупку тирольской пиццы в Санкт-Петербурге")
    }
}