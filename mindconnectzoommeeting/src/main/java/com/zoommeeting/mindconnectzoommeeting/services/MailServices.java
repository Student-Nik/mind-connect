package com.zoommeeting.mindconnectzoommeeting.services;

import java.util.List;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.zoommeeting.mindconnectzoommeeting.entitites.Quiz1;
import com.zoommeeting.mindconnectzoommeeting.repository.MeetingRepository;

@Service
public class MailServices {
	
	private JavaMailSender javaMailSender;
    private MeetingRepository meetingRepository;
    
	public MailServices(JavaMailSender javaMailSender, MeetingRepository meetingRepository) {
		this.javaMailSender = javaMailSender;
		this.meetingRepository = meetingRepository;
	}
    
	public Quiz1 saveQuiz1(Quiz1 quiz1) {
		return meetingRepository.save(quiz1);
	}
	
	public List<Quiz1> getAllQuiz(){
		return meetingRepository.findAll();
	}
	
	public void sendMail(String mail) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(mail);
		message.setSubject("Your Upcoming Consultation – Google Meet Link Inside");
		message.setText("Dear,\r\n"
				+ "\r\n"
				+ "I hope you're doing well! I’m looking forward to our upcoming consultation. Below, you’ll find the Zoom link for our meeting:\r\n"
				+ "\r\n"
				+ "Google Meet Link: http://meet.google.com/puh-sjea-gmt \r\n"
				+ "Date & Time: Current Time Only...\r\n"
				+ "\r\n"
				+ "Please feel free to join the meeting a few minutes early to ensure everything is working smoothly. If you encounter any issues or need assistance accessing the link, don't hesitate to reach out to me.\r\n"
				+ "\r\n"
				+ "Looking forward to speaking with you soon!\r\n"
				+ "\r\n"
				+ "Best regards,\r\n"
				+ "MindConnect\r\n");
		
		try {
	        javaMailSender.send(message);
	        System.out.println("Email sent ");
	    } catch (Exception e) {
	        System.out.println("Error sending email: " + e.getMessage());
	    }
		
		//javaMailSender.send(message);
	}
}
