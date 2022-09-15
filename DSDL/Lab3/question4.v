module question4(a,b,c,d,f);

input a,b,c,d;
output f;
wire an, cn;

assign an = a ~| a;
assign cn = c ~| c;
assign f = ~((c ~| d) | (an ~| cn) | (b ~| d));

endmodule
