
public class Bug implements Comparable<Bug> {
	
	public String title;
	public Integer priority;
	public String description;
	
	public Bug(String title, int priority, String description) {
		this.title = title;
		this.priority = priority;
		this.description = description;
	}
	
	public int compareTo(Bug b) {
		return this.priority.compareTo(b.priority);
	}
	
	public String toString() {
		return title + ": " + description;
	}

}
