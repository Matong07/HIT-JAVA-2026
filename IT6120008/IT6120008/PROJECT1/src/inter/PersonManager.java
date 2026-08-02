package inter;

import java.util.*;
import objects.*;

public interface PersonManager extends Statistic, Search {

	public boolean addPerson(Person p);

	public boolean editPerson(Person p);

	public boolean delPerson(Person p);

	public ArrayList<Person> getAll();

	public ArrayList<Person> getAll(Person similar, short page, byte total);

}
