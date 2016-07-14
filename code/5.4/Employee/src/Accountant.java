
public class Accountant extends Employee{
	public Accountant(String name, String id) {
        super(name, id);
    }

    public int getSalary() { return 80000; }
    public String makeWorkNoise() { return "$$$"; }
}
