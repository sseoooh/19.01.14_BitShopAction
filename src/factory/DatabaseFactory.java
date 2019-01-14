package factory;

import pool.Constant;

public class DatabaseFactory {
	public static Database createDatabase(
			String vendor) {
			//제조사 vendor
		Database database = null;
		switch(vendor) {
		case "oracle" :
			database = new Oracle(			//기존값 String driver, String url, String username, String password
					Constant.ORACLE_DRIVER,
					Constant.ORACLE_URL,
					Constant.USERNAME,
					Constant.PASSWORD);
			break;
		}
		return database;
	}
}
