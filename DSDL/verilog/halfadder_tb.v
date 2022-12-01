`timescale 1ns/1ns
`include "halfadder.v"

module halfadder_tb();
reg a,b;
wire s,c;
halfadder hf(a,b,s,c);
initial
begin
    $dumpfile("halfadder_tb.vcd");
    $dumpvars(0,halfadder_tb);

    a = 1'b0; b = 1'b0; #20;
    a = 1'b0; b = 1'b1; #20;
    a = 1'b1; b = 1'b0; #20;
    a = 1'b1; b = 1'b1; #20;

    $display("Test Complete");
end
endmodule
