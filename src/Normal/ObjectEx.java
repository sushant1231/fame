package Normal;
class Employee{
	public Integer empid;
	public String empname;
	public Double  empsal;
	public void m1(){
		System.out.println("i am a BOY");
	}
	public void m2(Integer empid,String empname,Double empsal){
		this.empid=empid;
		this.empname=empname;
		this.empsal=empsal;
	}
	public void m3(){
		
	System.out.println("empid :"+empid+" "+"empname :"+empname+" "+"empsal :"+empsal);
	

	}}


public  class ObjectEx {

	public static void main(String[] args) {
		Employee emp= new Employee();
		emp.m1();
		emp.m2(10, "sushant", 1000.0);
		emp.m3();
	}}
	  
	  
		

	


