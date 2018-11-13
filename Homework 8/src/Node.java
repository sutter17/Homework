public class Node {
	public int value;
	
	public Node left;
	public Node right;
	
	public Node(int value) {
		this.value = value;
		
		left = null;
		right = null;
	}
	
	// Suggestion: modify to include the level too
	//             after you implement the levels.
	public String toString() {
		return "[" + value + "]";
	}
}
