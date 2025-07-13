// record class reduce the code size and improve performance. The `reduce` method is a higher-order function that applies a given function
// In record class every field and Methods are private and final by default without any need to declare them as such. This is because record classes are designed to be immutable by default
// record class can not be extends because it is final by default

// In this program we tried to compare both(planet and planet1 ) object by equals method 
// after comparing it return false because both object are not same and also not equal.
// If we Apply/add hashCode and equals Method in the class Planet then it return true

// We Apply many Methods in the class Planet like hashCode() and equals() method to compare the two object of the class Planet instead of 
// We have Another Single Line Method To ByPass the All code line from 11 to 65.

import java.util.Objects;

// class Planet {
//     private final int id;
//     private final String name;

//     public Planet(int id, String name) {        // it is a Parameterized Constructor
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }
    

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Planet other = (Planet) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

//     @Override
//     public String toString() {
//         return "Planet{" +
//         "id=" + id +
//         ", name='" + name + '\'' +
//         '}';
//     }

// }


// Here is the record Method to byPass the Above code

record Planet (int id , String name)
{

}

public class Record_class {
    public static void main(String[] args) {
        
        Planet planet = new Planet(1, "Earth");
        Planet planet1 = new Planet(1, "Earth");

        System.out.println(planet.equals(planet1));
        //System.out.println(planet.getId());    // It will not work in record class intead of getid direct name()
        System.out.println(planet.name());

        System.out.println(planet);
    }
}
