import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dvd.Dvd;
import com.dvd.controller.DvdLibraryController;
import com.dvd.view.DvdLibraryView;
import com.dvdlibrary.DvdLibrary;

public class DvdDemo {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		/* Uncomment the following and test our the project. */
		
		//DvdLibraryView dvdView = context.getBean("dvdLibraryView", DvdLibraryView.class);
		//DvdLibraryController controller = context.getBean("dvdLibraryController", DvdLibraryController.class);
		//controller.addDvd("Smooth Criminal", "November 14, 1988", 5, "Michael Jackson", "Westlake (studio D), Los Angeles", "King of Pop");
		//controller.addDvd("Bohemian Rhapsody", "October 31, 1975", 5, "Queen", "EMI", "King of Rock");
		
		/* Uncomment to auto save the Dvd Library when starting the program. */
		
		context.close();
	}

}
