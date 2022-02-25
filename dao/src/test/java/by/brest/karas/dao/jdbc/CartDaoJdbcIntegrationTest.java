package by.brest.karas.dao.jdbc;

import by.brest.karas.model.CartRecord;
import by.brest.karas.model.dto.Cart;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath*:test-db.xml", "classpath*:test-dao.xml", "classpath*:dao.xml"})
class CartDaoJdbcIntegrationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CartDaoJdbcIntegrationTest.class);
    @Autowired
    private CartDaoJdbc cartDaoJdbc;

    @Test
    public void findCartByCustomerIdIntegrationTest() {

        Cart cart = cartDaoJdbc.findCartByCustomerId(1);
        assertNotNull(cart);
        assertNotNull(cart.getCartRecords());
        assertTrue(cart.getCustomerId() == 1);
        assertTrue(cart.getCartRecords().size() == 2);
        assertTrue(cart.getCartSumTotal().equals(BigDecimal.valueOf(18.87).setScale(2)));
    }
}