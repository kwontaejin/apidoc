/**
 * @api {post} /api/search/keyword/datas.ssg 키인창 자주찾은검색어
 * @apiVersion 0.0.0
 * @apiName SearchController.searchKeyWord
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
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/search/keyword/datas.ssg.ssg -d '
 * > {"common":{"apl_ver":"1.1.3","os_cd":"20","ts":"20170808134313","mobil_app_no":"51"},"params":{"siteNo":"6005"}}
 *
 * @apiSuccess {String} res_code			응답코드
 * @apiSuccess {String} res_message	응답메시지
 * @apiSuccess {Object} data				응답결과값
 * @apiSuccess {List} data.frqKeywordList	자주찾은 검색어 리스트
 * @apiSuccess {Stringt} data.loginYn	로그인여부
 * @apiSuccess {List} data.mbrKeywordList	최근검색어 리스트(사용안함)
 *
 * @apiSuccessExample Response (example):
 * {
 *     "cached": false,
 *     "method": "",
 *     "res_code": "200",
 *     "res_message": "성공",
 *     "data": {
 *         "frqKeywordList": [
 *             {
 *                 "srchCnt": "21",
 *                 "mbrId": "0005571281",
 *                 "siteNo": "6005",
 *                 "srchwdDtlc": "피코크",
 *                 "srchSeq": "10"
 *             },
 *             {
 *                 "srchCnt": "19",
 *                 "mbrId": "0005571281",
 *                 "siteNo": "6005",
 *                 "srchwdDtlc": "코트",
 *                 "srchSeq": "8"
 *             },
 *             {
 *                 "srchCnt": "7",
 *                 "mbrId": "0005571281",
 *                 "siteNo": "6005",
 *                 "srchwdDtlc": "넘버세븐",
 *                 "srchSeq": "1"
 *             }
 *         ],
 *         "loginYn": "Y",
 *         "mbrKeywordList": []
 *     }
 * }

*/