package com.web.demo.JpaRepository;

import com.web.demo.Entity.Rankings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RankingsRepository extends JpaRepository<Rankings, Long> {
    List<Rankings> findAllByOrderByRankingDesc();
}
