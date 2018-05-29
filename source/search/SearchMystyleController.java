/**
 * @api {post} /api/search/mystyle/datas.ssg 내취타취
 * @apiVersion 0.0.0
 * @apiName SearchCommController.getMyStyleList
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 통합검색 API
 *
 * 
 * @apiParam {String} [apiVersion]    api버전
 * @apiParam {String} [siteNo]    요청 사이트번호
 * @apiParam {String="mobile_mystyle"} [target="mobile_mystyle"]	 검색을 요청할 대상
 * @apiParam {String} [query]		검색어
 * @apiParam {String} [page]          페이지번호
 * @apiParam {String} [count]         요청상품수
 * @apiParam {String} [itemImgSize]   아이템이미지사이즈
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
 *       "target": "mobile_mystyle"
 *     , "siteNo": "6001"
 *     , "query": "나이키"
 *     , "page": "1"
 *     , "itemImgSize": "360"
 *     , "count": "20"
 *     , "apiVersion": "1.0"
 *   }
 * }
 * 
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/search/mystyle/datas.ssg -d '
 * > {"common":{"apl_ver":"1.1.3","os_cd":"20","ts":"20170808134313","mobil_app_no":"51"},"params":{"siteNo":"6001","target":"mobile_mystyle","query":"나이키","page":"1","itemImgSize":"360","count":"20", "apiVersion":"1.0"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {List} data.itemList				상품검색결과 리스트
 * @apiSuccess {String} data.itemCount			상품검색결과 수
 * @apiSuccess {String} data.maiTitleNm1		메인타이틀1
 * @apiSuccess {String} data.maiTitleNm2		메인타이틀2
 * @apiSuccess {String} data.subtitlNm1			서브타이틀1
 * @apiSuccess {String} data.subtitlNm2			서브타이틀2
 *
 * @apiSuccessExample Response (example):
  * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "maiTitleNm2": "타인의취향",
 *         "subtitlNm1": "#어떤걸 많이봐쓱",
 *         "subtitlNm2": "#어떤걸 자주샀쓱",
 *         "itemCount": "5",
 *         "maiTitleNm1": "내취향",
 *         "itemList": [
 *             {
 *                 "itemId": "1000013227176",
 *                 "itemNm": "매장정품 687942 FC AW77 풀집 후디 AS NIKE FC AW77 FZ HOODY 택1",
 *                 "displayPrc": "119000",
 *                 "strikeOutPrc": "",
 *                 "minOnetOrdPsblQty": "1",
 *                 "maxOnetOrdPsblQty": "50",
 *                 "soldOutYn": "N",
 *                 "stoppedSellingYn": "N",
 *                 "siteNo": "6001",
 *                 "siteNm": "emart mall",
 *                 "salestrNo": "6005",
 *                 "salestrNm": "",
 *                 "sellpntNm": "",
 *                 "brandNm": "나이키",
 *                 "goItemDetailYn": "Y",
 *                 "msgWhenGoToItemDetail": "이 상품은 옵션이 있는 상품 입니다.\n상품상세에서 옵션을 선택해주세요.",
 *                 "attnTgtIdnfNo1": "1000013227176",
 *                 "attnTgtIdnfNo2": "6005",
 *                 "attnDivCd": "10",
 *                 "needAdultCertification": "false",
 *                 "itemLnkd": "http://local-m.emart.ssg.com/item/itemView.ssg?itemId=1000013227176&siteNo=6001&salestrNo=6005&tlidSrchWd=나이키",
 *                 "itemImgUrl": "http://dev-item.ssgcdn.com/76/71/22/item/1000013227176_i1_360.jpg",
 *                 "itemImgUrlList": [
 *                     "http://dev-item.ssgcdn.com/76/71/22/item/1000013227176_i1_360.jpg"
 *                 ],
 *                 "planDt": "",
 *                 "dataFileNm": "",
 *                 "pickuItemYn": "N",
 *                 "qshppPsblYn": "N",
 *                 "mltSellQty": "1",
 *                 "uItemSamePrcYn": "Y",
 *                 "itemOrdQty": "",
 *                 "itemOrdQtyType": "DEAL",
 *                 "tildeDispYn": "N",
 *                 "recompPoint": "",
 *                 "recomRegCnt": "",
 *                 "sellUnitPrc": "",
 *                 "sellCapaUnitNmWithUnitCapa": "",
 *                 "replaceBtnDispYn": "N",
 *                 "arrivalNotiBtnDispYn": "N",
 *                 "advertAcctId": "",
 *                 "advertBidId": "",
 *                 "advertBilngTypeCd": "",
 *                 "advertKindCd": "",
 *                 "cartPsblType": "",
 *                 "zoomImgUrls": [],
 *                 "benefitGrp1": [],
 *                 "benefitGrp2": [],
 *                 "benefitGrp3": [],
 *                 "benefitGrp4": [],
 *                 "itemTagNmList": [],
 *                 "likeTitleDesc": "<span style='font-weight:bold'>내가.</span>많이본"
 *             }
 *         ]
 *     }
 * }
*/