package br.com.zaul.api.service;

import br.com.zaul.api.configuration.ApiConfiguration;
import br.com.zaul.api.resource.ClientResource;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class ApiService extends Service<ApiConfiguration> {

	public static void main(String[] args) throws Exception {
		new ApiService().run(new String[] { "server" });
	}
	
	@Override
	public void initialize(Bootstrap<ApiConfiguration> bootstrap) {
		bootstrap.setName("RESTful Test");
		
	}

	@Override
	public void run(ApiConfiguration configuration, Environment environment) throws Exception {
		environment.addResource(new ClientResource());
	}

}
