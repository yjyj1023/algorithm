package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;


class Stack02Test {

    @BeforeEach
    void setUp() {
        System.out.println("before each 실행");
    }

    @Test
    @DisplayName("push가 잘 되는지?")
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());

    }

    @Test
    @DisplayName("push가 잘 되는지 pop이 잘 되는지")
    void pushAndPop() {
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);

        Assertions.assertEquals(20, stack02.pop());
        Assertions.assertEquals(10, stack02.pop());

        stack02.push(30);
        Assertions.assertEquals(30, stack02.pop());

        //스택이 비어있을때
        //예외 검증
        assertThrows(EmptyStackException.class, ()->{
            stack02.pop();
        });

    }

    @Test
    @DisplayName("스택이 비어있는지 확인")
    void isEmpty() {
        Stack02 stack02 = new Stack02();
        assertTrue(stack02.isEmpty());
        stack02.push(10);
        assertFalse(stack02.isEmpty());
        stack02.pop();
        assertTrue(stack02.isEmpty());
    }

    @Test
    void peek() {
        Stack02 stack02 = new Stack02();
        assertThrows(EmptyStackException.class, ()->{
            stack02.peek();
        });
        stack02.push(10);
        int peeked = stack02.peek();
        assertEquals(10, peeked);
    }

    @Test
    void realStack() {
        Stack<Integer> st =new Stack<>();
        assertThrows(EmptyStackException.class, ()->{
            st.pop();
        });

    }
}