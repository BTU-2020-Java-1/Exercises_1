package ge.edu.btu.exercises_1;

public class Exercise1 {

    public static void main(String[] args) {
        int x = 524;

        int first = x / 100;
        int second = x % 100 / 10;
        int last = x % 10;

        int ans = first + second + last;
        System.out.println("ციფრთა ჯამია: " + ans);
    }
}
