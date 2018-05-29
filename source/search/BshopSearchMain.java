/**
 * @api {post} /api/bshop/shopmain/datas/search.ssg 샤벳 브랜드매장
 * @apiVersion 0.0.0
 * @apiName BshopSearchController.bshopMain
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 통합검색 API
 *
 * 
 * @apiParam {String} [apiVersion]    api버전
 * @apiParam {String} [siteNo]    요청 사이트번호
 * @apiParam {String="bshop_disp","bshop_disp_item"} [target="bshop_disp"]	 검색을 요청할 대상
 * @apiParam {String="best","sale","prcasc","prcdsc","regdt","cnt"} [sort="best"]        정렬코드
 * @apiParam {String} [page]          페이지번호
 * @apiParam {String} [count]         요청상품수
 * @apiParam {String} [ctgId]			 카테고리아이디
 * @apiParam {String} [shopId]		 BshopId
 * @apiParam {String} [itemImgSize]   아이템이미지사이즈
 * @apiParam {String} [shpp]			 배송유형
 * @apiParam {String} [pickuSalestr]  매직픽업 점포번호
 * @apiParam {String} [pageSize]		  페이지사이즈
 *
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *       "apl_ver": "1.1.3",
 *       "os_cd": "20",
 *       "ts": "20170808134313",
 *       "mobil_app_no": "51"
 *   },
 *   "params": {
 *       "siteNo": "6009",
 *       "target" : "bshop_disp",
 *       "pagingYn" : "Y",
 *       "shopId" : "1000000083",
 *       "pageSize" : "20",
 *       "page" : "1",
 *		 "itemImgSize" : "500"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/bshop/shopmain/datas/search.ssg -d '
 * > {"common":{"apl_ver":"1.1.3","os_cd":"20","ts":"20170808134313","mobil_app_no":"51"},"params":{"target":"bshop_disp","siteNo":"6009","pagingYn":"Y","pageSize":"20","shopId":"1000000083","page":"1","itemImgSize":"500"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {String} data.picku 					매직픽업 여부
 * @apiSuccess {String} data.bshopTitleNm 		브랜드매장 이름
 * @apiSuccess {String} data.bshopId				브랜드매장 ID
 * @apiSuccess {List} data.categoryList				카테고리 리스트
 * @apiSuccess {String} data.bshopImgNm 		브랜드매장 대표이미지
 * @apiSuccess {String} data.hasNext			다음페이지 존재여부
 * @apiSuccess {String} data.itemCount			상품검색결과 수
 * @apiSuccess {List} data.itemList				상품검색결과 리스트
 * @apiSuccess {List} data.sortFilterList 			정렬필터
 * @apiSuccess {List} data.pickuList 				매직픽업 점포 리스트
 * @apiSuccess {String} data.query 				검색어
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *   "cached": false,
 *   "method": "",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
 *     "picku": "Y",
 *     "bshopTitleNm": "무냐무냐",
 *     "bshopId": "1000000083",
 *     "categoryList": [
 *       {
 *         "key": "ctgId",
 *         "value": "",
 *         "name": "전체카테고리",
 *         "useYn": "Y"
 *       },
 *       {
 *         "key": "ctgId",
 *         "value": "6000018684",
 *         "name": "유아/완구/임부",
 *         "useYn": "Y"
 *       },
 *       {
 *         "key": "ctgId",
 *         "value": "6000018660",
 *         "name": "아동패션/잡화",
 *         "useYn": "Y"
 *       }
 *     ],
 *     "bshopImgNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017080316220643306064337606_342.jpg",
 *     "hasNext": "true",
 *     "query": null,
 *     "itemList": [
 *       {
 *         "itemId": "1000016003526",
 *         "itemNm": "무냐 소프트플라워브리프 (아동16S/S)",
 *         "displayPrc": "10800",
 *         "strikeOutPrc": "12000",
 *         "minOnetOrdPsblQty": "1",
 *         "maxOnetOrdPsblQty": "20",
 *         "soldOutYn": "N",
 *         "stoppedSellingYn": "N",
 *         "siteNo": "6009",
 *         "siteNm": "신세계백화점",
 *         "salestrNo": "1002",
 *         "salestrNm": "",
 *         "sellpntNm": "",
 *         "brandNm": "무냐무냐",
 *         "goItemDetailYn": "Y",
 *         "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *         "attnTgtIdnfNo1": "1000016003526",
 *         "attnTgtIdnfNo2": "1002",
 *         "attnDivCd": "10",
 *         "needAdultCertification": "false",
 *         "itemLnkd": "http://m.shinsegaemall.ssg.com/item/itemView.ssg?itemId=1000016003526&siteNo=6009&salestrNo=1002&tlidSrchWd=&srchPgNo=1",
 *         "itemImgUrl": "http://item.ssgcdn.com/26/35/00/item/1000016003526_i1_500.jpg",
 *         "planDt": "",
 *         "dataFileNm": "",
 *         "pickuItemYn": "Y",
 *         "qshppPsblYn": "Y",
 *         "mltSellQty": "1",
 *         "uItemSamePrcYn": "Y",
 *         "itemOrdQty": "",
 *         "itemOrdQtyType": "DEAL",
 *         "tildeDispYn": "N",
 *         "recompPoint": "5",
 *         "recomRegCnt": "20",
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
 *             "txt": "10"
 *           }
 *         ],
 *         "benefitGrp2": [],
 *         "benefitGrp3": [],
 *         "benefitGrp4": [
 *           {
 *             "type": "mpickup",
 *             "txt": "매직픽업"
 *           },
 *           {
 *             "type": "qshpp",
 *             "txt": "퀵배송"
 *           },
 *           {
 *             "type": "ssgtalk",
 *             "txt": "D02227"
 *           }
 *         ]
 *       }
 *     ],
 *     "sortList": [
 *       {
 *         "key": "sort",
 *         "value": "best",
 *         "name": "인기상품순",
 *         "useYn": "Y"
 *       }
 *     ],
 *     "itemCount": "2136",
 *     "pickuList": [
 *       {
 *         "key": "pickuSalestr",
 *         "value": "",
 *         "name": "전체",
 *         "useYn": "Y"
 *       },
 *       {
 *         "key": "pickuSalestr",
 *         "value": "1002",
 *         "name": "본점",
 *         "useYn": "Y"
 *       }
 *     ]
 *   }
 * }
*/