package day06.abs;

public class Dog extends Pet {

    public Dog(String name, String kind, int age) {
        super(name, kind, age);
    }

    public void takeNap() {
        System.out.println("강아지는 마당에서 쿨쿨쿨~");
    }
    public void eat() {
        System.out.println("강아지는 사료를 와구와구!");
    }

    @Override
    public void walk() {

    }
}