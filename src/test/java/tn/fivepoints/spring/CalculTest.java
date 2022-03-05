package tn.fivepoints.spring;
import static org.junit.Assert.*;
import org.apache.log4j.Logger;
import org.junit.Test;
import tn.fivepoints.spring.entities.Calcul;
import tn.fivepoints.spring.services.EntrepriseServiceImpl;
public class CalculTest {
	public static final Logger logger = Logger.getLogger(EntrepriseServiceImpl.class);
	Calcul calcul = new Calcul();
	@Test
	public void testCalculerSom() {
		try {
			logger.debug(calcul.calculerSom(10, 15));
			} catch (Exception err) {
				logger.warn(calcul.calculerSom(10, 15));
				}
		assertEquals(25, calcul.calculerSom(10, 15));
		}
	@Test
	public void testCalculerDiff() {
		assertEquals(30, calcul.calculerDiff(40, 10));
		}
	}