class TestExtends extends Test {
	
	TestExtends() {super(5);}
	//TestExtends() {} // не работает, тк нет конструктора по умолчанию в Test
	
	public static void main(String[] args){
		System.out.print("OK ");
		TestExtends te = new TestExtends();
		System.out.print(te.getMM());
		System.out.print(te.getM());
		//System.out.print(m); // не работает. нет доступа к приватным полям родителя.
		}
		
	int getMM(){ return super.getM(); }
	
	}
	
class Test{
	
	private int m;
	
	Test(int a){ this.m = a; }
	
	int getM() {return this.m;}
	
	}