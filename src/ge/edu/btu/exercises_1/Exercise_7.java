package ge.edu.btu.exercises_1;

public class Exercise_7 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 134;
        arr[1] = 5424;
        arr[2] = 245;
        arr[3] = 9134;
        arr[4] = 77;

        int evens = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evens++;
            }
        }

        if (evens > size - evens) {
            System.out.println("ლუწები მეტია");
        } else if (evens < size - evens) {
            System.out.println("კენტი მეტია");
        } else {
            System.out.println("ტოლია");
        }
    }
}
