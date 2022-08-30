module question1 (a,b,c,d,f);
  input a,b,c,d;
  output f;

  //level1
  and(ab1,a,b);
  and(ab2,a,b);
  
  //level2
  or(o1,ab1,c);
  or(o2,ab2,c);

  //level3
  not(n1,o1);

  //level4
  and(a3,n1,d);
  or(o3,o2,d);

  //level5
  and(f,a3,o3);

endmodule