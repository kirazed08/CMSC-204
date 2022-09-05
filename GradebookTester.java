
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GradebookTester {
	GradeBook g1, g2;

	@BeforeEach
	void setUp()  {
		 g1 = new GradeBook(5);
		g1.addScore(50);
		g1.addScore(75);
		 g2 = new GradeBook(5);
		g2.addScore(25);
		g2.addScore(70);
	}

	@AfterEach
	void tearDown()  {
		g1 = null;
		g2 = null;
	}

	
	@Test
public void addScore() {
	assertTrue(g1.toString().equals("50.0 75.0 "));
	assertTrue(g2.toString().equals("25.0 70.0 "));
	assertEquals(g1.getScoreSize(),2);
}
	@Test
	public void testSum() {
		assertEquals(125, g1.sum(), .0001);
	}
	@Test
	public void testMinimum() {
			assertEquals(50, g1.minimum(), .001);

		}
	@Test
	public void TestFinalScore() {
		assertTrue(g1.finalScore() == 75.0);
		assertTrue(g2.finalScore() == 70.0);
	}
}
