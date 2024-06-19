import java.util.Scanner;

public class Prime {
    int number;

    public Prime(int number) {
        this.number = number;
    }

    public boolean isPrime() {
        int counter = 0;
        for(int i = 1; i <= this.number; i++) {
            if (this.number % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }
        return false;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write a number");
        int nm = sc.nextInt();

        Prime prime = new Prime(nm);

        if (prime.isPrime()) {
            System.out.println("Prime");
        }
        else {
            System.out.println("NOT prime");
        }

    }


}
