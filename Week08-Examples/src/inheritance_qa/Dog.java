package inheritance_qa;

public class Dog {
    private String name;
    private String type;
    private int age;

    private int birthdayYear;


    public Dog(String name, String type, int age) {
        this.type = type;
        this.age = age;
    }

    public Dog(int age, int birthdayYear) {
        this.age = age;
        this.birthdayYear = birthdayYear;
    }

    public Dog(int birthdayYear, String type) {
        this.birthdayYear = birthdayYear;
        this.type = type;
    }

    public Dog(String type, int birthdayYear) {
        this.type = type;
        this.birthdayYear = birthdayYear;
    }
}
