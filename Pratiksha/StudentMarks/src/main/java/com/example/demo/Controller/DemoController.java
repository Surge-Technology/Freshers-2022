package com.example.demo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.camunda.zeebe.client.ZeebeClient;
import io.camunda.zeebe.client.api.response.ProcessInstanceResult;

@RestController
public class DemoController {
	
	@Autowired
	ZeebeClient client;
	
	@PostMapping("/start")
	public String demo() {
		System.out.println("Starting the flow");
		//Map<String,Object> map = new HashMap<>();
		ProcessInstanceResult workflowInstanceResult= (ProcessInstanceResult) client.newCreateInstanceCommand().bpmnProcessId("services").latestVersion().variables("").send().join();
	
		return "started successfully";
		
	}
	
	@PostMapping("/demo/{abc}")
	public String demo(@PathVariable Integer abc) {
		System.out.println("marks:"+abc);
		Map<String,Object> map = new HashMap<>();
		if(abc>75)
		{
		map.put("type", "DistinctionClass");
		System.out.println(map);
		}
		else if (abc>60 && abc<=75)
		{
			map.put("type", "FirstClass");
			System.out.println(map);
		}
		else if (abc>=35 && abc<=60)
		{
			map.put("type", "PassClass");
			System.out.println(map);
		}
		else
		{
			map.put("type", "FailClass");
			System.out.println(map);
		}
		ProcessInstanceResult workflowInstanceResult = client.newCreateInstanceCommand().bpmnProcessId("services").latestVersion().variables(map).withResult().send().join();
		return null;
		
	}

}
