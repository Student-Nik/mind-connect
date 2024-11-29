package com.zoommeeting.mindconnectzoommeeting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoommeeting.mindconnectzoommeeting.entitites.Quiz1;
import com.zoommeeting.mindconnectzoommeeting.services.MailServices;

@Controller
public class MailController {
	
	private MailServices mailServices;
   
	public MailController(MailServices mailServices) {
		this.mailServices = mailServices;
		
	}
	
	@GetMapping("/index")
    public String index(Model model) {
		model.addAttribute("quiz1", new Quiz1());
        return "index"; // Corresponds to index.html
    }

    @GetMapping("/mental")
    public String mental() {
        return "mental"; // Corresponds to mental.html
    }


    @GetMapping("/aboutus")
    public String aboutUs() {
        return "aboutus"; // Corresponds to aboutus.html
    }

    @GetMapping("/contactus")
    public String contactUs() {
        return "contactus"; // Corresponds to contactus.html
    }

    @GetMapping("/testimonials")
    public String testimonials() {
        return "testimonials"; // Corresponds to testimonials.html
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq"; // Corresponds to faq.html
    }

    @GetMapping("/learn")
    public String learn() {
        return "learn"; // Corresponds to learn.html
    }

    @GetMapping("/review")
    public String review() {
        return "review"; // Corresponds to review.html
    }

    
    @GetMapping("/quiz1")
    public String quiz1() {
        return "quiz1"; 
    }
    
    @GetMapping("/meeting")
    public String getMeeting() {
        return "meeting"; 
    }

	@PostMapping("/submit")
	public String getMail(@ModelAttribute Quiz1 quiz1,@RequestParam("patient-email") String mail, Model model) {
		mailServices.saveQuiz1(quiz1);
		mailServices.sendMail(mail);
		return "submit";
	}  
    
	@GetMapping("/list")
	public String getList(Model model) {
		model.addAttribute("quizes",mailServices.getAllQuiz());
		return "quiz2";
	}
	
	
}
