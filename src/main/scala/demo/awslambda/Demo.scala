package demo.awslambda

import scala.scalajs.js.annotation.JSExport

@JSExport
object Demo {
  @JSExport
  def apply(event: Object, context: Object): String = {
    println("Scala JS, Hello world!")
    println(event)
    println(context)
    "Completed Lambda Hello World"
  }
}

@JSExport
object DemoFailing {
  @JSExport
  def apply(event: Object, context: Object): String = {
    println("This lambda will fail!")
    throw new IllegalArgumentException("failed from Scala")
  }
}
