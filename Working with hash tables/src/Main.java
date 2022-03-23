public class Main {
    public static void main(String[] args) {
        MyHashTable myHashTable = new MyHashTable(11);
        myHashTable.insert(1, "value1");
        myHashTable.insert(2, "value2");
        myHashTable.insert(3, "value3");
        myHashTable.insert(4, "value4");
        myHashTable.insert(5, "value5");
        myHashTable.insert(6, "value6");
        myHashTable.insert(7, "value7");
        myHashTable.insert(8, "value8");
        myHashTable.insert(9, "value9");
        myHashTable.insert(10, "value10");
        myHashTable.insert(11, "value11");
        myHashTable.insert(12, "value12");
        myHashTable.insert(13, "value13");
        //myHashTable.insert(13, "value13");
        myHashTable.insert(14, "value14");
        myHashTable.insert(27, "value27");
        myHashTable.insert(32, "value32");
        myHashTable.insert(37, "value37");
        myHashTable.insert(42, "value42");
        myHashTable.insert(43, "value42");
        myHashTable.insert(44, "value42");
        myHashTable.insert(45, "value42");
        myHashTable.insert(46, "value42");
        System.out.println(myHashTable.count + " " + myHashTable.size);
        System.out.println("[i]    hash   key    value");
        myHashTable.showHashTable();
        System.out.println();
        int searchedKey = 27;
        if (myHashTable.search(searchedKey)==-1)
            System.out.println("Елемента з таким ключем немає в таблиці: " + myHashTable.search(searchedKey));
        else {
            System.out.println("Елемент з ключем " + searchedKey + " знаходиться в комірці №" + myHashTable.search(searchedKey));
        }
    }

}
