package br.com.dankicommerce.controller;

import javax.inject.Inject;

import org.hibernate.annotations.ResultCheckStyle;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;

@Controller
@Path("login")
public class LoginController {
	@Inject Result result;

	@Path("")
	public void oi() {
	}
}
