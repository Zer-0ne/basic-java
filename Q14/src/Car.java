class Car {
    String warranty ="10 yr";
    Car(){
        System.out.println("Class Car");
    }
    void vehicleType(){
        System.out.println("Vehicle Type : 4 wheeler");
    }
}
class Maruti extends Car{
    Maruti(){
        System.out.println("Class Maruti");
    }
    void brand(){
        System.out.println("Brand : Maruti");
    }
    void speed(){
        System.out.println("Max : 200kmph");
    }
    void warranty(){
        System.out.println("Warranty : "+super.warranty);
    }
}
class Maruti800 extends Maruti{
    Maruti800(){
        System.out.println("Maruti Model : 800");
    }
    void speed(){        
        System.out.println("Max : 100kmph");
    }
    void warranty(){
        System.out.println("Warranty : "+super.warranty);
    }
}