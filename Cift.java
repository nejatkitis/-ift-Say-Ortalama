import java.util.Scanner;

public class Cift {
    public static void main(String[] args) {
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        k = input.nextInt();
        int i = 0;
        int m = 0;
        int n = 0;
        while (i<=k){
            i++;
            if((i%3==0)&&(i%4==0)){
                m +=i;
                n++;
            }
        }
        System.out.println("Ortalama : "+(m/n));
    }
}
