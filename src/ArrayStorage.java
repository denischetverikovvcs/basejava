import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size;

    void clear() {
        for (int i = 0; i <= size; ++i) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (int i = 0; i <= size; ++i) {
            if (r.uuid == null) {
                System.out.println("You didn't enter anything");
                break;
            }
            if (storage[i] == null) {
                storage[i] = r;
            }
        }
    }

    Resume get(String uuid) {
        int indexForGet = -1;

        for (int i = 0; i <= size; ++i) {
            indexForGet = indexForGet + 1;
            if (storage[i].uuid == uuid) {
                return storage[indexForGet];
            }
            if (indexForGet == size - 1) {
                System.out.println("No such Resume in Array");
                break;
            }
        }
        return null;
    }

    void delete(String uuid) {
        int j = size;

        for (int i = 0; i < j; ++i) {
            if (storage[i].uuid == uuid) {
                storage[i] = storage[j - 1];
                storage[j - 1] = null;
                break;
            }
        }
    }

    Resume[] getAll() {

        return Arrays.copyOf(storage, size);
    }

    int size() {
        size = 0;

        for (int i = 0; i <= size && storage[i] != null; ++i) {
            ++size;
        }
        return size;
    }
}

