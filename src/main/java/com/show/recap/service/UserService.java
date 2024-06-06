package com.show.recap.service;

import com.show.recap.dto.JoinWishlist;
import com.show.recap.entity.SingUp;
import com.show.recap.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private RegisterRepository registerRepository;

   public void registerUser(JoinWishlist wishlist){
        SingUp singUp=new SingUp();
        if(wishlist.getEmail()!=null){
            singUp.setEmail(wishlist.getEmail());
        }
        if(wishlist.getPhone()!=null){
            singUp.setPhone(wishlist.getPhone());
        }
        singUp.setNotify(wishlist.isNotify());

        registerRepository.save(singUp);
    }
}
