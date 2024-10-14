package assign_1;

public class StackClass1 {
	
			private int stack[], maxSize, tos,n;
			
			public void createStack(int size) {
				tos=-1;
				stack=new int[size];
				maxSize=n=size;
			}
			void push1(int e) {
				tos++;
				stack[tos]=e;
				System.out.println("Element "+e+" pushed...");
			}
			void push2(int e) {
				maxSize--;
				stack[maxSize]=e;
				System.out.println("Element "+e+" pushed...");
			}
			boolean isFull1() {
				if(tos==maxSize-1)
					return true;
				else 
					return false;
			}
			boolean isFull2() {			
				if(maxSize-1==tos)
					return true;
				else 
					return false;
			}
			int pop1() {
				int temp=stack[tos];
				tos--;
				return temp;
			}
			int pop2() {
				int temp=stack[maxSize];
				maxSize++;
				return temp;
			}
			boolean isEmpty1() {
				if(tos==-1)
					return true;
				else
					return false;
			}
			boolean isEmpty2() {
				if(maxSize==n)
					return true;
				else
					return false;
			}
			int peek1() {
				return (stack[tos]);
			}
			int peek2() {
				return (stack[maxSize]);
			}
			void print() {
				System.out.print("Stack has: [");
				for(int i=tos;i>=0;i--) {
					System.out.print(stack[i]+" ");
				}
				System.out.print("]"+"\n");
				System.out.println("---------------------");
			}
		}
