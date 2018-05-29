# 개요

본 문서는 mapi와 APP간 응용프로그램개발 및 연동에 필요한 데이터구조와 기능에 대한 정보를 제공한다.
<br />
<br />

## <span id="api-header-for-a-change">Versioning 규약</span>
1) params내부의 apiVersion 값이 변경되는 경우에만 @apiVersion 을 변경한다.
2) apiVersion 값 변경없이 내용이 변경되는 경우는 [변경사항](#api-header-for-a-change) 영역에 그 내용을 기재한다.
3) apiVersion 규약은 [Semantic Versioning Specification(SemVer)](http://semver.org/)을 따르는 것을 원칙으로 한다.
<br />
<br />

## <span id="api-header-for-a-url">접속URL</span>
| Zone  | URL |
| --- | --- |
| 개발  | http://dev-m.apps.ssg.com |
| QA | http://qa-m.apps.ssg.com |
| STG  | http://stg-m.apps.ssg.com |
| 운영  | http://m.apps.ssg.com  |
<br />
<br />

## <span id="api-header-for-a-submenu-request">Request Headers </span>
| Header Name | Value | Descritpion |
|---|---|---|
| Content-Type | application/json; charset=utf-8 | - |
<br />
<br />

## <span id="api-header-for-a-submenu-response">Response Headers </span>
| Header Name | Value | Descritpion |
|---|---|---|
| Content-Type | application/json; charset=utf-8 | - |
<br />
<br />

## <span id="api-header-for-a-submenu-reqjson">Request Json Format </span>
request json포맷은 크게 공통파라미터 부분인 common과 API에 종속된 params로 구성되며, common부분의 매개변수명은 고정이다.

| 매개변수명 | 설명 | 필수/선택 | Descritpion |
| --- |  ---  |  ---  |  ---  |
|ts| Current time stamp | 필 | yyyyMMddHHmmss|
| mobil_app_no | 모바일앱구분코드 | 필 | - |
| apl_ver | 앱버전| 필 | - |
| os_cd | OS코드 | 필 | - |

JSON 예제

    {
        "common": {
          "ts": "20170101235959",
          "mobil_app_no": "1",
          "apl_ver": "1.3",
          "os_cd": "30"
        },
        "params": {
          "imgSearchYn": "Y",
          "pagingYn": "Y"
        }
    }
<br />
<br />

## <span id="api-header-for-a-submenu-resjson">Response Json Format </span>
json 포맷은 크게 응답코드(res_cod), 응답메시지(res_message), DATA(data) 세 부분으로 구성된다.

JSON 예제

    {
        "res_code":"200",
        "res_message":"성공",
        "data": {
          "itemList":[]
        }
    }
<br />
<br />

## <span id="api-header-for-a-submenu-rescode">res_code </span>
| 코드값 | 코드내용 |
| --- | --- |
| 200 | 성공|
| 400 | 잘못된 접근입니다.|
| 401 | 요청 파라미터가 없습니다. |
| 402 | 요청 파라미터 유효성 검사 실패.|
| 403 | 로그인이 필요한 서비스입니다. |
| 404 | 실패 |
| 450 | CART API 응답값 오류입니다.|
| 500| 서버 오류입니다.|
| 501| CART API 연동 오류입니다.|
| 502 | 클립등록처리가 정상적으로 종료되지 않았습니다.|
| 503 | 등록가능한 클립개수를 초과하였습니다. |
| 601 | 죄송합니다. 유효하지 않은 기획전 이거나 종료된 기획전입니다.|
| 602 | 올바르지 않은 접근 경로입니다.|
| 900 | 권한이 없습니다.|
| 9000| 서비스 점검중입니다.|
<br />
<br />

## <span id="api-header-for-a-submenu-itemunit">상품유닛 </span>
|key| Description |
|---|---|
| itemId       | 상품ID |
| itemNm       | 상품명 |
| displayPrc   | 표시가격 |
| strikeOutPrc | 삭선으로 표시할 가격 |
| minOnetOrdPsblQty | 최소구매수량 |
| maxOnetOrdPsblQty | 최대구매수량 |
| soldOutYn | 일시품절여부 |
| stoppedSellingYn | 품절여부 |
| siteNo | 상품의 사이트번호 |
| siteNm | 몰표기값 |
| salestrNo | 영업점번호 |
| salestrNm | 영업점명 |
| sellpntNm | 셀링포인트 |
| brandNm | 브랜드명 |
| goItemDetailYn | 장바구니 담기 시도시 상품상세로 이동해야 하는지 여부. 단, 값이 Y더라도 cartPsblType값이 있는 경우에는 예외적으로 장바구니 호출이 가능하며, 이 경우에는 장바구니 api 호출시 cartPsblType을 같이 전달해야 한다.  |
| msgWhenGoToItemDetail | 상품상세페이지 이동시 보여줄 메시지|
| attnTgtIdnfNo1 | 관심대상구분코드1(클립용) |
| attnTgtIdnfNo2 | 관심대상구분코드2(클립용) |
| attnDivCd | 관심구분코드(클립용) |
| needAdultCertification | 성인인증필요여부 |
| itemLnkd | 상품상세페이지 URL |
| itemImgUrl | 상품이미지 경로 |
| planDt |  입고예정일 (deprecated) |
| dataFileNm | 동영상파일 경로 |
| pickuItemYn | 매직픽업상품여부 |
| qshppPsblYn | 퀵배송가능상품여부 |
| mltSellQty | 배수판매수량 |
| ~~uItemSamePrcYn~~ | Deprecated, 단품의 가격이 동일한지 여부 |
| itemOrdQty | 상품판매수량 |
| itemOrdQtyType | 상품판매수량유형 |
| tildeDispYn | 가격에 ~표시 여부 |
| recompPoint | 상품평점 |
| recomRegCnt | 상품평 개수  |
| sellUnitPrc | 단위판매가격 |
| sellCapaUnitNmWithUnitCapa | 단위판매용량  |
| replaceBtnDispYn | 대체상품버튼노출여부 |
| arrivalNotiBtnDispYn | 입고알림버튼노출여부 |
| advertAcctId | |
| advertBidId |  |
| cartPsblType    | 예외적 장바구니 담기 가능유형 코드 |
| zoomImgUrls | 큰이미지 목록, 통합앱에서 사용하지 않으며, 이마트앱에서만 사용 |
| ~~itemTagNmList~~ | Deprecated, tag목록 |
| itemTagNmAndItemCnt | tag목록정보([{"txt":"tag1", "cnt":"3"}, {"txt":"tag2", "cnt":"1"}]) |
| benefitGrp1 | [혜택목록1](#api-header-for-a-submenu-benefitgpr) |
| benefitGrp2 | [혜택목록2](#api-header-for-a-submenu-benefitgpr) |
| benefitGrp3 | [혜택목록3](#api-header-for-a-submenu-benefitgpr) |
| benefitGrp4 | [혜택목록4](#api-header-for-a-submenu-benefitgpr) |
| imgSrchPsblYn | 이미지 검색 가능 여부 |
| sellprcDcrtExpsrYn |판매가할인율노출여부 (오반장 유닛 사용) |
| titleImgBanrFileNm | 제목이미지배너파일명 (오반장 유닛 사용) |
| titleImgBanrRplcTextNm | 제목이미지배너대체텍스트명 (오반장 유닛 사용) |
| thmnlImgBanrFileNm | 썸네일이미지배너파일명 (오반장 유닛 사용) |
| thmnlImgBanrRplcTextNm | 썸네일이미지배너대체텍스트명 (오반장 유닛 사용) |
| salestrItemOrdQty | 영업점상품주문수량(오반장 유닛 사용) |
| itemExistsYn | 상품존재여부 (오반장 유닛 사용) |
| iconTagList | 아이콘대상리스트 (오반장 유닛 사용) |
| titleShadUseYn | 제목음영사용여부 (오반장 유닛 사용) |
| usablInvQtyDispYn | 가용재고수량노출여부 (오반장 유닛 사용) |
| itemSellStateTypeCd | 상품판매상태유형코드 (오반장 유닛 사용) |
| mdMsgCntt | MD메시지내용 (오반장 유닛 사용) |
| mdMsgCntt2 | MD메시지내용2 (오반장 유닛 사용) |
| dispStrtDts |전시시작일시 (오반장/해바 유닛 사용) |
| dispEndDts |전시종료일시 (오반장/해바 유닛 사용) |
| maiTitleNm1 | 메인타이틀명1 (오반장/해바 유닛 사용) |
| maiTitleNm2 | 메인타이틀명2 (오반장/해바 유닛 사용) |
| subtitlNm1 | 서브타이틀명1 (오반장/해바 유닛 사용) |
| subtitlNm2 | 서브타이틀명2 (오반장/해바 유닛 사용) |
| iconTagLst | 아이콘대상목록 (오반장/해바 유닛 사용) |
| usablInvQty | 가용재고수량 (오반장/해바 유닛 사용) |

<br />
<br />

## <span id="api-header-for-a-submenu-benefitgpr">혜택목록 </span>
혜택목록1 - 앱에서는 type 값을 이용해서 혜택 이미지를 보여준다.<br />
예) 에누리 : /static/ui/app/6001/benefit/A0.png
| type | txt | description |
| --- | --- | --- |
|A0| 에누리 ||
|B0| 세일||
|C0| 쿠폰포함|
|10| N+1||
|11|2입기획||
|30|사은품||
|60|다다익선||
|61|One Free||

혜택목록2 - 앱에서는 type 값을 이용해서 혜택 이미지를 보여준다.<br />
예) 명절 : /static/ui/app/6001/icon/120.png
| type | txt | description |
| --- | --- | --- |
|120| 명절1 ||
|130| 명절2 ||
|90| 쓱배송 | 이몰 점포예약이였으나 쓱배송으로 통일됨|
|91| 쓱배송 | 트레이더스 점포예약이였으나 쓱배송으로 통일됨|
|100| 쓱배송 | 예약배송이였으나 쓱배송으로 통일됨 |
|110| 점포택배 ||
|270| 점포픽업 ||
|sschoice| 슈퍼샵초이스 ||

혜택목록3 - 텍스트 형태로 노출됨
| type | txt | description |
| --- | --- | --- |
|140| S포인트 ||
|150| S머니 ||
|160| 청구할인 ||
|170| 무이자 ||
|180| 무료배송 ||
|220| 카드할인 ||

혜택목록4
| type | txt | description |
| --- | --- | --- |
|mpickup| 매직픽업 ||
|qshpp| 퀵배송 ||
|ssgcon| 쓱콘 ||
|ssgtalk| 셀러톡 ||
|obanjang| 오반장 ||
|happy| 해피바이러스 | |
<br/>
<br/>

## <span id="api-header-for-a-submenu-commonconrcmpttgt">코너구성대상</span>
| type | key | Description |
| --- | --- | --- |
| 10(상품) | ctgId | 카테고리 ID |
| | cornrId | 코너 ID |
| | title | 배너명 |
| 30(배너) | id | 용도에 맞도록 설정되는 ID |
| | desc | 배너 문구 |
| | lnkdUrl | 배너 링크 |
| | lnkdType | 링크 연결 방법 |
| | imgFileNm | 배너 이미지 |
| | strtDts | 배너 전시 시작일 |
| | endDts | 배너 전시 종료일 |
| | maiTitleNm1 | 메인제목명1 |
| | maiTitleNm2 | 메인제목명2 |
| | subtitlNm1 | 서브제목명1 |
| | subtitlNm2 | 서브제목명2 |
| | iconTgtLst | 아이콘태그리스트 |
| | titleShadUseYn | 제목음영영역 사용여부 |
| | imgWidth | 이미지 가로 사이즈 |
| | imgHeight | 이미지 세로 사이즈 |
| | dispOrdr | 전시순서 |
| | bakgrndColrCdVal | 배너 배경색상코드 |
| | iconTgtList | 아이콘 태그 정보 |
| 70(기획전) | title | 기획전 타이틀 |
| | planShopId | 기획전 ID |
| | strtDts | 기획전 시작일 |
| | endDts | 기획전 종료일 |
| | themeList | 기획전 구성 테마 리스트 |
| | themeList.themeId | 기획전 구성 테마 ID |
| | themeList.themeNm | 기획전 구성 테마 명 |
| 60(동영상) | title | 동영상명 |
| | dataFileNm | 동영상 경로 |
| | imgFileNm | 배너 이미지 |
| | imgWidth | 이미지 가로 사이즈 |
| | imgHeight | 이미지 세로 사이즈 |
| | endDts | 동영상 종료일 |
| | dispOrdr | 전시순서 |
| 130(레시피) | recipeNm | 레시피 명 |
| | imgFileNm | 배너 이미지 |
| | imgWidth | 이미지 가로 사이즈 |
| | imgHeight | 이미지 세로 사이즈 |
| | lnkdUrl | 배너 링크 |
| | lnkdType | 링크 연결 방법 |

## <span id="api-header-for-a-submenu-commonconrbanr">코너배너유닛</span>
|key| Description |
|---|---|
|id| id값 ||
|title| 제목 ||
|desc | 문구 ||
|lnkdUrl | 링크 Url ||
|lnkdType | 링크 연결 방법 ||
|imgFileNm | 이미지 URl ||
|strtDts | 배너전시시작시간 ||
|endDts | 배너전시종료시간 ||
|maiTitleNm1 | 메인제목명1 ||
|maiTitleNm2 | 메인제목명2 ||
|subTitleNm1 | 서브제목명1 ||
|subTitleNm2 | 서브제목명2 ||
|iconTgtLst | 아이콘리스트(String형) ||
|titleShadUseYn | 제목음영사용여부 ||
|imgWidth | 이미지 넓이 ||
|imgHeight | 이미지 높이 ||
|dispOrdr | 전시 순서 ||
|bakgrndColrCdVal | 배너 배경색상코드 ||
|iconTagList | 아이콘리스트(Array형) ||
|banrRplcTextNm | 대체텍스트명 ||

## <span id="api-header-for-a-submenu-commonconrvod">코너동영상유닛</span>
|key| Description |
|---|---|
|title| 제목 ||
|regTypeCd | 틍록타입코드 10:직접등록, 20:링크등록 ||
|subtlCntt | 자막내용 (미사용) ||
|dataFileNm | 동영상 URL ||
|imgFileNm | 이미지 URL ||
|banrTgtTypeCd | 배너대상타입코드 (미사용) ||
|endDts | 전시종료일시 yyyyMMddHHmmss ||
|imgWidth | 이미지 가로 ||
|imgHeight | 이미지 세로 ||
|dispOrdr | 전시순서 ||
|banrRplcTextNm | 이미지 대체텍스트명 ||

## <span id="api-header-for-a-submenu-clipunit">클립데이터유닛 </span>
|key| Description |
|---|---|
| attnDivCd		| 클립데이터구분(M059) |
| attnDivDtlCd	| 클립데이터상세구분(M067) |
| siteNo		| 대상데이터 기준몰 |
| attnTgtIdnfNo1	| 대상데이터 ID값1 |
| attnTgtIdnfNo2	| 대상데이터 ID값2 - 사용하지 않음 |
| infloSiteNo	| 클립실행대상몰 |

## <span id="api-header-for-a-submenu-clipcodeinfo">클립코드정보 </span>
| attnDivCd(M059) | attnDivDtlCd(M067) | 클립종류 | 비고 |
|---|---|---|---|
| 10 | 10 | 상품(일반) | 상품default |
| 10 | 20 | 상품(단골) | 나의클립에서 변경가능 |
| 15 |    | 상품(그만보기) | 개인화 데이터 영역에서 사용 - 제외대상 |
| 20 |    | 카테고리 | |
| 30 | 30 | 브랜드 | |
| 30 | 31 | 전문관(공식스토어) | |
| 31 |    | 매장사진 | 샤벳전용 |
| 40 |    | 기획전 | |
| 60 |    | 이벤트 | |
| 80 | 80 | 라이프매거진 | 컨텐츠타입default |
| 80 | 81 | 하우디저널 | 하우디전용 |
| 80 | 82 | 오늘의e요리 | 이몰 |
| 80 | 83 | SIV매거진 | SIV전용 |
| 80 | 84 | 샤벳라이브 | 신몰 |
