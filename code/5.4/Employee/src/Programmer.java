
public class Programmer extends Employee{

    public Programmer(String name, String id) {
        super(name, id);
    }

    public int getSalary() { return 80000 * 2; }
    public String makeWorkNoise() { return "Clack clack clack"; }
}
