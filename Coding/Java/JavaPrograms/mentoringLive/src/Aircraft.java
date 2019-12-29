public class Aircraft {

    int passangers;			// num of passangers
    int price;				// USD
    double cruiseSpeed;		// km / hour
    double fuelCapacity;	// liters
    double fuelBuroutRate;  // liters per hour

    //_______________________ method non-return type

    public void calculateAircraftEndurance () {

        double endurance = fuelCapacity / fuelBuroutRate ;
        System.out.println("The endurance of the aircraft is "+ endurance + " hours.");
    }


    //_______________________ method return type

    double calculateAircraftEconomics ()  {

        double economy = price / passangers;

        return economy;
    }

    //_______________________ method with parameter

    public int calculateinvoice (int units) {

        int totalPrice = price * units;

        return totalPrice;
    }


    //_______________________ constructor
	/*
	public aircraft (int p, int pr, double cs, double fc, double fbr)   {

		passangers = p;
		price		= pr;
		cruiseSpeed	=cs;
		fuelCapacity	= fc;
		fuelBuroutRate	= fbr;


	}
	*/
    //_______________________

}
