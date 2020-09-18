package ge.edu.btu.exercises_1;

public class Exercise_4 {

    public static void main(String[] args) {
        int x = 2452452;

        int counter = 0;
        while (x != 0) {
            x = x / 10;
            counter++;
        }

        System.out.println("რიცხვი არის " + counter + " ნიშნა");
    }
}
