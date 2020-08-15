package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class FemaleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> female = new ArrayList<>();
        for(Person person : personList) {
            if (person.getGender().equalsIgnoreCase("FEMALE"))
                female.add(person);
        }
        return female;
    }
}
