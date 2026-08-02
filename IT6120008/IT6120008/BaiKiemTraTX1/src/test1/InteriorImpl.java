	package test1;

import java.util.*;

public class InteriorImpl implements InteriorManager {
	// 1 cặp các giá trị, Lưu trữ id sản phẩm
	private HashMap<Integer, Product1> list;

	public InteriorImpl() {
		list = new HashMap<>();
	}

	public InteriorImpl(short number) {
		list = new HashMap<>(number);
	}

	@Override
	public List<Product1> getAll() {
		// TODO Auto-generated method stub

		List<Product1> results = new ArrayList<>();

		for (Map.Entry<Integer, Product1> e : this.list.entrySet()) {
			results.add(e.getValue());
		}

		return results;
	}

	@Override
	public double getTotalPrice() {
		// TODO Auto-generated method stub

		double total = 0;

		for (Map.Entry<Integer, Product1> e : this.list.entrySet()) {

			short number = (short) (Math.random() * 20);

			Interior i = (Interior) (e.getValue());

			i.setInter_number(number);

			total += i.findPrice();
		}

		return total;
	}

	@Override
	public boolean addInterior(Product1 p) {
		// TODO Auto-generated method stub
		try {
			if (this.list.containsKey(p.getPro_id())) {
				Interior i = (Interior) (this.list.get(p.getPro_id()));

				short new_number = (short) (i.getInter_number() + 1);

				i.setInter_number(new_number);

				this.list.replace(p.getPro_id(), i);

			} else {
				this.list.put(p.getPro_id(), p);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();

		}

		return false;
	}

	@Override
	public boolean editInterior(Product1 p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delInterior(Product1 p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Product1> searchInterior(String name) {
		// TODO Auto-generated method stub

		// ArrayList là con của list
		List<Product1> results = new ArrayList<>();
		
		//Muốn sắp xếp biến HashMap<> thành TreeMap<> 
		
		for (Map.Entry<Integer, Product1> e : this.list.entrySet()) {
			if (e.getValue().getPro_name().contains(name)) {
				results.add(e.getValue());
			}
		}

		return results;
	}

}
