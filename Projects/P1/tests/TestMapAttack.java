import java.awt.Color;
import junit.framework.*;
import java.io.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		
		// Can't attack
		PacMan pacman = frame.addPacMan(new Location(0, 0));
		Ghost ghost = frame.addGhost(new Location (5, 5), "clyde", Color.orange);
		assertFalse(frame.getMap().attack("clyde"));
		
		// Can attack
		frame.getMap().add("blinky", new Location(1, 1),
		new GhostComponent(1, 1, 20), Map.Type.GHOST);
		assertTrue(frame.getMap().attack("blinky"));
	}
}
