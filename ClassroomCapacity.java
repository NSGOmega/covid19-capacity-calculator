import java.util.Scanner;
public class ClassroomCapacity {
    
    
    
    public static void main(String[] args)
{

    Scanner sc = new Scanner(System.in); // Start of our scanner class

    int numFloors = 0; //  Number of floors (We'll initialize all these values to 0)
    int numClassrooms = 0; // Number of classrooms 
   
    double classCap = 0.0; // Class capacity 
    double stateCap = 0.0; // State capacity 
    double reccCap = 0.0; // Reccomeneded capacaity, we'll do the math for this later on
    double totalFloorCap = 0.0; // Total capacity of the entire floor
    double totalStateCap = 0.0; // Total capacity with state calculated
    double totalStateCapComb = 0.0; // Total state capacity of all floors combined

    boolean validFloors = false; // We can use this to loop for valid input from the user
    boolean validClassrooms = false; // We can use this to loop for valid input from the user
    boolean validStateCap = false; // We can use this to loop for valid input from the user

    String buildingName; // Building name. We'll let the user pick this

    System.out.println("What is the name of your building");
    buildingName = sc.nextLine(); // Take input

    while (validStateCap == false) { // Loop for seeing if user puts in a value below 0 (negative number())

        System.out.println("What is your current state capacity (in %)");
        stateCap = sc.nextDouble(); // Take input

        if (stateCap > 0) { 
            validStateCap = true;
        } else {
            System.out.println("*!*!* Please enter a value greater than 0 *!*!*");
        }
    }


    while (validFloors == false ) { // Loop for making sure user puts in a value above or equal to 1.

        System.out.println("How many floors does your building have?");
        numFloors = sc.nextInt();

        if (numFloors >= 1) {
            validFloors = true;
        } else {
            System.out.println("*!*!* Please enter a value greater than or equal to 1 *!*!*");
        }
    }

    
    for (int i = 1; i <= numFloors; i++) // Use this to itterate our amount of classrooms per floor. We can use "i" to signify the current floor we're on.
    {
        System.out.println("");
        
        while (validClassrooms == false) {
            System.out.println("How many classrooms are on Floor #" + i);
            numClassrooms = sc.nextInt(); // Take input for our classrooms for floor #i
        
            if (numClassrooms >= 2) {
            validClassrooms = true;
            } else {
                System.out.println("!*!* Plese enter a value greater than or equal to 2 *!*!*");
            }

        }
        totalFloorCap = 0;
        
        
        for (int z = 1; z <= numClassrooms; z++) { // Calculate our capacity for current floor # and each classroom #. Itterate through z until it matches with numClassrooms
            System.out.println("What is the classroom capacity of (Floor: #" + i + " | Classroom: #" + z + ")");
            classCap = sc.nextInt();
            reccCap = classCap * (stateCap * .01 ); // Calculate our reccomended capacity based off of the max amount of people per classroom, and the state reccomendation %. Then assign to new var (reccCap).
            System.out.println("***************************\nBuilding name: " + buildingName + "\nFloor: [" + i + "]/" + numFloors + "\nClassroom: [" + z + "]/" + numClassrooms+ "\nNormal capacity: " + classCap + " Students" 
            + "\nState capacity: " + reccCap + " students" + " (" + stateCap + "% rate)" + "\n***************************"); // Print results neatly.
            totalFloorCap = (classCap + totalFloorCap);
            totalStateCap = totalFloorCap * (stateCap * .01);
        }

        // Prints out a card of information pretaining to current floor 
        System.out.println("");
        System.out.println("------Floor #" + i + " Information------");
        System.out.println("Total Classrooms: " + numClassrooms);
        System.out.println("Total Classroom Capacity: " + totalFloorCap + " students");
        System.out.println("Total State Capacity: " + totalStateCap + " students");
        System.out.println("");
        totalStateCapComb = (totalStateCapComb + totalFloorCap);
    


        

        
    
}
        // Final card summary of building information
        totalStateCapComb = totalStateCapComb * (stateCap * .01);
        System.out.println("");
        System.out.println("------[" + buildingName + "] Information------");
        System.out.println("Total Floors: " + numFloors);
        System.out.println("Total Classrooms: " + numClassrooms);
        System.out.println("Total Capacity (" + stateCap + "% rate): " +  totalStateCapComb + " students");
        System.out.println("-------------------------------");


}

    public static void Filler() {
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");
        System.out.println("               ");
    }
      
}
