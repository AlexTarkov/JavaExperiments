class DoubTest{
	
	public static void main(String[] args){
		
		Double m= new Double(33);
		Object obj = new Object();
		obj = (Object)m;
		
		System.out.println( obj.getClass().getName() );
		
		//System.out.println( obj.isNaN() );
		
		System.out.println( obj.toString() );
		
		}
	
	}