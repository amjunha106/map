package com.web.demo.JpaRepository;

import com.web.demo.Entity.Rankings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RankingsRepository extends JpaRepository<Rankings, Long> {
    // 랭킹을 오름차순으로 정렬하여 모두 반환
    List<Rankings> findAllByOrderByRankingAsc();

    // 특정 지역에 대한 랭킹만 오름차순으로 정렬하여 반환
    List<Rankings> findBylocationOrderByRankingAsc(String location);
}
