package BikkadIT.PrimaryAndQualifierAnnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import BikkadIT.PrimaryAndQualifierAnnotation.controller.ReportController;



@SpringBootApplication
public class PrimaryAndQualifierAnnotationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(PrimaryAndQualifierAnnotationApplication.class, args);
		ReportController reportController = context.getBean(ReportController.class);
		String generateReport = reportController.generateReport();
		System.out.println(generateReport);
	}

}
