package com.class_object;

public class Employeee {
	String emp_name;
	int emp_id;
	String emp_email;
	
	public String isWorking() {
		return"yes he is working";
	}
	
	public static void main(String[] args) {
		Employeee emp=new Employeee();
		emp.emp_name="mohan";
		emp.emp_id=121;
		emp.emp_email="m@parvam.com";
		String res=emp.isWorking();
		System.out.println("emp_name:"+emp.emp_name);
		System.out.println("emp_id:"+emp.emp_id);
		System.out.println("emp_email:"+emp.emp_email);
		System.out.println(res);
		
		Employeee emp1=new Employeee();
		emp1.emp_name="pavan";
		emp1.emp_id=111;
		emp1.emp_email="p@parvam.com";
		String res1=emp1.isWorking();
		System.out.println("emp_name:"+emp1.emp_name);
		System.out.println("emp_id:"+emp1.emp_id);
		System.out.println("emp_email:"+emp1.emp_email);
		System.out.println(res1);
		
		
		
	}

}
 