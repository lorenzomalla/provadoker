package org.stepsrl.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.stepsrl.model.CorsoDiLaureaSpecifico;
import org.stepsrl.service.InfoService;

@Controller
public class BachecaController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping(value="/getAllCorsiDiLaurea" , method= RequestMethod.POST )
	public @ResponseBody ResponseEntity<List<CorsoDiLaureaSpecifico>> getAllCorsiDiLaurea(){
		List<CorsoDiLaureaSpecifico> res = null;
		ResponseEntity<List<CorsoDiLaureaSpecifico>> result = null;
		try {
				res = infoService.getAllCorsiDiLaurea();
				result = new ResponseEntity<List<CorsoDiLaureaSpecifico>>(res, HttpStatus.OK);
		} catch (Exception e) {
			result = new ResponseEntity<List<CorsoDiLaureaSpecifico>>(res, HttpStatus.NOT_FOUND);
		}
		return result;
	}
	/**
	 * Metodo per fare il download di un file
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
//	@RequestMapping(value="/download",method = RequestMethod.GET)
//	public void download(HttpServletRequest request , HttpServletResponse response) throws IOException ,FileNotFoundException{
//		File file = new File("C:\\Users\\cblac\\Desktop\\prova\\test.txt");
//		InputStream inputStream = new BufferedInputStream(new FileInputStream(file));
//		String mimeType = URLConnection.guessContentTypeFromStream(inputStream);
//		if(mimeType == null){
//			mimeType = "application/octet-stream";
//		}
//		response.setContentType(mimeType);
//		response.setContentLength((int)file.length());
//		response.setHeader("Content-Disposition", String.format("attachment; filename=\"%s\"",file.getName()));
//		FileCopyUtils.copy(inputStream, response.getOutputStream());
//		
//	}
	/**
	 * Permette di fare il download di qualsiasi tipo di file.
	 * @param request
	 * @param response
	 * @param fileName
	 */
	 @RequestMapping(value="/file/{fileName:.+}",method=RequestMethod.GET )
	    public void downloadAllTypeFiles( HttpServletRequest request,HttpServletResponse response,@PathVariable("fileName") String fileName){
	        String dataDirectory = request.getSession().getServletContext().getRealPath("/WEB-INF/downloads/pdf/");
	        Path file = Paths.get(dataDirectory, fileName);
	        if (Files.exists(file)){
	        	//ANCHE SENZA CONTENT-TYPE FUNZIONA LO STESSO.
//	            response.setContentType("application/pdf");
	            response.addHeader("Content-Disposition", "attachment; filename="+fileName);
	            try{
	                Files.copy(file, response.getOutputStream());
	                response.getOutputStream().flush();
	                }catch (IOException ex) {
	                ex.printStackTrace();
	            }
	        }
	    }
}
