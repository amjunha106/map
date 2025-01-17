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

    // 순위별로 정렬하여 모든 랭킹 데이터를 반환
    public List<Rankings> getAllRankings() {
        return rankingsRepository.findAllByOrderByRankingAsc(); // 순위 오름차순 정렬
    }
}
