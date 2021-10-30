public class DynamicArray {

    // create three variable array[] is our array,
    // count deals with the number of elements you have added and
    // size is the size of the array
    private int[] array;
    private int count;
    private int size;

    // constructor initalize value to variable
    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    /**
     * method adds elements at the end of array
     * 
     * @param data is the elements we will add
     */
    public void add(int data) {

        // check if the number of elements is equal to the size of the array
        if (count == size) {
            growSize(); // make array size double
        }
        // insert element at end of array
        array[count] = data;
        count++;
    }

    // function makes size double of array
    public void growSize() {

        int temp[] = null; // new array

        if (count == size) {

            // temp is a double size array of array
            // and store array elements
            temp = new int[size * 2];
            {
                for (int i = 0; i < size; i++) {
                    // copy all array value into temp
                    temp[i] = array[i];
                }
            }
        }

        // double size array temp initialize
        // into variable array again
        array = temp;

        // and make size is double also of array
        size = size * 2;
    }

    // method shrinks size of array
    // which block unnecessary remove them
    public void shrinkSize() {
        int temp[] = null;
        if (count > 0) {

            // temp is a count size array
            // and store array elements
            temp = new int[count];
            for (int i = 0; i < count; i++) {

                // copy all array value into temp
                temp[i] = array[i];
            }

            size = count;

            // count size array temp initialize
            // into variable array again
            array = temp;
        }
    }

    /**
     * method adds an element at given index
     * 
     * @param index shows us where we need to add the element
     * @param data  element we will add
     */
    public void addAt(int index, int data) {
        // if size is not enough make size double
        if (count == size) {
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {

            // shift all element right
            // from given index
            array[i + 1] = array[i];
        }

        // insert data at given index
        array[index] = data;
        count++;
    }

    /**
     * methos removes last element and put zero at last index
     */
    public void remove() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    /**
     * method shifts all element of right side from given index in left
     * 
     * @param index
     */
    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {

                // shift all element of right
                // side from given index in left
                array[i] = array[i + 1];
            }
            array[count - 1] = 0;
            count--;
        }
    }

}