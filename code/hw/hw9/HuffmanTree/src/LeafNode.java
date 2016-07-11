
public class LeafNode implements Node{
	public Pair value;
	
	public LeafNode(short fst, int snd) {
		this.value = new Pair(fst, snd);
	}
	
	public boolean isLeaf() {
		return true;
	}
	
	public Integer compareValue() {
		return value.snd;
	}
	
	public String toString() {
		return "[" + (char)value.fst + ", " + value.snd + "]";
	}
}
