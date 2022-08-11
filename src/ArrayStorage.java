import java.util.Arrays;

public class ArrayStorage {
    Resume[] storage = new Resume[10000];
    int size;

    void clear() {
        for (int i = 0; i < size; ++i) {
            storage[i] = null;
        }
    }

    void save(Resume r) {
        for (int i = 0; i <= size; ++i) {
            if (r.uuid == null) {
                System.out.println("You didn't enter anything");
                break;
            }
            storage[size] = r;
            size++;
            break;
        }
    }

    Resume get(String uuid) {
        for (int i = 0; i < size; ++i) {
            if (storage[i].uuid == uuid) {
                return storage[i];
            }
        }
        System.out.println("No such Resume in Array");
        return null;
    }

    void delete(String uuid) {
        for (int i = 0; i < size; ++i) {
            if (storage[i].uuid == uuid) {
                storage[i] = storage[size - 1];
                storage[size - 1] = null;
                break;
            }
        }
    }

    Resume[] getAll() {
        return Arrays.copyOf(storage, size);
    }

    int size() {
        return size;
    }
}

