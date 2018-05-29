/**
 * @api {post} /api/brandNew/comm/datas.ssg 공통 브랜드
 * @apiVersion 0.0.0
 * @apiName BrandCommController.brand
 * @apiGroup Common Brand
 * @apiPermission none
 *
 * @apiDescription 공통 브랜드 API
 *
 * @apiParam {String} [apiVersion]    api버전
 * @apiParam {String} [itemImgSize]   아이템이미지사이즈
 * @apiParam {String} siteNo          사이트번호
 * @apiParam {String} brandId         브랜드Id
 * @apiParam {String} [dispCtgId]     전시카테고리ID
 * @apiParam {String="best","regdt","cnt","prcdsc","prcasc"} [sort="best"]        정렬코드
 * @apiParam {String} [page]          페이지번호
 * @apiParam {String} [shpp]          배송타입
 * @apiParam {String} [cls]           배송타입
 * @apiParam {String} [minPrc]        최저 가격
 * @apiParam {String} [maxPrc]        최대 가격
 * @apiParam {String} [pickuSalestr]  매직픽업 점포번호(다수일때 , 구분)
 * @apiParam {String} [benefit]        혜택
 * @apiParam {String} [salestrNo]      백화점 점포번호
 * @apiParam {String} target        전체(dtl 제외) : mobile_all, 상품 : mobile_item, 상세검색: mobile_dtl
 *
 *
 * @apiParamExample {json} Request-Example :
 * {
 *   "common": {
 *       "apl_ver": "2.3.2",
 *       "os_cd": "20",
 *       "ts": "20170307155228",
 *       "mobil_app_no": "12"
 *   },
 *   "params": {
 *       "brandId": "2000007206",
 *       "siteNo": "6005",
 *       "target" : "mobile_all"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/brandNew/comm/datas.ssg -d '
 * > {"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20170307155228","mobil_app_no":"12"},"params":{"brandIds":"2000007206", "siteNo":"6005", "target" : "mobile_all"}}
 *
 * @apiSuccess {String}     res_code 응답코드
 * @apiSuccess {String}     res_message 응답메시지
 * @apiSuccess {Object}     data 응답결과값
 * @apiSuccess {List} data.item
 * @apiSuccess {String} data.item.itemCount						카테고리 상품수
 * @apiSuccess {String} data.item.hasNext						페이지더보기유무
 * @apiSuccess {List} data.item.itemList [상품유닛리스트](#api-header-for-a-submenu-itemunit)
 * @apiSuccess {Object} data.sivBrandImage                      SIV용 배너 이미지
 * @apiSuccess {List} data.total
 * @apiSuccess {List} data.total.qshpp           			    optionFilterList 존재 여부
 * @apiSuccess {List} data.total.sortFilterList 			    정렬리스트
 * @apiSuccess {List} data.total.pickuList 				        매직픽업점포 리스트
 * @apiSuccess {List} data.total.salestrNoList 				    백화점 리스트
 * @apiSuccess {List} data.total.optionFilterList       		상품 필터
 * @apiSuccess {List} data.total.clipInfo                  		클리 정보
 * @apiSuccess {List} data.siblingCtgList 						동일레벨 카테고리 리스트
 * @apiSuccess {List} data.priorCtgInfo 						부모 카테고리 정보
 * @apiSuccess {List} data.dispCtgList	 						카테고리리스트
 * @apiSuccess {String} data.title								카테고리명
 * @apiSuccess {String} data.siteNo								사이트번호
 * @apiSuccess {String} data.defaultViewType					기본 뷰 타입
 * @apiSuccess {String} data.defaultCd							기본정렬값
 * @apiSuccess {String} data.dispCtgLvl							카테고리 뎁스
 * @apiSuccess {List} data.itemDtl
 * @apiSuccess {List} data.itemDtl.benefitFilterList            혜택리스트
 * @apiSuccess {List} data.itemDtl.sortFilterList               정렬리스트
 * @apiSuccess {List} data.itemDtl.optionFilterList             상품 필터
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "total": {
 *             "qshpp": "Y",
 *             "useSizeYn": "N",
 *             "sortFilterList": [
 *                 {
 *                     "key": "sort",
 *                     "value": "best",
 *                     "name": "추천순",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "sort",
 *                     "value": "prcasc",
 *                     "name": "저가격순",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "sort",
 *                     "value": "prcdsc",
 *                     "name": "고가격순",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "sort",
 *                     "value": "regdt",
 *                     "name": "신상품순",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "sort",
 *                     "value": "cnt",
 *                     "name": "상품평순",
 *                     "useYn": "Y"
 *                 }
 *             ],
 *             "pickuList": [
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "",
 *                     "name": "전체",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1002",
 *                     "name": "본점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1005",
 *                     "name": "인천점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1004",
 *                     "name": "강남점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1006",
 *                     "name": "경기점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1009",
 *                     "name": "센텀시티점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1007",
 *                     "name": "의정부점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1013",
 *                     "name": "영등포점A",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1003",
 *                     "name": "영등포점B",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1010",
 *                     "name": "마산점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1008",
 *                     "name": "광주신세계",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1017",
 *                     "name": "김해점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1018",
 *                     "name": "하남점",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "pickuSalestr",
 *                     "value": "1019",
 *                     "name": "대구신세계",
 *                     "useYn": "Y"
 *                 }
 *             ],
 *             "optionFilterList": [
 *                 {
 *                     "key": "emartItemYn",
 *                     "value": "Y",
 *                     "name": "이마트점포상품",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "shpp",
 *                     "value": "picku",
 *                     "name": "매직픽업",
 *                     "useYn": "Y"
 *                 },
 *                 {
 *                     "key": "shpp",
 *                     "value": "qshpp",
 *                     "name": "퀵배송",
 *                     "useYn": "Y"
 *                 }
 *             ],
 *              "clipInfo": {
 *              "attnDivCd": "20",
 *              "attnTgtIdnfNo1": "5500000001",
 *             "siteNo": "6005"
 *          },
 *         },
 *         "title": "겨울 남성 코트",
 *         "defaultViewType": "bthmb",
 *         "defaultCd": "best",
 *         "item": {
 *             "hasNext": "false",
 *             "itemList": [],
 *             "itemCount": "0"
 *         },
 *         "dispCtgLvl": "3",
 *         "dispCtgList": []
 *     }
 * }
 */