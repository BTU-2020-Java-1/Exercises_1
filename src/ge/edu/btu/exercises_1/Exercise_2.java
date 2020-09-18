package ge.edu.btu.exercises_1;

public class Exercise_2 {

    public static void main(String[] args) {
        char c = 't';

        if (c >= 'a' && c <= 'z') {
            System.out.println("სიმბოლო არის პატარა ლათინური ასო");
        } else if (c >= 'A' && c <= 'Z') {
            System.out.println("სიმბოლო არის დიდი ლათინური ასო");
        } else {
            System.out.println("სიმბოლო არ არის ლათინური ასო");
        }
    }
}
