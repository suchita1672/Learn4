package BikkadIT.PrimaryAndQualifierAnnotation.dao;



import org.springframework.stereotype.Repository;

@Repository
public class ReportDaoImpl implements ReportDao {

	@Override
	public String generateReport() {
		String msg = "Generated report from dataBase";
		return msg;
	}

}


