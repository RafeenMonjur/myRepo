package FirstPackage;

import java.util.Arrays;

public class NewPhone {

    public static void main(String[] args) {

        Phone o = new Phone();

        o.brand = "Apple";
        o.size = 7;
        o.weight = 228;
        o.color = "Grey";

        System.out.println(o.brand);
        System.out.println(o.size);
    }
}
