<h1>돈슐랭가이드</h1>
<img src="/images/image1.png" alt="Image">
<br>
<h1>소개 및 개요</h1>
프로젝트 기간 : 2025-01-06 ~ 2025-01-20<br>
인원 : 개인<br>
주제 : 맛집소개사이트 만들기<br>
사용언어 : JAVA, JAVASCRIPT 
<br>

<details>
  <summary>프로젝트 구조</summary>

  <pre>
C:.
│  .gitignore
│  build.gradle
│  gradlew
│  gradlew.bat
│  README.md
│  settings.gradle
│
├─.gradle
│  │  file-system.probe
│  │
│  ├─8.10
│  │  │  gc.properties
│  │  │
│  │  ├─checksums
│  │  │      checksums.lock
│  │  │      md5-checksums.bin
│  │  │      sha1-checksums.bin
│  │  │
│  │  ├─dependencies-accessors
│  │  │      gc.properties
│  │  │
│  │  ├─executionHistory
│  │  │      executionHistory.bin
│  │  │      executionHistory.lock
│  │  │
│  │  ├─expanded
│  │  ├─fileChanges
│  │  │      last-build.bin
│  │  │
│  │  ├─fileHashes
│  │  │      fileHashes.bin
│  │  │      fileHashes.lock
│  │  │      resourceHashesCache.bin
│  │  │
│  │  └─vcsMetadata
│  ├─buildOutputCleanup
│  │      buildOutputCleanup.lock
│  │      cache.properties
│  │      outputFiles.bin
│  │
│  └─vcs-1
│          gc.properties
│
├─.idea
│      .gitignore
│      compiler.xml
│      dbnavigator.xml
│      gradle.xml
│      misc.xml
│      vcs.xml
│      workspace.xml
│
├─build
│  │  bootRunMainClassName
│  │
│  ├─classes
│  │  └─java
│  │      └─main
│  │          └─com
│  │              └─web
│  │                  └─demo
│  │                          HomeController.class
│  │                          Map1Application.class
│  │
│  ├─generated
│  │  └─sources
│  │      ├─annotationProcessor
│  │      │  └─java
│  │      │      └─main
│  │      └─headers
│  │          └─java
│  │              └─main
│  ├─resources
│  │  └─main
│  │      │  application.properties
│  │      │
│  │      ├─static
│  │      │  │  test.html
│  │      │  │
│  │      │  └─images
│  │      │          image1.png
│  │      │
│  │      └─templates
│  │              Home.html
│  │
│  └─tmp
│      └─compileJava
│          │  previous-compilation-data.bin
│          │
│          └─compileTransaction
│              ├─backup-dir
│              └─stash-dir
│                      HomeController.class.uniqueId0
│
├─gradle
│  └─wrapper
│          gradle-wrapper.jar
│          gradle-wrapper.properties
│
├─out
│  └─production
│      ├─classes
│      │  └─com
│      │      └─web
│      │          └─demo
│      │              │  Map1Application.class
│      │              │
│      │              ├─Controller
│      │              │      HomeController.class
│      │              │      RankingsController.class
│      │              │      RecommendsController.class
│      │              │
│      │              ├─Entity
│      │              │      Rankings.class
│      │              │      Recommends.class
│      │              │
│      │              ├─JpaRepository
│      │              │      RankingsRepository.class
│      │              │      RecommendsRepository.class
│      │              │
│      │              └─Service
│      │                      RankingsService.class
│      │                      RecommendsService.class
│      │
│      └─resources
│          │  application.properties
│          │
│          ├─static
│          │  │  test.html
│          │  │
│          │  ├─css
│          │  │      style.css
│          │  │
│          │  └─images
│          │          image1.png
│          │          image10.jpg
│          │          image11.jpg
│          │          image2.jpg
│          │          image3.jpg
│          │          image4.jpg
│          │          image5.jpg
│          │          image6.jpg
│          │          image7.jpg
│          │          image8.jpg
│          │          image9.jpg
│          │
│          └─templates
│                  Home.html
│
└─src
    ├─main
    │  ├─java
    │  │  └─com
    │  │      └─web
    │  │          └─demo
    │  │              │  Map1Application.java
    │  │              │
    │  │              ├─Controller
    │  │              │      HomeController.java
    │  │              │      RankingsController.java
    │  │              │      RecommendsController.java
    │  │              │
    │  │              ├─Entity
    │  │              │      Rankings.java
    │  │              │      Recommends.java
    │  │              │
    │  │              ├─JpaRepository
    │  │              │      RankingsRepository.java
    │  │              │      RecommendsRepository.java
    │  │              │
    │  │              └─Service
    │  │                      RankingsService.java
    │  │                      RecommendsService.java
    │  │
    │  └─resources
    │      │  application.properties
    │      │
    │      ├─static
    │      │  │  test.html
    │      │  │
    │      │  ├─css
    │      │  │      style.css
    │      │  │
    │      │  └─images
    │      │          image1.png
    │      │          image10.jpg
    │      │          image11.jpg
    │      │          image2.jpg
    │      │          image3.jpg
    │      │          image4.jpg
    │      │          image5.jpg
    │      │          image6.jpg
    │      │          image7.jpg
    │      │          image8.jpg
    │      │          image9.jpg
    │      │
    │      └─templates
    │          │  Home.html
    │          │
    │          └─@{
    └─test
        ├─java
        └─resources
  </pre>
</details>

<br>

<br/>
<h1>프로젝트 기술스택</h1>
<h2>프론트엔드 (Front-end)</h2>
<ul>
  <li>Thymeleaf : Spring Mvc패턴의 view단으로 사용하기위해 템플릿 역할로 사용하며 html코드를 동적으로 렌더링하기위해 사용하였습니다.</li>
  <li>Javascript : 메인페이지의 이미지 슬라이드/매장순위(지역별)/추천매장(조회/등록)을 위해 사용하였습니다.</li>
  <li>CSS : 웹 페이지의 스타일과 레이아웃을 정하기 위해 사용하였습니다.</li>
</ul>

<h2>백엔드 (Back-end)</h2>
<ul>
  <li>java(SpringBoot사용) : Restful Api를 구축하기 위해 사용하였습니다.</li>
</ul>

<h2>데이터베이스 (Mysql)</h2>
<ul>
  <li>Mysql : 매장순위와 추천매장의 데이터를 저장하고 조회하기위해 사용하였습니다.</li>
</ul>
<br/>
<h1>프로젝트 관리도구</h1>
<h2>파일 관리 (File Management)</h2>
<ul>
  <li>GitHub : 코드를 새로 작성하거나 업데이트하거나 코드가 꼬여서 백업이 필요할 때 사용하였습니다.</li>
</ul>
<br/>
<h1>1. 메인페이지</h1>
<h3>이미지 슬라이드를 메인으로 타이틀과 사이드바</h3>
<img src="/images/image2.gif" width="950px" alt="Image">
<img src="/images/image2-1.png" width="950px" alt="Image">

<h1>2. 사이드바 메뉴</h1>
<h3>매장순위 조회</h3>
<img src="/images/image3.gif" width="950px" alt="Image">
<img src="/images/image3-1" width="950px" alt="Image">

<h3>전체 랭킹의 데이터를 지역별로 조회</h3>
<img src="/images/image4.gif" width="950px" alt="Image">
<img src="/images/image4-1.png" width="950px" alt="Image">
<img src="/images/image4-2.png" width="950px" alt="Image">

<h3>돈슐랭가이드 제작자의 돈까스철학을 파악할 수 있는 페이지</h3>
<img src="/images/image5.png" width="950px" alt="Image">

<h3>추천매장 등록</h3>
<img src="/images/image6.gif" width="950px" alt="Image">
<img src="/images/image6-1.png" width="950px" alt="Image">
<img src="/images/image6-2.png" width="950px" alt="Image">
