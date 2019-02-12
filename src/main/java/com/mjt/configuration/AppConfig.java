package com.mjt.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.ldap.repository.config.EnableLdapRepositories;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.core.support.LdapContextSource;

import com.mjt.ldap.LdapClient;

@Configuration
@PropertySource("classpath:application.yaml")
@ComponentScan(basePackages = { "com.mjt.*" })
@Profile("default")
@EnableLdapRepositories(basePackages = "com.mjt.**")
public class AppConfig {

	@Autowired
	private Environment env;

	@Bean
	public LdapContextSource ldapContextSource() {
		LdapContextSource ldapContextSource = new LdapContextSource();

		ldapContextSource.setUrl(env.getRequiredProperty("ldap.url"));
		ldapContextSource.setBase(env.getRequiredProperty("ldap.partitionSuffix"));
		ldapContextSource.setUserDn(env.getRequiredProperty("ldap.principal"));
		ldapContextSource.setPassword(env.getRequiredProperty("ldap.password"));

		return ldapContextSource;
	}

	@Bean
	public LdapTemplate ldapTemplate() {
		return new LdapTemplate(ldapContextSource());
	}

	@Bean
	public LdapClient ldapClient() {
		return new LdapClient();
	}

}
