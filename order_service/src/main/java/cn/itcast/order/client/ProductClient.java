package cn.itcast.order.client;

import cn.itcast.order.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "PRODUCT-SERVICE")
public interface ProductClient {


    @GetMapping("/product/{id}")
    public Product findById(@PathVariable("id") Long id);

}
