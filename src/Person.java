import java.util.Calendar;

class Person {
    private String name;
    private int yearOfBirth;
    private Gender gender;
    int currentYear = getCurrentYear();

    Person(String name, int yearOfBirth, Gender gender) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    private int getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    boolean isRecruit() {
        if (this.getGender() == Gender.Male) {
            if ((currentYear - this.yearOfBirth) > 17) {
                return true;
            }
        }
        return false;
    }

    int getYearOfBirth() {
        return yearOfBirth;
    }

    Gender getGender() {
        return gender;
    }

    String getName() {
        return name;
    }
}

