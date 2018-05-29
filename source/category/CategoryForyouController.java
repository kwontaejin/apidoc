/**
 * @api {post} /api/category/forYou/datas.ssg 카테고리 포유 데이터
 * @apiVersion 0.0.0
 * @apiName CategoryForYouController.category
 * @apiGroup Common Category
 * @apiPermission none
 *
 * @apiDescription 공통 카테고리 API
 *
 * 
 * @apiParam {String} [apiVersion]    api버전
 * @apiParam {String} [itemImgSize]   아이템이미지사이즈
 * @apiParam {String} dispCtgId     전시카테고리ID
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
 *       "dispCtgId": "0006110002"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/category/comm/datas.ssg -d '
 * > {"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20170307155228","mobil_app_no":"12"},"params":{"dispCtgId":"0006110002"}}
 *
 * @apiSuccess {String}     res_code 응답코드
 * @apiSuccess {String}     res_message 응답메시지
 * @apiSuccess {Object}     data 응답결과값
 * @apiSuccess {List} data.forYouItem
 * @apiSuccess {String} data.forYouItem.psnzDivCd            포유 코드 10 : 구매할 때 되지 않으셨나요?<br />20 : 장바구니 담은 상품이 할인 중입니다.<br />50 : 최근 본 상품이 할인 중입니다.<br />51 : 이 상품도 맘에 드실걸요?
 * @apiSuccess {String} data.forYouItem.psnzDivTitle         포유 문구
 * @apiSuccess {List} data.forYouItem.itemList             [포유상품유닛리스트](#api-header-for-a-submenu-itemunit)
 *
 *
 * @apiSuccessExample Response (example):
 * {
 * 	"cached": false,
 * 	"method": "",
 * 	"res_code": "200",
 * 	"res_message": "성공",
 * 	"data": {
 * 		"forYouItem": [{
 * 				"itemList": [{
 * 						"itemId": "1000017147790",
 * 						"itemNm": "[노브랜드] 굿밀크 우유 1L",
 * 						"displayPrc": "1680",
 * 						"strikeOutPrc": "",
 * 						"minOnetOrdPsblQty": "1",
 * 						"maxOnetOrdPsblQty": "20",
 * 						"soldOutYn": "N",
 * 						"stoppedSellingYn": "N",
 * 						"siteNo": "6001",
 * 						"siteNm": "이마트몰",
 * 						"salestrNo": "2449",
 * 						"salestrNm": "emart NE.O.002",
 * 						"sellpntNm": "",
 * 						"brandNm": "No Brand",
 * 						"goItemDetailYn": "N",
 * 						"msgWhenGoToItemDetail": "",
 * 						"attnTgtIdnfNo1": "1000017147790",
 * 						"attnTgtIdnfNo2": "2449",
 * 						"attnDivCd": "10",
 * 						"needAdultCertification": "false",
 * 						"itemLnkd": "http://qa-m.ssg.com/item/itemView.ssg?itemId=1000017147790&siteNo=6001&salestrNo=2449",
 * 						"itemImgUrl": "http://qa-item.ssgcdn.com/90/77/14/item/1000017147790_i1_500.jpg",
 * 						"itemImgUrlList": [
 * 							"http://qa-item.ssgcdn.com/90/77/14/item/1000017147790_i1_500.jpg",
 * 							"http://qa-item.ssgcdn.com/90/77/14/item/1000017147790_i2_500.jpg",
 * 							"http://qa-item.ssgcdn.com/90/77/14/item/1000017147790_i3_500.jpg"
 * 						],
 * 						"imgSrchPsblYn": "N",
 * 						"planDt": "",
 * 						"dataFileNm": "",
 * 						"pickuItemYn": "N",
 * 						"qshppPsblYn": "N",
 * 						"mltSellQty": "1",
 * 						"uItemSamePrcYn": "Y",
 * 						"itemOrdQty": "",
 * 						"itemOrdQtyType": "DEAL",
 * 						"tildeDispYn": "N",
 * 						"recompPoint": "4.91",
 * 						"recomRegCnt": "55840",
 * 						"sellUnitPrc": "",
 * 						"sellCapaUnitNmWithUnitCapa": "",
 * 						"replaceBtnDispYn": "N",
 * 						"arrivalNotiBtnDispYn": "N",
 * 						"advertAcctId": "",
 * 						"advertBidId": "",
 * 						"advertExtensTeryDivCd": "",
 * 						"advertBilngTypeCd": "",
 * 						"advertKindCd": "",
 * 						"cartPsblType": "",
 * 						"zoomImgUrls": [],
 * 						"benefitGrp1": [],
 * 						"benefitGrp2": [{
 * 								"type": "100",
 * 								"txt": "쓱-배송"
 * 							}
 * 						],
 * 						"benefitGrp3": [],
 * 						"benefitGrp4": [],
 * 						"itemTagNmList": [
 * 							"고소하고맛있어요",
 * 							"가성비최고입니다",
 * 							"노브랜드는사랑입니다",
 * 							"노브랜드우유맛있어요",
 * 							"요거트용",
 * 							"가성비짱임",
 * 							"맛잇어요또시킵니다",
 * 							"가성비갑입니다"
 * 						],
 * 						"itemTagNmAndItemCnt": [{
 * 								"txt": "고소하고맛있어요",
 * 								"cnt": "2433"
 * 							}, {
 * 								"txt": "가성비최고입니다",
 * 								"cnt": "693"
 * 							}, {
 * 								"txt": "노브랜드는사랑입니다",
 * 								"cnt": "101"
 * 							}, {
 * 								"txt": "노브랜드우유맛있어요",
 * 								"cnt": "1"
 * 							}, {
 * 								"txt": "요거트용",
 * 								"cnt": "39"
 * 							}, {
 * 								"txt": "가성비짱임",
 * 								"cnt": "55"
 * 							}, {
 * 								"txt": "맛잇어요또시킵니다",
 * 								"cnt": "19"
 * 							}, {
 * 								"txt": "가성비갑입니다",
 * 								"cnt": "96"
 * 							}
 * 						]
 * 					}, {
 * 						"itemId": "1000016842203",
 * 						"itemNm": "[노브랜드] 별미 포기 김치 3.5kg",
 * 						"displayPrc": "14480",
 * 						"strikeOutPrc": "",
 * 						"minOnetOrdPsblQty": "1",
 * 						"maxOnetOrdPsblQty": "20",
 * 						"soldOutYn": "N",
 * 						"stoppedSellingYn": "N",
 * 						"siteNo": "6001",
 * 						"siteNm": "이마트몰",
 * 						"salestrNo": "2449",
 * 						"salestrNm": "emart NE.O.002",
 * 						"sellpntNm": "",
 * 						"brandNm": "No Brand",
 * 						"goItemDetailYn": "N",
 * 						"msgWhenGoToItemDetail": "",
 * 						"attnTgtIdnfNo1": "1000016842203",
 * 						"attnTgtIdnfNo2": "2449",
 * 						"attnDivCd": "10",
 * 						"needAdultCertification": "false",
 * 						"itemLnkd": "http://qa-m.ssg.com/item/itemView.ssg?itemId=1000016842203&siteNo=6001&salestrNo=2449",
 * 						"itemImgUrl": "http://qa-item.ssgcdn.com/03/22/84/item/1000016842203_i1_500.jpg",
 * 						"itemImgUrlList": [
 * 							"http://qa-item.ssgcdn.com/03/22/84/item/1000016842203_i1_500.jpg",
 * 							"http://qa-item.ssgcdn.com/03/22/84/item/1000016842203_i2_500.jpg"
 * 						],
 * 						"imgSrchPsblYn": "N",
 * 						"planDt": "",
 * 						"dataFileNm": "",
 * 						"pickuItemYn": "N",
 * 						"qshppPsblYn": "N",
 * 						"mltSellQty": "1",
 * 						"uItemSamePrcYn": "Y",
 * 						"itemOrdQty": "",
 * 						"itemOrdQtyType": "DEAL",
 * 						"tildeDispYn": "N",
 * 						"recompPoint": "4.75",
 * 						"recomRegCnt": "9362",
 * 						"sellUnitPrc": "",
 * 						"sellCapaUnitNmWithUnitCapa": "",
 * 						"replaceBtnDispYn": "N",
 * 						"arrivalNotiBtnDispYn": "N",
 * 						"advertAcctId": "",
 * 						"advertBidId": "",
 * 						"advertExtensTeryDivCd": "",
 * 						"advertBilngTypeCd": "",
 * 						"advertKindCd": "",
 * 						"cartPsblType": "",
 * 						"zoomImgUrls": [],
 * 						"benefitGrp1": [],
 * 						"benefitGrp2": [{
 * 								"type": "100",
 * 								"txt": "쓱-배송"
 * 							}
 * 						],
 * 						"benefitGrp3": [],
 * 						"benefitGrp4": [],
 * 						"itemTagNmList": [
 * 							"짜지않고맛있어요",
 * 							"시원하고맛있어요",
 * 							"김치찌개용",
 * 							"가성비최고인듯해요",
 * 							"김치맛괜찮아요",
 * 							"노브랜드김치도괜찮아요",
 * 							"노브랜드김치최고입니다",
 * 							"싼맛에먹습니다"
 * 						],
 * 						"itemTagNmAndItemCnt": [{
 * 								"txt": "짜지않고맛있어요",
 * 								"cnt": "498"
 * 							}, {
 * 								"txt": "시원하고맛있어요",
 * 								"cnt": "254"
 * 							}, {
 * 								"txt": "김치찌개용",
 * 								"cnt": "204"
 * 							}, {
 * 								"txt": "가성비최고인듯해요",
 * 								"cnt": "14"
 * 							}, {
 * 								"txt": "김치맛괜찮아요",
 * 								"cnt": "5"
 * 							}, {
 * 								"txt": "노브랜드김치도괜찮아요",
 * 								"cnt": "1"
 * 							}, {
 * 								"txt": "노브랜드김치최고입니다",
 * 								"cnt": "1"
 * 							}, {
 * 								"txt": "싼맛에먹습니다",
 * 								"cnt": "31"
 *  							}
 * 						]
 * 					}
 * 				],
 * 				"psnzDivTitle": "구매할 때 되지 않으셨나요?"
 * 				"psnzDivCd": "10"
 * 			},
 * 		    {}]
 * 		}
 * }
 *
 */