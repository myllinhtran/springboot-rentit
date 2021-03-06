package com.rentit.rest;

import com.rentit.model.RentedProduct;
import com.rentit.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;


@RestController
@RequestMapping(path = "/api/v1")
@CrossOrigin(origins = "http://localhost:3000")
public class RentedProductController {

    @Autowired
    private PlatformService platformService;

    @GetMapping(path = "/rented-products")
    public @ResponseBody Iterable<RentedProduct> getRentedProducts() {
        return platformService.findAllRentedProducts();
    }

    @GetMapping(path = "/rented-products/{id}")
    public @ResponseBody
    RentedProduct getRentedProduct(@PathVariable("id") int id) {
        return platformService.findRentedProductById(id);
    }

    @GetMapping(path = "/accounts/{id}/renting-products")
    public @ResponseBody
    Collection<RentedProduct> getRentedProductByRenter(@PathVariable("id") int id) {
        return platformService.findRentedProductByRenter(id);
    }

    @GetMapping(path = "/accounts/{id}/rented-products")
    public @ResponseBody
    Collection<RentedProduct> getRentedProductByRentee(@PathVariable("id") int id) {
        return platformService.findRentedProductByRentee(id);
    }

    @DeleteMapping(path = "/rented-products/{id}")
    public void deleteRentedProductById(@PathVariable("id") int id) {
        platformService.removeRentedProduct(id);
    }

    @GetMapping(path = "/accounts/rented-products")
    public @ResponseBody RentedProduct getRenterByProduct(@RequestParam int productId) {
        return platformService.findRenterByProduct(productId);
    }
}
