package com.web.demo.JpaRepository;

import com.web.demo.Entity.Recommends;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecommendsRepository extends JpaRepository<Recommends, Long> {
    // today 필드를 기준으로 내림차순 정렬
    List<Recommends> findAllByOrderByTodayDesc();
}
