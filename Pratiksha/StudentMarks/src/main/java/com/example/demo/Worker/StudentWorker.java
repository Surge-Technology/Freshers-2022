package com.example.demo.Worker;

import java.util.Map;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.ZeebeWorker;

@SpringBootApplication
public class StudentWorker {
	
	final RestTemplate rest = new RestTemplate();
	
	@ZeebeWorker(type = "demo", name = "demo")
	public void Task1(final JobClient client,final ActivatedJob job) {
		System.out.println("Worker1 Started");
		
		client.newCompleteCommand(job.getKey()).send().join();
		System.out.println("Worker1 ended");
	}
	
	@ZeebeWorker(type="DistinctionClass",name="DistinctionClass")
	public void distinctClass(final JobClient client, final ActivatedJob job) throws Exception {
		System.out.println("DistinctClass worker job is activated");
	Map<String, Object> map = job.getVariablesAsMap();
	System.out.println("DistinctClass:"+map);
	client.newCompleteCommand(job.getKey()).variables(map).send().join();
		
	}
	@ZeebeWorker(type="FirstClass",name="FirstClass")
	public void firstClass(final JobClient client, final ActivatedJob job) throws Exception {
		System.out.println("FirstClass worker job is activated");
		Map<String,Object> map=job.getVariablesAsMap();
		System.out.println("FirstClass:"+map);
		client.newCompleteCommand(job.getKey()).variables(map).send().join();
	}
	@ZeebeWorker(type="PassClass",name="PassClass")
	public void passClass(final JobClient client, final ActivatedJob job) throws Exception {
		System.out.println("PassClass worker job is activated");
		Map<String,Object> map=job.getVariablesAsMap();
		System.out.println("PassClass:"+map);
		client.newCompleteCommand(job.getKey()).variables(map).send().join();
	}
	
	@ZeebeWorker(type = "FailClass", name = "FailClass")
	  public void failClass(final JobClient client, final ActivatedJob job) throws Exception {
		System.out.println("FailClass worker job is activated");
	    Map<String, Object> map=job.getVariablesAsMap();
		System.out.println("FailClass:"+map);
	    client.newCompleteCommand(job.getKey()).variables(map).send().join();

	  }

}
