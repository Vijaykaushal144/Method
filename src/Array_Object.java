import java.util.Scanner;

 public class Array_Object {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter th email=");
         String vtr = sc.nextLine();
         n t=new n();
         n.name(vtr);
         System.out.println("Enter one number=");
       int x = sc.nextInt();
         p s=new p();
         p.Prim(x);
   }
     }///method 1. for integer.
   class p {
        static void Prim(int a) {
           int i;
           for (i = 2; i < a; i++) {
               if (a % i == 0)
                   break;
           }
           if (i == a) {
               System.out.println("Prime number");

           } else
               System.out.println("Not a prime number");
       }
   }
   //method 2.for string.
 class n {
          static void name(String mail) {


             int a = mail.indexOf("@");
             String name = mail.substring(0, a);
             System.out.println(name);

         }
     }




