package experiments;

public class Person {
    public String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        setAge(age);
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("MATUKI");
        } else {
            this.age = age;
        }
    }
}









