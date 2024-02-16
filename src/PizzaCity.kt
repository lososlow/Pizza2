abstract class PizzaCity(
    val neapolitanPizzaPrice: Double, val romanPizzaPrice: Double,
    val sicilianPizzaPrice: Double, val tyroleanPizzaPrice: Double
) {
    var neapolitanPizzaCount = 0
    var romanPizzaCount = 0
    var sicilianPizzaCount = 0
    var tyroleanPizzaCount = 0
    var checkPhotosShownCount = 0
    var coffeeSoldCount = 0
    var totalDiscountAmount = 0.0
    var totalCoffeeRevenue = 0.0

    abstract fun  neapolitanPizzaSale()
    abstract fun  romanPizzaSale()
    abstract fun  sicilianPizzaSale()
    abstract fun  tyroleanPizzaSale()

    fun showStatistics(){
        println("Продано сицилийской пиццы: $sicilianPizzaCount")
        println("Продано неаполетанской пиццы: $neapolitanPizzaCount")
        println("Продано римской пиццы: $romanPizzaCount")
        println("Продано тирольской пиццы: $tyroleanPizzaCount")
        println("Показано чеков: $checkPhotosShownCount")
        println("Продано кофе: $coffeeSoldCount")
        println("Общая сумма скидок: $totalDiscountAmount")
        println("Общая выручка за кофе: $totalCoffeeRevenue")


        val money = neapolitanPizzaCount * neapolitanPizzaPrice + romanPizzaCount * romanPizzaPrice +
                sicilianPizzaCount * sicilianPizzaPrice + tyroleanPizzaCount * tyroleanPizzaPrice + totalCoffeeRevenue

        println("Всего заработано денег: $money")
    }
}