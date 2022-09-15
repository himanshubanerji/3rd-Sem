module question1(a,b,c,d,f);

input a,b,c,d;
output f;

assign an = a ~& a;
assign cn = c ~& c;
assign f = ~((an ~& cn) & (an ~& d) & (b ~& cn) & (b ~& d));

endmodule
