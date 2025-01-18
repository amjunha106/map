package com.web.demo.Service;

import com.web.demo.Entity.Rankings;
import com.web.demo.JpaRepository.RankingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankingsService {

    @Autowired
    private RankingsRepository rankingsRepository;

    // 모든 랭킹을 오름차순으로 반환
    public List<Rankings> getRankingAsc() {
        return rankingsRepository.findAllByOrderByRankingAsc();
    }

    // 특정 지역에 대한 랭킹을 오름차순으로 반환
    public List<Rankings> getLocationRankingAsc(String location) {
        return rankingsRepository.findBylocationOrderByRankingAsc(location);
    }
}
