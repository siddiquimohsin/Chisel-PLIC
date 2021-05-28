package Test1
import chisel3._
import chisel3.util._

class Test1_12 extends Module {
  val io = IO(new Bundle {
    val value1 = Input(UInt(4.W))
    val output = Output(UInt(4.W))
    //val outputValid   = Output(Bool())
  })
  val val1 = io.value1 
  println(s"Hell0 $val1")
  io.output:=val1
    //io.outputValid:=true 
}

    
