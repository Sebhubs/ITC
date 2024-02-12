package lectures.part1basics
object CBMvsCBV extends App {


  def calledByValue(x: Long): Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def calledByName(x: => Long): Unit = {
    println("by name: " + x)
    println("by name: " + x)
  }

  calledByValue(1257387745764245L)
  calledByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  // Call By Value
//  def printFirst(x: Int, y: Int) = println(x)
//  printFirst(34, infinite())  // stack overflow because evaluate the infinite() before starting

  // Call By Name
  def printFirst(x: Int, y: => Int) = println(x)
  printFirst(34, infinite())     // Executes and waits till the infinite() is needed to be evaluated



  //  printFirst(infinite(), 34) // stack overflow


}
