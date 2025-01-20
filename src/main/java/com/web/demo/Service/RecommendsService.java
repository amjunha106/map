package com.web.demo.Service;

import com.web.demo.Entity.Recommends;
import com.web.demo.JpaRepository.RecommendsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RecommendsService {

    @Autowired
    private RecommendsRepository recommendsRepository;

    // 최신 날짜 순으로 추천 리스트를 가져오는 메서드
    public List<Recommends> getLatestRecommends() {
        return recommendsRepository.findAllByOrderByTodayDesc();
    }

    // 추천 데이터를 저장하는 메서드
    public Recommends saveRecommend(Recommends recommend) {
        return recommendsRepository.save(recommend);  // 추천 데이터를 DB에 저장
    }

}
