package FilterPattern;

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = criteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> firstCriteriaPerson = criteria.meetCriteria(personList);
        List<Person> otherCriteriaPerson = criteria.meetCriteria(personList);

        for (Person person : firstCriteriaPerson) {
            if (!otherCriteriaPerson.contains(person))
                otherCriteriaPerson.add(person);
        }
        return otherCriteriaPerson;
    }
}
