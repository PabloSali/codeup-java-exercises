public class ArraysExercises {
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        Person arrayPerson[] = new Person[3];
        arrayPerson[0] = new Person ("Jimothy");
        arrayPerson[1] = new Person ("Rimothy");
        arrayPerson[2] = new Person ("Dimothy");
//        for(Person person: arrayPerson){
//            System.out.println(person.name);
//        }

        Person newPerson = new Person ("Jebediah");

        addPerson(arrayPerson, newPerson);
    }
    static void addPerson(Person[] arrayPerson,Person personAdding){
        int startingArrayLeng = arrayPerson.length;
        Person[] newArray = new Person[startingArrayLeng + 1];
        int newArrayLeng = newArray.length;
        newArray[newArrayLeng - 1] = personAdding;

        for(int i = 0; i < newArrayLeng; i++){
            if(i < newArrayLeng -1) {
                newArray[i] = arrayPerson[i];
            }
            System.out.println(newArray[i].name);
        }
    }
}