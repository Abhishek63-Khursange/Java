/*
 * 22. Vehicle Types
Scenario: Vehicles can be Land or Water types. Some vehicles can operate on both.

Problem Statement:
● Interface LandVehicle → method driveOnLand()
● Interface WaterVehicle → method driveOnWater()
● Class AmphibiousVehicle implements both interfaces → provides both methods

Sample Input:
AmphibiousVehicle → name=HydroCar

Sample Output:
HydroCar → Driving on Land
HydroCar → Driving on Water
 */


package Java.oopj.Assignment3;

 interface LandVehical {
        void driveOnLand();
    
}
interface WaterVehicle {
    void driveOnWater();

    
}
class AmphibiousVehicle implements LandVehical,WaterVehicle{

    
    

    public void driveOnLand(){
        System.out.println("HydroCar -> Driving on Land");



    }

    public void driveOnWater()
    {
        System.out.println("HydroCar -> Driving on Water");

    }

}
class LANDMAIN{
    public static void main(String[] args) {
      AmphibiousVehicle a=new AmphibiousVehicle();
      a.driveOnLand();
      a.driveOnWater();

    }
}
