package inheritance;


class Aeroplane
{
    public void Fly()
    {
        System.out.println("Aeroplane is flying");
    }
 public void Takeoff()
 {
    System.out.println("Aeroplane is going to takeoff");

 }
 
}   
 

class CargoPlane extends Aeroplane
{
    public void Fly()
    {
        System.out.println("CargoPlane is flying");
    }
    
    public void Takeoff()
    {
        System.out.println("CargoPlane carry Takepff");
    }
}

class PassengerPlane extends Aeroplane
{
    public void Fly()
    {
        System.out.println("PassengerPlane is flying");
    }
    public void Takeoff()
    {
        System.out.println("PAssenger Plane TAkeoff");
    }
}
class fighterPlane
{
    public void Fly()
    {
        System.out.println("Fighterplane is flying");
    }
    public void Takeoff()
    {
        System.out.println("Fighterplane is taking off");
    } 
}

public class polymorphism {
    public static void main(String[] args) {
        PassengerPlane pp=new PassengerPlane();
       

        CargoPlane cp=new CargoPlane();
        Aeroplane ref;
        ref=pp;
        ref.Takeoff();
        ref.Fly();
         System.out.println("-----------------------------------------------");
        ref=cp;
        ref.Takeoff();
        ref.Fly();

       
    }
}
