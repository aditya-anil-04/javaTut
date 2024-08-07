import java.util.List;

public class MyList<T extends Comparable<T>> {

	public static class Node<E extends Comparable<E>> {
		public Node<E> next;
		public E data;
		public Node(E data) {
			this.data = data;
			next = null;
		}
	}

	public Node<T> head = null;

	public void method1(List<T> coll) {
		
		if (coll == null || coll.isEmpty()) {
			
			return;
			
		}

		for (int i = coll.size() - 1; i >= 0; i--) {
			
			Node<T> newNode = new Node<>(coll.get(i));
			newNode.next = head;
			head = newNode;
			
		}
		
	}	

	public T method2() {
		
		if (head == null) {
			
	        throw new IllegalStateException("List is empty");
	        
	    }
	    
	    T max = head.data;
	    Node<T> current = head.next;
	    
	    while (current != null) {
	    	
	        if (current.data.compareTo(max) > 0) {
	        	
	            max = current.data;
	            
	        }
	        
	        current = current.next;
	        
	    }
	    
	    return max;
	    
	}

	public void method3() {
		
		if (head == null) {
			
	        return;
	        
	    }
	    
	    T largest = method2(); 
	    
	    Node<T> current = head;
	    
	    while (current != null) {
	    	
	        if (current.data.compareTo(largest) == 0) {
	        	
	            Node<T> newNode = new Node<>(largest);
	            newNode.next = current.next;
	            current.next = newNode;
	            break; 
	            
	        }
	        
	        current = current.next;
	        
	    }
		
	}

}
