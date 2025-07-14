class MyHashMap {
    private static class Pair {
        int key, value;
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int SIZE = 10000;
    private List<Pair>[] buckets;

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }
        for (Pair pair : buckets[index]) {
            if (pair.key == key) {
                pair.value = value;
                return;
            }
        }
        buckets[index].add(new Pair(key, value));
    }

    public int get(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            for (Pair pair : buckets[index]) {
                if (pair.key == key) {
                    return pair.value;
                }
            }
        }
        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] != null) {
            Iterator<Pair> it = buckets[index].iterator();
            while (it.hasNext()) {
                if (it.next().key == key) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
