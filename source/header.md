# 개요

본 문서는 mapi와 APP간 응용프로그램개발 및 연동에 필요한 데이터구조와 기능에 대한 정보를 제공한다.

## <span id="api-header-for-a-url">접속URL</span>

| Zone  | URL |
| --- | --- |
| 개발  | http://dev-m.apps.ssg.com |
| QA | http://qa-m.apps.ssg.com |
| STG  | http://stg-m.apps.ssg.com |
| 운영  | http://m.apps.ssg.com  |

## <span id="api-header-for-a-submenu-request">Request Headers </span>

| Header Name | Value | Descritpion |
|---|---|---|
| Content-Type | application/json; charset=utf-8 | - |

## <span id="api-header-for-a-submenu-response">Response Headers </span>
| Header Name | Value | Descritpion |
|---|---|---|
| Content-Type | application/json; charset=utf-8 | - |

## <span id="api-header-for-a-submenu-reqjson">Request Json Format </span>

json포맷은 크게 공통파라미터 부분인 common과 API에 종속된 params로 구성되며, common부분의 매개변수 값은 고정이다.

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
| goItemDetailYn | 상품상세페이지 이동여부 |
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
| uItemSamePrcYn | 단품의 가격이 동일한지 여부 |
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
| frebieYn    | 사은품여부 |
| zoomImgUrls | 큰이미지 목록, 통합앱에서 사용하지 않으며, 이마트앱에서만 사용 |
| benefitGrp1 | [혜택목록1](#api-header-for-a-submenu-benefitgpr) |
| benefitGrp2 | [혜택목록2](#api-header-for-a-submenu-benefitgpr) |
| benefitGrp3 | [혜택목록3](#api-header-for-a-submenu-benefitgpr) |
| benefitGrp4 | [혜택목록4](#api-header-for-a-submenu-benefitgpr) |

## <span id="api-header-for-a-submenu-benefitgpr">혜택목록 </span>
혜택목록1 - 앱에서는 type 값을 이용해서 혜택 이미지를 보여준다.
| type | txt | description |
| --- | --- | --- |
|A0| 에누리 ||
|B0| 세일||
|C0| 쿠폰포함|
|10| N+1||
|11|2입기획||
|60|다다익선||
|30|사은품||

혜택목록2 - 앱에서는 type 값을 이용해서 혜택 이미지를 보여준다.
| type | txt | description |
| --- | --- | --- |
|A0| 에누리 ||

> https://help.github.com/articles/basic-writing-and-formatting-syntax/#headings
> https://help.github.com/articles/organizing-information-with-tables/