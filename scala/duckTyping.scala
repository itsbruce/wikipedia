object duckTypes {
  type DuckLike = { def quack: String; def feathers: String }
}

class Duck {
  def quack = "Quaaaaaack!"
  def feathers = "The duck has white and gray feathers."
}

class Person {
  def quack = "The person imitates a duck"
  def feathers = "The person takes a feather from the ground and shows it."
  def name = "John Smith"
}

import duckTypes._
// import scala.languageFeature.reflectiveCalls

def inTheForest(duck: DuckLike) = {
  println(duck.quack)
  println(duck.feathers)
}

val donald = new Duck
val john = new Person
inTheForest(donald)
inTheForest(john)
