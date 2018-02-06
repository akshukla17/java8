public class PassBy{
	public static void main(String[]args){
		Dog d=new Dog("puppy");
		
		System.out.println((d.getName().equals("puppy"))?true:false);
		foo(d);
		System.out.println((d.getName().equals("puppy"))?true:false);
		System.out.println("-----");
		System.out.println((d.getName().equals("mini"))?true:false);
	}
	public static void foo(Dog d){
		d.name="mini";
		System.out.println("***********");
		System.out.println((d.getName().equals("mini"))?true:false);
		System.out.println("**********");
		
	}
}
class Dog{
	public Dog(String name){
		this.name=name;
	}
	public String name;
	private int age;
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}