class InnerClassTest{
	
	
	public static void main(String[] args){ 
		Tested tst = new Tested();
		tst.run();
		}
	

	
	}

class Tested{

	int a = 0;
	
	private class InnerClass{
	
		
		
		//InnerClass(Tested m){ Tested g = m; g.a = 4; } //������ ��������� ����������� � ���������� �������� this
		
		public void test() { System.out.println("InnerClass.test = " + a ); } //������ ������������� ������ outer.a
		
		}
	
	public void run(){
		InnerClass icl =  new InnerClass(this);
		
		icl.test();
		}
	
	
	}