public class MainAircraft {
    public static void main (String args[] ) {


        //_________________________________________________________________________
	/*
	aircraft boing737 = new aircraft (215, 90_000_000, 907, 3_200, 85.80_505);
	aircraft airbusA320 = new aircraft (180, 130_000_000, 903, 2_700, 80.20 );
	*/

        //______________________________OR_________________________________________

        Aircraft boing737 = new Aircraft();
        Aircraft airbusA320 = new Aircraft();



        boing737.passangers 	= 215;
        boing737.price			= 90_000_000;
        boing737.cruiseSpeed	= 907;
        boing737.fuelCapacity 	= 3_200;
        boing737.fuelBuroutRate = 85.80_505;


        airbusA320.passangers 	= 180;
        airbusA320.price		= 130_000_000;
        airbusA320.cruiseSpeed	= 903;
        airbusA320.fuelCapacity	= 2_700;
        airbusA320.fuelBuroutRate = 80.20;
        //_________________________________________________________________________



        System.out.println ("The number of passangers a boing737 can carry is " + boing737.passangers);
        System.out.println("An airbus A320 costs " + airbusA320.price + " USD.");


        boing737.calculateAircraftEndurance();


        System.out.println("\nThe cost price per passenger on full capacity for AirbusA320 is " + airbusA320.calculateAircraftEconomics() + " USD.");

        System.out.println("the cost of three airbusA320s would be " + airbusA320.calculateinvoice(4) + " USD.");

        System.out.println("the cost of 6 boing737 would be "+ boing737.calculateinvoice(6)+ " USD.");
    }


}




