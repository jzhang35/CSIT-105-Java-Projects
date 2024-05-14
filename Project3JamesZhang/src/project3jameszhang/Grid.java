//James Zhang
package project3jameszhang;
import java.util.Random;

public class Grid
{
    // class fields
    private int[][] gameArray = new int [10][10];
    private int currentRow;
    private int currentColumn;

    //for random numbers
    Random randomNumbers = new Random();

    // constants
    private final int MAX_ELEMENT_VALUE = 1000;

    /**
        no-arg constructor - creates a 10x10 grid and sets random location
    */
    public Grid()
    {
        currentRow = randomNumbers.nextInt(10);
        currentColumn = randomNumbers.nextInt(10);
        for(int ROWS = 0; ROWS < gameArray.length; ROWS++)
        {
            for(int COLUMNS = 0; COLUMNS < gameArray.length; COLUMNS++)
            {
                randomNumbers.nextInt(1000);
                gameArray[ROWS][COLUMNS] =
                        randomNumbers.nextInt(MAX_ELEMENT_VALUE);
            }            
        }
       
       
    }

    /**
        constructor  - creates a grid (newGridSize x newGridSize) and
                       sets random location
        @param newGridSize is the value to set for the dimensions of the grid
    */
    public Grid(int newGridSize)
    {
        currentRow = randomNumbers.nextInt(newGridSize);
        currentColumn = randomNumbers.nextInt(newGridSize);
        for(int ROWS = 0; ROWS < gameArray.length; ROWS++)
        {
            for(int COLUMNS = 0; COLUMNS < gameArray.length; COLUMNS++)
            {
                randomNumbers.nextInt(1000);
                gameArray[newGridSize][newGridSize] =
                        randomNumbers.nextInt(MAX_ELEMENT_VALUE);
            }
        }
    }

    /** private method populateBoard to set locations to random value
    */
    private void populateBoard()
    {
        int row, column;
       
        for(int ROWS = 0; ROWS < gameArray.length; ROWS++)
        {
            for(int COLUMNS = 0; COLUMNS < gameArray.length; COLUMNS++)
        {
                randomNumbers.nextInt(1000);
                gameArray[ROWS][COLUMNS] =
                    randomNumbers.nextInt(MAX_ELEMENT_VALUE);
        }
        }

       
    }

    /**
        The jump() method sets a random location
    */
    public void jump(String input)
    {
        if(input.equalsIgnoreCase("j"))
        {
            currentRow = randomNumbers.nextInt(10);
            currentColumn = randomNumbers.nextInt(10);
            System.out.printf("\nYou are in spot [%d,%d]\n",
                    currentRow, currentColumn);
        }
    }

    /**
        getCurrentRow method returns value in currentRow field
        @return value in currentRow field
    */
    public int getCurrentRow()
    {
        return currentRow;
    }

    /**
        getCurrentCol method returns value in currentColumn field
        @return value in currentColumn field
    */
    public int getCurrentCol()
    {
        return currentColumn;
    }

    /**
        The getCurrentValue() method returns the value in the game board
        or grid at the current row and current columnumm field (cell)
        @return the value in the grid at the current row and oclumn
    */
    public int getCurrentValue()
    {
        int currentValue;
        currentValue = gameArray[currentRow][currentColumn];
        return currentValue;
    }

    /**
        The goNorth() method decreases the value in the current row
    */
    public void goNorth(String input)
    {
        String playerInput = input;
        // decrease row (north)
        if(playerInput.equalsIgnoreCase("n"))
        {
            if(currentRow != 0)
            {
                currentRow = currentRow - 1;
            }
            else
                currentRow = currentRow;
        }
       
        // make sure not less than 0

    }

    /**
        The goSouth() method increases the value in the current row
    */
    public void goSouth(String input)
    {
        String playerInput = input;
        
        if(playerInput.equalsIgnoreCase("s"))
        {
            if(currentRow != 9)
            {
                currentRow = currentRow + 1;
            }
            else
                currentRow = currentRow;
        }

    }

    /**
        The goWest() method decreases the value in the current column
    */
    public void goWest(String input)
    {
        String playerInput = input;
        // decrease column (west)
        if(playerInput.equalsIgnoreCase("w"))
        {
            if(currentColumn != 0)
            {
                currentColumn = currentColumn - 1;
            }
            else
                currentColumn = currentColumn;
        }


        // make sure not less than 0

    }

    /**
        The gatherDaisies() method decreases the current location
        in the grid by 80% and returns the value decremented
        @return value of 80% decrease in grid
    */
    public int gatherDaisies()
    {
        int newVal = 0;
        int totalDaisiesGathered =0;
        int daisiesGathered = 0;
   
        daisiesGathered = (gameArray[currentRow][currentColumn] * 80)/100;
        gameArray[currentRow][currentColumn] =
                gameArray[currentRow][currentColumn] - daisiesGathered;
       
        System.out.printf("\nYou just gathered %d daisies from this spot!\n\n"
                + "You are in spot [%d,%d]\n"
                + "There are %d daisies located here\n",
                daisiesGathered, currentRow, currentColumn,
                gameArray[currentRow][currentColumn], totalDaisiesGathered);
       
        return daisiesGathered;
    }

    /**
        The goEast() method increases the value in the
        current column.
    */
    public void goEast(String input)
    {
        String playerInput = input;
       
        if(playerInput.equalsIgnoreCase("e"))
        {
            if(currentColumn != 9)
            {
                currentColumn = currentColumn + 1;
            }
            else
                currentColumn = currentColumn;
        }

    }

    /**
        The getGridSize() method returns the size of the grid
        @return the size of the grid or length of the array
    */
    public int getGridSize()
    {
        return gameArray.length;
    }

    /**
        The toString() method is used to return a String representing this Grid
        @return a String representing this Grid
    */
    public String toString()
    {
        String stringToReturn = "";
        int row, column;

        for(row = 0; row < gameArray.length; row++)
        {
            for(column = 0; column < gameArray.length; column++)
            {
                if(gameArray[row][column] < 100)
                    stringToReturn = stringToReturn + " ";
                if(gameArray[row][column] < 10)
                    stringToReturn = stringToReturn + " ";
                stringToReturn = stringToReturn + gameArray[row][column] + " ";
            }
            stringToReturn = stringToReturn + "\n";
        }


        return stringToReturn;
    }
}