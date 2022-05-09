package Ani;

public class Dog extends Animal{

    @Override
    void cry() {
        System.out.println("강아지는 멍멍멍! 울어요");
        
    }

    @Override
    void size(int hight, double weight) {
        System.out.println("강아지이 크기는 " + hight + "이고 무게는 " + weight + "이다");
        
    }

}
