
/**
  * Created by vishalgupta on 7/7/16.
  */
object Test {
  def main(args:Array[String]): Unit = {
    System.out.println(addNumber())
    System.out.println(returnString())
    System.out.println(findMax(4,8))
    val weekdays = new Array[String](5)
    weekdays(0)= "monday"
    weekdays(1)= "tuesday"
    weekdays(2)= "wednesday"
    weekdays(3)= "thursday"
    weekdays(4)= "friday"

    val weekends=Array("saturday","sunday")
    displayIteration(weekdays)
    displayIteration(weekends)
    whileDo(weekdays)

    val sum =(x:Int,y:Int) => x+y
    println(sum(4,4))
    println(funcLiteral(10,10))

  }
  def addNumber(): Integer =
  {
    val message:Integer=4+8
    return message
  }
  def returnString(): String =
  {
    val message:String="dude scala is crazy!!!"
    return message
  }

  def findMax(x:Int,y:Int): Int=
  {
    if(x>y) return x else y
  }

  def funcLiteral(x:Int,y:Int): Int=
  {
    val sum =(x:Int,y:Int) => x+y
    return sum(14,24);


  }

  def displayIteration(tokens:Array[String]):Unit=
  {
    tokens.foreach((tok:String)=> System.out.println(tok))
  }

  def whileDo(tokens:Array[String]):Unit=
  {
    var i=0
    while(i < tokens.length)
    {
      System.out.print(tokens(i) + "\t")
      i += 1
    }
  }

}

