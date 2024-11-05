package com.example.demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    // สามารถเพิ่ม query method ได้ที่นี่หากจำเป็น
}

