package com.i.springboot.contorller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@MultipartConfig(maxFileSize = 1024*1024*1024)
@Controller
public class fileupdate {

    @RequestMapping("file")
    @ResponseBody
    public String file(HttpServletRequest req, HttpServletResponse rep) throws IOException, ServletException {
      Part part=req.getPart("file");
   FileInputStream fileInputStream=(FileInputStream)part.getInputStream();
   FileOutputStream fileOutputStream=new FileOutputStream(new File(req.getContextPath()+part.getSubmittedFileName()));
   byte[]bytes=new byte[1024];
   int f=0;
      while((f=fileInputStream.read(bytes))!=-1){
          fileOutputStream.write(bytes,0,f);
      }
      fileInputStream.close();
      fileOutputStream.close();
     return "上传成功";
    }
}
