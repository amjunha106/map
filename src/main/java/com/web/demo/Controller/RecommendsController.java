package com.web.demo.Controller;

import com.web.demo.Entity.Recommends;
import com.web.demo.Service.RecommendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class RecommendsController {

    @Autowired
    private RecommendsService recommendsService;

    // 최신 추천 리스트를 반환하는 엔드포인트
    @GetMapping("/recommends")
    public List<Recommends> getRecommends() {
        return recommendsService.getLatestRecommends();
    }

}
