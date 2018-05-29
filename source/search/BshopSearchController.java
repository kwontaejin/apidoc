/**
 * @api {post} /api/bshop/datas/search.ssg 샤벳 검색
 * @apiVersion 0.0.0
 * @apiName BshopSearchController.bshopSearch
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 통합검색 API
 *
 * 
 * @apiParam {String} [siteNo]    요청 사이트번호
 * @apiParam {String="bshop","bshop_item"} [target="bshop"]	 검색을 요청할 대상
 * @apiParam {String} [query]		검색어
 * @apiParam {String="best","sale","prcasc","prcdsc","regdt","cnt"} [sort="best"]        정렬코드
 * @apiParam {String} [page]          페이지번호
 * @apiParam {String} [count]         요청상품수
 * @apiParam {String} [ctgId]			 카테고리아이디
 * @apiParam {String} [shopId]		 BshopId
 * @apiParam {String} [filter]			혜택
 * @apiParam {String} [cls]			상품요소
 * @apiParam {String} [minPrc]		최저가
 * @apiParam {String} [maxPrc]		최고가
 * @apiParam {String} [benefit]		혜택
 * @apiParam {String} [itemImgSize]   아이템이미지사이즈
 * @apiParam {String} [shpp]			배송유형
 * @apiParam {String} [pickuSalestr]  매직픽업 점포번호
 * @apiParam {String} [pageSize]		 페이지사이즈
 *
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *       "apl_ver": "1.1.3",
 *       "os_cd": "20",
 *       "ts": "20170808130724",
 *       "mobil_app_no": "51"
 *   },
 *   "params": {
 *       "siteNo": "6005",
 *       "target" : "bshop",
 *       "pagingYn" : "Y",
 *       "query" : "타미힐피거여성",
 *       "pageSize" : "20",
 *       "page" : "1"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/bshop/datas/search.ssg -d '
 * > {"common":{"apl_ver":"1.1.3","os_cd":"20","ts":"20170808130724","mobil_app_no":"51"},"params":{"target":"bshop","siteNo":"6005","pagingYn":"Y","pageSize":"20","query":"타미힐피거여성","page":"1"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {List} data.bshopList				샤벳 브랜드매장 리스트
 * @apiSuccess {List} data.categoryList			카테고리 리스트
 * @apiSuccess {String} data.hasNext			다음페이지 존재여부
 * @apiSuccess {String} data.itemCount			상품검색결과 수
 * @apiSuccess {String} data.itemList				상품검색결과 리스트
 * @apiSuccess {List} data.pickuList 				매직픽업 점포 리스트
 * @apiSuccess {String} data.query 				검색어
 * @apiSuccess {List} data.sortFilterList 			정렬필터
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *   "cached": false,
 *   "method": "",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
 *     "categoryList": [
 *       {
 *         "key": "ctgId",
 *         "value": "",
 *         "name": "전체카테고리",
 *         "useYn": "Y"
 *       },
 *       {
 *         "key": "ctgId",
 *         "value": "5500000001",
 *         "name": "여성캐주얼/정장",
 *         "useYn": "Y"
 *       }
 *     ],
 *     "hasNext": "true",
 *     "query": "타미힐피거여성",
 *     "itemList": [
 *       {
 *         "itemId": "1000023034131",
 *         "itemNm": "TFMR3AAE02A0 타미여성 패커블 TH 로고 토트 백",
 *         "displayPrc": "50460",
 *         "strikeOutPrc": "68000",
 *         "minOnetOrdPsblQty": "1",
 *         "maxOnetOrdPsblQty": "20",
 *         "soldOutYn": "N",
 *         "stoppedSellingYn": "N",
 *         "siteNo": "6009",
 *         "siteNm": "신세계백화점",
 *         "salestrNo": "1004",
 *         "salestrNm": "",
 *         "sellpntNm": "",
 *         "brandNm": "타미힐피거(여성)",
 *         "goItemDetailYn": "Y",
 *         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *         "attnTgtIdnfNo1": "1000023034131",
 *         "attnTgtIdnfNo2": "1004",
 *         "attnDivCd": "10",
 *         "needAdultCertification": "false",
 *         "itemLnkd": "http://m.ssg.com/item/itemView.ssg?itemId=1000023034131&siteNo=6009&salestrNo=1004&tlidSrchWd=타미힐피거여성&srchPgNo=1",
 *         "itemImgUrl": "http://item.ssgcdn.com/31/41/03/item/1000023034131_i1_202.jpg",
 *         "planDt": "",
 *         "dataFileNm": "",
 *         "pickuItemYn": "Y",
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
 *             "txt": "25"
 *           }
 *         ],
 *         "benefitGrp2": [],
 *         "benefitGrp3": [
 *           {
 *             "type": "220",
 *             "txt": "카드할인 5%"
 *           }
 *         ],
 *         "benefitGrp4": [
 *           {
 *             "type": "mpickup",
 *             "txt": "매직픽업"
 *           },
 *           {
 *             "type": "ssgtalk",
 *             "txt": "D00864"
 *           }
 *         ]
 *       }
 *     ],
 *     "bshopList": [
 *       {
 *         "bshopId": "1000000222",
 *         "bshopTitleNm": "타미힐피거 여성",
 *         "bshopEngTitleNm1": "Tommy.H",
 *         "bshopEngTitleNm2": "woman",
 *         "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201707/2017071314490643349644338964_765.jpg",
 *         "repBrandId": "2011000226",
 *         "bshopItemCount": 1436
 *       }
 *     ],
 *     "sortList": [
 *       {
 *         "key": "sort",
 *         "value": "best",
 *         "name": "인기상품순",
 *         "useYn": "Y"
 *       }
 *     ]
 *   }
 * }
*/