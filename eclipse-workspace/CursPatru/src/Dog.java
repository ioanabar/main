
public class Dog {
	String name;
	String color;

	{
		System.out.println("Constructing a Dog");
		name = "grivei";
		color = "alb";
	}

	public static void main(String[] args) {
		Dog x = new Dog();
		System.out.println(x.name);
		System.out.println(x.color);
		Dog y = new Dog();
		y.name = "rex";
		y.color = "negru";
		System.out.println(y.name);
		System.out.println(y.color);
	}

}
