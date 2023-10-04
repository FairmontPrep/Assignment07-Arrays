import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class isMountainTest {
    
    @DisplayName("isMountain Test 1")
    @Test
    void isMountain_Test01() {
        int[] mtn = {1, 2, 3, 2, 1};
        boolean result = Mountain.isMountain(mtn);
        boolean expected = true;
        assertEquals(expected, result);
    }
    
    @DisplayName("isMountain Test 2")
    @Test
    void isMountain_Test02() {
        int[] mtn = {1, 2, 1, 2, 1};
        boolean result = Mountain.isMountain(mtn);
        boolean expected = false;
        assertEquals(expected, result);
    }
    
    @DisplayName("isMountain Test 3")
    @Test
    void isMountain_Test03() {
        int[] mtn = {1, 2, 3, 1, 5};
        boolean result = Mountain.isMountain(mtn);
        boolean expected = false;
        assertEquals(expected, result);
    }
    
    @DisplayName("isMountain Test 4")
    @Test
    void isMountain_Test04() {
        int[] mtn = {1, 4, 2, 1, 0};
        boolean result = Mountain.isMountain(mtn);
        boolean expected = true;
        assertEquals(expected, result);
    }
    
    @DisplayName("isMountain Test 5")
    @Test
    void isMountain_Test05() {
        int[] mtn = {9, 3, 5, 7, 5};
        boolean result = Mountain.isMountain(mtn);
        boolean expected = false;
        assertEquals(expected, result);
    }
    
    @DisplayName("isMountain Test 6")
    @Test
    void isMountain_Test06() {
        int[] mtn = {3, 2, 1};
        boolean result = Mountain.isMountain(mtn);
        boolean expected = false;
        assertEquals(expected, result);
    }
    
    @DisplayName("isMountain Test 7")
    @Test
    void isMountain_Test07() {
        int[] mtn = {3, 4, 3, 5, 6, 5};
        boolean result = Mountain.isMountain(mtn);
        boolean expected = false;
        assertEquals(expected, result);
    }
    
    @DisplayName("isMountain Test 8")
    @Test
    void isMountain_Test08() {
        int[] mtn = {1, 3, 4, 8, 7, 5, 2};
        boolean result = Mountain.isMountain(mtn);
        boolean expected = true;
        assertEquals(expected, result);
    }
}
