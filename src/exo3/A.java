package exo3;

public class A {

    int y;

    public A(int y){
        this.y = y;
    }

    public boolean equals (Object a){
        A b = (A) a;
        return y == b.y;
    }
}
