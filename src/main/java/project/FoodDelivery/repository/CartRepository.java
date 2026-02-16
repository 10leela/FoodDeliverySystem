package project.FoodDelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import project.FoodDelivery.model.Cart;
import project.FoodDelivery.model.UserDtls;

import jakarta.transaction.Transactional;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    public Cart findByProductIdAndUserId(Integer productId, Integer userId);

    public Integer countByUserId(Integer userId);

    public List<Cart> findByUserId(Integer userId);

    @Transactional
    @Modifying
    public void deleteByUser(UserDtls user);

}