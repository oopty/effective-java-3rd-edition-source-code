package chapter3.item13;

public class HashTable implements Cloneable {
    private Entry[] buckets;

    public Entry[] getBuckets() {
        return buckets;
    }

    public void setBuckets(Entry[] buckets) {
        this.buckets = buckets;
    }

    @Override
    protected HashTable clone() {
        try{
            HashTable table = (HashTable) super.clone();
            table.buckets = buckets.clone();

            for(int i = 0; i < buckets.length; i++) {
                if(buckets[i] != null) {
                    table.buckets[i] = buckets[i].deepCopy();
                }
            }
            return table;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Entry {
        private String data;
        private Entry next;

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Entry getNext() {
            return next;
        }

        public void setNext(Entry next) {
            this.next = next;
        }

        public Entry(String data, Entry next) {
            this.data = data;
            this.next = next;
        }

        public Entry deepCopy() {
//            return new Entry(data, next == null ? null : new Entry(next.data, next.next));
            Entry result = new Entry(data, next);
            for(Entry p = result; p.next != null; p = p.next) {
                result.next = new Entry(p.data, p.next);
            }
            return result;
        }
    }
}
