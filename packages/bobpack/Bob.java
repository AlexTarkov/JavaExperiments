//package bobpack; // важно, что пакет закоментен

public class Bob{
	
	private int a=0;
	
	Bob(){}
	
	public Bob(int m){
		this.a = m;
		}
	
	public void fire(){
		System.out.println("I'm fire: "+a);
		}
	
	}