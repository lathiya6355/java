// enum Level{
//     LOW,
//     MEDIUM,
//     HIGH
// }
// public class Main {
//     public static void main(String[] args) {
//         Level mylvl = Level.LOW;
//         System.out.println(mylvl);
//     }
// }

// enum inside a class ================================

// public class Main {
//     enum Level{
//         LOW,
//         MEDIUM,
//         HIGH    
//     }
//     public static void main(String[] args) {
//         Level mylvl = Level.LOW;
//         System.out.println(mylvl);
//     }
// }

// enum in switch case ============================

// enum Level{
//     LOW,
//     MEDIUM,
//     HIGH    
// }
// public class Main {
//     public static void main(String[] args) {
//     Level mylvl = Level.LOW;

//         switch (mylvl) {
//             case LOW:
//             System.out.println("Low level");
//             break;
//             case MEDIUM:
//                 System.out.println("Medium level");
//                 break;
//             case HIGH:
//                 System.out.println("High level");
//                 break;
//         }
//     }
// }

// loop through enum ================================

// enum Level {
//     LOW,
//     MEDIUM,
//     HIGH
// }

// public class Main { 
//     public static void main(String[] args) { 
//         for (Level myVar : Level.values()) {
//         System.out.println(myVar);
//         }
//     } 
// }