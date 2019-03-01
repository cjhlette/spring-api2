package com.lette.product.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private static Logger log = LoggerFactory.getLogger(ProductController.class);

    @RequestMapping(path = "{productId}", method = RequestMethod.GET)
    public String getProductInfo(@PathVariable String productId) {

        log.info("product test");

//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return "[product id = " + productId + " at " + System.currentTimeMillis() + "]";
//        throw new RuntimeException("I/O Exception");
    }

}