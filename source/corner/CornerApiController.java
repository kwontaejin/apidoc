/**

@api {post} /api/cornr/datas.ssg 코너 정보
@apiVersion 1.0.0
@apiName CornrController.getCornrDatas
@apiGroup Corner
@apiSampleRequest off
@apiPermission none

@apiDescription
코너 정보 조회 API

/api/refrigerator/cornr/datas.ssg 동일

<br>- source : CornrController.getCornrDatas()
<br>- 담당자 : 박정환P

@apiParam {String} [cornrId] 코너ID (코너ID 또는 카테고리ID 반드시 필요)
@apiParam {String} [dispCtgId] 전시카테고리ID (코너ID 또는 카테고리ID 반드시 필요)
@apiParam {String} [siteNo] 사이트번호

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.key 코너구분값 (화면에서 넘겨준값 그대로 return)
@apiSuccess {List} data.cornrSetList 코너세트리스트
@apiSuccess {String} data.cornrSetList.type 코너구성대상유형 (10: 상품, 30: 배너, 60: 동영상, 70: 기획전, 130:레시피)
@apiSuccess {List} data.cornrSetList.cornrCmptTgtList 코너구성정보 리스트 (type에 따라 변경됨)
@apiSuccess {List} data.sortList 정렬리스
@apiSuccess {String} data.sortList.sortCd 정렬코드 (best, regbt, prcdsc, prcasc, cnt)
@apiSuccess {String} data.sortList.sortNm 정렬명 (추천상품순, 신상품순, 높은가격순, 낮은가격순, 상품평많은순)

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**

@api {post} /api/cornr/item/datas.ssg 코너 상품 리스트
@apiVersion 1.0.0
@apiName CornrController.getCornrItemListPageDatas
@apiGroup Corner
@apiSampleRequest off
@apiPermission none

@apiDescription
코너 상품 리스트 조회 API

<br>- source : CornrController.getCornrItemListPageDatas()
<br>- 담당자 : 박정환P

@apiParam {String} [dispCtgId] 전시카테고리ID
@apiParam {String} [cornrId] 코너ID (코너값 또는 테마+기획전 값 중 하나는 반드시 필요)
@apiParam {String} [themeId] 테마ID (코너값 또는 테마+기획전 값 중 하나는 반드시 필요)
@apiParam {String} [planShopId] 기획전ID (코너값 또는 테마+기획전 값 중 하나는 반드시 필요)
@apiParam {String} [siteNo="Y"] 사이트번호
@apiParam {String} itemImgSize 상품이미지사이즈
@apiParam {String} [page="1"] 현재페이지
@apiParam {String} [pageSize="20"] 페이지사이즈
@apiParam {String} [sort] 정렬순서 (http://wiki.ssgadm.com/doku.php?id=it%EA%B0%9C%EB%B0%9C1%ED%8C%80:%EC%A0%84%EC%8B%9C:%EA%B3%B5%ED%86%B5_%EB%B3%80%EC%88%98_%ED%8C%8C%EB%9D%BC%EB%AF%B8%ED%84%B0_%EC%A0%95%EC%9D%98)
@apiParam {String} [defaultCd] 기본정렬코드

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값

@apiSuccess {String} res_code 응답코드
@apiSuccess {String} res_message 응답메시지
@apiSuccess {Object} data 응답결과값
@apiSuccess {String} data.hasNext 페이지더보기 여부
@apiSuccess {String} data.pageSize 한페이지당 아이템 row 수
@apiSuccess {Object} data.itemList 상품리스트
@apiSuccess {Object} data.itemList.item 공통상품유닛

*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========
