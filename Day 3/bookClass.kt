package me.dumbtest.kt_basics.day3

fun  main(){
    //we can leave it empty since there are default vals
    val myBook = bookClass()
    println(myBook.author)
    println(myBook.title)
    println(myBook.yearPub)

    val customBook = bookClass("1984", "George Orwell", 1955)
    println(customBook.author)
    println(customBook.title)
    println(customBook.yearPub)


}


class bookClass(val title: String = "Unknown", val author : String = "anon", val yearPub: Int = 2024) {

    //public properties & default values
    /*public val title : String = "Unknown"
    public val author : String = "Anon"
    public val yearPub  : Int = 2024*/

}