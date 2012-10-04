/*
эксперимент со статическим методом, возвращающим объект другого класса
*/
public class exp{
	
	void exp(){
		this.i = 4;
		}
	
	public int i = 1;
	
	public static exp createExp(){
		return new exp();
		}
		
	public static a createA(){
		a p = new a();
		return p;	
	
		}
	public static void main(String[] args){
		//exp test = createExp();
		a test = createA();
		System.out.println(test.i);
		}
	}

class a{
	public int i = 1;
	public a(){//важно, что инициализатор объявляется без воида. если с воидом, это просто функция (НЕ РАБОТАЕТ)
		System.out.println("a init");
		i = 3;
		}
	}