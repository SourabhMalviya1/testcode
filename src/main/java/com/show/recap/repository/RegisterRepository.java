package com.show.recap.repository;

import com.show.recap.dto.JoinWishlist;
import com.show.recap.entity.SingUp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<SingUp,Long> {
}
