package me.dumbtest.kt_basics.day3


fun main(){
    val pucca = Dog("pucca", "salchicha") //ponc is a dog, no new kw
    print("My baby is a ${pucca.breed}")
}

//example class of a Perro
//class Dog(/*parameter*/ name:String, /*property*/val breed:String) {
class Dog(/*parameter*/val name:String, /*property*/val breed:String, val age: Int = 1) {
    //params are just info that's passed to the calss
    //prop are unique to each class instance and can be accessed even outside unlike params
    //default values are stated with =

    //constructor, preceedes the initializer, will be exec even withoud init

    //initializer what is done first
    init {
        bark()
    }
    //properties
    //we can also create classes inside classes

    //methods
    fun bark(){
        println("Woof Woof, my name is $name and I'm a $breed")
    }
}