package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준단")
    @Test
    void given_List_WhenExecuting(){

        BubbleSort<Integer> bubbleSort = new BubbleSort<>();


        List<Integer> actual = bubbleSort.sort(List.of(3,1,2,5,4));

        assertEquals(List.of(1,2,3,4,5) , actual);

    }

}