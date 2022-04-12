fun main() {
    var fname :String ="Mercy"
    println(fname)
    var phone :String= "0972355746"
    println(phone)
    var age:Int =20
    println(age)
    var citizenship :String =" is kenyan"
    println(citizenship)
    var weight : Int =50
    println(weight)
    val iskenyan = true
    val isnotKenyan =false
    println(iskenyan)

   println(greeting("Ada"))

    println(modulus(20,3))

    println(add(20,40,12,12))

    println(funFact("Nancy","swimming"))
}
fun greeting(name:String):String {
    var statement="hello $name"
    return statement
}
fun modulus(num:Int,num2:Int):Int{
    var total=num%num2
    return total
}
fun add(num:Int,num2:Int,num3:Int,num4:Int):Int {
    var sum=num+num2+num3+num4
    return sum
}
fun funFact(name:String,trait:String):String {
    var speech="I am $name and I love $trait"
    return speech
}





