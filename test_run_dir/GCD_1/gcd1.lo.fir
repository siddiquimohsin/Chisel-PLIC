circuit gcd1 :
  module gcd1 :
    input clock : Clock
    input reset : UInt<1>
    input io_in : UInt<1>
    output io_out : UInt<1>

    io_out <= io_in @[gcd1.scala 13:9]
