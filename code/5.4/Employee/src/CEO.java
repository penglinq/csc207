import java.util.*;

public class CEO extends Manager{
	public CEO(String name, String id, List<Employee> reportees) {
        super(name, id, reportees);
    }
	@Override
    public int getSalary() { return 80000 * 100; }
	@Override
    public String makeWorkNoise() { return "Do More Work More Do More Work More Do More Work"; }
}
