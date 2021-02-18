public class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        int compare = p1.getName().compareTo(p2.getName());

        if (compare != 0) {
            return compare;
        }

        return p1.getAge() - p2.getAge();
    }
}
