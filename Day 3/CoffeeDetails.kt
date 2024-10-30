package me.dumbtest.kt_basics.day3

//Kinda like structs, they only hold data
//they are encapsulated between parenthesis
data class CoffeeDetails (
    val sugarAmnt : Int,
    val name : String,
    val size: String,
)

fun  main(){
    //new data class coffee details
    val cafe = CoffeeDetails(2, "Eileen", "L")
    //we can also pass obj as arg
    makeACoffee(cafe)
}
//a function with a data class as a params
fun makeACoffee(details : CoffeeDetails){

    println("Coming in! an ${details.size} size coffee with " + when{
        details.sugarAmnt <= 0 -> "no sugar"
        details.sugarAmnt == 1 -> "1 spoonful of sugar"
        else -> "${details.sugarAmnt} spoonfuls of sugar"
    } + " for ${details.name}")

}