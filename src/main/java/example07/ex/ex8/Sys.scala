package example07.ex.ex8

object Sys {
  import scala.io.StdIn
  import java.lang.System._

  def main(args: Array[String]): Unit = {
    val pass = StdIn.readLine()
    if (pass == "secret") {
      val name = getProperty("user.name")
      out.printf("Greetings, %s", name)
    } else {
      err.println("error")
    }
  }
}