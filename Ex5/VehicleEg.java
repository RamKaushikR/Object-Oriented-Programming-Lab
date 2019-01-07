import java.util.*;
interface Vehicle{
    String getName();
    void setName(String a);
    int getMaxPasengers();
    void setMaxPassengers(int p);
    int getMaxSpeed();
    void setMaxSpeed(int s);
}
interface LandVehicle extends Vehicle{
    int getNumWheels();
    void setNumWheels(int a);
    void drive();
}
interface SeaVehicle extends Vehicle{
    int getDisplacement();
    void setDisplacement(int a);
    void launch();
}
interface EmergencyVehicle{
    void soundSiren();
}
class Jeep implements LandVehicle{
    public String getName(){
        String name = "Jeep";
        return name;
    }
    public void setName(String a){
        String q = a;
        System.out.println(a);
    }
    public int getMaxPasengers(){
        int max = 4;
        return max;
    }
    public void setMaxPassengers(int p){
        int pass = p;
        System.out.println(p);
    }
    public int getMaxSpeed(){
        int speed = 120;
        return speed;
    }
    public void setMaxSpeed(int s){
        int sp = s;
        System.out.println(s);
    }
    public int getNumWheels(){
        int wheel = 4;
        return wheel;
    }
    public void setNumWheels(int w){
        int we = w;
        System.out.println(w);
    }
    public void drive(){
        System.out.println("I am driving a Jeep");
    }
    public void soundHorn(){
        System.out.println("soundHorn() function in jeep class");
    }
}
class Frigate implements SeaVehicle{
    public String getName(){
        String name = "Frigate";
        return name;
    }
    public void setName(String a){
        String q = a;
        System.out.println(a);
    }
    public int getMaxPasengers(){
        int max = 40;
        return max;
    }
    public void setMaxPassengers(int p){
        int pass = p;
        System.out.println(p);
    }
    public int getMaxSpeed(){
        int speed = 90;
        return speed;
    }
    public void setMaxSpeed(int s){
        int sp = s;
        System.out.println(s);
    }
    public int getDisplacement(){
        int dis = 1205;
        return dis;
    }
    public void setDisplacement(int d){
        int disp = d;
        System.out.println(d);
    }
    public void launch(){
        System.out.println("launch() method in Frigate Class");
    }
    public void fireGun(){
        System.out.println("fireGun() method in Frigate Class");
    }
}
class HoverCraft implements LandVehicle, SeaVehicle{
    public String getName(){
        String name = "Hovercraft";
        return name;
    }
    public void setName(String a){
        String q = a;
        System.out.println(a);
    }
    public int getMaxPasengers(){
        int max = 5;
        return max;
    }
    public void setMaxPassengers(int p){
        int pass = p;
        System.out.println(p);
    }
    public int getMaxSpeed(){
        int speed = 150;
        return speed;
    }
    public void setMaxSpeed(int s){
        int sp = s;
        System.out.println(s);
    }
    public int getNumWheels(){
        int wheel = 0;
        return wheel;
    }
    public void setNumWheels(int w){
        int we = w;
        System.out.println(w);
    }
    public void drive(){
        System.out.println("I am driving a HoverCraft");
    }
    public int getDisplacement(){
        int dis = 800;
        return dis;
    }
    public void setDisplacement(int d){
        int disp = d;
        System.out.println(d);
    }
    public void launch(){
        System.out.println("launch() method in HoverCraft Class");
    }
    public void enterLand(){
        System.out.println("HoverCraft can travel in land");
    }
    public void enterSea(){
        System.out.println("HoverCraft can travel in sea");
    }
}
class Ambulance implements LandVehicle,EmergencyVehicle{
    public String getName(){
        String name = "Ambulance";
        return name;
    }
    public void setName(String a){
        String q = a;
        System.out.println(a);
    }
    public int getMaxPasengers(){
        int max = 3;
        return max;
    }
    public void setMaxPassengers(int p){
        int pass = p;
        System.out.println(p);
    }
    public int getMaxSpeed(){
        int speed = 120;
        return speed;
    }
    public void setMaxSpeed(int s){
        int sp = s;
        System.out.println(s);
    }
    public int getNumWheels(){
        int wheel = 4;
	return wheel;
    }
    public void setNumWheels(int w){
        int we = w;
        System.out.println(w);
    }
    public void drive(){
        System.out.println("I am driving an Ambulance");
    } 
    public void soundSiren(){
         System.out.println("It is an emergency vehicle");
    }
    public void patientIn(int a){
         int b = a;
         System.out.println("No. of patients in the ambulance"+a);
    }
}   
class VehicleEg{
    public static void main(String[] args){
        Jeep j = new Jeep();
        Frigate f = new Frigate();
        HoverCraft h = new HoverCraft();
        Ambulance a = new Ambulance();
        Scanner sc = new Scanner(System.in);
        int ch;
        System.out.println("Enter Choice:\n1.Jeep\n2.Frigate\n3.Hovercraft\n4.Ambulance");
        ch = sc.nextInt();
        switch (ch){
	    case 1:
                System.out.println("JEEP");
                String sj=j.getName();
                System.out.println("After setting a new name");
                j.setName("Wagon");
                int mj=j.getMaxPasengers();
                System.out.println("After setting max passenegers");
                j.setMaxPassengers(8);
                int msj=j.getMaxSpeed();
                System.out.println("After setting a new speed");
                j.setMaxSpeed(150);
                int wj=j.getNumWheels();
                System.out.println("The newly set no. of wheels");
                j.setNumWheels(6);
                j.drive();
                j.soundHorn();
                break;
            case 2:
                System.out.println("Frigate");
                String sf=f.getName();
                System.out.println("After setting a new name");
                f.setName("WarShip");
                int mf=f.getMaxPasengers();
                System.out.println("After setting max passenegers");
                f.setMaxPassengers(60);
                int msf=f.getMaxSpeed();
                System.out.println("After setting a new speed");
                f.setMaxSpeed(110);
                int df=f.getDisplacement();
                System.out.println("After setting a new Displacement");
                f.setDisplacement(1500);
                f.launch();
                f.fireGun();
                break;
            case 3:
                System.out.println("Hovercraft");
                String sh=h.getName();
                System.out.println("After setting a new name");
                h.setName("ACV");
                int mh=h.getMaxPasengers();
                System.out.println("After setting max passenegers");
                h.setMaxPassengers(10);
                int msh=h.getMaxSpeed();
                System.out.println("After setting a new speed");
                h.setMaxSpeed(160);
                int wh=h.getNumWheels();
                System.out.println("The newly set no. of wheels");
                h.setNumWheels(0);
                h.drive();
                int dh=h.getDisplacement();
                System.out.println("After setting a new Displacement");
                h.setDisplacement(1000);
                h.launch();
                h.enterLand();
                h.enterSea();
                break;
	    case 4:
		System.out.println("AMBULANCE");
		String sa=a.getName();
                System.out.println("After setting a new name");
                a.setName("ICU");
                int ma=a.getMaxPasengers();
                System.out.println("After setting max passenegers");
                a.setMaxPassengers(8);
                int msa=a.getMaxSpeed();
                System.out.println("After setting a new speed");
                a.setMaxSpeed(150);
                int wa=a.getNumWheels();
                System.out.println("The newly set no. of wheels");
                a.setNumWheels(4);
                a.drive();
                a.patientIn(2);
                a.soundSiren();
                break;
        }
    }
}
