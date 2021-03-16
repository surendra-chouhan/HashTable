package com.hashtables;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public class HashTableTest {

    @Test
    public void find_frequency_of_given_words() {
        String sentence = "To be or not to be";
        HashTable<String,Integer> hashTable = new HashTable<>();

        String[] words = sentence.toLowerCase().split(" ");

        for(String word : words){
            Integer value = hashTable.get(word);
            if(value == null) {
                value = 1;
            }
            else {
                value = value + 1;
            }
            hashTable.add(word,value);
        }
        int frequency = hashTable.get("be");
        System.out.println(hashTable);
        Assert.assertEquals(2, frequency);
    }
}
