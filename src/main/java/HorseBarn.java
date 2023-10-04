/* INSTRUCTIONS
 * A horse barn consists of N numbered spaces. Each space can hold at most one 
 * horse. The spaces are indexed starting from 0; the index of the last space 
 * is N-1. No two horses in the barn have the same name.
 * For the 'findHorseSpace' method you will return the index of the space in 
 * which the horse with the specified name is located. If there is no horse 
 * with the specified name in the barn, the method returns -1.
 * 
 * EXAMPLE CODE:
 * Assume a HorseBarn Object called sweetHome has horses in the following spaces.
 * Index:       0        1         2          3        4          5          6
 * Objects: "Trigger"   null    "Silver"    "Lady"    null    "Patches"    "Duke"
 *           1340                1210        1575              1350         1410
 * 
 *      Method Call                         Value Returned
 * sweetHome.findHorseSpace("Trigger")          0
 * sweetHome.findHorseSpace("Silver")           2
 * sweetHome.findHorseSpace("Coco")            -1
 * 
 * For the 'consolidate' method you will consolidate the barn by moving all the 
 * horses so that the horses are in adjacent spaces, starting at index 0, with 
 * no empty spaces between any two horses. After the barn has been consolidated 
 * the horses will be in the same order as they were both.
 * 
 * EXAMPLE CODE:
 * Assume a HorseBarn Object called sweetHome has horses in the following spaces.
 * Index:       0        1         2          3        4          5          6
 * Objects: "Trigger"   null    "Silver"     null     null    "Patches"    "Duke"
 *           1340                1210                          1350         1410
 * 
 * The following table shows the arrangement of the horses after consolidate is called.
 * Index:       0          1            2          3       4        5        6
 * Objects: "Trigger"   "Silver"    "Patches"   "Duke"    null     null     null
 *           1340        1210        1350        1410
 */
public class HorseBarn {
    /* The space in the barn. Each array element holds a referene to the horse 
     * that is currently occupying the space. A null value indicates an empty space.
     */
    private Horse[] spaces;

    /* CONSTRUCTOR
     * Do not change this constructor. This constructor is for testing purposes
     */
    public HorseBarn(Horse[] stable) {
        spaces = stable;
    }

    /* getSpaces
     * Do not change this method. This method is for testing purposes
     */
    public Horse[] getSpaces() {
        return spaces;
    }

    /* COMPLETE THIS METHOD
     * Returns the index of the space that contains the horse with the 
     * specified name.
     * Precondition: No two horses in the barn have the same name.
     * @param name the name of the horse to find
     * @return the index of the space containing the horse with the specified 
     *          name; -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name) {
        // Insert your code below
        
        
        return 0;
    }

    /* COMPLETE THIS METHOD
     * Consolidates the barn by moving horses so that the horses are in adjacent 
     * spaces, starting at index 0, with no empty spaces between any two horses.
     * Postcondition: The order of the horses is the same as before the consolidation.
     */
    public void consolidate() {
        // Insert your code below

        
    }
}
