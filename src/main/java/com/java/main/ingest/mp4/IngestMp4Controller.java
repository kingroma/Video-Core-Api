package com.java.main.ingest.mp4;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IngestMp4Controller {
	private static final Logger logger = LoggerFactory.getLogger(IngestMp4Controller.class);
	
	@Resource(name="ingestMp4Service")
	public IngestMp4Service ingestMp4Service;
	
	@RequestMapping(value = "/ingest/mp4/list", method = RequestMethod.GET)
	@ResponseBody
	public List<IngestMp4VO> ingestMp4List(Locale locale, Model model) {
		
		logger.info("Ingest mp4 list {}", model);
		List<IngestMp4VO> list = ingestMp4Service.list();
		for ( IngestMp4VO obj : list ) {
			System.out.println(obj);
		}
		return list ;
	}
	
	@RequestMapping(value = "/ingest/mp4/insert", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> ingestMp4Insert(@RequestBody IngestMp4VO ingestMp4VO) {
		logger.info("Ingest mp4 insert {}", ingestMp4VO);
		
		Map<String,Object> ret = new HashMap<String,Object>() ; 
		System.out.println(ingestMp4VO);
		
//		System.out.println(request.getAttribute("ingestMp4VO"));
//		System.out.println(request.getAttribute("ingestId"));
//		
//		System.out.println(request.getParameter("ingestMp4VO"));
//		System.out.println(request.getParameter("ingestId"));
		
		ret.put("return", ingestMp4VO);
		return ret  ;
	}
}
