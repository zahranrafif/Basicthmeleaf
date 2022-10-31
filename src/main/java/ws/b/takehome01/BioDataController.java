/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws.b.takehome01;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Zahran Rafif Pc
 */
@Controller
public class BioDataController {
    //Home
    @RequestMapping("/")
    public String register(){
        return "biodata";
    }
    //Halaman Tampil
    @PostMapping("/save")
    public String save(@RequestParam("name") String name, 
            @RequestParam("address") String address , 
            @RequestParam("kelamin") String kelamin , 
            @RequestParam("tanggal") String tanggal,
            @RequestParam("nohp") String nomorhp,
            @RequestParam("photo") MultipartFile photo, ModelMap model){
        
        //Deklarasi variabel
        BioData bio = new BioData();
        bio.setName(name);
        bio.setAddress(address);
        bio.setTanggal(tanggal);
        bio.setKelamin(kelamin);
        bio.setNohp(nomorhp);
        
        
        //Jika photo kosong
        if (photo.isEmpty()){
            return "biodata";
        }
        //Menyimpan di folder uploads
        Path path = Paths.get("src/main/resources/uploads/");
        try {
            InputStream inputStream = photo.getInputStream();
            Files.copy(inputStream, path.resolve(photo.getOriginalFilename()),
                    StandardCopyOption.REPLACE_EXISTING);
            bio.setPhoto (photo.getOriginalFilename().toLowerCase());
            
            model.addAttribute("BIO", bio);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "view-biodata";
    }
}
