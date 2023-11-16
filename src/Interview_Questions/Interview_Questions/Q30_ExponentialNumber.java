package interviewQuestions;

import java.util.Scanner;

public class Q30_ExponentialNumber {
    //Task->
    // Get 2 numbers from the user.
    //first number base
    //second number Top
    //Write a code that calculates the prime of a number.
    // Girilen taban ve us değerleri için sayının kuvvetini print eden code create ediniz.
    // 2, 3 --> 2^3 = 2*2*2= 8

    // 4, 3 --> 4^3= 4*4*4 = 64
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir taban degeri girin");
int taban=input.nextInt();
        System.out.println("Bir us degeri girin");
        int usDeger=input.nextInt();
        System.out.println("**** for ile****");
        int sonuc=1;
        for (int i = 1; i <=usDeger ; i++) {
            sonuc*=taban;
        }
        System.out.println("sonuc = " + sonuc);
        System.out.println("**** Mathpoe ile*****");
        int sonuc2= (int) Math.pow(taban,usDeger);
        System.out.println("sonuc2 = " + sonuc2);
    }
}
