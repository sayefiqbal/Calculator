package calculator.model

class Clear(override val calculator: Calculator) extends State(calculator){
  calculator.lhs = 0
  calculator.rhs = 0
  calculator.dN = 0.0
  override def operation(): Unit = {

  }
}
