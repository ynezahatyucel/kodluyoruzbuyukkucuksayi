package Giris;
import java.util.Scanner;
public class kucukbuyuksayıbulma {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        int kacSayi, min = 1, max = 1, sayi;
        System.out.print("Kaç tane sayı giriceksiniz? : ");
        kacSayi = inp.nextInt();
        for (int i = 1; i <= kacSayi; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            sayi = inp.nextInt();
            if (i == 1) {
                max = sayi;
                min = sayi;
            }

            if (sayi > max){
                max = sayi;
            }
            if (sayi < min){
                min = sayi;
            }

        }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);


    }

}
