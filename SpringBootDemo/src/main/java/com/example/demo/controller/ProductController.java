//package com.example.demo.controller;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.demo.dao.ProductDao;
//import com.example.demo.model.Product;
//
//@RestController
//public class ProductController {
//	
//	@Autowired
//	ProductDao dao;
//	@PostMapping(path="/createProduct")
////	public Product createProduct(@RequestBody Product Product)
////	{
////		//return dao.addProduct(Product);
////	}
//
//	@GetMapping(path = "/getAllProduct")
//	public List<Product> getAllProduct()
//	{
//	return 	dao.getAllProduct();
//	}
//	@GetMapping(path = "/getproductById/{pno}")
//	public Optional<Product> getProductByNumber(@PathVariable int pno) {
//		
//		return dao.getProductByNumber(pno);
//	}
//	
//	@GetMapping(path = "/getPriceByName/{pname}")
//	public String getPriceByName(@PathVariable String pname) {
//		double p=0.0;
//		p=dao.getPriceByName(pname);
//		if(p!=0.0)
//		return Double.toString(p);
//		else
//			return "product doesnt exist";
//	
//	
//	
//	
//	
//	
//	
//	
//	
//}
//}
