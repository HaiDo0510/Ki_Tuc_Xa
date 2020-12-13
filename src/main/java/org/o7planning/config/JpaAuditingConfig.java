package org.o7planning.config;



import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;



@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class JpaAuditingConfig {

	@Bean
	public AuditorAware<String> auditorProvider() {
		return (AuditorAware<String>) new AuditorAwareImpl();
	}

	public static class AuditorAwareImpl  implements AuditorAware<String>{

		@Override
		public String getCurrentAuditor() {
			// TODO Auto-generated method stub
			return null;
		}

	

		

		

		

	}
}
