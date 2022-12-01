module halfadder (a,b,s,c);
input a,b;
// always reg in case of behavioral model
output s,c;

reg s,c;

always @(*) 
begin
    s = a^b;
    c = a&b;
end
endmodule

module fulladder (a,s,c);
input [3:0]a;
output [1:0]s,c
