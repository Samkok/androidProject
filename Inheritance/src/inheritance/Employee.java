/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

public class Employee extends Person {
    private String phone;
    public Employee(){
        super();
        setPhone("011323270");
    }
    public Employee(int id,String name ,String phone) {
        super(id , name);
        setPhone(phone);
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public String toString() {
        return super.toString() + " " + phone;
    }
}
