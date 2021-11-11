package model;

public class CarSeller {
	private Car root;
	
	public CarSeller() {
		
	}
	
	public void addCar(Car n) {
		if(root == null) {
			root = n;
		} else {
			addCar(n, root);
		}
	}
	
	private void addCar(Car n, Car t) {
		if(n.getPrice() <= t.getPrice()) {
			if(t.getLeft() != null) {
				addCar(n, t.getLeft());
			} else {
				t.setLeft(n);
			}
		} else {
			if(t.getRight() != null) {
				addCar(n, t.getRight());
			} else {
				t.setRight(n);
			}
		}
	}
	
	private String print(Car r) {
		String s = "";
		
		if(root == null) {
			s = "No hay carros actualmente";
		} else {
			if(r != null) {
				s += r.toString() + "\n";
				
				if(r.getLeft() != null) {
					s += print(r.getLeft());
				}
				if(r.getRight() != null){
					s += print(r.getRight());
				}
			}
		}
		
		return s;
	}
	
	public String print() {
		String s = print(root);
		
		return s;
	}
}
