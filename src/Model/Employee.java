package Model;

import java.util.*;

public class Employee {
    String FirstName;
    String LastName;
    String Dob;
    String Age;
    String FirstLine;
    String SecondLine;
    String City;
    String State;
    String Post;
    String Pincode;
    String Country;
    String PhoneNumbers;
    String email;
    String OfficialEmail;
    String Department;
    String doj;
    String Qualification;
    String AadharNo;

    public Employee(String FirstName, String LastName, String Dob, String Age, String FirstLine, String SecondLine,
            String City, String State, String Post, String Pincode, String Country, String PhoneNumbers, String email,
            String OfficialEmail, String Department, String doj, String Qualification, String AadharNo) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Dob = Dob;
        this.Age = Age;
        this.FirstLine = FirstLine;
        this.SecondLine = SecondLine;
        this.City = City;
        this.State = State;
        this.Post = Post;
        this.Pincode = Pincode;
        this.Country = Country;
        this.PhoneNumbers = PhoneNumbers;
        this.email = email;
        this.OfficialEmail = OfficialEmail;
        this.Department = Department;
        this.doj = doj;
        this.Qualification = Qualification;
        this.AadharNo = AadharNo;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getDob() {
        return this.Dob;
    }

    public void setDob(String Dob) {
        this.Dob = Dob;
    }

    public String getAge() {
        return this.Age;
    }

    public void setAge(String Age) {
        this.Age = Age;
    }

    public String getFirstLine() {
        return this.FirstLine;
    }

    public void setFirstLine(String FirstLine) {
        this.FirstLine = FirstLine;
    }

    public String getSecondLine() {
        return this.SecondLine;
    }

    public void setSecondLine(String SecondLine) {
        this.SecondLine = SecondLine;
    }

    public String getCity() {
        return this.City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return this.State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getPost() {
        return this.Post;
    }

    public void setPost(String Post) {
        this.Post = Post;
    }

    public String getPincode() {
        return this.Pincode;
    }

    public void setPincode(String Pincode) {
        this.Pincode = Pincode;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getPhoneNumbers() {
        return this.PhoneNumbers;
    }

    public void setPhoneNumbers(String PhoneNumbers) {
        this.PhoneNumbers = PhoneNumbers;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficialEmail() {
        return this.OfficialEmail;
    }

    public void setOfficialEmail(String OfficialEmail) {
        this.OfficialEmail = OfficialEmail;
    }

    public String getDepartment() {
        return this.Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    public String getDoj() {
        return this.doj;
    }

    public void setDoj(String doj) {
        this.doj = doj;
    }

    public String getQualification() {
        return this.Qualification;
    }

    public void setQualification(String Qualification) {
        this.Qualification = Qualification;
    }

    public String getAadharNo() {
        return this.AadharNo;
    }

    public void setAadharNo(String AadharNo) {
        this.AadharNo = AadharNo;
    }

}
