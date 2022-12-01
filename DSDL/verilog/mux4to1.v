module mux2to1 (w0,w1,s,f);
input w0,w1,s;
output f;
reg f;
always@(w0 or w1 or s);
if(s == 0)
    f = w0;
else
    f = w1;
endmodule

module mux4to1 (a,s,f)
input [4:0]a;
input [2:0]s;
output f;
mux2to1

