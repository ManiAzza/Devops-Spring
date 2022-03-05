package tn.fivepoints.spring.entities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import tn.fivepoints.spring.services.EmployeServiceImpl;
public class Calcul
{
	private static final Logger l = LogManager.getLogger(EmployeServiceImpl.class);
	public int calculerSom(int a, int b) 
	{
		int res = 0;
		try
		{
			l.info("In calculerSom(" + a + ", " + b + ")");
			res = a + b;
			l.info("Out calculerSom() : " + res);
			} 
		catch (Exception e) {
			l.error("Erreur : " + e);
		}
		return res;
		}
	public int calculerDiff(int a, int b) {
		int res = 0;
		try
		{
			l.info("In calculerDiff(" + a + ", " + b + ")");
			res = a - b;l.info("Out calculerDiff() : " + res);
			} catch (Exception e) {
				l.error("Erreur : " + e);
			}return res;
			}
	}
