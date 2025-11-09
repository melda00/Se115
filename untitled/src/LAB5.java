import java.util.Scanner;

public class LAB5 {
    public static int factorial(int x){
        if (x==1){
            return 1;
        }
        return x*factorial(x-1);
    }
    public static int sumDigits(int n){
        if (n<10){
            return n;
        }
        return (n%10)+sumDigits(n/10);
    }

    public static long power(int a,int b){
        if(b==0){
            return 1L; //LONG İÇİN BÜYÜK L HARFİ GETİRDİK
        }
        return a*power(a,b-1);
    }

    public static int fib(int y){
        if (y==0){
            return 0;
        }
        if (y==1){
            return 1;
        }return fib(y-1)+fib(y-2);
    }
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to calculate factorial of it");
        System.out.println(factorial(sc.nextInt()));

        System.out.println("enter a number to calculate sum of every digits in the number");
        int n=sc.nextInt();
        System.out.println(sumDigits(n));

        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.println(power(a,b));


        int y= sc.nextInt();
        System.out.println(fib(y));

    }

}
