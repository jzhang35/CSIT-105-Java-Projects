// Prepared by      Linda Yang
// Programmed by    Stephen T Brower
// Date Written     10/24/2013
// Date Modified    10/16/2014 - implemented setters and displayRecord method

// Purpose:         LandscapingService - test using Loop

package landscapingservice;

public class LandscapingServiceDemoLoop
{
    public static void main(String[] args)
    {
        char[] serviceLevel   = {     'S',     'S',      'S',      'S',     'P',      'P',       'P',      'P' };
        double[] acreage      = {    0.25,     1.0,     1.25,      1.5,    0.25,      1.0,      1.25,     1.5, };
        double[] expectedCost = { 2466.34, 9865.34, 12331.68, 14798.01, 3993.94, 15975.75, 21475.745, 26975.74 };
        int test;

        // initalize with 1st test[0]
        LandscapingService landscapingServiceForTest = new LandscapingService(serviceLevel[0],acreage[0]);

        displayRecord ( serviceLevel[0] , acreage[0], expectedCost[0],
                        landscapingServiceForTest );

        for ( test = 1; test < serviceLevel.length; test++)
        {
            landscapingServiceForTest.setServiceLevel( serviceLevel[test] );
            landscapingServiceForTest.setAcreage( acreage[test] );

            displayRecord ( serviceLevel[test] , acreage[test], expectedCost[test],
                            landscapingServiceForTest );
        } // end for loop
    } // end main method

    public static void displayRecord(char levelPassed, double aceragePassed,
                                     double expectedCost,
                                     LandscapingService landscapingServicePassed)
    {
        System.out.printf("[%s,%4.2f] Level %s Acr.: %4.2f Exp: %,10.2f - Ac: %,10.2f",
                                levelPassed, aceragePassed,
                                landscapingServicePassed.getServiceLevel(),
                                landscapingServicePassed.getAcreage(),
                                expectedCost,
                                landscapingServicePassed.cost() );
        if ( Math.abs( expectedCost - landscapingServicePassed.cost()) >= .01)
            System.out.printf(" <= %.4f\n", expectedCost - landscapingServicePassed.cost());
        else
            System.out.println();
    } // end displayRecord method
} // end class
