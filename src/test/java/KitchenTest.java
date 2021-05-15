import org.junit.*;
import static org.junit.Assert.*;


public class KitchenTest {

    Kitchen emptyKitchen;
    Kitchen kitchenWithOne;
    Kitchen kitchenWithMany;

    @Before
    public void setUp(){
        emptyKitchen = new Kitchen();

        kitchenWithOne = new Kitchen();
        kitchenWithOne.add("Flower Tortilla");

        kitchenWithMany = new Kitchen();
        kitchenWithMany.add("corn tortilla");
        kitchenWithMany.add("white corn tortilla");
        kitchenWithMany.add("flower tortilla");

    }



    @Test
    public void testIsEmpty(){
//        boolean expected = true;
//        boolean actual = true;
//        assertTrue(expected, actual);
        assertTrue(emptyKitchen.isEmpty());

    }

    @Test
    public void testAdd(){
//        is it empty? checking before adding to see if kitchen is empty.
        assertTrue(emptyKitchen.isEmpty());

//        add tortilla.
        emptyKitchen.add("corn tortilla");
//        now check to see if kitchen is empty. should throw error because we .add() "corn tortilla" to emptyKitchen
//        assertTrue(emptyKitchen.isEmpty());

//        now make it pass. setting assert to "false because emptyKitchen now hold "corn tortilla".
        assertFalse(emptyKitchen.isEmpty());

//        now testing other instances " KitchenWithOne and KitchenWithMany".
        assertFalse(kitchenWithOne.isEmpty());
        assertFalse(kitchenWithMany.isEmpty());

    }

    @Test
    public void testPop(){
//        kitchen is empty.
        assertTrue(emptyKitchen.isEmpty());
//        added "white corn tortilla".
        emptyKitchen.add("white corn tortilla");
//        checked to see if kitchen was still empty. with assertTrue(emptyKitchen.isEmpty()); and failed.
//       now made it pass by setting asset to false.
        assertFalse(emptyKitchen.isEmpty());
//        using the ".pop()" to remove "white corn tortilla then checking to see if Kitchen is empty.
        emptyKitchen.pop();
        assertTrue(emptyKitchen.isEmpty());
    }


    @Test
    public void testContains(){

    }

}
