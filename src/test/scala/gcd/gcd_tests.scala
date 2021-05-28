package gcd

import chisel3._
import chisel3.tester._
import org.scalatest.FreeSpec
import chisel3.experimental.BundleLiterals._

class gcd_tests extends FreeSpec with ChiselScalatestTester{
    "GCD 1" in {
        test(new gcd1()){c =>
        c.io.in.poke(1.U)
        c.io.out.expect(1.U)
    }
    }
	
	
}