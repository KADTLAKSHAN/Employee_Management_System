package classes;

public class Admin extends User{
    
    public boolean addUser(){
        
        String sql = "INSERT INTO tblUser VALUES(?,?,?)";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, super.getUserName());
            MyConnection.pst.setString(2, super.getUserPassword());
            MyConnection.pst.setString(3, super.getUserType());
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
            
        } catch (Exception e) {
            System.out.println("Admin user insert function error! " + e.getMessage());
        }
        
        return false;
        
    }
    
    public boolean deleteUser(){
        
        String sql = "DELETE FROM tblUser WHERE userName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, super.getUserName());
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("Admin user delete function error! " + e.getMessage());
            
        }
        
        
        return false;
        
    }
    
    public boolean userUpdate(){
        
        String sql = "UPDATE tblUser SET userPassword=?, userType=? WHERE userName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, super.getUserPassword());
            MyConnection.pst.setString(2, super.getUserType());
            MyConnection.pst.setString(3, super.getUserName());
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
            
        } catch (Exception e) {
            System.out.println("Admin user update function error! " + e.getMessage());
        }
        
        
        return false;
    }
    
    public boolean userSearch(){
        
        String sql = "SELECT * FROM tblUser WHERE userName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, super.getUserName());
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                super.setUserPassword(MyConnection.rs.getString(2));
                super.setUserType(MyConnection.rs.getString(3));
                
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("Admin user search function error! " + e.getMessage());
        }
        
        
        
        return false;
    }
    
    public void viewAll(){
        String sql = "SELECT * FROM tblUser";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
        } catch (Exception e) {
            
            System.out.println("Admin view all user function error! " + e.getMessage());
            
        }
    }
    
    
    
}
