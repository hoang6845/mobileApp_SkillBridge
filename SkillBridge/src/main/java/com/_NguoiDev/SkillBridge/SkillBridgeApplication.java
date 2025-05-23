package com._NguoiDev.SkillBridge;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.messaging.FirebaseMessaging;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import java.io.FileInputStream;
import java.io.IOException;

@SpringBootApplication
public class SkillBridgeApplication {

	@Bean
	FirebaseMessaging firebaseMessaging() throws IOException {
		GoogleCredentials googleCredentials = GoogleCredentials
				.fromStream(new ClassPathResource("skill-bridge-3c155-firebase-adminsdk-fbsvc-ce90ce2176.json").getInputStream());

		FirebaseOptions options = new FirebaseOptions.Builder()
				.setCredentials(googleCredentials)
				.build();

		FirebaseApp app = FirebaseApp.initializeApp(options, "skill-bridge");
		return FirebaseMessaging.getInstance(app);
	}

	public static void main(String[] args) {
		SpringApplication.run(SkillBridgeApplication.class, args);
	}

}
