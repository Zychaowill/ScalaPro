package example05

object NewTime {
  def main(args: Array[String]): Unit = {
    val t1 = new NewTime(10, 30)
    val t2 = new NewTime(10, 50)
    val t3 = new NewTime(11, 10)
    
    println(t1.toString)
    println(t2.toString)
    println(t3.toString)
    println(t1.before(t2))
    println(t3.before(t2))
  }
}

class NewTime(val hours: Int, val minutes: Int) {
  def before(other: NewTime):Boolean = {
    hours < other.hours || (hours == other.hours && minutes < other.minutes)
  }
  
  override def toString():String = {
    hours * 60 + "" + minutes
  }
}