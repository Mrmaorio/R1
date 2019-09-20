package com.offcn.run;

public class Zi extends Fu {
    static{
                 System.out.println("this is son static code block");
            }
      {
                System.out.println("this is son common code block");
            }
     public Zi(){
                 System.out.println("this is son constructor");
            }
    public static void main(String[] args) {
                new Zi();
         }
     private int l = print("this is son common variable");
    private static int m = print("this is son stati variable");
}
