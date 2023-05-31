package jp.co.aforce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jp.co.aforce.bean.Login;

public class LoginDAO extends DAO {

	public Login search(String userid, String password) throws Exception {
		Login login = null;

		Connection con = getConnection();
		PreparedStatement st;
		st = con.prepareStatement(
				"SELECT * FROM Login WHERE userid= ? and password= ?");
		st.setString(1, userid);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			login = new Login();
			login.setId(rs.getInt("id"));
			login.setUserid(rs.getString("userid"));
			login.setPassword(rs.getString("password"));
		}

		st.close();
		con.close();
		return login;

	}
}
