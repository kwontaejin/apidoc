/**
 * @api {post} /api/starfield/str.ssg 스타필드 점포
 * @apiVersion 0.0.0
 * @apiName StarfieldStrController.str
 * @apiGroup Starfield
 * @apiPermission none
 *
 * @apiDescription 스타필드 점포 API
 *
 *
 * @apiParam {String} [apiVersion]    api버전
 * @apiParam {String} [strId]    점포번호
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
 *      "strId" : "01"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/starfield/str.ssg -d '
 * > {"common":{"apl_ver":"2.3.2","os_cd":"20","ts":"20170307155228","mobil_app_no":"12"},"params":{"strId":"01"}}
 *
 * @apiSuccess {String}     res_code 응답코드
 * @apiSuccess {String}     res_message 응답메시지
 * @apiSuccess {Object}     data 응답결과값
 * @apiSuccess {Object} data.banrInfo                                 배너 정보
 * @apiSuccess {String} data.banrInfo.banrImg                                 배너 이미지
 * @apiSuccess {String} data.banrInfo.today                                 오늘
 * @apiSuccess {String} data.banrInfo.date                                  요일
 * @apiSuccess {String} data.banrInfo.time                                 운영시간
 * @apiSuccess {Object} data.linkInfo                                 링크 정보
 * @apiSuccess {String} data.linkInfo.strLink                       점포안내
 * @apiSuccess {String} data.linkInfo.floorLink                     층별안내
 * @apiSuccess {String} data.linkInfo.eventLink                     이벤트
 * @apiSuccess {Object} data.mapInfo                                지도 영역
 * @apiSuccess {String} data.mapInfo.mapImg                         지도이미지
 * @apiSuccess {String} data.mapInfo.maplink                        지도보기
 * @apiSuccess {String} data.mapInfo.directions                     오시는길
 * @apiSuccess {List} data.specialShopDivList                       스폐셜샵 정보
 * @apiSuccess {String} data.specialShopDivList.divNm                       스폐셜샵 구분자 이름
 * @apiSuccess {List} data.specialShopDivList.specialShopList                       스폐셜샵 리스트
 * @apiSuccess {String} data.specialShopDivList.specialShopList.link                       스폐셜샵 링크
 * @apiSuccess {String} data.specialShopDivList.specialShopList.imgFileNm                       스폐셜샵 메인배너
 * @apiSuccess {String} data.specialShopDivList.specialShopList.maiTitleNm1                       스폐셜샵 메인타이틀
 * @apiSuccess {String} data.specialShopDivList.specialShopList.subtitlNm1                       스폐셜샵 서브타이블1
 * @apiSuccess {String} data.specialShopDivList.specialShopList.subtitlNm2                       스폐셜샵 서브타이틀2
 * @apiSuccess {String} data.specialShopDivList.specialShopList.banrDesc                       스폐셜샵 컨텐츠메시지
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "linkInfo": {
 *             "strLink": "/str",
 *             "floorLink": "/floor",
 *             "eventLink": "/event"
 *         },
 *         "mapInfo": {
 *             "directions": "/오시는길",
 *             "mapImg": "/지도이미지",
 *             "maplink": "/지도보기"
 *         },
 *         "specialShopDivList": [
 *             {
 *                 "divNm": "SHOP 쇼핑존",
 *                 "specialShopList": null
 *             },
 *             {
 *                 "divNm": "PLAY 플레이존",
 *                 "specialShopList": [
 *                     {
 *                         "shpgMgzDispDtlCd": "80",
 *                         "offlineStrNm": "고양점",
 *                         "shpgMgzGrpCd": "20",
 *                         "shpgMgzContentGrpNm": "플레이존",
 *                         "shpgMgzId": "7000000235",
 *                         "shpgMgzNm": "스타필 [DEV 정상 작동여부 테스트]드",
 *                         "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201803/2018032015054637202023724302_583.jpg",
 *                         "maiTitleNm1": "메인 타이틀 [DEV 정상 작동여부 테스트]",
 *                         "maiTitleNm2": null,
 *                         "subtitlNm1": "서브타이틀1 [DEV 정상 작동여부 테스트]",
 *                         "subtitlNm2": "서브타이틀2 [DEV 정상 작동여부 테스트]",
 *                         "banrDesc": "컨텐츠메시지 [DEV 정상 작동여부 테스트]",
 *                         "link": "/specialShop.ssg?id=7000000235"
 *                     },
 *                     {
 *                         "shpgMgzDispDtlCd": "80",
 *                         "offlineStrNm": "고양점",
 *                         "shpgMgzGrpCd": "20",
 *                         "shpgMgzContentGrpNm": "플레이존",
 *                         "shpgMgzId": "7000000215",
 *                         "shpgMgzNm": "테스트용_플레이존",
 *                         "imgFileNm": "http://dev-static.ssgcdn.com/cmpt/banner/201803/2018031313460637211423726242_492.jpg",
 *                         "maiTitleNm1": "test",
 *                         "maiTitleNm2": null,
 *                         "subtitlNm1": null,
 *                         "subtitlNm2": null,
 *                         "banrDesc": null,
 *                         "link": "/specialShop.ssg?id=7000000215"
 *                     }
 *                 ]
 *             },
 *             {
 *                 "divNm": "FOOD 푸드존",
 *                 "specialShopList": null
 *             }
 *         ],
 *         "banrInfo": {
 *             "date": "Monday",
 *             "today": "3월 26일",
 *             "banrImg": "/배너이미지",
 *             "time": "10:02 ~ 22:02"
 *         }
 *     }
 * }
 *
 */