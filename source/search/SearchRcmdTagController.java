/**
 * @api {post} /api/search/rcmdtag/datas.ssg 키인창 인기태그
 * @apiVersion 0.0.0
 * @apiName SearchCommController.getRcmdTagList
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
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/search/rcmdtag/datas.ssg -d '
 * > {"common":{"apl_ver":"1.1.3","os_cd":"20","ts":"20170808134313","mobil_app_no":"51"},"params":{"siteNo":"6005"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {List} data.rcmdTagList		인기태그 리스트
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *   "cached": false,
 *   "method": "",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
 *     "rcmdTagList": [
 *       "#샤브샤브용",
 *       "#깔끔하고맛있어요",
 *       "#아이들이잘먹어요",
 *       "#달고맛있어요",
 *       "#사무실비치용",
 *       "#아이들간식",
 *       "#가성비최고입니다",
 *       "#짜지않고맛있어요",
 *       "#샐러드용",
 *       "#달달하니맛있어요"
 *     ]
 *   }
 * }
*/