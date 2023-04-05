package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    SinglyLinkedList<String> list;

    @Before
    public void before(){
        list = new SinglyLinkedList<String>();
    }
    @Test
    public void testAdd() {
        String expected = "test";

        list.add("test");

        Assert.assertTrue(list.contains(expected));
    }

    @Test
    public void testRemove() {
        String expected = "test";

        list.add("test");
        list.remove("test");

        Assert.assertFalse(list.contains(expected));

    }
    @Test
    public void testContains(){
        String expected = "test";

        list.add("test");

        Assert.assertTrue(list.contains(expected));
        
    }

    @Test
    public void testFind() {
        Integer expected = 1;
        String val = "target";
        
        list.add("");
        list.add(val);
        
        Integer actual = list.find(val);
        
        Assert.assertEquals(expected, actual);
        
    }
    
    @Test
    public void testFind2(){
        Integer expected = -1;
        String val = "target";

        list.add("");
        list.add("");

        Integer actual = list.find(val);
        
        Assert.assertEquals(expected, actual);
        
    }

    @Test
    public void testSize() {
        int expected = 3;
        list.add("");
        list.add("");
        list.add("");
        
        int actual = list.size();
        
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet() {
       
        String expected = "target";

        list.add("");
        list.add(expected);

        Integer actual = list.get(1);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testCopy() {
        list.add("lux");
        list.add("blitz");
        list.add("morgana");
        
        SinglyLinkedList <String> newList = list.copy();
        
        Assert.assertNotEquals(list.toString(),newList.toString());
        
        for(int i = 0; i < list.size(); i++){
            Assert.assertEquals(list.get(i).getData(), newList.get(i).getData());
        }
    }

    @Test
    public void testSort() {
        list.add("lux");
        list.add("blitz");
        list.add("morgana");
        
        list.sort();
        
        Assert.assertEquals(list.get(0).getData(), "blitz");
        Assert.assertEquals(list.get(1).getData(), "lux");
        Assert.assertEquals(list.get(2).getData(), "morgana");
        
    }
}
