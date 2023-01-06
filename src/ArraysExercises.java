public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person arrayPerson[] = new Person[3];
        arrayPerson[0] = new Person ("Jimothy");
        arrayPerson[1] = new Person ("Rimothy");
        arrayPerson[2] = new Person ("Dimothy");

        for(Person person: arrayPerson){
            System.out.println(person.name);
        }
    }
}