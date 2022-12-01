`timescale 1ns/1ns
`include "adder.v"

module testbench();
	reg [4:0]a;
	wire f;

	adder q1(a,f);
	initial 
		begin
			$dumpfile("testbench.vcd");
			$dumpvars(0,testbench);

			a[0] = 1'b0; a[1] = 1'b0; a[2] = 1'b0; a[3] = 1'b0; #20;
			a[0] = 1'b0; a[1] = 1'b0; a[2] = 1'b0; a[3] = 1'b1; #20;
			a[0] = 1'b0; a[1] = 1'b0; a[2] = 1'b1; a[3] = 1'b0; #20;
			a[0] = 1'b0; a[1] = 1'b0; a[2] = 1'b1; a[3] = 1'b1; #20;
			a[0] = 1'b0; a[1] = 1'b1; a[2] = 1'b0; a[3] = 1'b0; #20;
			a[0] = 1'b0; a[1] = 1'b1; a[2] = 1'b0; a[3] = 1'b1; #20;
			a[0] = 1'b0; a[1] = 1'b1; a[2] = 1'b1; a[3] = 1'b0; #20;
			a[0] = 1'b0; a[1] = 1'b1; a[2] = 1'b1; a[3] = 1'b1; #20;
			a[0] = 1'b1; a[1] = 1'b0; a[2] = 1'b0; a[3] = 1'b0; #20;
			a[0] = 1'b1; a[1] = 1'b0; a[2] = 1'b0; a[3] = 1'b1; #20;
			a[0] = 1'b1; a[1] = 1'b0; a[2] = 1'b1; a[3] = 1'b0; #20;
			a[0] = 1'b1; a[1] = 1'b0; a[2] = 1'b1; a[3] = 1'b1; #20;
			a[0] = 1'b1; a[1] = 1'b1; a[2] = 1'b0; a[3] = 1'b0; #20;
			a[0] = 1'b1; a[1] = 1'b1; a[2] = 1'b0; a[3] = 1'b1; #20;
			a[0] = 1'b1; a[1] = 1'b1; a[2] = 1'b1; a[3] = 1'b0; #20;
			a[0] = 1'b1; a[1] = 1'b1; a[2] = 1'b1; a[3] = 1'b1; #20;

			$display("Test Complete");
		end
endmodule
