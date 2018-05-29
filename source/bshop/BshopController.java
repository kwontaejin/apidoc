/**

@api {post} /api/bshop/main/datas/brand.ssg  샤벳 > 브랜드리스트 조회
@apiVersion 1.0.0
@apiName BshopController.getShopAttackBshopList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
샤벳브랜드리스트 API

@apiParam {String} apiVersion api버전
@apiParam {String} page 페이지번호
@apiParam {String} pageSize 페이지사이즈
@apiParam {String} dispSiteNo 전사사이트번호
@apiParam {String} onedayBeforeYn 전일기준 데이터 조회여부

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"2.3.2",
        "os_cd":"20",
        "ts":"20161101141508",
        "mobil_app_no":"55"
    },
    "params":{
        "apiVersion":"2.0",
        "page":"1",
        "pageSize":"20",
        "dispSiteNo":"6005",
        "onedayBeforeYn":"N"
    }
}

@apiExample Example usage:
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/main/datas/brand.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","page":"1","pageSize":"20","dispSiteNo":"6005","onedayBeforeYn":"N"}}

@apiSuccess {String}	res_code 응답코드
@apiSuccess {String}	res_message 응답메시지
@apiSuccess {Object}	data 응답결과값
@apiSuccess {List}		data.bshopList 샤벳브랜드리스트
@apiSuccess {String}	data.bshopList.bshopId 샤벳브랜드Id
@apiSuccess {String}	data.bshopList.bshopTitleNm 샤벳브랜드 한글제목명
@apiSuccess {String}	data.bshopList.bshopEngTitleNm1 샤벳브랜드 영문제목명1
@apiSuccess {String}	data.bshopList.bshopEngTitleNm2 샤벳브랜드 영문제목명2
@apiSuccess {Object}	data.bshopList.repSeason 대표시즌정보
@apiSuccess {String}	data.bshopList.repSeason.seasonId 대표시즌Id
@apiSuccess {String}	data.bshopList.repSeason.seasonNm 대표시즌명
@apiSuccess {String}	data.bshopList.repSeason.salestrNo 백화점우선점포번호
@apiSuccess {String}	data.bshopList.repSeason.repImgUrl 대표이미지경로
@apiSuccess {String}	data.bshopList.repSeason.newYn new아이콘 노출 여부
@apiSuccess {String}	data.bshopList.repSeason.salestrNm 백화점점포명 (v2.0)
@apiSuccess {String}	data.bshopList.repSeason.bldgDivCd 백화점관코드 (v2.0)
@apiSuccess {String}	data.bshopList.repSeason.bldgDivNm 백화점관명 (v2.0)
@apiSuccess {String}	data.bshopList.repSeason.dptsFloCd 백화점관코드 (v2.0)
@apiSuccess {String}	data.bshopList.repSeason.dptsFloNm 백화점관명 (v2.0)
@apiSuccess {String}	data.bshopList.repSeason.dispStrtDts 전시시작일 (v2.0)
@apiSuccess {Object}	data.bshopList.clipInfo 클립정보
@apiSuccess {String}	data.bshopList.clipInfo.attnDivCd 클립유형 대표시즌Id
@apiSuccess {String}	data.bshopList.clipInfo.siteNo 클립한 게시글의 원 사이트번호
@apiSuccess {String}	data.bshopList.clipInfo.attnTgtIdnfNo1 클립타겟정보1
@apiSuccess {String}	data.bshopList.clipInfo.attnTgtIdnfNo2 클립타겟정보2
@apiSuccess {String}	data.bshopList.clipInfo.infloSiteNo 클립한 사이트번호
@apiSuccess {String}	data.hasNext	다음페이지 여부

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/bshop/main/datas/season.ssg  샤벳 > 시즌리스트 조회
@apiVersion 1.0.0
@apiName BshopController.getShopAttackSeasonList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
샤벳시즌리스트 API

@apiParam {String} apiVersion api버전
@apiParam {String} bshopId 샤벳브랜드Id
@apiParam {String} page 페이지번호
@apiParam {String} pageSize 페이지사이즈

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"2.3.2",
        "os_cd":"20",
        "ts":"20161101141508",
        "mobil_app_no":"55"
    },
    "params":{
        "apiVersion":"2.0",
        "page":"1",
        "pageSize":"20",
        "bshopId":"1000000377"
    }
}

@apiExample Example usage:
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/main/datas/season.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","page":"1","pageSize":"20","bshopId":"1000000377"}}

@apiSuccess {String}	res_code 응답코드
@apiSuccess {String}	res_message 응답메시지
@apiSuccess {Object}	data 응답결과값
@apiSuccess {List}		data.seasonList 시즌리스트
@apiSuccess {String}	data.seasonList.seasonId 시즌Id
@apiSuccess {String}	data.seasonList.seasonNm 시즌명
@apiSuccess {String}	data.seasonList.salestrNo 점포번호
@apiSuccess {String}	data.seasonList.salestrNm 점포명 (v2.0)
@apiSuccess {String}	data.seasonList.bldgDivCd 관코드 (v2.0)
@apiSuccess {String}	data.seasonList.bldgDivNm 관명 (v2.0)
@apiSuccess {String}	data.seasonList.dptsFloCd 층코드 (v2.0)
@apiSuccess {String}	data.seasonList.dptsFloNm 층명 (v2.0)
@apiSuccess {String}	data.seasonList.dispStrtDts 전시시작일 (v2.0)
@apiSuccess {String}	data.seasonList.repImgUrl 대표이미지경로
@apiSuccess {String}	data.seasonList.newYn new아이콘 노출여부
@apiSuccess {String}	data.hasNext	다음페이지 여부

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/bshop/main/datas/shop.ssg  샤벳 > 매장리스트 조회
@apiVersion 1.0.0
@apiName BshopController.getShopAttackShopList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
샤벳매장리스트 API

@apiParam {String} apiVersion api버전
@apiParam {String} seasonId 샤벳시즌Id
@apiParam {String} page 페이지번호
@apiParam {String} pageSize 페이지사이즈

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"2.3.2",
        "os_cd":"20",
        "ts":"20161101141508",
        "mobil_app_no":"55"
    },
    "params":{
        "apiVersion":"2.0",
        "page":"1",
        "pageSize":"20",
        "seasonId":"1000004438"
    }
}

@apiExample Example usage:
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/main/datas/shop.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","page":"1","pageSize":"20","seasonId":"1000004438"}}

@apiSuccess {String}	res_code 응답코드
@apiSuccess {String}	res_message 응답메시지
@apiSuccess {Object}	data 응답결과값
@apiSuccess {List}		data.shopList 매장리스트
@apiSuccess {String}	data.shopList.shopId 매장Id
@apiSuccess {String}	data.shopList.shopNm 매장명
@apiSuccess {String}	data.shopList.shopTitleNm 매장타이틀명
@apiSuccess {String}	data.shopList.shopDesc 매장설명
@apiSuccess {String}	data.shopList.imgFileNm 매장이미지경로
@apiSuccess {String}	data.shopList.repShopYn 대표매장여부
@apiSuccess {String}	data.shopList.itemShowBdgYn 상품노출여부
@apiSuccess {String}	data.shopList.dispOrdr 우선순위
@apiSuccess {String}	data.shopList.vodType 동영상타입
@apiSuccess {String}	data.shopList.vodFileNm 동영상경로
@apiSuccess {String}	data.shopList.vodImgNm 동영상이미지
@apiSuccess {String}	data.shopList.shopMasterItem 상품리스트 [상품유닛리스트](#api-header-for-a-submenu-itemunit) (v2.0)
@apiSuccess {String}	data.shopList.attnTgtIdnfCnt 매장클립갯수
@apiSuccess {String}	data.shopList.banrSizVal 배너사이즈
@apiSuccess {String}	data.shopList.dispStrtDts 매장전시시작일
@apiSuccess {Object}	data.selectedSeason 해당매장의 시즌정보
@apiSuccess {String}	data.selectedSeason.seasonId 시즌Id
@apiSuccess {String}	data.selectedSeason.seasonNm 시즌명
@apiSuccess {String}	data.selectedSeason.salestrNo 점포번호
@apiSuccess {String}	data.selectedSeason.salestrNm 점포명 (v2.0)
@apiSuccess {String}	data.selectedSeason.bldgDivCd 관코드 (v2.0)
@apiSuccess {String}	data.selectedSeason.bldgDivNm 관명 (v2.0)
@apiSuccess {String}	data.selectedSeason.dptsFloCd 층코드 (v2.0)
@apiSuccess {String}	data.selectedSeason.dptsFloNm 층명 (v2.0)
@apiSuccess {String}	data.selectedSeason.dispStrtDts 전시시작일 (v2.0)
@apiSuccess {String}	data.selectedSeason.repImgUrl 대표이미지경로
@apiSuccess {String}	data.selectedSeason.newYn new아이콘 노출여부
@apiSuccess {String}	data.repBrandYn ssg브랜드 연결 여부
@apiSuccess {String}	data.hasNext	다음페이지 여부

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
/**

@api {post} /api/bshop/main/datas/item.ssg  샤벳 > 상품리스트 조회
@apiVersion 1.0.0
@apiName BshopController.getShopAttackItemList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
샤벳상품리스트 API

@apiParam {String} apiVersion api버전
@apiParam {String} shopId 샤벳매장Id
@apiParam {String} salestrNo 백화점우선점포번호
@apiParam {String} page 페이지번호
@apiParam {String} pageSize 페이지사이즈

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"2.3.2",
        "os_cd":"20",
        "ts":"20161101141508",
        "mobil_app_no":"55"
    },
    "params":{
        "apiVersion":"2.0",
        "page":"1",
        "pageSize":"20",
        "salestrNo":"1002",
        "shopId":"6000120089"
    }
}

@apiExample Example usage:
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/main/datas/item.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","page":"1","pageSize":"20","salestrNo":"1002","shopId":"6000120089"}}

@apiSuccess {String}	res_code 응답코드
@apiSuccess {String}	res_message 응답메시지
@apiSuccess {Object}	data 응답결과값
@apiSuccess {String}	data.itemList 상품리스트 [상품유닛리스트](#api-header-for-a-submenu-itemunit) (v2.0)
@apiSuccess {String}	data.hasNext	다음페이지 여부

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/bshop/main/datas/allDptsStrList.ssg  샤벳 > 전체 백화점 점포 정보 조회
@apiVersion 1.0.0
@apiName BshopController.getAllDptsStrList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
전체 백화점 점포 목록을 가져옵니다.<br/>
점포별 정보에는 건물, 층도 포함합니다.

@apiParam {String} apiVersion api버전

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"2.3.2",
        "os_cd":"20",
        "ts":"20161101141508",
        "mobil_app_no":"55"
    },
    "params":{
        "apiVersion":"2.0"
    }
}

@apiExample Example usage:
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/main/datas/allDptsStrList.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0"}}

@apiSuccess {String}	res_code 						응답코드
@apiSuccess {String}	res_message 					응답메시지
@apiSuccess {Object}	data 							응답결과값
@apiSuccess {List}		data.dptsStrList 				백화점 점포 목록
@apiSuccess {String}	data.dptsStrList.dptsStrId 			백화점 점포ID
@apiSuccess {String}	data.dptsStrList.dptsStrNm 			백화점 점포명
@apiSuccess {String}	data.dptsStrList.salestrNo 			영업점 번호 (온라인)
@apiSuccess {String}	data.dptsStrList.dptsStrImgUrl		백화점 점포 이미지 URL
@apiSuccess {String}	data.dptsStrList.repTelno			대표번호
@apiSuccess {String}	data.dptsStrList.shopAddr			주소
@apiSuccess {List}		data.dptsStrList.dptsBldgList		백화점 건물 목록
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsStrId			백화점 점포ID
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsStrNm			백화점 점포명
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsBldgId		백화점 건물ID
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsBldgNm		백화점 건물명
@apiSuccess {List}		data.dptsStrList.dptsBldgList.dptsFloList		백화점 층 목록
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsStrId				백화점 점포ID
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsStrNm				백화점 점포명
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsBldgId			백화점 건물ID
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsBldgNm			백화점 건물명
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsFloId				백화점 층ID
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsFloNm				백화점 층명
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsFloDesc			백화점 층 설명
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.repImgUrl				백화점 층 장르 이미지 
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsFloPcImgUrl		백화점 층 PC 이미지
@apiSuccess {String}	data.dptsStrList.dptsBldgList.dptsFloList.dptsFloMobileImgUrl	백화점 층 모바일 이미지



*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/bshop/main/datas/ctgDptsShopList.ssg  샤벳 > 카테고리 > 백화점 브랜드 조회
@apiVersion 1.0.0
@apiName BshopController.getDptsShopList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
백화점 점포(또는 건물, 층) 선택 시 해당 영역의 브랜드 정보를 가져옵니다.

@apiParam {String} apiVersion api버전
@apiParam {String} dptsStrId 	백화점 점포 ID
@apiParam {String} dptsBldgId	백화점 건물 ID
@apiParam {String} dptsFloId	백화점 층 ID

@apiParamExample {json} Request-Example :
{
    "common":{
        "apl_ver":"2.3.2",
        "os_cd":"20",
        "ts":"20161101141508",
        "mobil_app_no":"55"
    },
    "params":{
        "apiVersion":"2.0",
        "dptsStrId":"SC00001",
        "dptsBldgId":"BC00007",
        "dptsFloId":"FC00014"
    }
}

@apiExample Example usage:
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/main/datas/allDptsStrList.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","dptsStrId":"SC00001","dptsBldgId":"BC00007","dptsFloId":"FC00014"}}

@apiSuccess {String}	res_code 						응답코드
@apiSuccess {String}	res_message 					응답메시지
@apiSuccess {Object}	data 							응답결과값
@apiSuccess {List}		data.ctgDptsShopList			백화점 브랜드 목록




*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========