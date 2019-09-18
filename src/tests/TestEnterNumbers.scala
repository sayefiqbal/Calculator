package tests

import calculator.controller.NumberAction
import calculator.model.Calculator
import org.scalatest.FunSuite

class TestEnterNumbers extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  // Example test case
  test("Enter Numbers Test") {
    val calculator: Calculator = new Calculator()

    new NumberAction(calculator, 1).handle(null)
    new NumberAction(calculator, 2).handle(null)
    new NumberAction(calculator, 5).handle(null)

    assert(equalDoubles(calculator.displayNumber(), 125.0), calculator.displayNumber())
  }

}
