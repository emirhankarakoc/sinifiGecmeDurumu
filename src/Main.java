import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sinifi gecme durumunuzu hesaplayan programa hosgeldiniz..");
        int mat, fizik, turkce, kimya, muzik;

        System.out.println("Matematik dersinin notunu giriniz:\n");
        mat = scanner.nextInt();
        System.out.println("Fizik dersinin notunu giriniz:\n");
        fizik = scanner.nextInt();
        System.out.println("Turkce dersinin notunu giriniz:\n");
        turkce = scanner.nextInt();
        System.out.println("Kimya dersinin notunu giriniz:\n");
        kimya = scanner.nextInt();
        System.out.println("Muzik dersinin notunu giriniz:\n");
        muzik = scanner.nextInt();
        float ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
        if (ortalama >=55){
            System.out.println("Gectiniz, gecme notunuz : " + ortalama);
        }
else{
            System.out.println("Kaldiniz, kalma notunuz : " + ortalama);
        }

    }
}