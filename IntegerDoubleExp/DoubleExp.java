class DoubleExp{
	
	public static void main(String arg[]){
		
		DoubleExp DE = new DoubleExp();
		DE.run();
		
		}
	
	private void run(){
		Double n = new Double(13);
		change(n);
		//System.out.println(n);
		}
	
	void change(Double k){
		//k++;
		//доказательство того, что первоначальный объект уничтожается:
		Double m = new Double(33);
		Double p = m;
		m++;
		Object obj = new Object();
		System.out.println(  );
		obj = p;
		System.out.println( obj.toString() );
		k++;
		//System.out.println(p);
		}
	
	}