package ge.edu.btu.exercises_1;

public class Exercise_5 {

    public static void main(String[] args) {
        int n = 17;

        boolean b = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                b = false;
                break;
            }
        }

        if (b) {
            System.out.println("მოცემული რიცხვი მარტივია");
        } else {
            System.out.println("მოცემული რიცხვი არაა მარტივი");
        }
    }
}
