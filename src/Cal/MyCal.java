package Cal;

public class MyCal extends Calculator {

    @Override
    public int add(int a, int b) {
       // int res = a + b;
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
       // int res = a - b;
        return a - b;
    }

    @Override
    public int Mul(int a, int b) {
       // int res = a * b;
        return a * b;
    }

    @Override
    public int Div(int a, int b) {
       // int res = a / b;
        return a / b;
    }

}
