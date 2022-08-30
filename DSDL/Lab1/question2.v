module question2 (a,b,c,d,f,g);
  input a,b,c,d;
  output f,g;

  //level1
  nand(na1,a,b);

  //level2
  xor(f,d,na1,c);
  nor(g,b,c,d);

endmodule
