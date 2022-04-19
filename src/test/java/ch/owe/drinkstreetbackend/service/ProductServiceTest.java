package ch.owe.drinkstreetbackend.service;


import ch.owe.drinkstreetbackend.model.Product;
import ch.owe.drinkstreetbackend.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    ProductRepository productRepository;

    @Test
    public void givenProduct_whenSaveProduct_thenReturnProduct(){
        Product product = Product.builder().id(1l).name("Demo").basicPrice(1.2).build();
        given(productRepository.save(product)).willReturn(product);

        Product productSaved = productRepository.save(product);
        assertThat(productSaved).isNotNull();
    }

}
