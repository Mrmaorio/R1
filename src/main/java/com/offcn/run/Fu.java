package com.offcn.run;

public class Fu {
    static{
              System.out.println("this is father static code block");
            }
     {
                System.out.println("this is father common code block");
         }
    public Fu(){
               System.out.println("this is father constructor");
            }

        static int print(String str){
                System.out.println(str);
            return 2;
           }
     private int i = print("this is father common variable");
    private static int j = print("this is father static variable");
}
