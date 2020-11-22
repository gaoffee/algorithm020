package org.geekbang.algorithm020.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    public void should_remove_duplicates() {
        assertEquals(new RemoveDuplicates().remove(new int[]{1, 1, 2}), 2);
        assertEquals(new RemoveDuplicates().remove(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}), 5);
    }
}