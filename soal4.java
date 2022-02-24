package tes.bataraguru;
import java.util.Scanner;

public class TesBataraguru {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        String str= String.valueOf(n);
        int l = str.length();
        for(int i=0;i < l-1;i++){
            if(genap(Integer.valueOf(str.charAt(i)))){
                if(genap(Integer.valueOf(str.charAt(i+1)))){
                    i++;
                    str = str.substring(0, i) + "-" + str.substring(i, str.length());
                    l++;
                }
            }
            
        }
        System.out.println(str);
    }
    
    public static boolean genap(int n){
        boolean gen=false;
        if(n%2==0){
            gen=true;
        }
        return gen;
    }
}
