package classes;

public class User {
    
    private String userName;
    private String userPassword;
    private String userType;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    
    public boolean userLogin(){
        
        String sql = "SELECT * FROM tblUser WHERE BINARY userName=? AND BINARY userPassword=? AND BINARY userType=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, userName);
            MyConnection.pst.setString(2, userPassword);
            MyConnection.pst.setString(3, userType);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                MyConnection.con.close();
                
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("Login Error: " + e.getMessage());
            
        }
        
        return false;
        
    }
    
}
