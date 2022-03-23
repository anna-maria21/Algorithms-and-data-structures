public class MyHashTable {
    public Element[] table;
    public int size;
    public int count;

    public MyHashTable(int size) {
        this.size = size;
        table = new Element[size];
    }

    public int getHashCode(int key) {
        double d = (Math.sqrt(5)-1)/2;
        int myHashCode = (int) (size * ((key * d) - (int)(key * d)));
        return Math.abs(myHashCode);
    }

    public void resize() {
        size = size * 2;
        MyHashTable temp = new MyHashTable(size);
        temp.size = size;
        for (int i=0; i<size/2; i++) {
            if (table[i] != null)
            temp.insert(table[i].getKey(), table[i].getValue());
        }
        this.table = temp.table;
    }

    public void insert(int key, String value) {
        if (search(key) != -1) {
            System.out.println("Ключ має бути унікальним! Введений ключ " + key + " повторюється!");
            return;
        }
        Element element = new Element(key, value);
        int hash = getHashCode(key);
        while (table[hash] != null) {
            hash++;
            hash = hash % size;
        }
        table[hash] = element;
        count++;
        double k = (float)count/size;
        if (k > 0.667) {
            resize();
        }
    }

    public void showHashTable() {
        for (int i=0; i<size; i++) {
            if (table[i] != null) {
                System.out.printf("%-7d%-7d%-7d%-10s\n", i, getHashCode(table[i].getKey()), table[i].getKey(), table[i].getValue());
            }
        }
    }

    public int search(int key) {
        int hash = getHashCode(key);
        while (table[hash] != null) {
            if (table[hash].getKey() == (key)) {
                return hash;
            }
            hash++;
            hash = hash % size;
        }
        return -1;
    }
}
