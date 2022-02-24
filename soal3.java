package tes.bataraguru;
import java.util.Scanner;

public class TesBataraguru {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        int hasil=1;
        for(int i=1;i<=n;i++){
            hasil = hasil*i;
        }
        System.out.println(hasil);
    }    
}
