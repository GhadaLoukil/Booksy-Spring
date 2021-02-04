package tn.esprit.booksy;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.booksy.entities.*;
import tn.esprit.booksy.services.BookBuyService;
import tn.esprit.booksy.controller.*;
import com.sun.el.parser.ParseException;
@RunWith(SpringRunner.class)
@SpringBootTest
class BooksyApplicationTest {

	@Autowired
	BookBuyService us;
	@Test
	void contextLoads1() {
		us.retrieveAllBooks();
	}
	 @Test
	public void contextLoads() throws ParseException, java.text.ParseException {
	 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	 Date d = dateFormat.parse("2015-03-23"); 
	BookToBuy b = new BookToBuy(123,"amour","abir", "hahahah ",12.5,10,"dar maaref" , (java.util.Date) d,1);
	us.addBook(b); 
	
	 }


}
