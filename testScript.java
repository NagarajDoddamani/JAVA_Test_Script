import StackAN.stackImplimentation;

public class testScript {
    public static void main(String args[]){

        // createing the object for testing stack
        stackImplimentation s = new stackImplimentation(10);
        
        // if (s.isEmpty() == 1){
        //     System.out.println("TestCase 1 : Empty st start Sucsesfull");
        // }else{
        //     System.out.println("TestCase 1 : Failed");
        // }
        // if (s.isFull() == 0){
        //     System.out.println("TestCase 2 : Stack is not full Sucsesfull");
        // }else{
        //     System.out.println("TestCase 2 : isFull Failed");
        // }
        if (s.pop() == 0){
            System.out.println("TestCase 1 : Stack underflow Sucsesfull");
        }else{
            System.out.println("TestCase 1 : Stack underflow Failed");
        }
        if (s.display() == 0){
            System.out.println("TestCase 2  : Stack is empty Sucsesfull");
        }else{
            System.out.println("TestCase 2 : Stack is empty Failed");
        }
        if (s.peek() == 0){
            System.out.println("TestCase 3 : Stack is empty Sucsesfull");
        }else{
            System.out.println("TestCase 3 : Stack is empty Failed");
        }
        if (s.push(5) == 1){
            System.out.println("TestCase 4 : Push operation Sucsesfull");
        }else{
            System.out.println("TestCase 4 : Push operation Failed");
        }
        if (s.peek() == 1){
            System.out.println("TestCase 5 : Peek operation Sucsesfull");
        }else{
            System.out.println("TestCase 5 : Peek operation Failed");
        }
        if (s.display() == 1){
            System.out.println("TestCase 6 : Display operation Sucsesfull");
        }else{
            System.out.println("TestCase 6 : Display operation Failed");
        }
        if (s.pop() == 1){
            System.out.println("TestCase 7 : Pop operation Sucsesfull");
        }else{
            System.out.println("TestCase 7 : Pop operation Failed");
        }
        if (s.pop() == 0){
            System.out.println("TestCase 8 : Stack underflow Sucsesfull");
        }else{
            System.out.println("TestCase 8 : Stack underflow Failed");
        }
        // making full no need for intermidiate transactions
        s.makeFull();
        if (s.push(5) == 0){
            System.out.println("TestCase 9 : Stack overflow Sucsesfull");
        }else{
            System.out.println("TestCase 9 : Stack overflow Failed");
        }
        if (s.display() == 0){
            System.out.println("TestCase 10 : Display operation on full stack Failed");
        }else{
            System.out.println("TestCase 10 : Display operation on full stack Sucsesfull");
        }
        if (s.peek() == 0){
            System.out.println("TestCase 11 : Peek operation on full stack Failed");
        }else{
            System.out.println("TestCase 11 : Peek operation on full stack Sucsesfull");
        }
        if (s.pop() == 0){
            System.out.println("TestCase 12 : Pop operation on full stack Failed");
        }else{
            System.out.println("TestCase 12 : Pop operation on full stack Sucsesfull");
        }
    }
}
