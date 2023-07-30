package chapter3.item13;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @Test
    void deepCoppy() {
        HashTable hashTable = new HashTable();
        HashTable.Entry bucket3 = new HashTable.Entry("3", null);
        HashTable.Entry bucket2 = new HashTable.Entry("2", bucket3);
        HashTable.Entry bucket1 = new HashTable.Entry("1", bucket2);

        HashTable.Entry[] buckets = new HashTable.Entry[1];
        buckets[0] = bucket1;

        hashTable.setBuckets(buckets);


        HashTable cloned = hashTable.clone();
        Assertions.assertThat(cloned.getBuckets().length).isEqualTo(1);
        Assertions.assertThat(cloned.getBuckets()[0].getNext().getData()).isEqualTo("2");

        bucket2.setData("4");

        Assertions.assertThat(hashTable.getBuckets()[0].getNext().getData()).isEqualTo("4");
        Assertions.assertThat(cloned.getBuckets()[0].getNext().getData()).isEqualTo("2");
    }
}