package Comparator;

import java.util.Comparator;

public class RetangleComparator implements Comparator<Retangle> {

    @Override
    public int compare(Retangle t1, Retangle t2) {
        if(t1.getPerimeter()>t2.getPerimeter()) return 1;
        else if(t1.getPerimeter()<t2.getPerimeter()) return -1;
        else return 0;
    }
}
