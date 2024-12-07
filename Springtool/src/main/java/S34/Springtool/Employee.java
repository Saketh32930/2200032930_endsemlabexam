package S34.Springtool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Emp {
  
  int id;
  String fn, ln;
  Address address;
  
  public Employee() {
    
  }
  
  public Employee(int id, String fn, String ln, @Autowired @Qualifier("add2") Address address) {
    this.id = id;
    this.fn = fn;
    this.ln = ln;
    this.address = address;
  }
  
  public int getId() {
    return id;
  }
  public Address getAddress() {
    return address;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getFn() {
    return fn;
  }
  public void setFn(String fn) {
    this.fn = fn;
  }
  public String getLn() {
    return ln;
  }
  public void setLn(String ln) {
    this.ln = ln;
  }
  
  public String toString() {
    return (id + " - " + fn + " - " + ln + " - " + address);
  }
  
}
