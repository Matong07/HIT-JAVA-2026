package inter;

import java.util.*;
import objects.*;

public interface Statistic {

	public ArrayList<Person> statisticPerson(String name);

	public ArrayList<Person> statisticPerson(Address addr);

	public ArrayList<Person> statisticPerson(byte min_age, byte max_age);

	public ArrayList<Person> statisticPerson(Person similar);

}
