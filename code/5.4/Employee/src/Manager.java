import java.util.*;

public class Manager extends Employee{
	private List<Employee> reportees;
	
	public Manager(String name, String id, List<Employee> reportees) {
        super(name, id);
        this.reportees = reportees;
    }

    public int getSalary() { return 120000 * 3; }
    public String makeWorkNoise() { return "Do Work Do Work Do Work"; }
}
