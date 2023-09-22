public class Townhouse extends Home
{
    private int unitNum;
    private double maintenanceFee;
    private int numSharedWalls;

    /**
     * Initializes a townhouse object and fills in all the fields with the parameters
     *
     * @param price The price of the home
     * @param numParkingSpace The number of parking spaces
     * @param numBedrooms The number of bedrooms
     * @param numBathrooms The number of bathrooms
     * @param address The address
     * @param floorArea The total floor area of them home
     * @param monthlyPropertyTax The monthly property tax
     * @param listId The listing ID
     * @param unitNum The unit number
     * @param maintenanceFee The monthly maintenance fee
     * @param numSharedWalls The number of shared walls
     */
    public Townhouse(double price, int numParkingSpace, int numBedrooms, int numBathrooms, Address address, double floorArea, double monthlyPropertyTax, String listId, int unitNum, double maintenanceFee, int numSharedWalls)
    {
        super(price, numParkingSpace, numBedrooms, numBathrooms, address, floorArea, monthlyPropertyTax, listId);
        this.unitNum = unitNum;
        this.maintenanceFee = maintenanceFee;
        this.numSharedWalls = numSharedWalls;
    }

    /**
     * Returns the unit number
     *
     * @return The unit number
     */
    public int getUnitNum()
    {
        return unitNum;
    }

    /**
     * Returns the monthly maintenance fee
     *
     * @return The monthly maintenance fee
     */
    public double getMaintenanceFee()
    {
        return maintenanceFee;
    }

    /**
     * Returns the number of shared walls
     *
     * @return The number of shared walls
     */
    public int getNumSharedWalls()
    {
        return numSharedWalls;
    }

    /**
     * Changes the monthly maintenance fee to the parameter given
     *
     * @param maintenanceFee The new monthly maintenance fee
     */
    public void setMaintenanceFee(double maintenanceFee)
    {
        this.maintenanceFee = maintenanceFee;
    }

    /**
     * Changes the number of shared walls to the parameter given
     *
     * @param numSharedWalls The new number of shared walls
     */
    public void setNumSharedWalls(int numSharedWalls)
    {
        this.numSharedWalls = numSharedWalls;
    }

    /**
     * Calculates the cost to own the townhouse for a year not including mortgage
     *
     * @return The total cost to own the townhouse for a year
     */
    @Override
    double calculateExpectedCost()
    {
        return NUM_MONTHS_IN_YEAR * (monthlyPropertyTax + maintenanceFee);
    }

    /**
     * Returns a string representation of the object
     *
     * @return The townhouse's details
     */
    public String toString()
    {
        return super.toString() + String.format( "\nUnit number: %d\nMonthly maintenance fee: %.2f\nNumber of shared walls: %d\n-------------------------------\n", unitNum, maintenanceFee, numSharedWalls);
    }
}
