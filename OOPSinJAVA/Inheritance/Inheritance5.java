package OOPSinJAVA.Inheritance;
class Aeroplane{
    public void takeOff(){
        System.out.println("Aeroplane is takking Off");
    }
    public void fly(){  // ye method @Overridden kehlayega
        System.out.println("Aeroplane is flying");
    }
}


class CargoPlane extends Aeroplane{
    // doing here @Override
    public void fly(){
        System.out.println("CargoPlane fly at lower height ");
    }
    public void carryGood(){  // specialized function.
        System.out.println("cargoplane carry goods");
    }
}


class PassengerPlane extends Aeroplane{

    public void fly(){
        System.out.println("PassengerPlane fly at medium height");
    }
    // ye method yaha @Overriding kehlayega

    public void carryPassenger(){  // ye  hua specialized mehods,kyu ki ye parent method me nhi hai
        System.out.println("Pasengerplane carry Passenger");
    }

}


public class Inheritance5 {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();


    }
}
