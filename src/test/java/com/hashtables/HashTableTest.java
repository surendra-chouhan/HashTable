package com.hashtables;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashTableTest {
    HashTable<String,Integer> hashTable;

    @Before
    public void set() {
        hashTable = new HashTable<>();
    }

    @Test
    public void find_frequency_of_given_words_in_a_sentence() {
        String sentence = "To be or not to be";

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

        System.out.println(hashTable);
        Assert.assertEquals(2, (int)hashTable.get("be"));
    }

    @Test
    public void find_frequency_of_given_words_in_a_paragraph() {
        String paragraph = "Paranoids are not"+
                "paranoid because they are paranoid but"+
                "because they keep putting themselves"+
                "deliberately into paranoid avoidable"+
                "situations";

        String[] words = paragraph.toLowerCase().split(" ");

        for (String word : words) {
            Integer value = hashTable.get(word);
            if(value == null)
                value = 1;
            else
                value = value + 1;

            hashTable.add(word,value);
        }

        System.out.println(hashTable);
        Assert.assertEquals( 2, (int)hashTable.get("are"));
    }

    @Test
    public void delete_word_from_a_given_paragraph() {
        String paragraph = "Paranoids are not"+
                "paranoid because they are paranoid but"+
                "because they keep putting themselves"+
                "deliberately into paranoid avoidable"+
                "situations";

        String[] words = paragraph.toLowerCase().split(" ");

        for (String word : words) {
            Integer value = hashTable.get(word);
            if (value == null)
                value = 1;
            else
                value = value + 1;
        }
        hashTable.deleteGivenNode("avoidable");
        System.out.println(hashTable);
        Assert.assertEquals(null, hashTable.get("avoidable"));
    }
}
