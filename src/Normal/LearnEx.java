package Normal;


class Animal{
	public void eat(){                
		System.out.println("earting chicken ");
	}
	public void bark(){
		System.out.println("woowooowoo");
	}}
	class Tiger extends Animal{
		public void bark(){
			System.out.println("yoo yoo  yoo");
			//super.bark();
		}
	}


public class LearnEx {

	public static void main(String[] args) {
		Tiger ti= new Tiger();
		ti.bark();
            

	}

}
