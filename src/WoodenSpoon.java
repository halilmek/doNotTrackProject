import java.util.Collections;

public class WoodenSpoon {
    private String name;
    private int age;
    private char gender;
    private boolean isEligible;

    public WoodenSpoon(String name, int age, char gender, boolean isEligible) {

        setName(name);
        setAge(age);
        this.gender = gender;
        this.isEligible = isEligible;
    }

public void setName(String name) {

    for (int i = 0; i < name.length(); i++) {

        if (Character.isDigit(name.charAt(i)) || !Character.isLetterOrDigit(name.charAt(i))){

            throw new RuntimeException("name contains characters except letters !!!");
        }
    }

    this.name = name;
}

public String getName() {

        return name;
}

public void setAge(int age) {

        String age1 = age +"";
    for (int i = 0; i < age1.length(); i++) {

        if (!Character.isDigit(age1.charAt(i)))
        {
            throw new RuntimeException("age contains characters instead of number !!");
        }
    }

    this.age = age;
}

public int getAge() {

        return age;
}

public void setGender(char gender) {

        String gender1 = gender + "";
        if (!gender1.equalsIgnoreCase("m") || !gender1.equalsIgnoreCase("f")) {

            throw new RuntimeException("another gender is not support !!!");
        }

        this.gender = gender;
}

public char getGender() {

        return gender;
}

}
