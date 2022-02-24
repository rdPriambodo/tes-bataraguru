package tes.bataraguru;
import java.util.Scanner;

public class TesBataraguru {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int j100k = jumlahuang(n,100000);
        int sisa = n-(j100k*100000);
        int j50k = jumlahuang(sisa,50000);
        sisa = sisa-(j50k*50000);
        int j20k = jumlahuang(sisa,20000);
        sisa = sisa-(j20k*20000);
        int j5k = jumlahuang(sisa,5000);
        sisa = sisa-(j5k*5000);
        int j1k = jumlahuang(sisa,1000);
        sisa = sisa-(j1k*1000);
        int j50 = jumlahuang(sisa,50);
        sisa = sisa-(j50*50);
        System.out.println(sisa);
        System.out.println("100k : "+j100k);
        System.out.println("50k : "+j50k);
        System.out.println("20k : "+j20k);
        System.out.println("5k : "+j5k);
        System.out.println("1k : "+j1k);
        System.out.println("50 : "+j50);
        
    }
    public static int jumlahuang(int n, int uang){
        int jumlah = 0;
        while(n>=uang){
            n=n-uang;
            jumlah++;
        }
        return jumlah;
    }
}
