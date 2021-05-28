package Test1

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class Test1_Tests extends FreeSpec with ChiselScalatestTester{
    "Test1" in {
        test(new Test1_12){c =>
        c.io.value1.poke("b111".U)
        c.io.output.expect("b111".U)
    }
    }
	
	
}