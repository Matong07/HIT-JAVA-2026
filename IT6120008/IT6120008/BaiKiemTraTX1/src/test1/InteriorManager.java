package test1;

import java.util.*;

public interface InteriorManager extends General {

	public boolean addInterior(Product1 p);
	public boolean editInterior(Product1 p);
	public boolean delInterior(Product1 p);
	
	public List<Product1> searchInterior(String name);
	
	
}
