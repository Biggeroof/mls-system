public class Address
{
    //these are all final because you can't change the address once the home object is created
    private int streetNum;
    private String streetName;
    private String city;
    private String postalCode;

    /**
     * Initializes an address object instance and fills in all the field with the parameters
     *
     * @param streetNum The number of the home on the street
     * @param streetName The name of the street
     * @param city The city the home is in
     * @param postalCode The postal code of the home
     */
    public Address(int streetNum, String streetName, String city, String postalCode)
    {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.postalCode = postalCode;
    }

    /**
     *Returns the street number
     *
     * @return the street number
     */
    public int getStreetNum()
    {
        return streetNum;
    }

    /**
     * Returns the name of the street
     *
     * @return the name of the street
     */
    public String getStreetName()
    {
        return streetName;
    }

    /**
     * Returns the city that the home is in
     *
     * @return The city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Returns the postal code of the home
     *
     * @return The postal code
     */
    public String getPostalCode()
    {
        return postalCode;
    }

    /**
     * Returns string representation of the object
     *
     * @return The home's details
     */
    public String toString()
    {
        return streetNum + " " + streetName + ", " + city + ", " + postalCode;
    }
}
