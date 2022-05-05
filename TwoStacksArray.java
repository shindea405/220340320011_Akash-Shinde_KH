//Question no 3

class TSArray{
    int size;
	int ar1[];
	int top1;
	int top2;
	
	TSArray(){
		ar1 = new int[10];
		size = 10;
		top1 = size/2+1;
		top2 = size/2;
		
	}
	
	
	    void push1(int a){
			if(top1>0)
			{
				top1--;
				ar1[top1]=a;
			}
			else
			{
				System.out.println("Overflow");
				return;
			}
			
	    }
		
		int pop1(int b){
			if(top1<=size/2)
			{
				int a = ar1[top1];
				top1++;
				return a;
			}
			else
			{
				System.out.println("Underflow");
				System.exit(1);
			}
			return 0;
		}
		
		void push2(int a){
			if(top2<size-1)
			{
				top2++;
				ar1[top2] = a;
			}
			else
			{
				System.out.println("Overflow");
				return;
			}
			
		}
		
		int pop2(int b){
			if(top2>=size/2+1)
			{
				int a = ar1[top2];
				top2--;
				return a;
			}
			else
			{
				System.out.println("Underflow");
				System.exit(1);
			}
			return 1;
		}
		
}

class TwoStacksArray{
	public static void main(String[] args){
		TSArray ts = new TSArray();
		    ts.push1(5);
			ts.push2(10);
			ts.push2(15);
			ts.push1(11);
			ts.push2(10);
			ts.push2(40);
			
			//ts.pop1(11);
			System.out.println("Popped element from stack1 is "+ts.pop1(11));
			System.out.println("Popped element from stack2 is "+ts.pop2(40));
			//ts.pop1(40);
			
		
	}
}