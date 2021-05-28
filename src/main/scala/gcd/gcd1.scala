package gcd

import chisel3._

class gcd1 extends Module {
  val io = IO(new Bundle {
    val in = Input(UInt(1.W))
    val out = Output(UInt(1.W))
    //val outputValid   = Output(Bool())
  })
  val val1 = io.in
  println(s"Hell0 $val1")
  io.out:=val1
    //io.outputValid:=true 
}