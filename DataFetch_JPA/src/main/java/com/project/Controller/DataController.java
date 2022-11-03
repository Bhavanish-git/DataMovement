package com.project.Controller;
import java.text.ParseException;
//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.project.DataServiceImplement.DataServImple;

@RestController
public class DataController {

	@Autowired
	DataServImple dataserv;
	
    @GetMapping("/alldata")
    public ModelAndView alldata() {
    	                                                     //List l=dataserv.findAll();
        ModelAndView mav = new ModelAndView("list-datas");
    	mav.addObject("OrigTables",dataserv.findAll());
    	return mav;
	                                                       // return  dataserv.findAll();
                                                          //return l.size();
    }
     
	 @GetMapping("/aggNo")
	 public ModelAndView aggNo(@PathVariable("aggno")String aggno) {
	    	ModelAndView mav2 = new ModelAndView("list-datas");
	    	mav2.addObject("OrigTables",dataserv.findByAGREEMENT_NO(aggno));
	    	return mav2;
		// List<OrigTable> l = dataserv.findByAGREEMENT_NO(aggno);
		// return  l;
		}
	 
	 @GetMapping("/date/{sDate}")
	 public ModelAndView date(@PathVariable("sDate") String sDate) throws ParseException {
	    	
	    	ModelAndView mav1 = new ModelAndView("list-datas");
	    	mav1.addObject("OrigTables",dataserv.findByLMS_DATELike(sDate));
	    	return mav1;
		}
	 
	 @GetMapping("/date/{sDate}/{eDate}")
	 public ModelAndView dateBetween(@PathVariable("sDate") String sDate,
                                     @PathVariable("eDate") String eDate) throws ParseException {
	    	
	    	ModelAndView mav2 = new ModelAndView("list-datas");
	    	mav2.addObject("OrigTables",dataserv.findByLMS_DATEBetween(sDate,eDate));
	    	return mav2;
		}
	 
	 
}
