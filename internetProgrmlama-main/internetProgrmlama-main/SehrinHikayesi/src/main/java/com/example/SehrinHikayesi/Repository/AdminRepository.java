package com.example.SehrinHikayesi.Repository;

import com.example.SehrinHikayesi.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Admin findByAdminEmail(String adminEmail);
}
