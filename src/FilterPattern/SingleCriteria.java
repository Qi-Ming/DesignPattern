package FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class SingleCriteria implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> single = new ArrayList<>();
        for (Person person : personList) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
                single.add(person);
        }
        return single;
    }
}
