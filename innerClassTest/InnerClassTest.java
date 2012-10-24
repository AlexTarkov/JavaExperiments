class InnerClassTest{
	
	
	public static void main(String[] args){ 
		Tested tst = new Tested();
		tst.run();
		}
	

	
	}

class Tested{

	int a = 0;
	
	private class InnerClass{
	
		
		
		//InnerClass(Tested m){ Tested g = m; g.a = 4; } //неявно создается конструктор и передается параметр this
		
		public void test() { System.out.println("InnerClass.test = " + a ); } //неявно подставляется ссылка outer.a
		
		}
	
	public void run(){
		InnerClass icl =  new InnerClass(this);
		
		icl.test();
		}
	
	
	}