public class Apartment extends Home
{
    private int unitNum;
    private double maintenanceFee;

    /**
     * Initializes an apartment object and fills in all the fields with the parameters
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
     */
    public Apartment(double price, int numParkingSpace, int numBedrooms, int numBathrooms, Address address, double floorArea, double monthlyPropertyTax, String listId, int unitNum, double maintenanceFee)
    {
        super(price, numParkingSpace, numBedrooms, numBathrooms, address, floorArea, monthlyPropertyTax, listId);
        this.unitNum = unitNum;
        this.maintenanceFee = maintenanceFee;
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
     * Returns the maintenance fee
     *
     * @return The maintenance fee
     */
    public double getMaintenanceFee()
    {
        return maintenanceFee;
    }

    /**
     * Changes the monthly maintenance fee to the parameter given
     *
     * @param maintenanceFee the new monthly maintenance fee
     */
    public void setMaintenanceFee(double maintenanceFee)
    {
        this.maintenanceFee = maintenanceFee;
    }

    /**
     * Calculates the cost to own the apartment for a year not including mortgage
     *
     * @return The total cost to own the apartment for a year
     */
    @Override
    double calculateExpectedCost()
    {
        return NUM_MONTHS_IN_YEAR * (monthlyPropertyTax + maintenanceFee);
    }

    /**
     * Returns a string representation of the object
     *
     * @return The apartment's details
     */
    public String toString()
    {
        return super.toString() + String.format( "\nUnit Number: %d\nMonthly maintenance fee: %.2f\n-------------------------------\n", unitNum, maintenanceFee);
    }
}
