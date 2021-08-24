package lt.lhu.unit05.main;

import java.util.ArrayList;
import java.util.List;

public class BaseOfCustomer {

	private List<Customer> custs = new ArrayList<Customer>();

	public BaseOfCustomer() {
	}

	public List<Customer> getCusts() {
		return custs;
	}

	public void setCusts(List<Customer> custs) {
		this.custs = custs;
	}

	public int size() {
		return custs.size();
	}

	public Customer getCustomer(int i) {
		return custs.get(i);
	}

	public void add(Customer c) {
		custs.add(c);
	}

	public void setCustomer(int i, Customer s) {
		this.custs.set(i, s);
		
	}

}
