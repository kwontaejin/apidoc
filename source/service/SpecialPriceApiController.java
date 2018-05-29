/**

@api {post} /api/obanjang/datas.ssg 오반장
@apiVersion 1.0.0
@apiName ObanjangController.getObanjangDatas
@apiGroup Special Price
@apiSampleRequest off
@apiPermission none

@apiDescription
오반장 API

<br>- source : ssg-mapi-webapp/src/main/java/ssg/mapi/na/obanjang/controller/ObanjangController.java
<br>- 담당자 : 전보솔P

@apiParam {String} pagingYn 페이징여부 Y/N
@apiParam {String} [page="1"] 페이지
@apiParam {String} [pageSize="30"] 페이지사이즈(현재는 사용되고 있지 않음 최대 200개 내려줌)
@apiParam {String} [sortCd="recommend"] 정렬 (recommend 추천순, best 인기상품순, sellSale 판매량많은순 , new 신상품순)
@apiParam {String} [dispCtgZoneId] 전시카테고리존ID
@apiParam {String} [imgSearchYn="N"] 이미지조회여부
@apiParam {String} [siteNo="6001"] 사이트번호
@apiParam {String} itemImgSize 상품이미지사이즈
@apiParam {String} [optBarYn="N"] 옵션바여부
@apiParam {String} [mergeYn="N"] 소스통합여부
@apiParam {String} [cuponDispYn="N"] 쿠폰기준노출여부


@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
        "pagingYn":"N",
        "page":"1",
        "pageSize":"30",
        "sortCd":"recommend",
        "dispCtgZoneId":"",
        "imgSearchYn":"N",
        "siteNo":"6001",
        "itemImgSize":"360",
        "optBarYn":"Y",
        "mergeYn":"Y",
        "adYn":"Y",
        "cuponDispYn":"Y"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext
@apiSuccess {String} data.obangjangEndTime 오반장 종료시간
@apiSuccess {List} data.obanjangItemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
	"cached": false,
	"method": "mbrProgOrdCnt",
	"res_code": "200",
	"res_message": "성공",
	"data": {
		"obangjangEndTime": "20170822085959",
		"hasNext": "false",
		"obanjangItemList": [
		{
			"itemId": "1000017175984",
			"itemNm": "블루베리 그래놀라 50g",
			"displayPrc": "1580",
			"strikeOutPrc": "",
			"minOnetOrdPsblQty": "1",
			"maxOnetOrdPsblQty": "1000",
			"soldOutYn": "N",
			"stoppedSellingYn": "N",
			"siteNo": "6001",
			"siteNm": "emart mall",
			"salestrNo": "2449",
			"salestrNm": "emart NE.O.002",
			"sellpntNm": "",
			"brandNm": "일렉트로맨",
			"goItemDetailYn": "N",
			"msgWhenGoToItemDetail": "",
			"attnTgtIdnfNo1": "1000017175984",
			"attnTgtIdnfNo2": "2449",
			"attnDivCd": "10",
			"needAdultCertification": "false",
			"itemLnkd": "http://qa-m.ssg.com/item/itemView.ssg?itemId=1000017175984&siteNo=6001&salestrNo=2449",
			"itemImgUrl": "http://qa-item.ssgcdn.com/84/59/17/item/1000017175984_i1_360.jpg",
			"planDt": "",
			"dataFileNm": "",
			"pickuItemYn": "N",
			"qshppPsblYn": "N",
			"mltSellQty": "1",
			"uItemSamePrcYn": "Y",
			"itemOrdQty": "40",
			"itemOrdQtyType": "IN_FIELD",
			"tildeDispYn": "N",
			"recompPoint": "",
			"recomRegCnt": "",
			"sellUnitPrc": "316",
			"sellCapaUnitNmWithUnitCapa": "10g",
			"replaceBtnDispYn": "N",
			"arrivalNotiBtnDispYn": "N",
			"advertAcctId": "",
			"advertBidId": "",
			"cartPsblType": "",
			"zoomImgUrls": [],
			"benefitGrp1": [
				{
					"type": "10",
					"txt": "1+1"
				}
			],
			"benefitGrp2": [
			  	{
					"type": "110",
					"txt": "점포택배"
				}
			],
			"benefitGrp3": [],
			"benefitGrp4": [
			  	{
					"type": "obanjang",
					"txt": "오반장"
				}
			],
			"dispStrtDts": "20170731090000",
			"dispEndDts": "20171115085959",
			"sellprcDcrtExpsrYn": "Y",
			"titleImgBanrFileNm": "http://qa-item.ssgcdn.com/84/59/17/item/1000017175984_i1_360.jpg",
			"titleImgBanrRplcTextNm": "",
			"thmnlImgBanrFileNm": "http://qa-item.ssgcdn.com/84/59/17/item/1000017175984_i1_360.jpg",
			"thmnlImgBanrRplcTextNm": "",
			"salestrItemOrdQty": "40",
			"itemExistsYn": "Y",
			"maiTitleNm1": "2입기획+다다익선",
			"maiTitleNm2": "ㅇㅇㅇ",
			"subtitlNm1": "",
			"subtitlNm2": "",
			"iconTagLst": "",
			"iconTagList": [],
			"titleShadUseYn": "Y",
			"usablInvQtyDispYn": "Y",
			"itemSellStateTypeCd": "10",
			"usablInvQty": "623",
			"mdMsgCntt": "ㅇㅇ",
			"mdMsgCntt2": "ㅇㅇ"
		},
		]
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
/**

@api {post} /vsApi/obanjang.ssg 가상스토어 오반장
@apiVersion 1.0.0
@apiName VsApiController.obanjang
@apiGroup Special Price
@apiSampleRequest off
@apiPermission none

@apiDescription
가상스토어 오반장 API

<br>- source : ssg-mapi-webapp/src/main/java/ssg/mapi/vsapi/controller/VsApiController.java
<br>- 담당자 : 전보솔P

@apiParam {String} [mergeYn="N"] 소스통합여부
@apiParam {String} apiVersion api버전
@apiParam {String} ckwhere

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "1.2.7",
        "os_cd": "20",
        "ts": "20170822151449",
        "mobil_app_no": "31"
    },
    "params": {
        "mergeYn":"Y",
        "apiVersion":"1.2",
        "ckwhere":"app_31"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.itemCount 상품갯수
@apiSuccess {String} data.s_date 현재시간
@apiSuccess {List} data.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
	"cached": false,
	"method": "mbrProgOrdCnt",
	"res_code": "200",
	"res_message": "성공",
	"data": {
		"s_date": "20170822151450",
		"itemCount": "195",
		"itemList": [
		{
			"itemId": "1000017175984",
			"itemNm": "블루베리 그래놀라 50g",
			"displayPrc": "1580",
			"strikeOutPrc": "",
			"minOnetOrdPsblQty": "1",
			"maxOnetOrdPsblQty": "1000",
			"soldOutYn": "N",
			"stoppedSellingYn": "N",
			"siteNo": "6001",
			"siteNm": "emart mall",
			"salestrNo": "2449",
			"salestrNm": "emart NE.O.002",
			"sellpntNm": "",
			"brandNm": "일렉트로맨",
			"goItemDetailYn": "N",
			"msgWhenGoToItemDetail": "",
			"attnTgtIdnfNo1": "1000017175984",
			"attnTgtIdnfNo2": "2449",
			"attnDivCd": "10",
			"needAdultCertification": "false",
			"itemLnkd": "http://qa-m.ssg.com/item/itemView.ssg?itemId=1000017175984&siteNo=6001&salestrNo=2449",
			"itemImgUrl": "http://qa-item.ssgcdn.com/84/59/17/item/1000017175984_i1_360.jpg",
			"planDt": "",
			"dataFileNm": "",
			"pickuItemYn": "N",
			"qshppPsblYn": "N",
			"mltSellQty": "1",
			"uItemSamePrcYn": "Y",
			"itemOrdQty": "40",
			"itemOrdQtyType": "IN_FIELD",
			"tildeDispYn": "N",
			"recompPoint": "",
			"recomRegCnt": "",
			"sellUnitPrc": "316",
			"sellCapaUnitNmWithUnitCapa": "10g",
			"replaceBtnDispYn": "N",
			"arrivalNotiBtnDispYn": "N",
			"advertAcctId": "",
			"advertBidId": "",
			"cartPsblType": "",
			"zoomImgUrls": [],
			"benefitGrp1": [
				{
					"type": "10",
					"txt": "1+1"
				}
			],
			"benefitGrp2": [
			  	{
					"type": "110",
					"txt": "점포택배"
				}
			],
			"benefitGrp3": [],
			"benefitGrp4": [
			  	{
					"type": "obanjang",
					"txt": "오반장"
				}
			],
			"dispStrtDts": "20170731090000",
			"dispEndDts": "20171115085959",
			"sellprcDcrtExpsrYn": "Y",
			"titleImgBanrFileNm": "http://qa-item.ssgcdn.com/84/59/17/item/1000017175984_i1_360.jpg",
			"titleImgBanrRplcTextNm": "",
			"thmnlImgBanrFileNm": "http://qa-item.ssgcdn.com/84/59/17/item/1000017175984_i1_360.jpg",
			"thmnlImgBanrRplcTextNm": "",
			"salestrItemOrdQty": "40",
			"itemExistsYn": "Y",
			"maiTitleNm1": "2입기획+다다익선",
			"maiTitleNm2": "ㅇㅇㅇ",
			"subtitlNm1": "",
			"subtitlNm2": "",
			"iconTagLst": "",
			"iconTagList": [],
			"titleShadUseYn": "Y",
			"usablInvQtyDispYn": "Y",
			"itemSellStateTypeCd": "10",
			"usablInvQty": "623",
			"mdMsgCntt": "ㅇㅇ",
			"mdMsgCntt2": "ㅇㅇ"
		},
		]
	}
}

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/happyvirus/datas.ssg 해피바이러스
@apiVersion 1.0.0
@apiName HappyVirusController.getHappyVirusDatas
@apiGroup Special Price
@apiSampleRequest off
@apiPermission none

@apiDescription
해피바이러스 API

<br>- source : ssg-mapi-webapp/src/main/java/ssg/mapi/na/happyvirus/controller/HappyVirusController.java
<br>- 담당자 : 전보솔P

@apiParam {String} [dataIndex="N"] 데이터 index : 0 - 상단배너, 중단배너, 정렬리스트, 카테고리리스트 필드 추가
@apiParam {String} [dataType="HAPPYWEEK"] 해피바이러스 type HAPPYDAY, HAPPYWEEK
@apiParam {String} [pagingYn="N"] 페이징여부 Y/N
@apiParam {String} [page="1"] 페이지
@apiParam {String} [pageSize="30"] 페이지사이즈(현재는 사용되고 있지 않음 최대 200개 내려줌)
@apiParam {String} [sortCd="recommend"] 정렬 (recommend 추천순, hotdeal 최신오픈순, sellSale 판매순 , deptord 백화점우선)
@apiParam {String} [dispCtgId] 전시카테고리존ID
@apiParam {String} [imgSearchYn="N"] 이미지조회여부
@apiParam {String} [siteNo="6004"] 사이트번호
@apiParam {String} itemImgSize 상품이미지사이즈
@apiParam {String} [optBarYn="N"] 옵션바여부
@apiParam {String} [cuponDispYn="N"] 상품이미지사이즈
@apiParam {String} [deptItemYn] 백화점상품만가져오기여부


@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170307155228",
        "mobil_app_no": "12"
    },
    "params": {
        "pagingYn":"N",
        "page":"1",
        "pageSize":"30",
        "dataIndex":"0",
        "sortCd":"recommend",
        "dispCtgId":"",
        "imgSearchYn":"N",
        "siteNo":"6001",
        "itemImgSize":"360",
        "optBarYn":"Y",
        "dataType":"HAPPYWEEK",
        "adYn":"Y",
        "cuponDispYn":"Y",
        "deptItemYn":"N"
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext
@apiSuccess {List} data.topBanr 상단배너
@apiSuccess {String} data.topBanr.lnkdUrl 상단배너 링크URL
@apiSuccess {String} data.topBanr.imgWidth 상단배너 이미지 넓이
@apiSuccess {String} data.topBanr.imgHeight 상단배너 이미지 높이
@apiSuccess {String} data.topBanr.imgFileNm 상단배너 이미지명(url)
@apiSuccess {List} data.middleBanr 중단배너
@apiSuccess {String} data.middleBanr.lnkdUrl 중단배너 링크URL
@apiSuccess {String} data.middleBanr.imgWidth 중단배너 이미지 넓이
@apiSuccess {String} data.middleBanr.imgHeight 중단배너 이미지 높이
@apiSuccess {String} data.middleBanr.imgFileNm 중단배너 이미지명(url)
@apiSuccess {List} data.sortList 정렬리스트
@apiSuccess {String} data.sortList.sortNm 정렬명
@apiSuccess {String} data.sortList.sortCd 정렬코드
@apiSuccess {List} data.dispCtgIdList 카테고리리스트
@apiSuccess {String} data.dispCtgIdList.dispCtgNm 카테고리명
@apiSuccess {String} data.dispCtgIdList.dispCtgId 카테고리ID
@apiSuccess {List} data.happyVirusItemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)

@apiSuccessExample Response (example):
{
	"cached": false,
	"method": "mbrProgOrdCnt",
	"res_code": "200",
	"res_message": "성공",
	"data": {
		"dispCtgIdList": [
		  {
		"dispCtgNm": "해피바이러스 ALL",
		"dispCtgId": ""
		},
		  {
		"dispCtgNm": "패션/언더웨어",
		"dispCtgId": "6000030355"
		},
		  {
		"dispCtgNm": "뷰티/잡화",
		"dispCtgId": "6000030359"
		},
		  {
		"dispCtgNm": "스포츠/레저",
		"dispCtgId": "6000030360"
		},
		  {
		"dispCtgNm": "유아동/식품",
		"dispCtgId": "6000030361"
		},
		  {
		"dispCtgNm": "리빙/가전",
		"dispCtgId": "6000030362"
		}
		],
		"middleBanr": {},
		"hasNext": "true",
		"topBanrList": [],
		"sortList": [
		  {
		"sortNm": "추천순",
		"sortCd": "recommend"
		},
		  {
		"sortNm": "판매순",
		"sortCd": "sellSale"
		},
		  {
		"sortNm": "최신오픈순",
		"sortCd": "hotdeal"
		},
		  {
		"sortNm": "백화점우선",
		"sortCd": "deptord"
		}
		],
		"topBanr": {
		"lnkdUrl": "http://m.shinsegaemall.ssg.com/event/eventDetail.ssg?promId=1100245779",
		"imgWidth": "720",
		"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017081816193509023790900479_106.jpg",
		"imgHeight": "156"
		},
		"happyVirusItemList": [
			{
			"itemId": "1000023264242",
			"itemNm": "소니 인기모델 기획전",
			"displayPrc": "4799610",
			"strikeOutPrc": "",
			"minOnetOrdPsblQty": "1",
			"maxOnetOrdPsblQty": "1000",
			"soldOutYn": "N",
			"stoppedSellingYn": "N",
			"siteNo": "6009",
			"siteNm": "신세계백화점",
			"salestrNo": "1002",
			"salestrNm": "본점",
			"sellpntNm": "",
			"brandNm": "SONY",
			"goItemDetailYn": "Y",
			"msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다. 상품상세에서 옵션을 선택해주세요.",
			"attnTgtIdnfNo1": "1000023264242",
			"attnTgtIdnfNo2": "1002",
			"attnDivCd": "10",
			"needAdultCertification": "false",
			"itemLnkd": "http://m.shinsegaemall.ssg.com/item/dealItemView.ssg?itemId=1000023264242&siteNo=6009&salestrNo=1002",
			"itemImgUrl": "http://item.ssgcdn.com/42/42/26/item/1000023264242_i1_360.jpg",
			"planDt": "",
			"dataFileNm": "",
			"pickuItemYn": "N",
			"qshppPsblYn": "N",
			"mltSellQty": "1",
			"uItemSamePrcYn": "N",
			"itemOrdQty": "57",
			"itemOrdQtyType": "IN_FIELD",
			"tildeDispYn": "Y",
			"recompPoint": "",
			"recomRegCnt": "",
			"sellUnitPrc": "",
			"sellCapaUnitNmWithUnitCapa": "",
			"replaceBtnDispYn": "N",
			"arrivalNotiBtnDispYn": "N",
			"advertAcctId": "",
			"advertBidId": "",
			"cartPsblType": "",
			"zoomImgUrls": [],
			"benefitGrp1": [],
			"benefitGrp2": [],
			"benefitGrp3": [],
			"benefitGrp4": [
				{
					"type": "happy",
					"txt": "해피바이러스"
				}
			],
			"dispStrtDts": "20170821090000",
			"dispEndDts": "20170828085959",
			"maiTitleNm1": "",
			"maiTitleNm2": "",
			"subtitlNm1": "미러리스 베스트셀러",
			"subtitlNm2": "소니 인기모델",
			"iconTagLst": "",
			"usablInvQty": "34",
			"imgFileNm": ""
			}
		],
	}
}
*/


// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
@api {post} /api/cheaper/datas.ssg 이얼싼
@apiVersion 1.0.0
@apiName CheaperPriceController.cheaperPriceDatas
@apiGroup Special Price
@apiSampleRequest off
@apiPermission none

@apiDescription
해피바이러스 API

<br>- source : ssg-mapi-webapp/src/main/java/ssg/mapi/na/service/CheaperPriceController.java
<br>- 담당자 : 전보솔P

@apiParam {String} [dataIndex] 데이터 index : 0 - 이얼싼 메인 상단(우)배너, 이얼싼 타이틀 배너, 이얼싼 중단 띠배너, 이얼싼 특가 상품, 이얼싼 오늘의 추천 상품, 카테고리리스트 필드 추가
@apiParam {String} [page="1"] 페이지
@apiParam {String} [pageSize="10"] 페이지사이즈
@apiParam {String} [dispCtgId] 전시카테고리ID
@apiParam {String} [itemImgSize="360"] 상품이미지사이즈

@apiParamExample {json} Request-Example :
{
    "common": {
        "apl_ver": "2.3.2",
        "os_cd": "20",
        "ts": "20170315165914",
        "mobil_app_no": "12"
    },
    "params": {
        "page":"1",
        "pageSize":"30",
        "dataIndex":"0",
        "dispCtgId":"",
        "itemImgSize":"500",
    }
}

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext
@apiSuccess {List} data.dispCtgIdList 카테고리리스트
@apiSuccess {String} data.dispCtgIdList.dispCtgNm 카테고리명
@apiSuccess {String} data.dispCtgIdList.dispCtgId 카테고리ID
@apiSuccess {List} data.specialItemList [특가상품유닛리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.specialBanrList [특가배너리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.topRtBanrList [메인상단(우)배너](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.midBanrList [중단띠배너리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.titleBanrList [타이틀띠배너리스트](#api-header-for-a-submenu-commonconrbanr)
@apiSuccess {List} data.recomItemList [오늘의추천상품리스트](#api-header-for-a-submenu-itemunit)
@apiSuccess {List} data.cheaperPriceItemList [이얼싼상품리스트](#api-header-for-a-submenu-itemunit)

*/