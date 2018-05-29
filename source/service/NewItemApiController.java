/**

@api {post} /api/howdy/newarrivals/datas.ssg howdy - 신상품 - New Arrivals
@apiVersion 1.0.0
@apiName HowdyServiceController.newArrivalsMain
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
howdy 신상품 API

<br>- source : HowdyServiceController.newArrivalsMain()
<br>- 담당자 : 박정환P

@apiParam {String} dataIndex 데이터 index (0: sortList, ctgIdList, brandList, rcmdBanrList 노출)
@apiParam {String} apiVersion API 버전
@apiParam {String} [page="1"] 페이지번호
@apiParam {String} [pageSize="30"] 페이지사이즈
@apiParam {String="best", "regdt", "prcdsc", "prcasc"} [sort="best"] 정렬 (best: RECOMMEND regdt : NEWEST, prcdsc : HIGH PRICE, prcasc : LOW PRICE)
@apiParam {String} [ctgId] 전시카테고리ID
@apiParam {String} [brand] 브랜드ID (브랜드ID 여러 개 입력시 | 로 연결 ex) 1010000723|1010100001)
@apiParam {String} itemImgSize 아이템이미지사이즈


@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext 다음페이지 여부
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 개수
@apiSuccess {List} data.itemList 상품 리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛
@apiSuccess {List} data.sortList 정렬 리스트
@apiSuccess {String} data.sortList.sort 정렬
@apiSuccess {String} data.sortList.sortNm 정렬명
@apiSuccess {List} data.brandList 브랜드 리스트
@apiSuccess {String} data.brandList.brandNm 브래늗명
@apiSuccess {String} data.brandList.brandId 브랜드ID
@apiSuccess {List} data.categoryList 카테고리 리스트
@apiSuccess {String} data.categoryList.dispCtgNm 카테고리명
@apiSuccess {String} data.categoryList.dispCtgId 카테고리ID
@apiSuccess {List} data.rcmdBanrList 상품 리스트
@apiSuccess {Object} data.rcmdBanrList.banr 공통배너유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/newarrival/siv/datas/item.ssg SIV - 신상품
@apiVersion 1.0.0
@apiName NewArrivalController.getNewArrivalSIVDatasItem
@apiGroup Service
@apiSampleRequest off
@apiPermission none

@apiDescription
SIV 신상품 API

<br>- source : NewArrivalController.getNewArrivalSIVDatasItem()
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
