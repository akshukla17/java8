public class MultileReturnType{
		public static void main(String[]a){
			Circle c=new Circle();
			c.build();
			Square s=new Square();
			s.build();
			Tringle t=new Tringle();
			t.build();
		}
	
}
 class Circle implements Shape{
	public Circle build(){
		System.out.println("Circle build");
		return new Circle();
	}
}

 class Square implements Shape{
	public Square build(){
		System.out.println("Square build");
		return new Square();
	}
}

 class Tringle implements Shape{
	public Tringle build(){
		System.out.println("Tringle build");
		return new Tringle();
	}
}
interface Shape{
	public Shape build();
}