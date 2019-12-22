class Employee{  
 float salary=40000;  
}  
class Manager extends Employee{  
 int bonus=10000;  
 public static void main(String args[]){  
   Manager m=new Manager();  
   System.out.println("Manager salary is:"+m.salary);  
   System.out.println("Bonus of Manager is:"+m.bonus);  
}  
}  
