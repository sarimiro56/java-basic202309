package day04.inherit;

class Address {
    String city;
    String street;
    String zipcode;
}

public class Student extends Person {

    public Student() {
        super(30);
        System.out.println("Student 생성자 호출!");
    }
}