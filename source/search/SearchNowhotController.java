/**
 * @api {post} /api/search/nowhot/datas.ssg 키인장 NOWHOT
 * @apiVersion 0.0.0
 * @apiName SearchCommController.getNowHotList
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
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/search/nowhot/datas.ssg -d '
 * > {"common":{"apl_ver":"1.1.3","os_cd":"20","ts":"20170808134313","mobil_app_no":"51"},"params":{"siteNo":"6005"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {List} data.nowHotList 	NOWHOT 데이터 리스트
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *   "cached": false,
 *   "method": "",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
 *     "nowHotList": [
 *       {
 *         "dispSrchwdNm": "키인검색어",
 *         "rplcSrchwdNm": "간편한야식",
 *         "linkUrl": "http://m.ssg.com/search.ssg?target=all&query=간편하고맛있어요",
 *         "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082318110943302154336215_231.jpg"
 *       },
 *       {
 *         "dispSrchwdNm": "키인검색어",
 *         "rplcSrchwdNm": "마사지는\n사랑입니다",
 *         "linkUrl": " http://m.ssg.com/search.ssg?target=all&query=마사지볼",
 *         "imgFileNm": "http://static.ssgcdn.com/cmpt/banner/201708/2017082316395643348504330950_714.jpg"
 *       }
 *     ]
 *   }
 * }
*/