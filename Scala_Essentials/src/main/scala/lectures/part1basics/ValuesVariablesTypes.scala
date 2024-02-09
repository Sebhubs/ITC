package lectures.part1basics
object ValuesVariablesTypes extends App {
  // We added extends App in order for the script to be "runnable"


  //  Values //////////////////////////////////////////////
  // Syntax to declare a val
  val x: Int = 22
  println(x)
  val y = 24
  print(x); println(y)
  println(y); print(x)
  //  VALS ARE IMMUTABLE
  //  compiler can infer types

  val aString : String = "hello ! this is a string"
  println( aString )
  val anotherString = "good bye ! this is a string"
  println( anotherString )

  val aBoolean: Boolean = false
  println( aBoolean )

  val aChar: Char = 'a'
  println(aChar)
  var anInt: Int = x
  println( anInt )

  //the following 2 lines wont work
  //  val anInt: Int = x
  //  var anInt: Int = x
  //  If we want to update/change a variable's "var" value:
  anInt = y
  println( anInt )

  val aShort: Short = 32767
  println(aShort)
  val a2ndShort: Short = -32767
  println(a2ndShort)
  //  In the next line, the character 'L' is essential for the compilation to take place!
  val a1stLong: Long = 123456789123456789L
  println(a1stLong)
  val a2ndLong: Long = 1234567891234567891L
  println(a2ndLong)
  //  Otherwise, the compiler doesnt accept it like that :
  //  val aLong: Long = 123456789123456789

  val a1stFloat: Float = 2.987f
  println(a1stFloat)
  val a2ndFloat: Float = 2.987F
  println(a2ndFloat)
  val aDouble: Double = 3.14
  println(aDouble)



  //  Variables ///////////////////////////////////////////
  var aVariable: Int = 78
  println(aVariable)
  aVariable = 5      // side effects
  println(aVariable)

}
