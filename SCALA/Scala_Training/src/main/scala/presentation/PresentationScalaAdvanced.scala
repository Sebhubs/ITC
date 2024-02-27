package presentation

  object ImplicitFunctionsExample extends App {
    // Implicit class to enhance String with a new method
    implicit class RichString(val s: String) {
      def isNumeric: Boolean = s.matches("[+-]?\\d+(\\.\\d+)?")
    }

      val numericString = "12345"
      val nonNumericString = "abc123"

      // Thanks to implicit conversion, we can now directly call isNumeric on a String
      println(s"'$numericString' is numeric? ${numericString.isNumeric}")
      println(s"'$nonNumericString' is numeric? ${nonNumericString.isNumeric}")

  }


