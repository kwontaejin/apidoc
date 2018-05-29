/**
 * @api {post} /api/brand/search/datas.ssg 브랜드매장
 * @apiVersion 0.0.0
 * @apiName BrandSearchController.brandSearch
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 통합검색 API
 *
 * 
 * @apiParam {String} [siteNo]    요청 사이트번호
 * @apiParam {String="mobile_brand","mobile_brand_item"} [target="mobile_brand"]	 검색을 요청할 대상
 * @apiParam {String="best","sale","prcasc","prcdsc","regdt","cnt"} [sort="best"]        정렬코드
 * @apiParam {String} [page]          페이지번호
 * @apiParam {String} [count]         요청상품수
 * @apiParam {String} [ctgId]			 카테고리아이디
 * @apiParam {String} [brandId]		 브랜드아이디
 * @apiParam {String} [filter]			 혜택
 * @apiParam {String} [cls]			 상품요소
 * @apiParam {String} [minPrc]		 최저가
 * @apiParam {String} [maxPrc]		 최고가
 * @apiParam {String} [benefit]		 혜택
 * @apiParam {String} [itemImgSize]   아이템이미지사이즈
 *
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *       "apl_ver": "2.4.0",
 *       "os_cd": "20",
 *       "ts": "20170808151332",
 *       "mobil_app_no": "12"
 *   },
 *   "params": {
 *       "siteNo": "6005",
 *       "target" : "mobile_brand",
 *       "brandId" : "1000000083",
 *       "ctgId" : "5500000001",
 *       "page" : "1",
 *		 "itemImgSize" : "500"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/brand/search/datas.ssg -d '
 * > 
{"common":{"apl_ver":"2.4.0","os_cd":"20","ts":"20170808151332","mobil_app_no":"12"},"params":{"maxPrc":"","sort":"","siteNo":"6005","brandId":"2011005297","ctgId":"5500000001","target":"mobile_brand","minPrc":"","page":"1","itemImgSize":"500","dataIndex":""}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {List} data.categoryFilterList 		카테고리필터
 * @apiSuccess {String} data.ctgId					카테고리 ID
 * @apiSuccess {Map} data.clipInfo					클립정보
 * @apiSuccess {String} data.brandImg 				브랜드 대표이미지
 * @apiSuccess {String} data.brandNm 				브랜드 이름
 * @apiSuccess {String} data.hasNext			다음페이지 존재여부
 * @apiSuccess {String} data.query 				검색어
 * @apiSuccess {String} data.itemCount			상품검색결과 수
 * @apiSuccess {String} data.itemList				상품검색결과 리스트
 * @apiSuccess {String} data.pageSize			상품검색결과 페이지수
 * @apiSuccess {List} data.sortFilterList 			정렬필터
 * @apiSuccess {String} data.brandId			브랜드 ID
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *   "cached": false,
 *   "method": "",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
 *     "categoryFilterList": [
 *       {
 *         "key": "ctgId",
 *         "value": "5500000001",
 *         "name": "여성캐주얼/정장",
 *         "useYn": "Y",
 *         "selected": "selected",
 *         "cList": [
 *           {
 *             "key": "ctgId",
 *             "value": "5500000019",
 *             "name": "원피스",
 *             "useYn": "Y",
 *             "selected": "",
 *             "cList": null,
 *             "level": "2"
 *           }
 *         ],
 *         "level": "1"
 *       }
 *     ],
 *     "ctgId": "5500000001",
 *     "clipInfo": {
 *       "attnDivCd": "30",
 *       "siteNo": "6005",
 *       "attnTgtIdnfNo1": "2011005297",
 *       "attnTgtIdnfNo2": "5500000001",
 *       "notiTitle": "난닝구"
 *     },
 *     "brandImg": "",
 *     "brandNm": "난닝구",
 *     "hasNext": "true",
 *     "query": null,
 *     "itemList": [
 *       {
 *         "itemId": "1000023031285",
 *         "itemNm": "피넛 린넨브이넥원피스",
 *         "displayPrc": "27118",
 *         "strikeOutPrc": "29800",
 *         "minOnetOrdPsblQty": "1",
 *         "maxOnetOrdPsblQty": "100",
 *         "soldOutYn": "N",
 *         "stoppedSellingYn": "N",
 *         "siteNo": "6004",
 *         "siteNm": "shinsegae mall",
 *         "salestrNo": "6005",
 *         "salestrNm": "",
 *         "sellpntNm": "",
 *         "brandNm": "난닝구",
 *         "goItemDetailYn": "Y",
 *         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *         "attnTgtIdnfNo1": "1000023031285",
 *         "attnTgtIdnfNo2": "6005",
 *         "attnDivCd": "10",
 *         "needAdultCertification": "false",
 *         "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000023031285&siteNo=6004&salestrNo=6005&tlidSrchWd=&srchPgNo=1",
 *         "itemImgUrl": "http://item.ssgcdn.com/85/12/03/item/1000023031285_i1_500.jpg",
 *         "planDt": "",
 *         "dataFileNm": "",
 *         "pickuItemYn": "N",
 *         "qshppPsblYn": "N",
 *         "mltSellQty": "1",
 *         "uItemSamePrcYn": "Y",
 *         "itemOrdQty": "",
 *         "itemOrdQtyType": "DEAL",
 *         "tildeDispYn": "N",
 *         "recompPoint": "",
 *         "recomRegCnt": "",
 *         "sellUnitPrc": "",
 *         "sellCapaUnitNmWithUnitCapa": "",
 *         "replaceBtnDispYn": "N",
 *         "arrivalNotiBtnDispYn": "N",
 *         "advertAcctId": "",
 *         "advertBidId": "",
 *         "cartPsblType": "",
 *         "zoomImgUrls": [],
 *         "benefitGrp1": [
 *           {
 *             "type": "C0",
 *             "txt": "9"
 *           }
 *         ],
 *         "benefitGrp2": [],
 *         "benefitGrp3": [
 *           {
 *             "type": "160",
 *             "txt": "청구할인"
 *           }
 *         ],
 *         "benefitGrp4": []
 *       }
 *     ],
 *     "pageSize": "40",
 *     "sortFilterList": [
 *       {
 *         "key": "sort",
 *         "value": "best",
 *         "name": "인기상품순",
 *         "useYn": "Y"
 *       }
 *     ],
 *     "itemCount": "408",
 *     "brandId": "2011005297"
 *   }
 * }
*/