package Day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnShoe {

	public static void main(String[] args) {
		
		ApplicationContext appCtxt = new AnnotationConfigApplicationContext(AppConfig.class);
		//Shoe s = appCtxt.getBean(Bata.class);
		
//		Shoe s = (Shoe) appCtxt.getBean("newshoe");
//		s.makeShoeComfortable();
//		
//		Shoe s2 = (Shoe) appCtxt.getBean("newshoe");
//		s2.makeShoeComfortable();
//		
//		s.setPrice(100);
//		s2.setPrice(200);
//		
//		System.out.println(s.getPrice());
//		System.out.println(s2.getPrice());
		
		ShoeShowRoom ssr = (ShoeShowRoom) appCtxt.getBean("ssr");
		//ssr.s1.makeShoeComfortable();
		ssr.s2.makeShoeComfortable();

	}

}
