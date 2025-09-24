package index;

public class Lion extends Animal implements act{

	public Lion(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void interact() {
		System.out.println(this.getName() + " roars!");
	}

}
