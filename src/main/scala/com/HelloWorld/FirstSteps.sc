
/** devon object.
  * Age method returns given integer.*/
object devon {
  val species = "Human"
  val name = "Devon"

  def age(value: Int): Int = value
}

println(devon.name + " is a " + devon.species)


/** Calculator object
  * Returns square of given integer.*/
object calc {
  def square(number: Int): Int = number * number
}

calc.square(5)

/** better calculator object.
  * Defines both square and cube methods for a given Double.*/
object betterCalc{
  def square(number: Double): Double = number * number

  def cube(number: Double): Double = betterCalc.square(number) * number

}

betterCalc.cube(2.0)

assert(calc.square(2) == 4)
assert(betterCalc.square(3.0) == 9.0)
assert(betterCalc.square(-2.0) == 4.0)

if(7 < 10) println("Yes") else println("No")