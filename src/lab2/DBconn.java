package lab2;

import java.sql.*;
import java.util.*;
public class DBconn {
	/**
	 * �����������ݿ����Ϣ�����ݿ�URL���û���������
	 */
	private static final String URL="jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_watertree105?user=mjmw4kkxx4&password=jzm31zm33i4x3xk34jhl304iwh2k2kl5jy4yxy3x&characterEncoding=UTF-8&useSSL=true";
	/**
	 * ����JDBC����ض���
	 */
	protected static Statement s=null;
	protected static ResultSet rs=null;
	protected static Connection conn=null;
	/**
	 * �������ݿ�����
	 */
	public static synchronized Connection getConnection()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(URL);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	/**
	 * ִ��INSERT��UPDATE��DELETE���
	 * @param sqlִ����䣬�ַ�������
	 * @return ִ�н����int����
	 */
	public static int executeUpdate(String sql)
	{
		int result=0;
		try{
			s=getConnection().createStatement();
			result=s.executeUpdate(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	/**
	 * ִ��SELECT���
	 * @param sql SQL��䣬�ַ�������
	 * @return ResultSet�����
	 */
	public static ResultSet executeQuery(String sql)
	{
		try{
			s=getConnection().createStatement();
			rs=s.executeQuery(sql);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rs;
	}
	/**
	 * ִ�ж�̬SQL���
	 * @param sql ���в����Ķ�̬SQL���
	 * @return ����PreparedStatement����
	 */
	public static PreparedStatement executePreparedStatement(String sql)
	{
		PreparedStatement ps=null;
		try{
			ps=getConnection().prepareStatement(sql);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return ps;
	}
	/**
	 * ����ع�
	 */
	public static void rollback(){
		try{
			getConnection().rollback();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	/**
	 * �ر����ݿ�
	 */
	public static void close()
	{
		try
		{
			if(rs!=null)
				rs.close();
			if(s!=null)
				s.close();
			if(conn!=null)
				conn.close();
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}
