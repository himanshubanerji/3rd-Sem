module question2(a,b,c,d,f);

input a,b,c,d;
output f;

assign an = a ~| a;
assign bn = b ~| b;
assign cn = c ~| c;
assign dn = d ~| d;

assign f = ~((an ~| bn) | (cn ~| dn) | (bn ~| d));

endmodule 
