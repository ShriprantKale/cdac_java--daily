package assign_1;



import java.util.Scanner;
public class StackMain1 {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			StackClass1 sc=new StackClass1();
			System.out.println("Enter size of stack: ");
			int size=in.nextInt();
			sc.createStack(size);
			do {
				System.out.println("-----Stack Menu-----");
				System.out.println("1.Push1");
				System.out.println("2.Pop1");
				System.out.println("3.Peek1");
				System.out.println("4.Push2");
				System.out.println("5.Pop2");
				System.out.println("6.Peek2");
				System.out.println("0.Exit");
				System.out.println("\nEnter choice: ");
				int ch=in.nextInt();
				switch(ch) {
				case 1:
		
					if(sc.isFull1()) 
						System.out.println("Stack is full cannot insert new element inside stack..!");
					else {
						System.out.println("Enter element need to be pushed in stack: ");
						int e=in.nextInt();
						sc.push1(e);
					}
					break;
				case 2:
					System.out.println("");
					if(sc.isEmpty1())
						System.out.println("Stack is empty no more elements to be removed..!");
					else {
						int temp=sc.pop1();
						System.out.println("Element "+temp+" removed from stack...");
					}
					break;
				case 3:
					if(sc.isEmpty1())
						System.out.println("Stack is empty..!");
					else {
					int temp=sc.peek1();
					System.out.println("Element present at top of stack is: "+temp);
					}
					break;
				case 4:
					
					if(sc.isFull2()) 
						System.out.println("Stack is full cannot insert new element inside stack..!");
					else {
						System.out.println("Enter element need to be pushed in stack: ");
						int e=in.nextInt();
						sc.push2(e);
					}
					break;
				case 5:
					System.out.println("");
					if(sc.isEmpty2())
						System.out.println("Stack is empty no more elements to be removed..!");
					else {
						int temp=sc.pop2();
						System.out.println("Element "+temp+" removed from stack...");
					}
					break;
				case 6:
					if(sc.isEmpty2())
						System.out.println("Stack is empty..!");
					else {
					int temp=sc.peek2();
					System.out.println("Element present at top of stack is: "+temp);
					}
					break;
				case 0:
					System.out.println("Thanks for using this appication...");
					System.exit(0);
				default:
					System.out.println("Invalid choice!!!");
				}
			}while(true);
		}
	}
