fun main (){
output()
  var h=  mylength("school")
    println(h)
    var g= mydata("Anena",15)
    println(g)
    mydata("Beatrice",10)
    myname()
}
//Question 1
fun output(){
    var school= "akirachix"
    var s = school[0].toString() +school[2] +school[3]
    println(s)
}
//Question 2
fun mydata(x:String,y:Int):String{
    var b= "Hey, my name is $x and i am $y years old"
    return(b)
}
//Question 3
fun mylength(p:String):Int{
    var w= p.length
    return w
}
//Question 4
fun myname() {
    var name = "anena"
    var x = name
    if (x.equals(name)) {
        println("Thats my name")
    } else {
        println("I dont know who that is")
    }
}




