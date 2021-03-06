package com.emailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class Emailclient3Application {

	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(Emailclient3Application.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		service.sendSimpleEmail("sankarsathya1999@gmail.com", "Galactic", "Galactic");
	}
}
