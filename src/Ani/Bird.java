package Ani;

public class Bird extends Animal {

    @Override
    void cry() {
        System.out.println("새는 짹짹 울어요");

    }

    @Override
    void size(int hight, double weight) {
        System.out.println("새 크기는 " + hight + "이고 무게는 " + weight + "이다");

    }

}
