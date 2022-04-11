//package com.example.demo.dao;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.Exception.BookCreationException;
//import com.example.demo.Exception.ProductCreationException;
//import com.example.demo.model.Book;
//import com.example.demo.model.Product;
//
//import com.example.demo.repository.ProductRepository;
//import com.example.demo.service.ProductService;
//
//
//@Service
//public class ProductDao implements  ProductService{
//	@Autowired
//	ProductRepository repos;
//	@Override
//	public Product addProduct(Product Product) throws ProductCreationException {
//		if(repos.existsById(Product.getProductId())){
//			throw new ProductCreationException("Product id is available");
//		}
//		return repos.save(Product);
//	}
//
//	@Override
//	public List<Product> getAllProduct() {
//		List<Product> listOfprod=	repos.findAll();
//		return listOfprod;
//	}
//	@Override
//	public List<Product> getAllProductSorted(int pagestart, int pageEnd, String sortBy) {
//	
//		Pageable paging = PageRequest.of(pagestart, pageEnd, Sort.by(sortBy).ascending());
//		 
//        Page<Product> pagedResult = repos.findAll(paging);
//         
//        if(pagedResult.hasContent()) {
//            return pagedResult.getContent();
//        } else {
//            return new ArrayList<Product>();
//        }
//      
//	}
//	@Override
//	public   List<Product> sortName()
//    {
//    	Sort sort=Sort.by("productName");
//    	return (List<Product>) repos.findAll(sort);
//    }
//
//	@Override
//	public double getPriceByName(String productName) {
//		double price=repos.getPriceByName(productName);
//		return price;
//	}
//
//	@Override
//	public Optional<Product> getProductByNumber(int productNumber) {
//		
//		return repos.findById(productNumber);
//	}
//
//}
