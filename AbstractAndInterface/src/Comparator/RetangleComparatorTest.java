package Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class RetangleComparatorTest {

    public static void main(String[] args) {
        Retangle[] retangles= new Retangle[3];
        retangles[0] = new Retangle(4,5);
        retangles[1] = new Retangle();
        retangles[2] = new Retangle(2,3, "blue", true);

        System.out.println("Pre-sorted:");
        for(Retangle rec: retangles){
            System.out.println(rec);
        }

        Comparator comparator = new RetangleComparator();
        Arrays.sort(retangles,comparator);

        System.out.println("After-sorted:");
        for(Retangle rec: retangles){
            System.out.println(rec);
        }
    }
}
