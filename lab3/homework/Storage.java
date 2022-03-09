package lab3.homework;

import java.util.ArrayList;
import java.util.List;

/**
 * Interface with abstract methods which must be implemented
 */
public interface Storage {
    public abstract int getStorage();
    public abstract void setStorage(int capacity);

    /**
     * this method gets a capacity and returns a list of different values based on provided value
     * @param capacity the capacity given
     * @return a list of capacities in different formats
     */
    default List<Integer> getStorageCapacity(int capacity){
        List<Integer> storageValues = new ArrayList<>();
        storageValues.add(capacity*1000);
        storageValues.add(capacity*1000000);
        storageValues.add(capacity*1000000000);

        return storageValues;
    }
}
