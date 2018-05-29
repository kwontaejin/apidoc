/**

@api {post} /api/best/small/datas/item.ssg 신세계몰 - 베스트100
@apiVersion 1.0.0
@apiName BestHundredController.getBestSmallDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
신세계몰 베스트100 상품 정보 API

<br>- source : BestHundredController.getBestSmallDatasItem()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String} [dispCtgId] 카테고리ID (null 인경우 전체)
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [itemImgSize] 아이템이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String=true, false} data.hasNext 페이지더보기 유무
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 수
@apiSuccess {Object} data.bestItemList 공통상품유닛 리스트

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/small/datas/dispctg.ssg 신세계몰 - 베스트100 - 대카리스트
@apiVersion 1.0.0
@apiName BestHundredController.getBestSmallDatasDispctg
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
신세계몰 베스트100 대카 리스트 API

<br>- source : BestHundredController.getBestSmallDatasDispctg()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.dispCtgList 대카 리스트
@apiSuccess {String} data.dispCtgList.dispCtgId 전시카테고리ID
@apiSuccess {String} data.dispCtgList.dispCtgNm 전시카테고리명

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/small/datas/category.ssg 신세계몰 - 베스트100 - 대대카리스트
@apiVersion 1.0.0
@apiName BestHundredController.getBestSmallDatasCategory
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
신세계몰 베스트100 대대카 리스트 API

<br>- source : BestHundredController.getBestSmallDatasCategory()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.dispCtgList 대대카 리스트
@apiSuccess {String} data.dispCtgList.dispCtgId 전시카테고리ID
@apiSuccess {String} data.dispCtgList.dispCtgNm 전시카테고리명

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/dept/datas/item/item.ssg 신세계백화점 - 베스트100
@apiVersion 1.0.0
@apiName BestHundredController.getBestDeptDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
신세계백화점 베스트100 상품 정보 API

<br>- source : BestHundredController.getBestDeptDatasItem()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String} [dispCtgId] 카테고리ID (null 인경우 전체)
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [itemImgSize] 아이템이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String=true, false} data.hasNext 페이지더보기 유무
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 수
@apiSuccess {Object} data.bestItemList 공통상품유닛 리스트

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/small/datas/dispctg.ssg 신세계백화점 - 베스트100 - 대카리스트
@apiVersion 1.0.0
@apiName BestHundredController.getBestDeptDatasDisctg
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
신세계백화점 베스트100 대카 리스트 API

<br>- source : BestHundredController.getBestDeptDatasDisctg()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {Object} data.dispCtgList 대카 리스트
@apiSuccess {String} data.dispCtgList.dispCtgId 전시카테고리ID
@apiSuccess {String} data.dispCtgList.dispCtgNm 전시카테고리명

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/ssg/datas/category.ssg SSG - 베스트
@apiVersion 1.0.0
@apiName BestController.getSsgBestMainDatasCategory
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
SSG 베스트 API

<br>- source : BestController.getSsgBestMainDatasCategory()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String} [zoneId="all"] 카테고리존ID
@apiParam {String} [itemImgSize] 아이템이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.dispCtgList 카테고리 리스트
@apiSuccess {String} data.dispCtgList.dispCtgId 전시카테고리ID
@apiSuccess {String} data.dispCtgList.dispCtgNm 전시카테고리명
@apiSuccess {String} data.dispCtgList.dispCtgLvl 전시카테고리레벨
@apiSuccess {List} data.dispCtgList.dispCtgList
@apiSuccess {String} data.dispCtgList.dispCtgList.dispCtgId 전시카테고리ID
@apiSuccess {String} data.dispCtgList.dispCtgList.dispCtgNm 전시카테고리명
@apiSuccess {String} data.dispCtgList.dispCtgList.dispCtgLvl 전시카테고리레벨
@apiSuccess {List} data.itemList 상품 리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/emall/datas/code.ssg 이마트몰 - 베스트 - 카테고리
@apiVersion 1.0.0
@apiName BestController.getMemallBestDispCtgInfo
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
이마트몰 베스트 카테고리 API

<br>- source : BestController.getMemallBestDispCtgInfo()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String="FOOD", "LIFE"} [categoryZoneType="FOOD"] 카테고리존이름

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.dispCtgList 카테고리 리스트
@apiSuccess {String} data.dispCtgList.dispCtgId 전시카테고리ID
@apiSuccess {String} data.dispCtgList.dispCtgNm 전시카테고리명
@apiSuccess {String} data.dispCtgList.dispCtgLvl 전시카테고리레벨
@apiSuccess {List} data.dispCtgList.dispCtgList
@apiSuccess {String} data.dispCtgList.dispCtgList.dispCtgId 전시카테고리ID
@apiSuccess {String} data.dispCtgList.dispCtgList.dispCtgNm 전시카테고리명
@apiSuccess {String} data.dispCtgList.dispCtgList.dispCtgLvl 전시카테고리레벨

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/emall/datas/item.ssg 이마트몰 - 베스트 - 상품
@apiVersion 1.0.0
@apiName BestController.getMemallBestDispCtgItemDatas
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
이마트몰 베스트 상품 API

<br>- source : BestController.getMemallBestDispCtgItemDatas()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String="FOOD", "LIFE"} [categoryZoneType="FOOD"] 카테고리존이름
@apiParam {String} [dispCtgId] 카테고리ID (null 인경우 전체)
@apiParam {String} [itemImgSize] 아이템이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.itemList 상품 리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/emall/datas/item.ssg TV쇼핑 - 베스트
@apiVersion 1.0.0
@apiName BestController.getBestTvDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
TV쇼핑 베스트 API

<br>- source : BestController.getBestTvDatasItem()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String} [page] 페이지번호
@apiParam {String} [pageSize] 페이지사이즈
@apiParam {String} [itemImgSize] 아이템이미지사이즈

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.pageSize 페이지 사이즈
@apiSuccess {String} data.hasNext 다음페이지 여부
@apiSuccess {List} data.bestItemList 상품 리스트
@apiSuccess {Object} data.bestItemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/boots/datas/item.ssg Boots - 베스트
@apiVersion 1.0.0
@apiName BestController.getBestBootsDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
Boots 베스트 API

<br>- source : BestController.getBestBootsDatasItem()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [pageSize="30"] 페이지사이즈
@apiParam {String} [itemImgSize="150"] 아이템이미지사이즈
@apiParam {String} [dispCtgId] 카테고리ID ("" or 카테고리ID)

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext 다음페이지 여부
@apiSuccess {String} data.pageSize 페이지 사이즈
@apiSuccess {List} data.itemList 상품 리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/best/siv/datas/item.ssg SIV - 베스트
@apiVersion 1.0.0
@apiName BestController.getBestSIVDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
SIV 베스트 API

<br>- source : BestController.getBestSIVDatasItem()
<br>- 담당자 : 박정환P

@apiParam {String} apiVersion API 버전
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [pageSize="30"] 페이지사이즈
@apiParam {String} [itemImgSize="150"] 아이템이미지사이즈


@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext 다음페이지 여부
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 개수
@apiSuccess {List} data.itemList 상품 리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/small/gabest/datas/filter.ssg 신몰 성별/연령별 베스트100 매장 필터
@apiVersion 1.0.0
@apiName BestHundredController.getSmallGaBestDatasFilter
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
신몰 성별/연령별 베스트100 필터 정보 API
<br>- 담당자 : 유현재P

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
    }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/small/gabest/datas/filter.ssg -d '
> {"common":{"ts":"20140619175133","mobil_app_no":"13","apl_ver":"2.0.2","os_cd":"40"},"params":{}}'

@apiSuccess {String}     res_code 응답코드
@apiSuccess {String}     res_message 응답메시지
@apiSuccess {Object}     data 응답결과값
@apiSuccess {List} data.genderList 정렬리스트
@apiSuccess {String} data.genderList.selected 선택여부
@apiSuccess {String} data.genderList.genderCd 성별코드
@apiSuccess {String} data.genderList.genderNm 성별
@apiSuccess {List} data.ageList 정렬리스트
@apiSuccess {String} data.ageList.selected 선택여부
@apiSuccess {String} data.ageList.ageCd 나이코드
@apiSuccess {String} data.ageList.ageNm 나이
@apiSuccess {List} data.dispCtgList 정렬리스트
@apiSuccess {String} data.dispCtgList.dispCtgId 카테고리ID
@apiSuccess {String} data.dispCtgList.dispCtgNm 카테고리명

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "genderList": [
            {
                "selected": "true",
                "genderNm": "전체",
                "genderCd": "ALL"
            },
            {
                "selected": "false",
                "genderNm": "남성",
                "genderCd": "M"
            },
            {
                "selected": "false",
                "genderNm": "여성",
                "genderCd": "F"
            }
        ],
        "ageList": [
            {
                "selected": "false",
                "ageNm": "20대 이하 인기",
                "ageCd": "20"
            },
            {
                "selected": "false",
                "ageNm": "30대 인기",
                "ageCd": "30"
            },
            {
                "selected": "false",
                "ageNm": "40대 인기",
                "ageCd": "40"
            },
            {
                "selected": "false",
                "ageNm": "50대 이상 인기",
                "ageCd": "50"
            },
            {
                "selected": "true",
                "ageNm": "전체 보기",
                "ageCd": "ALL"
            }
        ],
        "dispCtgList": [
            {
                "dispCtgNm": "전체",
                "dispCtgId": ""
            },
            {
                "dispCtgNm": "패션의류",
                "dispCtgId": "6000027643"
            },
            {
                "dispCtgNm": "패션잡화",
                "dispCtgId": "6000027644"
            },
            {
                "dispCtgNm": "해외명품/시계/쥬얼리",
                "dispCtgId": "6000027645"
            },
            {
                "dispCtgNm": "뷰티",
                "dispCtgId": "6000027646"
            },
            {
                "dispCtgNm": "유아동",
                "dispCtgId": "6000027647"
            },
            {
                "dispCtgNm": "스포츠/아웃도어",
                "dispCtgId": "6000027648"
            },
            {
                "dispCtgNm": "주방/생활/건강",
                "dispCtgId": "6000027649"
            },
            {
                "dispCtgNm": "가구/홈인테리어",
                "dispCtgId": "6000027650"
            },
            {
                "dispCtgNm": "디지털/가전",
                "dispCtgId": "6000027651"
            },
            {
                "dispCtgNm": "식품",
                "dispCtgId": "6000027652"
            },
            {
                "dispCtgNm": "취미/서비스",
                "dispCtgId": "6000027653"
            }
        ]
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/small/gabest/datas/item.ssg 신몰 성별/연령별 베스트100 매장 상품리스트
@apiVersion 1.0.0
@apiName BestHundredController.getSmallGaBestDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
신몰 성별/연령별 베스트100 상품리스트 API
<br>- 담당자 : 유현재P

@apiParam {String} dispCtgId 카테고리ID
@apiParam {String} genderCd 성별코드
@apiParam {String} ageCd 나이코드
@apiParam {String} [departmentViewYn=N] 백화점상품만보기 여부
@apiParam {String} itemImgSize 상품이미지 size
@apiParam {String} [page=1] page 페이지번호

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
        "itemImgSize":"202",
        "dispCtgId":"",
        "genderCd":"ALL",
        "ageCd":"ALL",
        "departmentViewYn":"N",
        "page":"1"
    }
}

@apiExample Example usage:
 curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/small/gabest/datas/item.ssg -d '
> {"common":{"ts":"20140619175133","mobil_app_no":"13","apl_ver":"2.0.2","os_cd":"40"},"params":{"itemImgSize":"202", "dispCtgId":"", "genderCd":"ALL", "ageCd":"ALL", "departmentViewYn":"N", "page":"1"}}'

@apiSuccess {String}     res_code 응답코드
@apiSuccess {String}     res_message 응답메시지
@apiSuccess {Object}     data 응답결과값
@apiSuccess {List} data.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {String} data.hasNext 다음페이지 존재 여부
@apiSuccess {String} data.pageSize 한번에 가져올 상품리스트 크기

@apiSuccessExample Response (example):
{
    "cached": false,
    "method": "",
    "res_code": "200",
    "res_message": "성공",
    "data": {
        "hasNext": "false",
        "pageSize": "30",
        "itemList": [
          {
            상품유닛
          }
        ]
    }
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/howdy/best/datas.ssg howdy - 베스트
@apiVersion 1.0.0
@apiName HowdyServiceController.howdyBestDatas
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
howdy 베스트 API

<br>- source : HowdyServiceController.howdyBestDatas()
<br>- 담당자 : 유현재P

@apiParam {String} apiVersion API 버전
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [pageSize="30"] 페이지사이즈
@apiParam {String} itemImgSize 아이템이미지사이즈
@apiParam {String} dispCtgId 카테고리ID


@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {List} data.categoryList 카테고리 리스트
@apiSuccess {String} data.categoryList.dispCtgNm 카테고리명
@apiSuccess {String} data.categoryList.dispCtgId 카테고리ID
@apiSuccess {String} data.hasNext 다음페이지 여부
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 개수
@apiSuccess {List} data.itemList 상품 리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
