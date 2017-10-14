package lab2;

import java.sql.*;
import java.util.*;
public class DBconn {
	/**
	 * 声明连接数据库的信息：数据库URL、用户名和密码
	 */
	private static final String URL="jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_watertree105?user=mjmw4kkxx4&password=jzm31zm33i4x3xk34jhl304iwh2k2kl5jy4yxy3x&characterEncoding=UTF-8&useSSL=true";
	/**
	 * 申明JDBC的相关对象
	 */
	protected static Statement s=null;
	protected static ResultSet rs=null;
	protected static Connection conn=null;
	/**
	 * 创建数据库连接
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
	 * 执行INSERT、UPDATE、DELETE语句
	 * @param sql执行语句，字符串类型
	 * @return 执行结果，int类型
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
	 * 执行SELECT语句
	 * @param sql SQL语句，字符串类型
	 * @return ResultSet结果集
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
	 * 执行动态SQL语句
	 * @param sql 含有参数的动态SQL语句
	 * @return 返回PreparedStatement对象
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
	 * 事务回滚
	 */
	public static void rollback(){
		try{
			getConnection().rollback();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	/**
	 * 关闭数据库
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
