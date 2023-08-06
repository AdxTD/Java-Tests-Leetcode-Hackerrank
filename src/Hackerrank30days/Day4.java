package Hackerrank30days;

public class Day4 {

    public class Person{
        private int age;
        
        public Person(int initialAge){
            if(initialAge < 0){
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0; return;
            }
            this.age = initialAge;
        }
        
        public void yearPasses(){
            this.age += 1;
        }
        
        public void amIOld(){
            String msg = "";
            if(this.age < 13)
                msg = "You are young.";
            else if(this.age < 18) 
                msg = "You are teenager.";
            else
                msg = "You are old.";
            System.out.println(msg);
                
        }
    }
    
}
