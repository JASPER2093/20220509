package Ani;

public class Cat extends Animal {

    @Override
    void cry() {
        System.out.println("고양이는 야옹야옹 울어요");

    }

    @Override
    void size(int hight, double weight) {
        
        System.out.println("고양이 크기는 " + hight + "이고 무게는 " + weight + "이다");

    }

}
