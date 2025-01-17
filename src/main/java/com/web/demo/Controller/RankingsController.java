package com.web.demo.Controller;

import com.web.demo.JpaRepository.RankingsRepository;
import com.web.demo.Entity.Rankings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RankingsController {

    @Autowired
    private RankingsRepository rankingsRepository;  // RankingsRepository 사용

    // "/rank" URL 요청을 처리하는 메서드 (JSON 반환)
    @GetMapping("/rank")
    public List<Rankings> getRankingData() {
        // rankings 데이터를 순위 내림차순으로 가져옴
        return rankingsRepository.findAllByOrderByRankingAsc();
    }
}
