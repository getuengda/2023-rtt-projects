package boundedtypeparameter;

public class MathBox<E extends Number> {
	/*
	 * Sometimes, we do not want to parameterize out classes or methods with just
	 * any type, but we want to put some restrictions on them. For instance, suppose
	 * we want a box that holds particular kinds of numbers such as a MathBox. What
	 * we want to say is that E must be a subtype of Number.
	 */

	private E data;

	public MathBox(E data) {
		this.data = data;
	}

	public double sqrt() {
		return Math.sqrt(this.data.doubleValue());
	}

}
