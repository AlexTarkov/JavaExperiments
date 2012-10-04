class IntegerExp{
	
	public static void main(String arg[]){
		
		IntegerExp IE = new IntegerExp();
		IE.run();
		
		}
	
	private void run(){
		Integer n = new Integer(5);
		change(n);
		System.out.println(n);
		}
	
	void change(Integer k){
		Integer p = k;
		p++;
		System.out.println(p);
		k = p;
		}
	
	}