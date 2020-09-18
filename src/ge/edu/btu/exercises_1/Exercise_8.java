package ge.edu.btu.exercises_1;

public class Exercise_8 {

    public static void main(String[] args) {
        int[] arr = {5, 134, 42, 9152, 135, 935};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("მაქსიმალური ელემენტია " + max);
    }
}
