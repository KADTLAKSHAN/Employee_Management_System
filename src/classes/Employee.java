package classes;

public class Employee {
    
    private String empID;
    private String empFirstName;
    private String empLastName;
    private String empAddress;
    private String empPhoneNo;
    private String empEPFNo;
    private String depID;
    private String desID;
    private String userName;

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpFirstName() {
        return empFirstName;
    }

    public void setEmpFirstName(String empFirstName) {
        this.empFirstName = empFirstName;
    }

    public String getEmpLastName() {
        return empLastName;
    }

    public void setEmpLastName(String empLastName) {
        this.empLastName = empLastName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public void setEmpPhoneNo(String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }

    public String getEmpEPFNo() {
        return empEPFNo;
    }

    public void setEmpEPFNo(String empEPFNo) {
        this.empEPFNo = empEPFNo;
    }

    public String getDepID() {
        return depID;
    }

    public void setDepID(String depID) {
        this.depID = depID;
    }

    public String getDesID() {
        return desID;
    }

    public void setDesID(String desID) {
        this.desID = desID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    
    public boolean addEmployee(){
        
        String sql = "INSERT INTO tblEmployee VALUES (?,?,?,?,?,?,?,?,?)";
        
        try {
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, empID);
            MyConnection.pst.setString(2, empFirstName);
            MyConnection.pst.setString(3, empLastName);
            MyConnection.pst.setString(4, empAddress);
            MyConnection.pst.setString(5, empPhoneNo);
            MyConnection.pst.setString(6, empEPFNo);
            MyConnection.pst.setString(7, depID);
            MyConnection.pst.setString(8, desID);
            MyConnection.pst.setString(9, userName);
            
            if(MyConnection.pst.executeUpdate()==1){
                MyConnection.con.close();
                return true;
            }
        } catch (Exception e) {
            
            System.out.println("EMPLOYEE ADD FUNCTION ERROR!" + e.getMessage());
        }
        
        
        return false;
    }
    
    public boolean deleteEmployee(){
        
        String sql = "DELETE FROM tblEmployee WHERE empID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, empID);
            
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("EMPLOYEE DELETE FUNCTION ERROR!" + e.getMessage());
                    
            
        }
        
        return false;
    }
    
    public boolean updateEmployee(){
        
        String sql = "UPDATE tblEmployee SET empFirstName=?, empLastName=?, empAddress=?, empPhoneNumber=?, empEPF=?, depID=?, desID=?, userName=?  WHERE empID=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, empFirstName);
            MyConnection.pst.setString(2, empLastName);
            MyConnection.pst.setString(3, empAddress);
            MyConnection.pst.setString(4, empPhoneNo);
            MyConnection.pst.setString(5, empEPFNo);
            MyConnection.pst.setString(6, depID);
            MyConnection.pst.setString(7, desID);
            MyConnection.pst.setString(8, userName);
            MyConnection.pst.setString(9, empID);
                     
            if(MyConnection.pst.executeUpdate() == 1){
                MyConnection.con.close();
                return true;
            }
            
        } catch (Exception e) {
            
            System.out.println("EMLPOYEE UPDATE FUNCTION ERROR!" + e.getMessage());
            
        }
        
        return false;
    }
    
    public boolean searchEmployee(){
        
        String sql = "SELECT * FROM tblEmployee WHERE empID=? OR empFirstName=? OR empLastName=?";
        
        try {
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            
            MyConnection.pst.setString(1, empID);
            MyConnection.pst.setString(2, empFirstName);
            MyConnection.pst.setString(3, empLastName);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                empID = MyConnection.rs.getString(1);
                empFirstName = MyConnection.rs.getString(2);
                empLastName = MyConnection.rs.getString(3);
                empAddress = MyConnection.rs.getString(4);
                empPhoneNo = MyConnection.rs.getString(5);
                empEPFNo = MyConnection.rs.getString(6);
                depID = MyConnection.rs.getString(7);
                desID = MyConnection.rs.getString(8);
                userName = MyConnection.rs.getString(9);
                MyConnection.con.close();
                return true;
                
            }
        } catch (Exception e) {
            
            System.out.println("EMPLOYEE SEARCH FUNCTION ERROR! : " + e.getMessage());
            
        }
        
        
        return false;
    }
    
    public void viewAll(){
        
        String sql = "SELECT * FROM tblEmployee";
        
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
    
    
    public String designationSearchByName(String des_Name){
        
        String sql = "SELECT desID FROM tblDesignation WHERE desName=?";
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, des_Name);
            
            MyConnection.rs = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs.isBeforeFirst()){
                MyConnection.rs.first();
                
                desID = MyConnection.rs.getString(1);
                MyConnection.con.close();
                return desID;
                
            }
            
            
            
        } catch (Exception e) {
            
            System.out.println("DESIGNATION SEARCH BY DEP NAME FUNCTION ERROR IN DESIGNATION CLASS" + e.getMessage());
            
        }
        
        return null;
        
    }
    
    public String designationSearchByID(String des_ID){
        
        String sql = "SELECT desName FROM tblDesignation WHERE desID=?";
        String desName;
        
        try {
            
            MyConnection.getConnection();
            MyConnection.pst = MyConnection.con.prepareStatement(sql);
            MyConnection.pst.setString(1, des_ID);
            
            MyConnection.rs2 = MyConnection.pst.executeQuery();
            
            if(MyConnection.rs2.isBeforeFirst()){
                MyConnection.rs2.first();
                
                desName = MyConnection.rs2.getString(1);
                MyConnection.con.close();
                return desName;
                
            }
            
            
            
        } catch (Exception e) {
            
            System.out.println("DEPARTMENT SEARCH BY DEPID FUNCTION ERROR IN DESIGNATION CLASS" + e.getMessage());
            
        }
        
        return null;
        
    }
    
    
}
