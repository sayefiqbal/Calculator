package calculator.model


class Calculator() {

  var dN: Double = 0.0
  var lhs: Int = 0
  var rhs: Int = 0
  var state: State = new Clear(this)

  // Accessed by View. You should edit this method as you build functionality
  def displayNumber(): Double = {
    // TODO
    dN
  }

  def clearPressed(): Unit = {
    // TODO
  }

  def numberPressed(number: Int): Unit = {
    // TODO
  }

  def dividePressed(): Unit = {
    // TODO
  }

  def multiplyPressed(): Unit = {
    // TODO
  }

  def subtractPressed(): Unit = {
    // TODO
  }

  def addPressed(): Unit = {
    // TODO
  }

  def equalsPressed(): Unit = {
    // TODO
  }

  def decimalPressed(): Unit = {
    // TODO
  }


}
