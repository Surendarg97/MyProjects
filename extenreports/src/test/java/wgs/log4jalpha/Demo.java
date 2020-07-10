package wgs.log4jalpha;

import org.apache.logging.log4j.*;

public class Demo {
	
	private static Logger log=LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		
		log.debug("i am dubuggin");
		
		log.fatal("i am fatal error");
		
		log.info("object is present");
		
		log.
		
		int i=5;
		
		if(3>i)
			log.info("object is present");
		else
			log.error("There is an error");
	}

}
