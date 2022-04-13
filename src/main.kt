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

    word("codehive")
    var show=getmodulus(20,3)
    println(show)

    var hi=greet("Veronica",20)
    println(hi)
    var me=string("Australia")
    println(me.length)
    var see=takeArray(arrayOf(12,10,4,5))
    println(see)
    println(getArrays(arrayOf(true,30.0,12,"a",40.5,60.1,false)))

    println(getVowels(arrayOf('s','a','i','u','o','e','c','l')))


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
fun takeArray(name:Array<String>){
    println(name.contentToString())
}
fun takeCities(city:Array<String>){
    city.forEach { a ->
        println(a.capitalize())
    }
}
fun getNums(num:Array<Int>) {
    var sum=num[3]+num[6]
    println(sum)
    var position=num.indexOf(158)
    println(position)
    var arrange=num.sortedArray()
    println(arrange.contentToString())
}
fun takeName(name:Array<String>):Array<String> {
    return name
}
fun word(name:String){
    var text=(name[4])
    var text2=(name[5])
    var text3=(name[6])
    var text4=(name[7])
    var result=text.toString()+text2+text3+text4
    println(result)
}
fun getmodulus(num1:Int,num2:Int):Int {
    var nums=num1%num2
    return nums
}
fun greet(name:String,age:Int):Any{
    var statement="Hi my name is $name and I am $age years old"
    return statement
}
fun string(word:String):String {
    return word
}
fun takeArray(num:Array<Int>):Int{
    var product=3
    num.forEach { a->
        product*=a
    }
    return product
}
fun getArrays(num:Array<Any>):Double {
    var valueType=1.0
    num.forEach { b->
        if (b is Double || b is Int || b is String || b is Char)
             valueType++
    }
    return valueType
}
fun getVowels(char: Array<Char>):Int {
    var num=0
    char.forEach { c->
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            num++
    }
    return num
}





