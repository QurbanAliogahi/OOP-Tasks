import java.util.Scanner;


class Calculator
{
    public static void main(String[] args) {
     double a ;
     double b;
     Scanner getNumbers = new Scanner(System.in);
     System.out.println(" enetr first number ");
     a = getNumbers.nextDouble();
     System.out.println("enter 2nd number ");
     b = getNumbers.nextDouble();
     System.out.println("jjjj"+(19/10));
     System.out.println("enter an opertion   +   ,-    ,*,    /     ,%");

     char c = getNumbers.next().charAt(0);
     
     
     if (c=='+'){

       System.out.println(" sum is :" + a +" + "+ b +" = "+(a+b));

     }
     if (c=='-'){
        System.out.println(" Subtraction is :" + a +" - "+ b +" = "+(a-b));
     }
     if (c=='*'){
        System.out.println(" multipilcation is  :" + a +" * "+ b +" = "+(a*b));
     }
     if (c=='/'){
        System.out.println(" division  is :" + a +" / "+ b +" = "+(a/b));
     }

     if (c=='%'){
        System.out.println(" reminder  is :" + a +" % "+ b +" = "+(a%b));
     }
    }
}
