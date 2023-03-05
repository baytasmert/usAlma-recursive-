import java.util.Scanner;

public class Main {

    static int  ustAlma(int n,int ust){

        if(ust==0){
            return 1;
        } else {
           return ustAlma(n,ust-1)*n;
        }

    }

    public static void main(String[] args) {
        int n,ust,sonuc;
        Scanner oku=new Scanner(System.in);

        System.out.println("taban giriniz : ");
        n=oku.nextInt();

        System.out.println("ust giriniz :");
        ust= oku.nextInt();

        sonuc = ustAlma(n,ust);
        System.out.println("sonuc = "+sonuc);
    }
}