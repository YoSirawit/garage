
public class DB_connector {
    
    public static String getUrl(){
        return "jdbc:mysql://aws.connect.psdb.cloud:3306/garagesystemdfdfd";
    }
    public static String getUsername(){
        return "6supp5otf9r8vj9gtxf8";
    }
    public static String getPassword(){
        return "pscale_pw_XbS8WVUcYPAD1ExOc8YmQGYSL1XWBtN7en7DkJlKUld";
    }
  
//    public DB_connector(){
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(url, username, password);
//            statement = conn.createStatement();
//        } catch (Exception e){
//            System.out.println(e);
//        }
//    }
//    
    
//        public static void main(String[] args) {
//        try{Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection conn = DriverManager.getConnection(url, username, password);
//            Statement statement = conn.createStatement();
//            ResultSet result = statement.executeQuery("select * from userid");
//            result.next();
//            System.out.println(result.getString(3));
//            
//        System.out.println(result.getInt(1));
//        } catch(Exception e){
//            System.out.println(e);
//        }
//    }
    
}
