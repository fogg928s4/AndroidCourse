package me.dumbtest.kt_basics.day4

fun main(){
    //a basic list of items to buy a PC
    //inmutable list, we cant add any more items
    var shopList = listOf<String>("CPU", "RAM", "GPU", "ROM")

    //mutable list so u can add items and change them
    var wishList = mutableListOf<String>("CPU", "RAM", "GPU", "ROM")
    //add a new element, theres to ways, by index + value or just value @ the end
    wishList.add("PSU")
    println(wishList)

    //we can also remove items by index or value
    //wishList.removeAt(5)
    wishList.remove("CPU")
    println(wishList)

    wishList.add("CPU")

    //indexes work the same as usual, but for the for loops
    //u dont use val i, u just declare the i in (range)



    //we can also mod an element in whichever of these ways
    wishList.set(3, "Cooling")
    wishList[2] = "Network Card"
    println(wishList)
    for(i in 0..4) {
        print("The ${wishList[i]} u want is ")
        if(shopList.contains(wishList[i]))
            print(" on your car\n")
        else
            print(" not on your car\n")
    }
    //another way
    for(i in 0 until wishList.size) {
        print("The ${wishList[i]} u want is ")
        if(shopList.contains(wishList[i]))
            print(" on your car\n")
        else
            print(" not on your car\n")
    }

}