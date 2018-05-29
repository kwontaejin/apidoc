/**
 * @api {post} /api/search/hotKeywd/datas.ssg 실시간 인기검색어
 * @apiVersion 0.0.0
 * @apiName SearchCommController.getHotKeywdList
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 통합검색 API
 *
 * 
 * @apiParam {String} [apiVersion]    api버전
 * @apiParam {String} [siteNo]    요청 사이트번호
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
 *       "siteNo": "6005"
 *   }
 * }
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/search/hotKeywd/datas.ssg -d '
 * > {"common":{"apl_ver":"1.1.3","os_cd":"20","ts":"20170808134313","mobil_app_no":"51"},"params":{"siteNo":"6005"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {List} data.hotKeywdList		인기검색어 리스트
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *   "cached": false,
 *   "method": "",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
 *     "hotKeywdList": [
 *       {
 *         "srchwdNm": "루즈앤라운지가방",
 *         "dispOrdr": "1",
 *         "srchwdNewYn": "N"
 *       },
 *       {
 *         "srchwdNm": "믹서기",
 *         "dispOrdr": "10",
 *         "srchwdNewYn": "N"
 *       }
 *     ]
 *   }
 * }
*/