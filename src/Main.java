import Math.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Adınız=");
        String name=scanner.next();
        System.out.println("Merhaba "+name);
        DortIslem dortIslem=new DortIslem();
        System.out.println(dortIslem.topla(15,343));
        Logarithm logarithm=new Logarithm();
        System.out.println(logarithm.log());

    }
}