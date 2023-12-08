package BikkadIT.PrimaryAndQualifierAnnotation.dao;



	import org.springframework.context.annotation.Primary;
	import org.springframework.stereotype.Repository;

	@Repository
	@Primary
	public class MysqlReportDaoImpl implements ReportDao {

		@Override
		public String generateReport() {
			String msg = "Generated report from MySql database";
			return msg;
		}

	}


