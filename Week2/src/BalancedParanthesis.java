//Using stack check for balanced parenthesis within a string. [2 Marks]
//		Input "{()}{}"
//		Output true

public class BalancedParanthesis {
	int size;
	char stk[];
	int top=-1;
	
	//defining the size of stack
	BalancedParanthesis(int size){
		stk=new char[size];
	}
	
	public BalancedParanthesis() {
		// TODO Auto-generated constructor stub
	}

	void push(char data) {
		top=top+1;
		stk[top]=data;
	}
	
	char pop() {
		return stk[top--];	
	}
	
	int peak() {
		return top;
	}
	
	//checks if string is balanced or not
	boolean isBalanced(String data) {
		String openparanthesis="{({";
		String closeparanthesis="})}";
		int size=data.length();
		
		
		BalancedParanthesis stk=new BalancedParanthesis(size);
		for(int i=0;i<size;i++) {
			char paranthesis=data.charAt(i);
			
			
			
			
			if(openparanthesis.indexOf(paranthesis)!=-1) {
				stk.push(paranthesis);
			}else {
				int indx=closeparanthesis.indexOf(paranthesis);
				char opening=openparanthesis.charAt(indx);
				if(stk.pop()!=opening) {
					return false;
				}
			}
		}
		if(stk.peak()==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String data="{()}{}";
		BalancedParanthesis bp=new BalancedParanthesis();
		if(bp.isBalanced(data)) {
			System.out.println(" The given string is balanced");
		}else {
			System.out.println(" The given string is unbalanced");
		}
		
	}

}
