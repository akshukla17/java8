package com.app.leet;
// need to create enum with constructor and interate it.
public enum EnumBasics {
	TESCO(2),MAHARASTRA(23),KARANATAKA(56),BANGLORE(66),DEORIA(01),RAM(67),VINA(12),WER_34_TEST(90);
	
	int value;
	//enum constructor is private (if we didn't assign, JVM will do it). That's why enum can't instanciate using new keyword 	
	EnumBasics(int v){
		this.value=v;
	}
	
	
}
class A{
	public static void main(String[] args) {
		final EnumBasics b=EnumBasics.VINA;
		switch(b) {
		case DEORIA: System.out.println(b.value); break;
		default: System.out.println("default");
		}
	}
}


