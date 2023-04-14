package Normal;
class Jungle{
	public int id;
	public String name;
	public float sal;
     Jungle(int id,String name,float sal){
    	this.id=id;
    	this.name=name;
    	this. sal=sal;
     }
	public void Display(){
		System.out.println(id+" "+name+" "+sal);
	}
}

public class ConceptEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jungle j = new Jungle(10,"sushant",1000f);
		Jungle j1= new Jungle(20,"hypertext",1500f);
		j.Display();
		j1.Display();
		
		

	}

}
