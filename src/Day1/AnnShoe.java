package Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnShoe {

	public static void main(String[] args) {
		
		ApplicationContext appCtxt = new AnnotationConfigApplicationContext(AppConfig.class);

	}

}