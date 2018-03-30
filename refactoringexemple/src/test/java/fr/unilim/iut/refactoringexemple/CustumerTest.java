package fr.unilim.iut.refactoringexemple;
import static org.junit.Assert.assertEquals;

public class CustumerTest {
	public void statementForOneRegularMovie(){
		Customer customer = new Customer("Alice");
        Movie movie = new Movie("The Lord of the Rings", Movie.REGULAR);
        Rental rental = new Rental(movie, 3); // 3 days rental
        customer.addRental(rental);
        
        String statement = customer.statement();
        
        String expected = "Rental Record for Alice\n" +
                "\tThe Lord of the Rings\t3.5\n" +
                "Amount owed is 3.5\n";
        assertEquals(expected, statement);
	}
}
