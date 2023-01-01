public class logicalOperators {
    logicalOperators(){
        System.out.println("\n\n1.Logical Condition");
        int a=50,b=30,c=100;
        boolean condition = true;

        // AND LOGICAL OPERATOR
        if(a<c && b<c){
            System.out.println(c+" is greatest number");
        }

        // OR LOGICAL OPERATOR
        else if(a%2==0 || b%2==0 || c%2==0){
            System.out.println("one of them even number");
        }

        // NOT LOGICAL OPERATOR
        else if(!condition){
            System.out.println("Condition is false!!");
        }

        else{
            System.out.println("Logical operators");
        }
    }
}
