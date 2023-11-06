package university;

import java.io.Serializable;

public class Person implements Serializable {
    public int id;
    private String name;
    private String gender;

    public Person(int id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "姓名：" + name + " 性别：" + gender;
    }
}
