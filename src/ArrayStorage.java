
public class ArrayStorage {
    Resume[] storage = new Resume[10000];
int size=size();
    public ArrayStorage() {
    }

    void clear() {
        for (int i = 0; i < this.storage.length - 1; ++i) {
            if (this.storage[i] != null) {
                this.storage[i] = null;
            }
        }
    }

    void save(Resume r) {
        for (int i = 0; i <= size()+1; ++i) {
            if (storage[i] == null) {
                storage[i] = r;
                break;
            }
            if (storage[i].uuid == r.uuid) {
                System.out.println("The same resume exist");
                break;
            }
        }
    }

    Resume get(String uuid) {
        int arrayin = 0;

        for (int i = 0; i < size(); ++i) {
            if (storage[i].uuid == uuid) {
                arrayin = arrayin + 1;
                return storage[i];
            }
        }
        if (arrayin == 0) {
            System.out.println("Not such resume in Array");
        }
        return null;
    }

    void delete(String uuid) {
        int j = size();

        for (int i = 0; i < j; ++i) {
            if (storage[i].uuid == uuid) {
                storage[i] = storage[j - 1];
                storage[j - 1] = null;
                break;

            }
        }
    }

    Resume[] getAll() {
        int s = size();
        Resume[] storageFilled = new Resume[s];

        for (int i = 0; i < s; ++i) {
            if (storage[i] != null) {
                storageFilled[i] = storage[i];
            }
        }
        return storageFilled;
    }
        int size() {
        int size = 0;

        for (int i = 0; i < storage.length - 1 && storage[i] != null; ++i) {
            ++size;
        }
        return size;
    }
}

