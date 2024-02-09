
object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world 0 ")
    val alice = new Person( "Alice": String, 30: Int );
    val bob   = new Person( "Bob"  : String, 31: Int );

    alice.greet()
    bob.greet()
    alice.greet()
    bob.greet()
    alice.greet()

  }
}


class Person(name: String, age: Int) {
  def greet(): Unit = {
    println(s"Hello, my name is $name and I am $age years old.")
  }
}

