// Nama : Jaya Bestina Simbolon
// Nim : 12S24023

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String soal = sc.next(); 

        
        // SOAL 1 — Integer Overflow
        
        if (soal.equals("Soal1")) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            // Cek overflow sebelum menjumlah
            if ((y > 0 && x > Integer.MAX_VALUE - y) ||
                (y < 0 && x < Integer.MIN_VALUE - y)) {

                System.out.println("OVERFLOW");

            } else {
                System.out.println(x + y);
            }
        }

        
        // SOAL 2 — Float vs Double
       
        else if (soal.equals("Soal2")) {

            double x = sc.nextDouble();
            double y = sc.nextDouble();

            float xf = (float) x;
            float yf = (float) y;

            float sumFloat = xf + yf;
            double sumDouble = x + y;

            double diff = Math.abs(sumDouble - sumFloat);

            System.out.printf("%.6f\n", diff);
        }

        
        // SOAL 3 — Primitive vs Wrapper
        
        else if (soal.equals("Soal3")) {

            int n = sc.nextInt();

            Integer a = n;
            Integer b = a;

            a = a + 1;

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        
        // SOAL 4 — String Immutability
        
        else if (soal.equals("Soal4")) {

            String s = sc.next();

            String a = s;
            String b = new String(s);

            a = a + "X";

            System.out.println("==: " + (a == b));
            System.out.println("equals: " + a.equals(b));
        }

        
        // SOAL 5 — Parsing & Type Safety
       
        else if (soal.equals("Soal5")) {

            String intStr = sc.next();
            String doubleStr = sc.next();
            String boolStr = sc.next();

            int i = Integer.parseInt(intStr);
            double d = Double.parseDouble(doubleStr);
            boolean flag = Boolean.parseBoolean(boolStr);

            double result = i * d;

            if (!flag) {
                result *= -1;
            }

            System.out.printf("%.2f\n", result);
        }

        else {
            System.out.println("Soal tidak dikenali");
        }

        sc.close();
    }
}
