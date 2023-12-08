package BikkadIT.PrimaryAndQualifierAnnotation.service;


	

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import BikkadIT.PrimaryAndQualifierAnnotation.dao.ReportDao;

	

	@Service
	public class ReportServiceImpl implements ReportService{
	     @Autowired
		private ReportDao reportDao;
		
	     @Override
		public String generateReport() {
			String generateReport = reportDao.generateReport();
			return generateReport;
			
	         	
		}
	}



