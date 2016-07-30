package hashmap;

public class LinkedList {

	Node head = null;
	
	public void insert(String key, String value) {
		Node temp = new Node(key, value);
		if(head == null) {
			head = temp;
		} else {
			Node iteratingNode = head;
			while(iteratingNode.next != null) {
				iteratingNode = iteratingNode.next;
			}
			iteratingNode.next = temp;
		}
	}
	
	
	public String getValue(String key) {
		Node iteratingNode = head;
		while(iteratingNode != null) {
			if(iteratingNode.key.equals(key)) {
				return iteratingNode.value;
			}
			iteratingNode = iteratingNode.next;
		}
		return null;
	}
	
	
	static class Node {
		
		String key;
		String value;
		Node next;
		
		Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}
}
