

val list1 = new java.util.ArrayList[Int];
{
  println("Created list1" )
}
val list2 = new java.util.ArrayList[Int]
{
  println("Created list2" )
}
println(list1.getClass())
println(list2.getClass())


class Vehicle {
  protected def checkEngine() {}
}

class Car extends Vehicle {
  def start() { checkEngine() /*OK*/ }
  def tow(car: Car) {
    car.checkEngine() //OK
  }
  def tow(vehicle: Vehicle) {
    //vehicle.checkEngine() //ERROR
  }
}

