package day06.abs;

public class Main {
    public static void main(String[] args) {

//        new Pet("이름없음", "모름", 3);

        Pet dog = new Dog("해피", "푸들", 3);
        Cat cat = new Cat("꾸끼", "코숏", 1);

        Pet[] pets = {
                dog,
                cat,
                new Dog("초코", "말티즈", 4)
        };

        for (Pet pet : pets) {
            pet.takeNap();
        }
    }
}