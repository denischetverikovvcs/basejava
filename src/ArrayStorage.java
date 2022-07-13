

public class ArrayStorage {
    Resume[] storage = new Resume[10000];

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

        for (int i = 0; i < this.storage.length - 1; ++i) {
            if (this.storage[i] != null && this.storage[i].uuid == r.uuid) {
                System.out.println("Takoje resume uzhe est");
                break;
            }
            if (this.storage[i] == null) {


                storage[i] = r;
                break;
            }


        }

    }


    Resume get(String uuid) {
        int arrayin = 0;

        for (int i = 0; i < this.storage.length - 1; ++i) {
            if (this.storage[i] != null && this.storage[i].uuid == uuid) {
                arrayin = arrayin + 1;
                return this.storage[i];
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
//                Arrays.stream(this.storage).sorted();
//                int c= 0;
//                j=j+1;
//
//                Resume tmp;
//                while (j > c) {
//                    tmp = storage[j];
//                    storage[j] = storage[c];
//                    storage[c] = tmp;
//                    j--;
//                    c++;
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

