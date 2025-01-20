package com.web.demo.Service;

import com.web.demo.Entity.Recommends;
import com.web.demo.JpaRepository.RecommendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RecommendsService {

    @Autowired
    private RecommendsRepository recommendsRepository;

    // 최신 날짜 순으로 추천 리스트를 가져오는 메서드
    public List<Recommends> getLatestRecommends() {
        return recommendsRepository.findAllByOrderByTodayDesc();
    }

}
