package ge.edu.btu.exercises_1;

public class Exercise_3 {

    public static void main(String[] args) {
        int n = 9;

        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = ans * i;
        }
        System.out.println(ans);
    }
}
