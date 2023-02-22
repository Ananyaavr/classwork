package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class arraylist{
	@Value("${value.name}")
	String newnameString;
@GetMapping("/arraylist")
public String homepage() {
	return newnameString + " to student list";
}
@GetMapping("/list")
public List<arraylistnew> getList(){
	List<arraylistnew> detailsList=new ArrayList<>();
	detailsList.add(new arraylistnew(1,"AAA",23));
	detailsList.add(new arraylistnew(2,"BBB",24));
	detailsList.add(new arraylistnew(3,"CCC",25));
	return detailsList;
}
}
