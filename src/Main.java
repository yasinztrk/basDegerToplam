
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, basValue, basNumber = 0, bas2 = 0;
        System.out.println("Sayıyı Giriniz :");
        number = input.nextInt();
        int tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        tempNumber = number;


        while (tempNumber != 0) {
            basValue = 1;

            basValue = tempNumber % 10;

            tempNumber /= 10;
            bas2 += basValue;


        }
        System.out.println(bas2);

    }


}


