 
package friday_task;
// Step 1: Define Enum
enum TrafficLight {
    RED, YELLOW, GREEN
}

// Step 2: Use Enum in a class
public class Enum {
    public static void main(String[] args) {
        // Assign a traffic light color
        TrafficLight signal = TrafficLight.RED;

        // Print the current signal
        System.out.println("Current traffic signal: " + signal);

        // Decide what to do based on the signal
        switch(signal) {
            case RED -> System.out.println("Stop!");
            case YELLOW -> System.out.println("Get Ready!");
            case GREEN -> System.out.println("Go!");
        }
    }
}