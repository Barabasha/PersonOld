import java.util.ArrayList;

class Container {
    private ArrayList<Person> list = new ArrayList<Person>();

    Container(ArrayList<Person> list) {
        this.list = list;
    }

    ArrayList<String> recruit() {
        ArrayList<String> listOfRecruit = new ArrayList<String>();
        for (Person elem : list) {
            if (elem.isRecruit()) {
                listOfRecruit.add(elem.getName());
            }
        }
        return listOfRecruit;
    }

    int womenAverage() {
        int average = 0;
        int count = 0;
        for (Person elem : list) {
            if (elem.getGender() == Gender.Female) {
                average += (elem.currentYear - elem.getYearOfBirth());
                count++;
            }
        }
        if (count != 0) {
            return (int) average / count;
        }
        return 0;
    }

    ArrayList<String> listOfYear(int year) {
        ArrayList<String> listOfYear = new ArrayList<>();
        for (Person elem : list) {
            if (elem.getYearOfBirth() == year) {
                listOfYear.add(elem.getName());
            }
        }
        return listOfYear;
    }
}
