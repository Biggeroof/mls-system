public abstract class Home implements Comparable<Home>
{

    protected final int NUM_MONTHS_IN_YEAR = 12;
    protected double price;
    protected int numParkingSpace;
    protected int numBedrooms;
    protected int numBathrooms;
    protected Address address;
    protected double floorArea;
    protected double monthlyPropertyTax;
    protected String listId;

    /**
     * A constructor for the home class that is for use in the subclasses
     *
     * @param price The price of the home
     * @param numParkingSpace The number of parking spaces
     * @param numBedrooms The number of bedrooms
     * @param numBathrooms The number of bathrooms
     * @param address The address
     * @param floorArea The total floor area of them home
     * @param monthlyPropertyTax The monthly property tax
     * @param listId The listing ID
     */
    public Home(double price, int numParkingSpace, int numBedrooms, int numBathrooms, Address address, double floorArea, double monthlyPropertyTax, String listId)
    {
        this.price = price;
        this.numParkingSpace = numParkingSpace;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.address = address;
        this.floorArea = floorArea;
        this.monthlyPropertyTax = monthlyPropertyTax;
        this.listId = listId;
    }

    /**
     * Returns the price
     *
     * @return The price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Returns the number of parking spaces
     *
     * @return The number of parking spaces
     */
    public int getNumParkingSpace()
    {
        return numParkingSpace;
    }

    /**
     * Returns the number of bedrooms
     *
     * @return The number of bedrooms
     */
    public int getNumBedrooms()
    {
        return numBedrooms;
    }

    /**
     * Returns the number of bathrooms
     *
     * @return The number of bathrooms
     */
    public int getNumBathrooms()
    {
        return numBathrooms;
    }

    /**
     * Returns the address of the home
     *
     * @return The address
     */
    public Address getAddress()
    {
        return address;
    }

    /**
     * Returns the total floor area of the home
     *
     * @return The total floor area
     */
    public double getFloorArea()
    {
        return floorArea;
    }

    /**
     * Returns the monthly property tax
     *
     * @return The monthly property tax
     */
    public double getMonthlyPropertyTax()
    {
        return monthlyPropertyTax;
    }

    /**
     * Returns the listing ID of the home
     *
     * @return The listing ID
     */
    public String getListId()
    {
        return listId;
    }

    /**
     * Changes the price to parameter given
     *
     * @param price The new price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Changes the number of parking spaces to parameter given
     *
     * @param numParkingSpace The new amount of parking spaces
     */
    public void setNumParkingSpace(int numParkingSpace)
    {
        this.numParkingSpace = numParkingSpace;
    }

    /**
     * Changes the number of bedrooms to the parameter given
     *
     * @param numBedrooms The new amount of bedrooms
     */
    public void setNumBedrooms(int numBedrooms)
    {
        this.numBedrooms = numBedrooms;
    }

    /**
     * Changes the number of bathrooms to the parameter given
     *
     * @param numBathrooms The new amount of bathrooms
     */
    public void setNumBathrooms(int numBathrooms)
    {
        this.numBathrooms = numBathrooms;
    }

    /**
     * Changes the total floor area to the parameter given
     *
     * @param floorArea The new floor area
     */
    public void setFloorArea(double floorArea)
    {
        this.floorArea = floorArea;
    }

    /**
     * Changes the monthly property tax to the parameter given
     *
     * @param monthlyPropertyTax The new monthly property tax
     */
    public void setMonthlyPropertyTax(double monthlyPropertyTax)
    {
        this.monthlyPropertyTax = monthlyPropertyTax;
    }

    abstract double calculateExpectedCost();

    /**
     * Calculates which home has a higher number of bedrooms
     *
     * @param o the home to compare to
     * @return How many bedrooms the home has more or less of
     */
    @Override
    public int compareTo(Home o)
    {
        return this.numBedrooms - o.numBedrooms;
    }

    /**
     * Returns a string representation of the object
     *
     * @return The home's details
     */
    public String toString()
    {
        return this.getClass().getName() + String.format("\n-------------------------------\nListingID: %s\nPrice: %.2f\nAddress: %s\nFloor Area: %.2f\nNumber of bedrooms: %d\nNumber of bathrooms: %d" +
                "\nNumber of parking spaces: %d\nMonthly property tax: %.2f", listId, price, address, floorArea, numBedrooms, numBathrooms, numParkingSpace, monthlyPropertyTax);
    }
}
