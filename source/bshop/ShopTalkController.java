/**
 
@api {post} /api/bshop/shoptalk/datas/talk.ssg  샤벳 > 샵톡 조회
@apiVersion 1.0.0
@apiName ShopTalkController.getShopTalkList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
샵톡리스트 API

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
        "bshopId":"1000000091"
    }
}

@apiExample Example usage:
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/shoptalk/datas/talk.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","page":"1","pageSize":"20","bshopId":"1000000091"}}

@apiSuccess {String}	res_code 응답코드
@apiSuccess {String}	res_message 응답메시지
@apiSuccess {Object}	data 응답결과값
@apiSuccess {List}		data.shopTalkList 샵톡리스트
@apiSuccess {String}	data.shopTalkList.titleNm 제목
@apiSuccess {String}	data.shopTalkList.salestrNo 점포Id
@apiSuccess {String}	data.shopTalkList.salestrNm 점포명
@apiSuccess {String}	data.shopTalkList.expsrTypeCd 노출유형코드 10:텍스트 20:이미지 30:텍스트+이미지 40:텍스트+상품
@apiSuccess {String}	data.shopTalkList.expsrWordCntt 노출문구내용
@apiSuccess {String}	data.shopTalkList.imgFileNm 배너이미지
@apiSuccess {String}	data.shopTalkList.linkUrl 연결Url
@apiSuccess {String}	data.shopTalkList.itemId 상품Id
@apiSuccess {String}	data.shopTalkList.itemNm 상품명
@apiSuccess {String}	data.shopTalkList.dcSellPrc 최적가
@apiSuccess {String}	data.shopTalkList.itemImgUrl 상품이미지
@apiSuccess {String}	data.shopTalkList.phoneNum 전화번호
@apiSuccess {String}	data.shopTalkList.iconTypeCd 노출아이콘 (v2.0) 11: 점포소식 12: 특가안내 13:할인행사 14: 타임혜택 15:세일안내 16:긴급공지 17:샵마공지 18:시크릿쿠폰
@apiSuccess {String}	data.shopTalkList.titleNm 제목
@apiSuccess {String}	data.hasNext 다음페이지 여부

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/** 
 
@api {post} /api/bshop/shoptalk/datas/phone.ssg  샤벳 > 전화번호 조회
@apiVersion 1.0.0
@apiName BshopController.getShopTalkPhoneNumberList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
샤벳 전화번호 리스트 API

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
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/shoptalk/datas/phone.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","page":"1","pageSize":"20","bshopId":"1000000377"}}

@apiSuccess {String}	res_code 응답코드
@apiSuccess {String}	res_message 응답메시지
@apiSuccess {Object}	data 응답결과값
@apiSuccess {List}		data.phoneList 시즌리스트
@apiSuccess {String}	data.phoneList.salestrNo 점포번호
@apiSuccess {String}	data.phoneList.salestrNm 점포명
@apiSuccess {String}	data.phoneList.phoneNum 전화번호
@apiSuccess {String}	data.hasNext	다음페이지 여부

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
 
@api {post} /api/bshop/shoptalk/datas/kakao.ssg  샤벳 > 카카오톡 조회
@apiVersion 1.0.0
@apiName BshopController.getShopAttackShopList
@apiGroup Bshop
@apiSampleRequest off
@apiPermission none

@apiDescription
카카오톡 리스트  API

@apiParam {String} apiVersion api버전
@apiParam {String} bshopId 샤벳Id
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
curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/shoptalk/datas/kakao.ssg -d '
{"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20161101141508","mobil_app_no":"55"},"params":{"apiVersion":"2.0","page":"1","pageSize":"20","bshopId":"1000000377"}}

@apiSuccess {String}	res_code 응답코드
@apiSuccess {String}	res_message 응답메시지
@apiSuccess {Object}	data 응답결과값
@apiSuccess {List}		data.kakaoList 카카오 리스트
@apiSuccess {String}	data.kakaoList.salestrNo 점포번호
@apiSuccess {String}	data.kakaoList.salestrNm 점포명 
@apiSuccess {String}	data.kakaoList.linkUrl 링크Url

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========