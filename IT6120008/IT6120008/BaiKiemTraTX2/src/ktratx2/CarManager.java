package ktratx2;

import java.util.*;

/**
 * 
 * @author Ma Thế Quyền - MSV: 2021603162
 *
 */

public interface CarManager {

	// Thêm sản phẩm trong kho
	public boolean addCar(Car c);

	// Sửa sản phẩm trong kho
	public boolean editCar(Car c);

	// Xóa sản phẩm trong kho
	public boolean delCar(Car c);

	// Tìm kiếm theo tên
	public List<Car> searchCar(String name);

	// Xắp xếp theo giá
	public List<Car> sortedCarByPrice(boolean isINC);

}
