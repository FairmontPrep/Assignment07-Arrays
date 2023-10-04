import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class findHorseSpaceTest {

    private HorseBarn createStable() {
        Horse[] stable = new Horse[7];
        stable[0] = new Horse("Trigger", 1340);
        stable[2] = new Horse("Silver", 1210);
        stable[3] = new Horse("Lady", 1575);
        stable[5] = new Horse("Patches", 1350);
        stable[6] = new Horse("Duke", 1410);
        HorseBarn glu = new HorseBarn(stable);
        
        return glu;
    }

    @DisplayName("findHorseSpace Test 1")
    @Test
    void findHorseSpace_Test01() {
        HorseBarn factory = createStable();
        int result = factory.findHorseSpace("Trigger");
        int expected = 0;
        assertEquals(expected, result);
    }
    
    @DisplayName("findHorseSpace Test 2")
    @Test
    void findHorseSpace_Test02() {
        HorseBarn factory = createStable();
        int result = factory.findHorseSpace("Silver");
        int expected = 2;
        assertEquals(expected, result);
    }
    
    @DisplayName("findHorseSpace Test 3")
    @Test
    void findHorseSpace_Test03() {
        HorseBarn factory = createStable();
        int result = factory.findHorseSpace("Lady");
        int expected = 3;
        assertEquals(expected, result);
    }
    
    @DisplayName("findHorseSpace Test 4")
    @Test
    void findHorseSpace_Test04() {
        HorseBarn factory = createStable();
        int result = factory.findHorseSpace("Coco");
        int expected = -1;
        assertEquals(expected, result);
    }
    
    @DisplayName("findHorseSpace Test 5")
    @Test
    void findHorseSpace_Test05() {
        HorseBarn factory = createStable();
        int result = factory.findHorseSpace("Epona");
        int expected = -1;
        assertEquals(expected, result);
    }
    
    @DisplayName("findHorseSpace Test 6")
    @Test
    void findHorseSpace_Test06() {
        HorseBarn factory = createStable();
        int result = factory.findHorseSpace("Duke");
        int expected = 6;
        assertEquals(expected, result);
    }
    
    @DisplayName("findHorseSpace Test 7")
    @Test
    void findHorseSpace_Test07() {
        HorseBarn factory = createStable();
        int result = factory.findHorseSpace("patches");
        int expected = -1;
        assertEquals(expected, result);
    }
    
    @DisplayName("findHorseSpace Test 8")
    @Test
    void findHorseSpace_Test08() {
        HorseBarn factory = createStable();
        int result = factory.findHorseSpace("Patches");
        int expected = 5;
        assertEquals(expected, result);
    }
}
