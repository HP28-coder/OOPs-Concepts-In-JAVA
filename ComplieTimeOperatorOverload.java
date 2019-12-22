class OperatorOverload { 
  
    void operator(String str1, String str2) 
    { 
        String s = str1 + str2; 
        System.out.println("Concatinated String - "
                           + s); 
    } 
  
    void operator(int a, int b) 
    { 
        int c = a + b; 
        System.out.println("Sum = " + c); 
    } 
} 
  
class Main { 
    public static void main(String[] args) 
    { 
        OperatorOverload obj = new OperatorOverload (); 
        obj.operator(5, 6); 
        obj.operator("work", "done"); 
    } 
} 
