package com.app.stepdefenition;

import com.app.base.BaseClass;
import com.app.execution.Execution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenitionclass extends Execution {
	@Given("launch the browser")
	public void launch_the_browser() {
	  browser();
	}
	@Given("load the url")
	public void load_the_url() {
	   url();
	}
	@When("click the equipment")
	public void click_the_equipment() {
	  equipment();
	}
	@Then("get loder")
	public void get_loder() {
	   loder();
	}

	@When("click the alert")
	public void click_the_alert() {
	    alert();
	}


}
