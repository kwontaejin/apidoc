/**
* @api {post} /api/brand/dept/main/datas.ssg 백화점 브랜드 메인
* @apiVersion 0.0.0
* @apiName BrandController.getDeptBrandMain
* @apiGroup Brand
* @apiPermission none
*
* @apiDescription 백화점 브랜드 메인
*
*
* @apiParam {String} [apiVersion]    api버전
* @apiParam {String} [dispCtgId]     전시카테고리ID
*
* @apiParamExample {json} Request-Example :
* {
*	"common": {
*     "apl_ver": "2.3.2",
*       "os_cd": "20",
*       "ts": "20170307155228",
*       "mobil_app_no": "12"
*	},
*	"params": {
*     "dispCtgId": "6000018686"
*	}
* }
*
* @apiExample Example usage:
* curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/brand/dept/main/datas.ssg -d '
* > {"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20170307155228","mobil_app_no":"12"},"params":{"dispCtgId":"6000018686"}}
*
* @apiSuccess {String}     	res_code 응답코드
* @apiSuccess {String}     	res_message 응답메시지
* @apiSuccess {Object}     	data 응답결과값
* @apiSuccess {List} 		data.brandTotalBanrList	전체 카테고리선택시 (1200000000)
* @apiSuccess {String} 		data.brandTotalBanrList.dispCtgId	카테고리ID
* @apiSuccess {List} 		data.brandTotalBanrList.brandBanrList 브랜드배너리스트
* @apiSuccess {String} 		data.brandTotalBanrList.brandBanrList.brandNm 브랜드명
* @apiSuccess {String} 		data.brandTotalBanrList.brandBanrList.imgFileNm 이미지파일명
* @apiSuccess {String} 		data.brandTotalBanrList.brandBanrList.banrSizVal 배너사이즈값
* @apiSuccess {String} 		data.brandTotalBanrList.brandBanrList.lnkdUrl 링크URL
* @apiSuccess {String} 		data.selectedCtgId 선택된 카테고리ID
* @apiSuccess {List} 		data.brandBanrList 브랜드배너리스트
* @apiSuccess {String} 		data.brandBanrList.brandNm 브랜드명
* @apiSuccess {String} 		data.brandBanrList.imgFileNm 이미지파일명
* @apiSuccess {String} 		data.brandBanrList.banrSizVal 배너사이즈값
* @apiSuccess {String} 		data.brandBanrList.lnkdUrl 링크URL
* @apiSuccess {List} 		data.dispCtgList 카테고리리스트
* @apiSuccess {String} 		data.dispCtgList.dispCtgId 카테고리ID
* @apiSuccess {String}		data.dispCtgList.dispCtgNm 카테고리명
* 
* @apiSuccessExample Response-Example : 
* {
* 	"cached": true,
* 	"method": "",
* 	"res_code": "200",
* 	"res_message": "성공",
* 	"data": {
* 		"brandTotalBanrList": [],
* 		"selectedCtgId": "6000018686",
* 		"brandBanrList": [
* 			{
* 				"brandNm": "DJI",
* 				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=3000004442",
* 				"banrSizVal": "750 * 452",
* 				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015122310574859789635973073_939.jpg"
* 			},
* 			  {
* 				"brandNm": "필립스(PHILIPS)",
* 				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000005264",
* 				"banrSizVal": "750 * 452",
* 				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121415113759710685976068_839.jpg"
* 			},
* 			  {
* 				"brandNm": "SONY",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000006154",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121014484535725733577573_575.jpg"
*			},
*			  {
*				"brandNm": "다이슨",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000010602",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121415124735796873575787_249.jpg"
*			},
*			  {
*				"brandNm": "동양매직",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000011257",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121415132035745943579594_172.jpg"
*			},
*			  {
*				"brandNm": "드롱기",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000011400",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121415181059730745979074_350.jpg"
*			},
*			  {
*				"brandNm": "블루에어 (blue air)",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000014887",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121014492125980902592190_446.jpg"
*			},
*			  {
*				"brandNm": "일렉트로룩스",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000020394",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121014470659778755974975_149.jpg"
*			},
*			  {
*				"brandNm": "캐논",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000021774",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121014500625944312599431_305.jpg"
*			},
*			  {
*				"brandNm": "쿠쿠",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2000022211",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121014503025919612596961_980.jpg"
*			},
*			  {
*				"brandNm": "GoPro",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2011011800",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121415195059745865972686_160.jpg"
*			},
*			  {
*				"brandNm": "발뮤다",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=2011015615",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121014475059788845976984_558.jpg"
*			},
*			  {
*				"brandNm": "제네바 (GENEVA)",
*				"lnkdUrl": "http://m.shinsegaemall.ssg.com/dept/disp/brandMain.ssg?ctgId=6000018686&brandId=3000000596",
*				"banrSizVal": "750 * 452",
*				"imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201512/2015121014481435760863571186_351.jpg"
*			}
*		],
*		"dispCtgList": [
*			{
*				"dispCtgNm": "전체",
*				"dispCtgId": "1200000000"
*			},
*			  {
*				"dispCtgNm": "해외명품",
*				"dispCtgId": "6000002167"
*			},
*			  {
*				"dispCtgNm": "명품화장품",
*				"dispCtgId": "3500002635"
*			},
*			  {
*				"dispCtgNm": "패션잡화",
*				"dispCtgId": "3500002795"
*			},
*			  {
*				"dispCtgNm": "패션슈즈",
*				"dispCtgId": "3500002915"
*			},
*			  {
*				"dispCtgNm": "여성캐주얼",
*				"dispCtgId": "3500002258"
*			},
*			  {
*				"dispCtgNm": "여성캐릭터/커리어",
*				"dispCtgId": "3500002344"
*			},
*			  {
*				"dispCtgNm": "언더웨어",
*				"dispCtgId": "3500002430"
*			},
*			  {
*				"dispCtgNm": "진/유니섹스",
*				"dispCtgId": "3500002576"
*			},
*			  {
*				"dispCtgNm": "스포츠패션/슈즈/시즌",
*				"dispCtgId": "3500003592"
*			},
*			  {
*				"dispCtgNm": "등산/골프",
*				"dispCtgId": "6000005881"
*			},
*			  {
*				"dispCtgNm": "남성캐주얼",
*				"dispCtgId": "3500002472"
*			},
*			  {
*				"dispCtgNm": "남성정장/셔츠",
*				"dispCtgId": "3500002524"
*			},
*			  {
*				"dispCtgNm": "유아/완구/임부",
*				"dispCtgId": "6000018684"
*			},
*			  {
*				"dispCtgNm": "아동패션/잡화",
*				"dispCtgId": "6000018660"
*			},
*			  {
*				"dispCtgNm": "가전",
*				"dispCtgId": "6000018686"
*			},
*			  {
*				"dispCtgNm": "가정생활",
*				"dispCtgId": "6000018659"
*			},
*			  {
*				"dispCtgNm": "식품",
*				"dispCtgId": "3500003732"
*			},
*			  {
*				"dispCtgNm": "쓱콘·식당가/베이커리",
*				"dispCtgId": "6000028294"
*			}
*		]
*	 }
* }
*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========

/**
* @api {post} /api/brand/boots/datas/collectionUI/brandShopList  부츠 브랜드 메인
* @apiVersion 0.0.0
* @apiName BshopController.getBrandShopListDatasForCollectionUI
* @apiGroup Brand
* @apiPermission none
*
* @apiDescription 부츠 브랜드 메인
*
* @apiParam {String="6003"} siteNo 사이트번호
* @apiParamExample {json} Request-Example :
* {
*    "common":{
*        "apl_ver":"2.3.2",
*        "os_cd":"20",
*        "ts":"20161101141508",
*        "mobil_app_no":"55"
*    },
*    "params":{
*        "siteNo":"6003"
*    }
* }
*
* @apiExample Example usage:
* curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://m.apps.ssg.com/api/bshop/main/datas/item.ssg -d '
* {"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20170307155228","mobil_app_no":"12"},"params":{"siteNo":"6003"}}
* @apiSuccess {String}	res_code 응답코드
* @apiSuccess {String}	res_message 응답메시지
* @apiSuccess {Object}	data 응답결과값
* @apiSuccess {List}	data.brandShopList 브랜드 매장리스트
* @apiSuccess {Object}	data.brandShopList.brandShop 브랜드매장(배너공통DTO 사용)
* @apiSuccess {String}	data.brandShopList.brandShop.id 브랜드아이디
* @apiSuccess {String}	data.brandShopList.brandShop.title 브랜드명
* @apiSuccess {String}	data.brandShopList.brandShop.desc 브랜드설명
* @apiSuccess {String}	data.brandShopList.brandShop.lnkdUrl 링크URL
* @apiSuccess {String}	data.brandShopList.brandShop.lnkdType 링크타입
* @apiSuccess {String}	data.brandShopList.brandShop.imgFileNm 이미지파일명
* @apiSuccess {String}	data.brandShopList.brandShop.strtDts 배너전시시작일
* @apiSuccess {String}	data.brandShopList.brandShop.imgWidth 배너이미지너비
* @apiSuccess {String}	data.brandShopList.brandShop.imgHeight 배너이미지높이
* @apiSuccess {String}	data.brandShopList.brandShop.dispOrdr 전시순서
* @apiSuccess {List}	data.itemList 상품리스트 [상품유닛리스트](#api-header-for-a-submenu-itemunit) (v2.0)

* @apiSuccessExample Response-Example : 
*  {
*	"cached": false,
*	"method": "",
*	"res_code": "200",
*	"res_message": "성공",
*	"data": {
*		"brandShopList": [
*		  	{
*				"itemList": [],
*				"brandShop": {
*					"id": "1030770237",
*					"title": "No7",
*					"desc": "No7",
*					"lnkdUrl": "http://m.boots.ssg.com/disp/specialBrandShop.ssg?ctgId=6000031301&brandId=1030770237",
*					"lnkdType": "10",
*					"imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201707/2017071717313843304224335422_397.jpg&w=508&h=386&edit=p&pad_color=&t=e7f7b7eefb13da0b7a5cf9438a6c59f00555b2ac",
*					"strtDts": "20170426000000",
*					"endDts": "20990426235959",
*					"maiTitleNm1": "",
*					"maiTitleNm2": "",
*					"subtitlNm1": "",
*					"subtitlNm2": "",
*					"iconTgtLst": "",
*					"titleShadUseYn": "",
*					"imgWidth": "508",
*					"imgHeight": "386",
*					"dispOrdr": "0",
*					"bakgrndColrCdVal": "",
*					"iconTgtList": []
*				}
*			},
*			{
*				"itemList": [],
*				"brandShop": {
*					"id": "1030770239",
*					"title": "Botanics",
*					"desc": "Botanics",
*					"lnkdUrl": "http://m.boots.ssg.com/disp/specialBrandShop.ssg?ctgId=6000031297&brandId=1030770239",
*					"lnkdType": "10",
*					"imgFileNm": "http://img.ssgcdn.com/trans.ssg?src=/cmpt/banner/201707/2017071717351280441158048115_698.jpg&w=508&h=386&edit=p&pad_color=&t=717166b55119eb50994d3ccb1fd89e7f80dee7f0",
*					"strtDts": "20170717000000",
*					"endDts": "20990717235959",
*					"maiTitleNm1": "",
*					"maiTitleNm2": "",
*					"subtitlNm1": "",
*					"subtitlNm2": "",
*					"iconTgtLst": "",
*					"titleShadUseYn": "",
*					"imgWidth": "508",
* 					"imgHeight": "386",
* 					"dispOrdr": "0",
* 					"bakgrndColrCdVal": "",
*					"iconTgtList": []
* 				}
* 			}
* 		}
* 	}
* 
*/

// ========== ========== ========== ========== ========== ========== ========== ========== ========== ==========