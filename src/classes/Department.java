package classes;

public class Department {
    
    private String depID;
    private String depName;

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }
    
    
    public boolean addDepartment(){
        
        String sql = "INSERT INTO tblDepartment VALUES (?,?)";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, depID);
            MyConnection.pst.setString(2, depName);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
            
        } catch (Exception e) {
            
            System.out.println("addDepartment functions error! : " + e.getMessage());
        }
        
        return false;
    }
    
    public boolean deleteDepartment(){
        
        String sql = "DELETE FROM tblDepartment WHERE depID=? OR depName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, depID);
            MyConnection.pst.setString(2, depName);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
            
        } catch (Exception e) {
            
            System.out.println("Department delete functions error! : " + e.getMessage());
            
        }
        
        return false;
    }
    
    public boolean updateDepartment(){
        
        String sql = "UPDATE tblDepartment SET depName=? WHERE depID=?";
        
        try {
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, depName);
            MyConnection.pst.setString(2, depID);
            
            if(MyConnection.pst.executeUpdate()==1){
                MyConnection.con.close();
                return true;
            }
        } catch (Exception e) {
            
            System.out.println("Department update functions error! : " + e.getMessage());
        }
        
        return false;
    }
    
    public boolean searchDepartment(){
        
        String sql = "SELECT * FROM tblDepartment WHERE depID=? OR depName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, depID);
            MyConnection.pst.setString(2, depName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                depID = MyConnection.rs.getString(1);
                depName = MyConnection.rs.getString(2);
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("Department search functions error! : " + e.getMessage());
            
        }
        
        return false;
    }
    
    public void viewAll(){
        String sql = "SELECT * FROM tblDepartment";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
        } catch (Exception e) {
            
            System.out.println("Department view all user function error! " + e.getMessage());
            
        }
    }
    
}
