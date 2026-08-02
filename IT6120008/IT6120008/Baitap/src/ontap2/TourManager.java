package ontap2;

import java.util.*;

public interface TourManager {

	public boolean addTour(Tour t);
	
	public boolean delTour(Tour t);
	
	public List<Tour> searchTour(String name);
	
	public List<Tour> searchTour(double price);
	
	public List<Tour> sortedTour(boolean isINC);
	
	public List<Tour> getTotalPrice();
	
}
