class TestExtendsPrivate extends TestEP{
	
	private int m;
	
	public static void main(String[] args){
		
		TestExtendsPrivate me = new TestExtendsPrivate();
		//me.toOneMyN(me);
		TestExtendsPrivate you = new TestExtendsPrivate();
		me.toOneMyM(you);
		System.out.println(you.getM());
		
		}
	
	void toOneMyN(TestEP a){
		//TestEP k = (TestEP) a;
		//k.n = 1;
		}
		
	void toOneMyM(TestExtendsPrivate a){
		a.m = 1;
		}
	
	public int getM() {return this.m;}
	
	}
	
class TestEP{
	
	private int n;
	
	public int getN() {return this.n;}
	
	}