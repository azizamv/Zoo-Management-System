package index;

public class Fish extends Animal implements act {

	public Fish(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		System.out.println(this.getName() + " does not make sound, it bubbles!");
		System.out.println(this.getName() + " is swimming.");
	}

}
