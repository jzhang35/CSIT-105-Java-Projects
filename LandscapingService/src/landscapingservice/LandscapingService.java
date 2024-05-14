//James Zhang
package landscapingservice;

public class LandscapingService {

    private char serviceLevel;
    private double acreage;
    double cost;
    
    /**
       The LandScapingService constructor method
       @param newServiceLevel the level of service picked
       @param newAcreage the amount of acres of the landscaping
    */
    
    public LandscapingService(char newServiceLevel, double newAcreage)
    {
        serviceLevel = newServiceLevel;
        acreage = newAcreage;
    }
    
    /**
       The getAcreage method returns the landscaping acreage.
       @return the amount of acres of the landscaping
    */
    
    public double getAcreage()
    {
        return acreage;
    }
    
    /**
       The getServiceLevel method returns the level of service.
       @return the level of service
    */
    
    public char getServiceLevel()
    {
        return serviceLevel;
    }
    
    /**
       The setAcreage method sets the amount of acres of landscaping.
       @param newAcreage the amount of acres of landscaping
    */
    
    public void setAcreage(double newAcreage)
    {
        acreage = newAcreage;
    }
    
    /**
       The setServiceLevel method sets the level of landscaping.
       @param newServiceLevel the level of landscaping
    */
    
    public void setServiceLevel(char newServiceLevel)
    {
        serviceLevel = newServiceLevel;
    }
    
    /**
       The cost method returns the total cost based on the level of service
       picked and the number of acres of landscaping.
       @return the total cost
    */
    
    public double cost()
    {
        if(serviceLevel == 'S' || serviceLevel == 's')
        {
            cost = 9865.34 * acreage;
        } else if ((serviceLevel == 'P' || serviceLevel == 'p') && acreage <= 1)
        {
            cost = 15975.75 * acreage;
        } else {
            cost = 15975.75 + 21999.98 * (acreage - 1);
        }
        
        return cost;
    }
    
    /**
       The str method displays the service level, acreage, and
       cost, positioned accordingly within a string.
       @return the service level, acreage, and cost within a string
    */
    
    public String toString()
   {
      String str = "[" + serviceLevel + "," + serviceLevel + "]" + " " + 
                   serviceLevel + " Acr.: " + acreage + " Exp:    " + cost + 
                   " - Ac:    "  + cost;
      
      return str;
   }
        
    }