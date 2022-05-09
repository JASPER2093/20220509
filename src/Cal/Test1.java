package Cal;

public class Test1 {
    public static void main(String[] args) {

        MyCal c = new MyCal();
        int res1 = c.add(10, 20);
        int res2 = c.sub(10, 20);
        int res3 = c.Mul(10, 20);
        int res4 = c.Div(20, 10);

        System.out.println("res1 = " + res1);
        System.out.println("res2 = " + res2);
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);
    }
}
