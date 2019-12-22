class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Lion extends Animal{  
void roar(){System.out.println("roaring...");}  
}  	
class Cat extends Animal{  
void meow(){System.out.println("meowing...");}  
}  
class TestingInheritance3{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();  
c.eat();  
}}  

