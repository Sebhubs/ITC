package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + "-" * 50 + b
  }
  println(aFunction("hello", 3))
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello",3))

  // WHEN YOU NEED LOOPS, USE RECURSION.
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int, c: Int): Int = a + b + c

//    aSmallerFunction(n, n-1)
    aSmallerFunction(n, n-1, n-2 )
  }
  println( aBigFunction( 5 ) )


  // 1. A greeting Function :
  def greeting( name: String, age:Int ): String =  {
    //1. By string concatenation :
    //"My name is "+name+" and I am "+age+" years old"

    // Or by string interpolation
    //1. With '$' and 's'
    s"My name is $name and I am $age years old "
    //2. With "String.format"
    //String.format("My name is %s and I am %d years old.",
    //                  name, Integer.valueOf(age))
    //3. With using f String Interpolator
    //f"My name is $name%s and I am $age%d years old."
    //4. With StringBuilder
    new StringBuilder().append("My name is ").append(name)
      .append(" and I am ").append(age)
      .append(" years old.").toString()
  }
  println(greeting( "Andrew", 33 ))

  //2. Factorial function
  def factorialFunction(n: Int): Int = {
    if (n <= 1) 1
    else n * factorialFunction(n - 1)
  }
  // calling the function
  println(factorialFunction( 9 ))

  //3, Test if a number is even
  def isTheNbEven(n: Int): String = {
    var s1: String = "Yes"

    if ((n % 2) == 0)
      s1 = f"Yes, $n%d, is  an even number !"
    else
      s1 = f"Noo, $n%d, is not an even number !";
    s1;
  }
  // Calling the function
  var k: Int = 55
  println( isTheNbEven( k  ))
  k = 82
  println( isTheNbEven( k ))


  //4, Prime or not prime ? That's the question
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 until n).exists(i => n % i == 0)
  }
  // Calling the function
  k = 45
  println( s"$k is a Prime number true or false ? " + isPrime( k ))
  k = 47
  println( s"$k is a Prime number true or false ? " + isPrime( k ))


  //5. Fibonacci
  def fibonacci(n: Int): Int = {
    if (n <= 0)
      return 0
    else if (n == 1)
      return 1
    else
      return fibonacci(n-1) + fibonacci(n-2)
  }
  // Calling the function
  k = 8
  println( s"Fibbonaci of $k is : ", fibonacci(k) )

}
