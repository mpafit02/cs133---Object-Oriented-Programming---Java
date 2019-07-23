
public class Octagon extends GeometricObject implements Comparable, Cloneable {

	public Octagon(int side) {
		super(side);
		setArea((2 + 4 / 22) * this.getSide() * this.getSide());
		setPerimeter(this.getSide()*8);
	}
	
	public Octagon(Octagon o) {
		super(o.getSide());
		setArea(o.getArea());
		setPerimeter(o.getPerimeter());
	}


	@Override
	public Octagon clone(Octagon o) {
		return new Octagon(o);
	}

	@Override
	public boolean compareTo(Object o) {
		if(o == null) {
			return false;
		}else if(o.getClass() != getClass()) {
			return false;
		}else { 
			if(((Octagon)o).getSide() == this.getSide())
				return true;
		}
		return false;
	}
}
