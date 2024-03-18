import java.util.Arrays;

public class strsort {
    public static void main(String[] args) {
        String[] names = {"jagan", "dheeraj", "Bijo", "Gopi"};

        System.out.println("strings are :");
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(names));
    }
}
