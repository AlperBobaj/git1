package Class15HomeWork;

public class Task5 {

    // 5) Write a method to return whether given number is prime or not?

    boolean num(int num) {
        boolean prime = true;
        if (num > 1) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    return false;
                }

            }
        }
        return prime;
    }

    public static void main(String[] args) {
        Task5 task = new Task5();
        System.out.println(task.num(7));
    }
}

