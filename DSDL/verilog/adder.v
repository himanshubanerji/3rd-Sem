module adder (a,f);
	input [4:0]a;
	output f;

    assign f = (~a[1] & a[3]) | (~a[1] & a[2]) | (a[1] & ~a[2] & ~a[3]);

endmodule
