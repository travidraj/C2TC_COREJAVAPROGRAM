package dayseven.overriding.covariant;

public class Color {
	protected Color getColor() {
		Color s = new Color();
		return s;
	}
}
class Red extends Color {
	public Red getColor() {
		Red s = new Red();
		return s;
	}
}

public class CovariantOverriding {
	public static void main(String[] args) {
		Color c1 = new Color();
		Color c2 = c1.getColor();
		System.out.println(c2);

		Red r1 = new Red();
		Red r2 = r1.getColor();
		System.out.println(r2);
	}

}
