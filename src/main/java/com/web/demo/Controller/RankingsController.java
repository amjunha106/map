package com.web.demo.Controller;

import com.web.demo.Entity.Rankings;
import com.web.demo.Service.RankingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RankingsController {

    @Autowired
    private RankingsService rankingsService;  // RankingsService 사용

    // 지역별 랭킹을 반환
    @GetMapping("/rank")
    public List<Rankings> getRankings(@RequestParam(value = "location", required = false) String location) {
        if (location != null) {
            return rankingsService.getLocationRankingAsc(location);  // 지역별 오름차순 랭킹
        } else {
            return rankingsService.getRankingAsc();  // 모든 랭킹 조회
        }
    }
}
