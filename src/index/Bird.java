package index;

public class Bird extends Animal implements act{

	public Bird(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		System.out.println(this.getName() + " chirps!");
		System.out.println(this.getName() + " is flying.");
	}

}
