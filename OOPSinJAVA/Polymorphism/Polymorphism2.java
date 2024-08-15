package OOPSinJAVA.Polymorphism;

class AeroPlane2{
    public void takeOff(){
        System.out.println("AeroPlane takeOff");
    }
    public void fly(){
        System.out.println("Aeroplane do fly");
    }
}
class CargoPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("Cragoplane need longer runway");
    }
    public void fly(){
        System.out.println("cragoplane fly at lower height");
    }
}
class PassengerPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("Passenger plane need medium runway");
    }
    public void fly(){
        System.out.println("Passenger plane fly at medium height");
    }
}
class FighterPlane2 extends AeroPlane2{
    public void takeOff(){
        System.out.println("figer plane need short runway");
    }
    public void fly(){
        System.out.println("Figer Plane fly at heigher height");
    }
}

class Airport{
    public void poly(AeroPlane2 ref){  // here it is a method taking a 'ref' of 'AeroPlane2' type which is parent class
        ref.takeOff();
        ref.fly();
        System.out.println("----------------------");
    }
}

public class Polymorphism2 {
    public static void main(String[] args) {

        CargoPlane2 cp = new CargoPlane2();

        PassengerPlane2 pp = new PassengerPlane2();

        FighterPlane2 fp = new FighterPlane2();

//        cp.takeOff();
//        cp.fly();
//
//        pp.takeOff();
//        pp.fly();
//
//        fp.takeOff();
//        fp.fly();

        Airport a = new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

    }
}
