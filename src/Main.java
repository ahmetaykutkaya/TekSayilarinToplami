import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner data =new Scanner(System.in);
        int a ,total = 0;

        do {
            System.out.print("Sayi Giriniz :");
            a=data.nextInt();
            if(a %2==0){
                if (a %2 ==0){
                }
                total +=a;
                }
            }
        while (a %2==0 );
        System.out.print("toplam : "+ total);
    }
}