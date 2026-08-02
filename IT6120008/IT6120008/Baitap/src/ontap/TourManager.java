package ontap;

import java.util.*;

public interface TourManager {

	// Cập nhật tour
	public boolean addTour(Tour t);

	// Xóa bỏ tour
	public boolean delTour(Tour t);

	// tìm kiếm theo tên
	public List<Tour> searchTour(String name);

	// Tìm kiếm theo giá
	public List<Tour> searchTour(double price);

	// Xắp xếp theo giá
	public List<Tour> sortedTour(boolean isINC);

	// Tính tiền tổngS
	public List<Tour> getTotalStorage();
}
