// soal 1
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String soal = sc.nextLine();

        if (soal.equals(soal1));

        int a = input.nextint();
        int b = input.nextint():

        boolean overflow = false;

        nt a = input.nextInt();
            int b = input.nextInt();

            boolean overflow = false;

            if (a > 0 && b > 0 && a > Integer.MAX_VALUE - b) {
                overflow = true;
            }
            else if (a < 0 && b < 0 && a < Integer.MIN_VALUE - b) {
                overflow = true;
            }

            if (overflow) {
                System.out.println("OVERFLOW");
            } else {
                System.out.println(a + b);
            }

        }


// soal 2

else if (soal.equals("soal2")){

    float a = input.nextFloat();
    float b = input.nextFloat();

    float hasilFloat = x + y;
            double hasilDouble = (double) x + (double) y;

            double selisih = Math.abs(hasilDouble - hasilFloat);

            System.out.printf("%.6f\n", selisih);

        }

}


// soal 3
else if (soal 3 ) {

            int n = input.nextInt();

            Integer a = n;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        }


// soal 4

else if (soal.equals("Soal4")) {

            String s = input.next();

            String a = s;
            String b = new String(s);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));

        }


// soal 5

else if (soal.equals("Soal5")) {

            String intStr = input.next();
            String doubleStr = input.next();
            String boolStr = input.next();

            int i = Integer.parseInt(intStr);
            double d = Double.parseDouble(doubleStr);
            boolean b = Boolean.parseBoolean(boolStr);

            double hasil = i * d;

            if (b == false) {
                hasil = hasil * -1;
            }

            System.out.printf("%.2f\n", hasil);

        }