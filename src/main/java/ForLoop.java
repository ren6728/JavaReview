public class ForLoop {
    public static void main(String[] args) {
        ForLoop object101 = new ForLoop();
        object101.addNewObject("String class",0);
       //object101.addNewObject("Build", 1);
        //object101.addNewObject("MainObject", 2);
    }

    public void addNewObject(String object, int indexNumber) {
        String[] listOfObjects = new String[6];

        //System.out.println("Add an object");
        //System.out.println("Size of the list of object before insertion: " + listOfObjects[indexNumber]);

        listOfObjects[indexNumber] = object;
        int i;
        for (i = 0; i < listOfObjects.length; i++) {
            String item = listOfObjects[i];
            System.out.println("Index " + i + " Object from the list is " + item);
           // System.out.println("Add an object");
            System.out.println("After insertion: " + object);
        }
        //System.out.println("Size of the list of object after insertion: " + listOfObjects[indexNumber]);
    }


    public void deleteObject(){
        System.out.println("Delete an object from the list");
    }

    public void updateObject () {
        System.out.println("Update an object from the list");
    }
}
