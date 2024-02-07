package lesson2;

//mport javax.sql.PooledConnection;

public class exec1 {
    int a = 8;
    int b = 7;
    int j = 10;
    double d1, d2, d3;
    boolean p;
    public static void main(String[] args) {
        exec1 exec1Var = new exec1();
        exec1Var.exec1Calculate();
    }

    public void exec1Calculate(){
        this.j = this.a + this.b -10;
        this.p = (a >= b);
        System.out.println("go");
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        System.out.println(Math.ceil(squareRoot));
        //System.out.println(Math.ceil(squareRoot));
        System.out.println(Math.PI);

    }

}
