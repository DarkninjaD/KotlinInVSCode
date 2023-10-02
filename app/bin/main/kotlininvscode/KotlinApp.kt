package kotlininvscode;

class KotlinApp {
  public fun getGreeting() : String {
    return "Hello kotlin"
  }
}
fun main() {
  println(KotlinApp().getGreeting())
}

class Sample() {
  fun sum(a:Int, b:Int) : Int {
    return a+b
  }
}
