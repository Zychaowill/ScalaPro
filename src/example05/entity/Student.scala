package example05.entity

class Student {
  private var name = ""
  private var age = 0
  
  def this(name: String) {
    this()
    this.name = name
  }
  
  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
}