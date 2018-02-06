public class Singleton{
	public static void main(String[]args){
		
	}
}

class SingletonTest{
	private SingletonTest(){}
	private static SingletonTest instance=null;
	
	public static synchronized SingletonTest getInstance(){
		if(instance==null){
			instance=new SingletonTest();
			return instance;
		}else{
			return instance;
		}
	}
	
}