/**
 * @api {post} /api/starfield/main.ssg 스타필드 메인
 * @apiVersion 0.0.0
 * @apiName StarfieldMainController.main
 * @apiGroup Starfield
 * @apiPermission none
 *
 * @apiDescription 스타필드 메인 API
 *
 *
 * @apiParam {String} [apiVersion]    api버전
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
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/starfield/main.ssg -d
 *
 * @apiSuccess {String}     res_code 응답코드
 * @apiSuccess {String}     res_message 응답메시지
 * @apiSuccess {Object}     data 응답결과값
 * @apiSuccess {List} data.strList                                  스타필드 점포
 * @apiSuccess {String} data.strList.strId                          스타필드 점포 번호
 * @apiSuccess {String} data.strList.strNm                          스타필드 점포 이름
 * @apiSuccess {Object} data.strList.strBanrList                    스타필드 점포별 배너
 * @apiSuccess {List} data.strList.strBanrList.img                  스타필드 점포별 이미지 [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
 * @apiSuccess {List} data.strList.strBanrList.title                스타필드 점포별 타이틀 [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
 * @apiSuccess {List} data.strList.strBanrList.desc                 스타필드 점포별 본문 [코너배너유닛](#api-header-for-a-submenu-commonconrbanr)
 * @apiSuccess {List} data.strList.heroBanrList                     스타필드 점포별 히어로 배너
 * @apiSuccess {String} data.strList.heroBanrList.offlineStrId      점포 번호
 * @apiSuccess {String} data.strList.heroBanrList.sfBanrId                        히어로 배너 번호
 * @apiSuccess {String} data.strList.heroBanrList.sfBanrNm                        히어로 배너 명
 * @apiSuccess {String} data.strList.heroBanrList.pcImgUrl                        피씨 이미지URL
 * @apiSuccess {String} data.strList.heroBanrList.pcTextImgUrl                   피씨 텍스트이미지URL
 * @apiSuccess {String} data.strList.heroBanrList.mobilImgUrl                     모바일 이미지URL
 * @apiSuccess {String} data.strList.heroBanrList.mobilTextImgUrl                모바일 텍스트이미지URL
 * @apiSuccess {String} data.strList.heroBanrList.sfBanrLinkTypeCd              배너 링크 타입
 * @apiSuccess {String} data.strList.heroBanrList.sfBanrLinkId                   배너 링크 값
 * @apiSuccess {String} data.strList.heroBanrList.sfBanrLink                      배너 링크
 *
 * @apiSuccessExample Response (example):
 * {
 * 	"cached": false,
 * 	"method": "",
 * 	"res_code": "200",
 * 	"res_message": "성공",
 * 	"data": {
 * 		"strList": [{
 * 				"heroBanrList": [{
 * 						"offlineStrId": "01",
 * 						"sfBanrId": "HB2018012614143095856255",
 * 						"sfBanrNm": "아쿠아필드 하남에서 따뜻한 겨울 보내기",
 * 						"pcImgUrl": "/starfield/heroBanr/201803/08/IM20180126021407809424.png",
 * 						"pcTextImgUrl": "/starfield/heroBanr/201803/08/IM20180126021407902246.png",
 * 						"mobilImgUrl": "/starfield/heroBanr/201803/08/IM20180126021407984281.png",
 * 						"mobilTextImgUrl": "/starfield/heroBanr/201803/08/IM20180126021408061830.png",
 * 						"sfBanrLinkTypeCd": "10",
 * 						"sfBanrLinkId": "EV201801081452462659",
 * 						"dispOrdr": null,
 * 						"dispStrtDts": null,
 * 						"dispEndDts": null,
 * 						"dispYn": null,
 * 						"useYn": null,
 * 						"regpeId": null,
 * 						"regDts": null,
 * 						"modpeId": null,
 * 						"modDts": null,
 * 						"page": 1,
 * 						"pageSize": 10,
 * 						"startRownum": 0,
 * 						"endRownum": 0,
 * 						"affectedCount": 0,
 * 						"totalRecordCount": 0
 * 					}
 * 				],
 * 				"strBanrList": {
 * 					"img": [{
 * 							"id": "",
 * 							"title": "하남 이미지",
 * 							"desc": "하남 이미지",
 * 							"lnkdUrl": "1",
 * 							"lnkdType": "20",
 * 							"imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201803/2018032217035937200983724998_377.png",
 * 							"strtDts": "20180322000000",
 * 							"endDts": "20190322235959",
 * 							"maiTitleNm1": "",
 * 							"maiTitleNm2": "",
 * 							"subtitlNm1": "",
 * 							"subtitlNm2": "",
 * 							"iconTgtLst": "",
 * 							"titleShadUseYn": "",
 * 							"imgWidth": "679",
 * 							"imgHeight": "400",
 * 							"dispOrdr": "0",
 * 							"bakgrndColrCdVal": "",
 * 							"banrRplcTextNm": "하남 이미지",
 * 							"iconTgtList": []
 * 						}
 * 					],
 * 					"title": [{
 * 							"id": "",
 * 							"title": "하남 타이틀",
 * 							"desc": "하남 타이틀",
 * 							"lnkdUrl": "하남타이틀",
 * 							"lnkdType": "20",
 * 							"imgFileNm": "",
 * 							"strtDts": "20180322000000",
 * 							"endDts": "20190322235959",
 * 							"maiTitleNm1": "",
 * 							"maiTitleNm2": "",
 * 							"subtitlNm1": "",
 * 							"subtitlNm2": "",
 * 							"iconTgtLst": "",
 * 							"titleShadUseYn": "",
 * 							"imgWidth": "0",
 * 							"imgHeight": "0",
 * 							"dispOrdr": "0",
 * 							"bakgrndColrCdVal": "",
 * 							"banrRplcTextNm": "",
 * 							"iconTgtList": []
 * 						}
 * 					],
 * 					"desc": [{
 * 							"id": "",
 * 							"title": "하남 본문",
 * 							"desc": "하남 본문",
 * 							"lnkdUrl": "하남본문",
 * 							"lnkdType": "20",
 * 							"imgFileNm": "",
 * 							"strtDts": "20180322000000",
 * 							"endDts": "20190322235959",
 * 							"maiTitleNm1": "",
 * 							"maiTitleNm2": "",
 * 							"subtitlNm1": "",
 * 							"subtitlNm2": "",
 * 							"iconTgtLst": "",
 * 							"titleShadUseYn": "",
 * 							"imgWidth": "0",
 * 							"imgHeight": "0",
 * 							"dispOrdr": "0",
 * 							"bakgrndColrCdVal": "",
 * 							"banrRplcTextNm": "",
 * 							"iconTgtList": []
 * 						}
 * 					]
 * 				},
 * 				"strId": "01",
 * 				"strNm": "하남"
 * 			}, {
 * 				"heroBanrList": [
 * 				],
 * 				"strBanrList": {
 * 					"img": [{
 * 							"id": "",
 * 							"title": "코엑스 이미지",
 * 							"desc": "코엑스 이미지",
 * 							"lnkdUrl": "코엑스이미지",
 * 							"lnkdType": "20",
 * 							"imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201803/2018032217065437249693728079_771.png",
 * 							"strtDts": "20180322000000",
 * 							"endDts": "20190322235959",
 * 							"maiTitleNm1": "",
 * 							"maiTitleNm2": "",
 * 							"subtitlNm1": "",
 * 							"subtitlNm2": "",
 * 							"iconTgtLst": "",
 * 							"titleShadUseYn": "",
 * 							"imgWidth": "679",
 * 							"imgHeight": "400",
 * 							"dispOrdr": "0",
 * 							"bakgrndColrCdVal": "",
 * 							"banrRplcTextNm": "코엑스 이미지",
 * 							"iconTgtList": []
 * 						}
 * 					],
 * 					"title": [{
 * 							"id": "",
 * 							"title": "코엑스 타이틀",
 * 							"desc": "코엑스 타이틀",
 * 							"lnkdUrl": "코엑스타이틀",
 * 							"lnkdType": "20",
 * 							"imgFileNm": "",
 * 							"strtDts": "20180322000000",
 * 							"endDts": "20190322235959",
 * 							"maiTitleNm1": "",
 * 							"maiTitleNm2": "",
 * 							"subtitlNm1": "",
 * 							"subtitlNm2": "",
 * 							"iconTgtLst": "",
 * 							"titleShadUseYn": "",
 * 							"imgWidth": "0",
 * 							"imgHeight": "0",
 * 							"dispOrdr": "0",
 * 							"bakgrndColrCdVal": "",
 * 							"banrRplcTextNm": "",
 * 							"iconTgtList": []
 * 						}
 * 					],
 * 					"desc": [{
 * 							"id": "",
 * 							"title": "코엑스 본문",
 * 							"desc": "코엑스 본문",
 * 							"lnkdUrl": "코엑스본문",
 * 							"lnkdType": "20",
 * 							"imgFileNm": "",
 * 							"strtDts": "20180322000000",
 * 							"endDts": "20190322235959",
 * 							"maiTitleNm1": "",
 * 							"maiTitleNm2": "",
 * 							"subtitlNm1": "",
 * 							"subtitlNm2": "",
 * 							"iconTgtLst": "",
 * 							"titleShadUseYn": "",
 * 							"imgWidth": "0",
 * 							"imgHeight": "0",
 * 							"dispOrdr": "0",
 * 							"bakgrndColrCdVal": "",
 * 							"banrRplcTextNm": "",
 * 							"iconTgtList": []
 * 						}
 * 					]
 * 				},
 * 				"strId": "02",
 * 				"strNm": "코엑스몰"
 * 			}, {
 * 				"heroBanrList": [
 * 				],
 * 				"strBanrList": {
 * 					"img": [
 * 					],
 * 					"title": [
 * 					],
 * 					"desc": [
 * 					]
 * 				},
 * 				"strId": "03",
 * 				"strNm": "고양"
 * 			}, {
 * 				"strBanrList": {
 * 					"img": [
 * 					],
 * 					"title": [
 * 					],
 * 					"desc": [
 * 					]
 * 				},
 * 				"strId": "00",
 * 				"strNm": "메인"
 * 			}
 * 		]
 * 	}
 * }
 *
 */