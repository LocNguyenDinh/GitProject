package Comparable;

import java.util.Arrays;

public class ComparableRetangleTest {
    public static void main(String[] args) {
        ComparableRetangle[] retangles = new ComparableRetangle[3];
        retangles[0] = new ComparableRetangle(4, 5);
        retangles[1] = new ComparableRetangle();
        retangles[2] = new ComparableRetangle(6,7, "red",false);

        System.out.println("Pre-sorted:");
        for(Retangle re: retangles){
            System.out.println(re);
        }
        Arrays.sort(retangles);
        System.out.println("After-sorted:");
        for(Retangle re: retangles){
            System.out.println(re);
        }
    }
}
