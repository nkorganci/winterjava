package day42designpatterns;

public class Builder {

}

class User {
    private final String firstName;
    private final int age;

    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}

class UserBuilder {
    private final String firstName;
    private int age;

    public UserBuilder(String firstName) {
        this.firstName = firstName;
    }
}