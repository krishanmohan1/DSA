package OOPSinJAVA.Polymorphism;

class Aeroplane1{
    public void takeOff(){
        System.out.println("Areoplane takeOff");
    }
    public void fly(){
        System.out.println("Aeroplne fly");
    }
}

class Cargoplane1 extends Aeroplane1{

    public void takeOff(){
        System.out.println("Cargoplane need longer run way");
    }
    public void fly(){
        System.out.println("cargoplane fly at lower height");
    }

}
class PassengerPlane1 extends Aeroplane1{
    public void takeOff(){
        System.out.println("Passenger plane need shorter run way ");
    }
    public void fly(){
        System.out.println("Passenger plane fly at heigher height");
    }
}

public class Polymorphism1 {
    public static void main(String[] args) {

        Cargoplane1 cp = new Cargoplane1();

        PassengerPlane1 pp = new PassengerPlane1();

        Aeroplane1 ref; // parent class ka reference ,jo dono sub class ko refer kar sakta hai.

//        cp=pp;  this is not valid because dono the type differnet hai, ek Cargoplane1 hai aur ek passenger plane hai,
//        but dono ka parent class same hai , so Parent class dono refer kar sakte hai,

        ref=cp;
        ref.takeOff();
        ref.fly();

        System.out.println("-------------------------------------------");
        ref=pp;
        ref.takeOff();
        ref.fly();

        /*
        Here you can see that , same thing call two different thing .
        Hence Polymorphism is achieved .
        But this is not right way , because ,using polymorphism , size of code reduces but here is not reducing .
        So learn that thing in next videos.

         */
    }
}
