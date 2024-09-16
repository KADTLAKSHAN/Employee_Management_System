package classes;

public class Designation {
    
    private String desID;
    private String desName;
    private String depID;

    public String getDesID() {
        return desID;
    }

    public void setDesID(String desID) {
        this.desID = desID;
    }

    public String getDesName() {
        return desName;
    }

    public void setDesName(String desName) {
        this.desName = desName;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }
    
    
    public boolean addDesignation(){
        
        String sql = "INSERT INTO tblDesignation VALUES (?,?,?)";
        
        try {
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, desID);
            MyConnection.pst.setString(2, desName);
            MyConnection.pst.setString(3, depID);
            
            if(MyConnection.pst.executeUpdate()==1){
                MyConnection.con.close();
                return true;
            }
        } catch (Exception e) {
            
            System.out.println("DESIGNATION FUNCTION ERROR!" + e.getMessage());
        }
        
        return false;
    }
    
    
    public boolean updateDesignation(){
        
        String sql = "UPDATE tblDesignation SET desName=?, depID=? WHERE desID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, desName);
            MyConnection.pst.setString(2, depID);
            MyConnection.pst.setString(3, desID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("DESIGNATION UPDATE FUNCTION ERROR!" + e.getMessage());
            
        }
        
        return false;
    }
    
    public boolean deleteDesignation(){
        
        String sql = "DELETE FROM tblDesignation WHERE desID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, desID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("DESIGNATION DELETE FUNCTION ERROR!" + e.getMessage());
                    
            
        }
        
        return false;
    }
    
    public boolean searchDesignation(){
        
        String sql = "SELECT * FROM tblDesignation WHERE desID=? OR desName=?";
        
        try {
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, desID);
            MyConnection.pst.setString(2, desName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                desID = MyConnection.rs.getString(1);
                desName = MyConnection.rs.getString(2);
                depID = MyConnection.rs.getString(3);
                MyConnection.con.close();
                return true;
                
            }
        } catch (Exception e) {
            
            System.out.println("DESIGNATION SEARCH FUNCTION ERROR! : " + e.getMessage());
            
        }
        
        return false;
    }
    
    public void viewAll(){
        
        String sql = "SELECT * FROM tblDesignation";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
        } catch (Exception e) {
            
            System.out.println("DESIGNATION VIEW ALL FUNCTION ERROR! " + e.getMessage());
            
        }
            
        
    }
    
    public String departmentSearchByName(String depName){
        
        String sql = "SELECT depID FROM tblDepartment WHERE depName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, depName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                depID = MyConnection.rs.getString(1);
                MyConnection.con.close();
                return depID;
                
            }
            
            
            
        } catch (Exception e) {
            
            System.out.println("DEPARTMENT SEARCH BY DEP NAME FUNCTION ERROR IN DESIGNATION CLASS" + e.getMessage());
            
        }
        
        return null;
        
    }
    
    
    public String departmentSearchByID(String depID){
        
        String sql = "SELECT depName FROM tblDepartment WHERE depID=?";
        String depName;
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, depID);
            
            MyConnection.rs2 = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs2.isBeforeFirst()){
                MyConnection.rs2.first();
                
                depName = MyConnection.rs2.getString(1);
                MyConnection.con.close();
                return depName;
                
            }
            
            
            
        } catch (Exception e) {
            
            System.out.println("DEPARTMENT SEARCH BY DEPID FUNCTION ERROR IN DESIGNATION CLASS" + e.getMessage());
            
        }
        
        return null;
        
    }
    
}
