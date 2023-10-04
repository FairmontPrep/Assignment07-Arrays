import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class consolidateTest {
    public static void main(String[] args) {
        HorseBarn temp = createStable();
        temp.consolidate();
        for (int i = 0; i < temp.getSpaces().length; i++)
            if (temp.getSpaces()[i] != null)
                System.out.println(temp.getSpaces()[i].getName());
            else
                System.out.println("null");
    }

    private static HorseBarn createStable() {
        Horse[] stable = new Horse[7];
        stable[0] = new Horse("Trigger", 1340);
        stable[2] = new Horse("Silver", 1210);
        stable[3] = new Horse("Lady", 1575);
        stable[5] = new Horse("Patches", 1350);
        stable[6] = new Horse("Duke", 1410);
        HorseBarn glu = new HorseBarn(stable);
        
        return glu;
    }

    private static HorseBarn createStable2() {
        Horse[] stable = new Horse[7];
        stable[0] = new Horse("Trigger", 1340);
        stable[1] = new Horse("Spirit", 1020);
        stable[2] = new Horse("Silver", 1210);
        stable[3] = new Horse("Lady", 1575);
        stable[4] = new Horse("Epona", 1155);
        stable[5] = new Horse("Patches", 1350);
        stable[6] = new Horse("Duke", 1410);
        HorseBarn glu = new HorseBarn(stable);
        
        return glu;
    }

    @DisplayName("consolidate Test 1")
    @Test
    void consolidate_Test01() {
        HorseBarn factory = createStable();
        factory.consolidate();
        Horse[] result = factory.getSpaces();
        Horse[] expected = new Horse[7];
        expected[0] = new Horse("Trigger", 1340);
        expected[1] = new Horse("Silver", 1210);
        expected[2] = new Horse("Lady", 1575);
        expected[3] = new Horse("Patches", 1350);
        expected[4] = new Horse("Duke", 1410);

        boolean worked = true;
        int iter = 0;
        while(worked && iter < expected.length && expected[iter] != null) {
            if (result[iter] == null)
                worked = false;
            else if (expected[iter].getName() != result[iter].getName())
                worked = false;
            iter++;
        }
        assertEquals(true, worked);
    }

    @DisplayName("consolidate Test 2")
    @Test
    void consolidate_Test02() {
        HorseBarn factory = createStable();
        factory.getSpaces()[0] = null;
        factory.consolidate();
        Horse[] result = factory.getSpaces();
        Horse[] expected = new Horse[7];
        expected[0] = new Horse("Silver", 1210);
        expected[1] = new Horse("Lady", 1575);
        expected[2] = new Horse("Patches", 1350);
        expected[3] = new Horse("Duke", 1410);

        boolean worked = true;
        int iter = 0;
        while(worked && iter < expected.length && expected[iter] != null) {
            if (result[iter] == null)
                worked = false;
            else if (expected[iter].getName() != result[iter].getName())
                worked = false;
            iter++;
        }
        assertEquals(true, worked);
    }

    @DisplayName("consolidate Test 3")
    @Test
    void consolidate_Test03() {
        HorseBarn factory = createStable();
        factory.getSpaces()[5] = null;
        factory.consolidate();
        Horse[] result = factory.getSpaces();
        Horse[] expected = new Horse[7];
        expected[0] = new Horse("Trigger", 1340);
        expected[1] = new Horse("Silver", 1210);
        expected[2] = new Horse("Lady", 1575);
        expected[3] = new Horse("Duke", 1410);

        boolean worked = true;
        int iter = 0;
        while(worked && iter < expected.length && expected[iter] != null) {
            if (result[iter] == null)
                worked = false;
            else if (expected[iter].getName() != result[iter].getName())
                worked = false;
            iter++;
        }
        assertEquals(true, worked);
    }

    @DisplayName("consolidate Test 4")
    @Test
    void consolidate_Test04() {
        HorseBarn factory = createStable2();
        factory.consolidate();
        Horse[] result = factory.getSpaces();
        Horse[] expected = new Horse[7];
        expected[0] = new Horse("Trigger", 1340);
        expected[1] = new Horse("Spirit", 1020);
        expected[2] = new Horse("Silver", 1210);
        expected[3] = new Horse("Lady", 1575);
        expected[4] = new Horse("Epona", 1155);
        expected[5] = new Horse("Patches", 1350);
        expected[6] = new Horse("Duke", 1410);

        boolean worked = true;
        int iter = 0;
        while(worked && iter < expected.length && expected[iter] != null) {
            if (result[iter] == null)
                worked = false;
            else if (expected[iter].getName() != result[iter].getName())
                worked = false;
            iter++;
        }
        assertEquals(true, worked);
    }

    @DisplayName("consolidate Test 5")
    @Test
    void consolidate_Test05() {
        HorseBarn factory = createStable2();
        factory.getSpaces()[2] = null;
        factory.consolidate();
        Horse[] result = factory.getSpaces();
        Horse[] expected = new Horse[7];
        expected[0] = new Horse("Trigger", 1340);
        expected[1] = new Horse("Spirit", 1020);
        expected[2] = new Horse("Lady", 1575);
        expected[3] = new Horse("Epona", 1155);
        expected[4] = new Horse("Patches", 1350);
        expected[5] = new Horse("Duke", 1410);

        boolean worked = true;
        int iter = 0;
        while(worked && iter < expected.length && expected[iter] != null) {
            if (result[iter] == null)
                worked = false;
            else if (expected[iter].getName() != result[iter].getName())
                worked = false;
            iter++;
        }
        assertEquals(true, worked);
    }

    @DisplayName("consolidate Test 6")
    @Test
    void consolidate_Test06() {
        HorseBarn factory = createStable2();
        factory.getSpaces()[1] = null;
        factory.getSpaces()[4] = null;
        factory.getSpaces()[6] = null;
        factory.consolidate();
        Horse[] result = factory.getSpaces();
        Horse[] expected = new Horse[7];
        expected[0] = new Horse("Trigger", 1340);
        expected[1] = new Horse("Silver", 1210);
        expected[2] = new Horse("Lady", 1575);
        expected[3] = new Horse("Patches", 1350);

        boolean worked = true;
        int iter = 0;
        while(worked && iter < expected.length && expected[iter] != null) {
            if (result[iter] == null)
                worked = false;
            else if (expected[iter].getName() != result[iter].getName())
                worked = false;
            iter++;
        }
        assertEquals(true, worked);
    }

    
    
    
}
