package OOPS;
/*
Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in
this class.
public abstract String notice();
Derive FirstClass,Ladies, General, Luggage classes from the compartment class. Override the notice function
in each of them to print notice message that is suitable to the specific type of compartment/
Create a class TestCompartment. Write main function to do the following:
    Declare an array of compartment of size 10.
    Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4/
    Check the polymorphic behaviour of the notice board

 */
import java.util.Random;

// Abstract class Compartment
abstract class Compartment {
    // Abstract method notice
    public abstract String notice();
}

// FirstClass subclass
class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "Notice: Welcome to the First Class compartment!";
    }
}

// Ladies subclass
class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Notice: This compartment is reserved for ladies.";
    }
}

// General subclass
class General extends Compartment {
    @Override
    public String notice() {
        return "Notice: Welcome to the General compartment.";
    }
}

// Luggage subclass
class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Notice: This compartment is for luggage only.";
    }
}

// TestCompartment class
public class TestCompartment {
    public static void main(String[] args) {
        // Declare an array of Compartment of size 10
        Compartment[] compartments = new Compartment[10];

        Random random = new Random();

        // Create compartments of random types
        for (int i = 0; i < compartments.length; i++) {
            int compartmentType = random.nextInt(4) + 1; // Generate a random integer in the range 1 to 4
            switch (compartmentType) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        // Check polymorphic behavior
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + compartments[i].notice());
        }
    }
}