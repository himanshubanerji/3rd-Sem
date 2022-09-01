module question1b (a,b,c,d,f);
input a,b,c,d;
output f;

assign f = (~b & c) | (~b & d) | (b & ~c & ~d);

endmodule


