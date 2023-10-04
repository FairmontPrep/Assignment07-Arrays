import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class getPeakIndexTest {
    @DisplayName("getPeakIndex Test 1")
    @Test
    void getPeakIndex_Test01() {
        int[] mtn = {11, 22, 33, 22, 11};
        int result = Mountain.getPeakIndex(mtn);
        int expected = 2;
        assertEquals(expected, result);
    }
    
    @DisplayName("getPeakIndex Test 2")
    @Test
    void getPeakIndex_Test02() {
        int[] mtn = {11, 22, 11, 22, 11};
        int result = Mountain.getPeakIndex(mtn);
        int expected = 1;
        assertEquals(expected, result);
    }
    
    @DisplayName("getPeakIndex Test 3")
    @Test
    void getPeakIndex_Test03() {
        int[] mtn = {1, 2, 3, 5, 7};
        int result = Mountain.getPeakIndex(mtn);
        int expected = -1;
        assertEquals(expected, result);
    }
    
    @DisplayName("getPeakIndex Test 4")
    @Test
    void getPeakIndex_Test04() {
        int[] mtn = {9, 3, 5, 7, 12};
        int result = Mountain.getPeakIndex(mtn);
        int expected = -1;
        assertEquals(expected, result);
    }
    
    @DisplayName("getPeakIndex Test 5")
    @Test
    void getPeakIndex_Test05() {
        int[] mtn = {9, 3, 5, 7, 5};
        int result = Mountain.getPeakIndex(mtn);
        int expected = 3;
        assertEquals(expected, result);
    }
    
    @DisplayName("getPeakIndex Test 6")
    @Test
    void getPeakIndex_Test06() {
        int[] mtn = {3, 2, 1};
        int result = Mountain.getPeakIndex(mtn);
        int expected = -1;
        assertEquals(expected, result);
    }
    
    @DisplayName("getPeakIndex Test 7")
    @Test
    void getPeakIndex_Test07() {
        int[] mtn = {3, 4, 3, 5, 6, 5};
        int result = Mountain.getPeakIndex(mtn);
        int expected = 1;
        assertEquals(expected, result);
    }
    
    @DisplayName("getPeakIndex Test 8")
    @Test
    void getPeakIndex_Test08() {
        int[] mtn = {1, 3, 4, 6, 7, 9, 2};
        int result = Mountain.getPeakIndex(mtn);
        int expected = 5;
        assertEquals(expected, result);
    }

    @DisplayName("getPeakIndex Test 9")
    @Test
    void getPeakIndex_Test09() {
        int[] mtn = {1, 3, 4, 8, 8, 7, 2};
        int result = Mountain.getPeakIndex(mtn);
        int expected = -1;
        assertEquals(expected, result);
    }
}
