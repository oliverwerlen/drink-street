package ch.owe.drinkstreetbackend.controller;

import ch.owe.drinkstreetbackend.dto.ProductDto;
import ch.owe.drinkstreetbackend.model.Product;
import ch.owe.drinkstreetbackend.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
@AllArgsConstructor
@Slf4j
public class ProductController {
    private final ProductService productService;
    private final ModelMapper modelMapper;

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        Product product = modelMapper.map(productDto, Product.class);
        product = productService.createProduct(product);
        return modelMapper.map(product, ProductDto.class);
    }
}
