package home_work_14;

import org.junit.jupiter.api.*;
import org.junit.runners.Parameterized;

class ArrayFourTest {
    private ArrayFour arrays;

    @BeforeAll
    static void init(){}

    @AfterAll
    static void end(){}

    @BeforeEach
    void startApp(){arrays = new ArrayFour();}

    @AfterEach
    void shutdown(){}

    @Test
    void newArray1(){
        int[] a = {1, 2, 3};
        int[] b = {5, 6, 4, 7, 8, 4, 1, 2, 3};
        Assertions.assertArrayEquals(a, arrays.newArray(b));
    }

    @Test
    void newArray2(){
        int[] a = {2, 3};
        int[] b = {3, 4, 2, 3};
        Assertions.assertArrayEquals(a, arrays.newArray(b));
    }

    @Test
    void newArray3(){
        int[] a = {};
        int[] b = {3, 2, 3, 4};
        Assertions.assertArrayEquals(a, arrays.newArray(b));
    }

    @Test
    void newArray4(){
        int[] a = {3, 2, 3};
        int[] b = {4, 3, 2, 3};
        Assertions.assertArrayEquals(a, arrays.newArray(b));
    }

    @Test
    void chekArray1(){
        int[] arr = {1, 1, 4, 4};
        Assertions.assertTrue(arrays.chekArray(arr));
    }
    @Test
    void chekArray2(){
        int[] arr = {1, 1, 4, 3};
        Assertions.assertFalse(arrays.chekArray(arr));
    }

    @Test
    void chekArray3(){
        int[] arr = {4, 4, 4};
        Assertions.assertFalse(arrays.chekArray(arr));
    }

    @Test
    void chekArray4(){
        int[] arr = {1, 1, 1};
        Assertions.assertFalse(arrays.chekArray(arr));
    }
}