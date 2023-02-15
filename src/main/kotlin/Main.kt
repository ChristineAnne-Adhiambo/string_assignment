fun main() {
str()
    println( nameGreet("Anne", 24) )
    length()
    print("Tina")

}
fun str (){
    var string1 = "akirachix"
    println(string1[1] .toString() + string1[2]+ string1[3])
}
fun nameGreet(name : String, age : Int) :String{
    var greeting = "Hi my name is $name and I am $age years old"
    return greeting
}
fun length() {
    val string3 = "Anna Adhiambo"

    println(string3.length)
}
fun print(name: String) {
    var jina = "Tina"
    if (jina.equals (name)){
        println("Thats me")
    } else {
        println("I don't know who that is")
    }
}