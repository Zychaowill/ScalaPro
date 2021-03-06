package example07.ex.ex3

package random {
  object Random {
    private val a = 1664525
    private val b = 1013904223
    private val n = 32
    
    private var seed = 0
    private var follow:BigInt = 0
    private var previous:BigInt = 0
    
    def nextInt(): Int = {
      follow = (previous * a + b) % BigInt(math.pow(2, n).toLong)
      previous = follow
      (follow % Int.MaxValue).intValue()
    }
    
    def nextDouble():Double = {
      nextInt().toDouble
    }
    
    def setSeed(seed: Int):Unit = {
      this.seed = seed
      previous = seed
    }
  }
}

object Test extends App {
  var r = random.Random
  r.setSeed(args(0).toInt)
  
  for (i <- 1 to 10) print(r.nextInt() + "\t")
  for (i <- 1 to 10) print(r.nextDouble() + "\t")
}