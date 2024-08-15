package OOPSinJAVA.Abstraction;



abstract class AeroPlane3{  // agar class ke component me ek bhi abstract hoga to class ko bhi abstract karna padega


    abstract public void takeOff();

    /*
    Like Due to Overring en method ke body ka use nhi ho rha hai issilye esko hatah dete hai.
     */
    abstract public void fly();

    /*
    Like Due to Overring en method ke body ka use nhi ho rha hai issilye esko hatah dete hai.
     */
    // Aur Enko Abstract Kar dete hai .

    public void landing(){
        System.out.println("Aeroplane is landing ");
    }

}

class CargoPlane3 extends AeroPlane3{
    public void takeOff(){
        System.out.println("CargoPlane takeOff on longer runway");
    }
    public void fly(){
        System.out.println("CargoPlane Fly at lower height");
    }

    public void alert(){
        System.out.println("Alert..");
    }

}
class PassengerPlane3 extends AeroPlane3{

    public void takeOff(){
        System.out.println("PassengerPlane takeOff on medium runway");
    }
    public void fly(){
        System.out.println("PassengerPlane fly at medium Height");
    }

}
public class Abstraction1 {
    public static void main(String[] args) {

        AeroPlane3 cp = new CargoPlane3();  // Abstract class ka reference bana sakte hai.
        cp.takeOff();
        cp.fly();
        cp.landing();

        ((CargoPlane3)cp).alert(); // here changinig the parent refrence to child type ---> Casting

        AeroPlane3 pp = new PassengerPlane3();  // yaha bhi abstract class ka ref banaye hai
        pp.takeOff();
        pp.takeOff();
        pp.landing();

        // But , we cannot make the , Objects of Abstract class,
        // AeroPlane3 a = new AeroPlane3(); // it will give error, that is abstract class cannot instantiated.




    }
}
