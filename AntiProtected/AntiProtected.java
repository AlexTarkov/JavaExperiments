class AntiProtected{
	
	public static void main(String[] args){
		
		B objB = new B(13);
		
		objB.getSecret();
		
		}
	
	}
	
class A{
	
	private int secret;
	
	public A(int m) { this.secret = m; }
	
	
	}
	
class B extends A{
	
	public B(){ super(13);	}
	
	public void getSecret(){
		A objA = (A)this;
		System.out.println(objA.m);
		}
	
	}