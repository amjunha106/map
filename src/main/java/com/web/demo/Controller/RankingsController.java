package com.web.demo.Controller;

import com.web.demo.JpaRepository.RankingsRepository;
import com.web.demo.Entity.Rankings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RankingsController {

    @Autowired
    private RankingsRepository rankingsRepository;  // RankingsRepository 사용

    // "/KatsuGuide" URL 요청을 처리하는 메서드
    @GetMapping("/rank")
    public String getRankingPage(Model model) {
        // rankings 데이터를 순위 내림차순으로 가져옴
        List<Rankings> rankings = rankingsRepository.findAllByOrderByRankingDesc();

        // model에 rankings 데이터를 추가하여 템플릿에서 사용할 수 있도록 함
        model.addAttribute("rankings", rankings);

        // "rankingPage"라는 이름의 Thymeleaf 템플릿을 반환 (HTML 파일 이름)
        return "Home";  // rankingPage.html (템플릿 이름)
    }
}

