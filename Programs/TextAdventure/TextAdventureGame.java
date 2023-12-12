import java.util.Scanner;

class Room {
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String description) {
        this.description = description;
    }

    public void setExits(Room north, Room south, Room east, Room west) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    public String getDescription() {
        return description;
    }

    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }
}

public class TextAdventureGame {
    public static void main(String[] args) {
        // Creating rooms
        Room room1 = new Room("You are in a dark room.");
        Room room2 = new Room("You entered a room with a window.");
        Room room3 = new Room("You found a treasure room!");
        Room room4 = new Room("You are in a corridor.");

        // Setting room exits
        room1.setExits(null, room2, room4, null);
        room2.setExits(room1, null, null, null);
        room3.setExits(null, null, null, room4);
        room4.setExits(null, room3, room1, null);

        Room currentRoom = room1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Text Adventure Game!");

        while (true) {
            System.out.println("\n" + currentRoom.getDescription());
            System.out.println("Choose your direction (N/S/E/W) or type 'exit' to quit:");

            String input = scanner.nextLine().toUpperCase();

            if (input.equals("EXIT")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }

            switch (input) {
                case "N":
                    if (currentRoom.getNorth() != null) {
                        currentRoom = currentRoom.getNorth();
                    } else {
                        System.out.println("You can't go that way.");
                    }
                    break;
                case "S":
                    if (currentRoom.getSouth() != null) {
                        currentRoom = currentRoom.getSouth();
                    } else {
                        System.out.println("You can't go that way.");
                    }
                    break;
                case "E":
                    if (currentRoom.getEast() != null) {
                        currentRoom = currentRoom.getEast();
                    } else {
                        System.out.println("You can't go that way.");
                    }
                    break;
                case "W":
                    if (currentRoom.getWest() != null) {
                        currentRoom = currentRoom.getWest();
                    } else {
                        System.out.println("You can't go that way.");
                    }
                    break;
                default:
                    System.out.println("Invalid direction! Try again.");
            }
        }
    }
}

