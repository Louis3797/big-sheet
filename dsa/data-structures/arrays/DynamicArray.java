import java.util.Arrays;

/**
 * This class implements a dynamic array with a static Array
 *
 * @param <E> is the type of the array
 */
public class DynamicArray<E> {

    // default capacity of array
    private static final int DEFAULT_CAPACITY = 16;

    private int capacity; // size of the array
    private int size; // number of elements that are currently stored, important: that is the actual
                      // length!
    private Object[] elements; // our array

    /**
     * constructor
     *
     * @param capacity the starting length of the array
     */
    public DynamicArray(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
        this.capacity = capacity;
        this.size = 0;
        this.elements = new Object[this.capacity];
    }

    /**
     * No-args constructor
     */
    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * @return true if array contains no elements (size == 0)
     */
    public boolean isEmpty() {
        return this.size <= 0;
    }

    /**
     * @param element to search for in array
     * @return true if array contains specified element
     */
    public boolean contains(E element) {
        for (int i = 0; i < this.size; i++) {
            if (element == this.elements[i]) {
                return true;
            }
        }
        return false;
    }

    /**
     * method returns element at the specified index
     *
     * @param index in array
     * @return element at the specified index
     */
    public E get(int index) {
        return (E) this.elements[index];
    }

    /**
     * replaces the element at the specified position
     *
     * @param index   in array
     * @param element element to put in array
     */
    public void set(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.elements[index] = element;
    }

    /**
     * adds element at the end of the array, if full call resize and double the
     * capacity
     *
     * @param element to be inserted
     */
    public void add(E element) {
        if (this.size == this.elements.length) {
            resize(2 * this.capacity);
        }
        this.elements[this.size] = element;
        size++;
    }

    /**
     * removes all elements that are the same as specified element if size is 1/4 of
     * capacity, resize array to half
     *
     * @param element to be removed
     */
    public void remove(E element) {
        // check if array is not empty
        if (size > 0 && contains(element)) {
            for (int i = 0; i < this.size; i++) {
                if (element == this.elements[i]) {
                    removeAt(i);
                }
            }
            if (size * 4 <= this.capacity) {
                resize(capacity / 2);
            }
        }
    }

    /**
     * removes all elements that are the same as specified element if size is 1/4 of
     * capacity, resize array to half
     *
     * @param index of the element to be deleted
     */
    public void removeAt(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        // check if array is not empty
        if (size > 0) {
            for (int i = index; i < this.size - 1; i++) {

                // shift all element of right
                // side from given index in left
                this.elements[i] = this.elements[i + 1];
            }
            this.elements[this.size - 1] = null;
            size--;

            if (size * 4 <= this.capacity) {
                resize(capacity / 2);
            }
        }
    }

    /**
     * method deletes last element of array if size is 1/4 of capacity, resize array
     * to half
     */
    public void pop() {
        // check if array is not empty
        if (size > 0) {
            this.elements[this.size] = null;
            this.size--;

            if (size * 4 <= this.capacity) {
                resize(capacity / 2);
            }
        }
    }

    /**
     * Rezises capacity and copies every element in new array with new capacity
     *
     * @param new_capacity is the new capacity of the new array
     */
    private void resize(int new_capacity) {

        Object[] temp = new Object[new_capacity];

        for (int i = 0; i < this.size; i++) {
            // copy all array value into temp
            temp[i] = this.elements[i];
        }

        setElements(temp);

        setCapacity(new_capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    public Object[] getElements() {
        return elements;
    }

    private void setElements(Object[] elements) {
        this.elements = elements;
    }
}
