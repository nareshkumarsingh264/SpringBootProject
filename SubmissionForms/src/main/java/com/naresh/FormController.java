package com.naresh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
@GetMapping("naresh")
public String naresh() {
	return "naresh";
}
@PostMapping("/details")
public String viewdetails(@RequestParam("cid") String cid,
	@RequestParam("cname") String cname,
	@RequestParam("cemail") String cemail, ModelMap modelMap) 
{
	modelMap.put("cid", cid);
	modelMap.put("cname", cname);
	modelMap.put("cemail", cemail);
	return "viewcustomers";
}
}
