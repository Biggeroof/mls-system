public class House extends Home
{
    private String type;
    private int numFloors;
    private double utilityFees;

    /**
     * Initializes a house object and fills in all the fields with the parameters
     *
     * @param price The price of the home
     * @param numParkingSpace The number of parking spaces
     * @param numBedrooms The number of bedrooms
     * @param numBathrooms The number of bathrooms
     * @param address The address
     * @param floorArea The total floor area of them home
     * @param monthlyPropertyTax The monthly property tax
     * @param listId The listing ID
     * @param type The type of the house
     * @param numFloors The number of floors the house has
     * @param utilityFees The monthly utility fee
     */
    public House(double price, int numParkingSpace, int numBedrooms, int numBathrooms, Address address, double floorArea, double monthlyPropertyTax, String listId, String type, int numFloors, double utilityFees)
    {
        super(price, numParkingSpace, numBedrooms, numBathrooms, address, floorArea, monthlyPropertyTax, listId);
        this.type = type;
        this.numFloors = numFloors;
        this.utilityFees = utilityFees;
    }

    /**
     * Returns the type of the home
     *
     * @return The type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Returns the number of floors
     *
     * @return The number of floors
     */
    public int getNumFloors()
    {
        return numFloors;
    }

    /**
     * Returns the monthly utility fee
     *
     * @return The monthly utility fee
     */
    public double getUtilityFees()
    {
        return utilityFees;
    }

    /**
     * Changes the monthly utility fee to the parameter given
     *
     * @param utilityFees The new monthly utility fee
     */
    public void setUtilityFees(double utilityFees)
    {
        this.utilityFees = utilityFees;
    }

    /**
     * Calculates the cost to own the house for a year not including mortgage
     *
     * @return The total cost to own the house for a year
     */
    @Override
    public double calculateExpectedCost()
    {
        return NUM_MONTHS_IN_YEAR * (monthlyPropertyTax + utilityFees);
    }

    /**
     * Returns a string representation of the object
     *
     * @return The house's details
     */
    public String toString()
    {
        return super.toString() + String.format("\nType of house: %s\nNumber of floors: %d\nMonthly utility fee: %.2f\n-------------------------------\n", type, numFloors, utilityFees);
    }
}
