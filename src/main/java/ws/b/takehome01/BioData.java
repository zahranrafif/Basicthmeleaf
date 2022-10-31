/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.b.takehome01;

/**
 *
 * @author Zahran Rafif Pc
 */
public class BioData {
    private String name;
    private String address;
    private String tanggal;
    private String photo;
    private String kelamin;
    private String nohp;
    public BioData() {
        super();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    
    public String getTanggal(){
        return tanggal;
    }
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo){
        this.photo = photo;
    }
    
    public String getKelamin(){
        return kelamin;
    }
    public void setKelamin(String Kelamin){
        kelamin = Kelamin;
    }
    
    public String getNohp(){
        return nohp;
    }
    public void setNohp(String nohp){
        this.nohp = nohp;
    }
}
