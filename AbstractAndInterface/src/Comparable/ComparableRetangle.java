package Comparable;

public class ComparableRetangle extends Retangle implements Comparable<Retangle> {
    public ComparableRetangle(){

    }
    public ComparableRetangle(double weight,double height){
        super(weight, height);
    }
    public ComparableRetangle(double weight,double height,String color, boolean filled){
        super(weight, height, color, filled);
    }


    @Override
    public int compareTo(Retangle o) {
        if (getPerimeter() > o.getPerimeter()) return 1;
        else if (getPerimeter() < o.getPerimeter()) return -1;
        else return 0;
    }
}
