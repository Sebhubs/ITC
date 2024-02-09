package lectures.part1basics

object Expressions extends App {
  println("Hi Expressions")

  val x = 1 + 2 // EXPRESSION
  val y = 1 + 2.3 // EXPRESSION
  println(x)

  // + - * / & | ^ << >> >>> ( right shift with zero extension )

  println( x == 1 )
  println( 1 == x )

  // == != > >= , <=

  println(  (1 == x ) | (3 == x )) // || = or
  println(  (5 >= x ) & (3 == x )) // && = and
  // ! && ||


  var aVariable = 5
  println(aVariable)
  aVariable += 2
  println(aVariable)
  aVariable *= 2
  println(aVariable)
  aVariable /= 2
  println(aVariable)



  // INSTRUCTIONS VS EXPRESSIONS

  // Instruction = Something you tell the computer to do:
  // change a variable, print to the console, etc
  // (imperative languages - Python/Java - are instructions focused )

  // Expression =  something that has a value and/or a type

  // IF expression
//  val aCondition = true
  val aCondition = false
  var aConditionedValue1 = if(aCondition) 5 else 3
  println(aConditionedValue1)
  val aConditionedValue2 = if(aCondition==false) 5 else 3
  println(aConditionedValue2)
  println((if(aCondition) 5 else 3) + (if(aCondition==false) 5 else 3) )

  //println( 50*"h" )

  // LOOPS
  var i = 0
  while ( i< 10 ){
    println( i )
    i += 1
  }

//  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  println("This the aWhile : ", aWhile)



  // Everything in Scala is a expression
  val aWeirdValue = ( aVariable = 3  ) // Unit === void
  println( aWeirdValue )

  // reassigning aVariable is a side effect, a while loop is a side effect
  // side effects return () === Unit
  // side effects: println(), whiles, reassigning



  // Code blocks
  val aCodeBlock = {
    val y = 2       // code blocks have their own definition inside
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }


  // 1. difference between "hello world" vs println("hello world")?
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)


  val aStrin = "hello world"
  println(aStrin)
  val aPrint = println("astrin")
  println(aPrint)



}
