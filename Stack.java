// SPDX-FileCopyrightText: 2024 Leonhard Blank leonhardblank@outlook.de
//
// SPDX-License-Identifier: HPND-MIT_disclaimer

public class Stack {
	
	private int maxSize = 0;
	int pos = -1;
	int[] stackArr = null;

	// Constructor to initialize the stack with a specified size
	public Stack(int size) {
		maxSize = size;
		stackArr = new int[size];
		System.out.println("Constructor executed");
	}	  

    // Method to check if the stack is empty
	public boolean isEmpty() {
		if (this.size() == 0)
			return true;
		return false;
	}  

    // Method to remove and return the top element of the stack
	public int pop() {  
		if (pos == -1)
			return -1;
		int element = stackArr[pos];  
		stackArr[pos] = -1;  
		pos--;  
		return element;  
	}  

	// Method to add an element to the top of the stack
	public void push(int element) throws StackOverflowError,IllegalArgumentException {  		
		if (element<0)
			throw new IllegalArgumentException();
		int npos = pos + 1;  
		if (npos == maxSize)  
			throw new StackOverflowError("Stack is full");  
		pos = npos;  
		stackArr[pos] = element;  
	}  

	// Method to return the top element without removing it
	public int top() {
		if(this.isEmpty()) {
			return -1;
		}

		else {
			return stackArr[pos];
		}
	}

	// Method to return the current size of the stack
	public int size() { 		
		return pos + 1;  
	}  	

}


