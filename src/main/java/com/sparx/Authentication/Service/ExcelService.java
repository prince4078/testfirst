//package com.sparx.Authentication.Service;
//
//import java.io.IOException;
//import java.util.List;
//
//import com.sparx.Authentication.Entity.TutorialsRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.multipart.MultipartFile;
//
//import com.sparx.Authentication.Entity.ExcelHelper;
//import com.sparx.Authentication.Entity.Tutorial;
//
//@Service
//public class ExcelService {
//	 @Autowired
//	  private final TutorialsRepository repository;
//
//	  public void save(MultipartFile file) {
//	    try {
//	      List<Tutorial> tutorials = ExcelHelper.excelToTutorials(file.getInputStream());
//	      repository.saveAll(tutorials);
//	    } catch (IOException e) {
//	      throw new RuntimeException("fail to store excel data: " + e.getMessage());
//	    }
//	  }
//
//	  public List<Tutorial> getAllTutorials() {
//	    return repository.findAll();
//	  }

//}
