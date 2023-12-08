package BikkadIT.PrimaryAndQualifierAnnotation.controller;



	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;

import BikkadIT.PrimaryAndQualifierAnnotation.service.ReportService;

	

	@Controller
	public class ReportController {
		@Autowired
		private ReportService reportService;
		
		public String generateReport() {
			String report = reportService.generateReport();
			return report;
		}

	}



