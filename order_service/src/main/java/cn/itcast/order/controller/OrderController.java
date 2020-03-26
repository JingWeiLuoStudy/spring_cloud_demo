package cn.itcast.order.controller;

import cn.itcast.order.client.ProductClient;
import cn.itcast.order.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private DiscoveryClient discoveryClient;

    /**
     * 参数:商品id
     *  通过订单系统,调用商品服务根据id查询商品信息
     *      1.需要配置商品对象
     *      2.需要调用商品服务
     *  使用java中的urlconnection,httpclient,okhttp
     */
//    @GetMapping("/buy/{id}")
//	public Product findById(@PathVariable Long id) {
		//调用discoveryClient方法
		//已调用服务名称获取所有的元数据
//		List<ServiceInstance> instances = discoveryClient.getInstances("product-service");
		//获取唯一的一个元数据
//		ServiceInstance instance = instances.get(0);
		//根据元数据中的主机地址和端口号拼接请求微服务的URL
//		Product product = null;
		//如何调用商品服务?
//		product = restTemplate.getForObject("http://"+"product-service"+"/product/1",Product.class);
//        product = restTemplate.getForObject("http://127.0.0.1:9001/product/1",Product.class);
//		return product;
//	}

	@Autowired(required = false)
	ProductClient productClient;

	@GetMapping("/buy/{id}")
	public Product findById(@PathVariable Long id) {
		Product product = null;
		//如何调用商品服务?
		product = productClient.findById(id);
		return product;
	}


}
