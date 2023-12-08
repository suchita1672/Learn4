package BikkadIT.PrimaryAndQualifierAnnotation.dao;



	import org.springframework.context.annotation.Primary;
	import org.springframework.stereotype.Repository;

	@Repository
	
	public class OracleReportDaoImpl implements ReportDao{
	    @Override 
		public String generateReport() {
			String msg = "Generated report from Oracle dataBase";
			return msg;
		}
	}



