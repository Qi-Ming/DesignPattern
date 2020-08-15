package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class MaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> male = new ArrayList<>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("MALE"))
                male.add(person);
        }
        return male;
    }
}
