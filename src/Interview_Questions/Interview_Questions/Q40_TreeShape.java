package interviewQuestions;

import java.util.Scanner;

public class Q40_TreeShape {
    // Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
    // Not :govde sabit sayi olsun
    /* tac uzunlugu -> 6 iken

    ^
    ^^
    ^^^
    ^^^^
    ^^^^^
    ^^^^^^
    |||
    |||
    |||
    |||
    |||
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir uzunluk gir");
        int uzunluk =scan.nextInt();
        String yaz="";
        for (int i = 0; i < uzunluk; i++) {
            yaz+="^";
            System.out.println(yaz);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("|||");

        }
    }
}



