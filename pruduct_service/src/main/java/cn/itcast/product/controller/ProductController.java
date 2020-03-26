package cn.itcast.product.controller;

import cn.itcast.product.entity.Product;
import cn.itcast.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @Value("${server.port}")
    private String portt;

    @Value("${spring.cloud.client.ip-address}") //spring cloud 自动的获取当前应用的ip地址
    private String ip;


    @GetMapping("/{id}")
    public Product selectById(@PathVariable("id") Long targetId) {
        Product productt = productService.findById(targetId);
        Product old_product = new Product();
        productt.setProductName(ip+":"+portt);
        return productt;
    }



}
