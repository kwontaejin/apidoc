/**
 * @api {post} /api/search/siteTag/datas.ssg 실시간#태그,코너태그
 * @apiVersion 0.0.0
 * @apiName SearchCommController.getSrchSiteTagList
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
 * @apiSuccess {List} data.rcmdTagList		#실시간태그리스트
 * @apiSuccess {List} data.cornrTagList		코너태그리스트
 * @apiSuccess {String} data.baseTime			실시간태그기준시간
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
 *     ],
 *     "cornrTagList": [
 *       {
 *     		"titleNm": "이것만 알면 준비 끝나지",
 *     		"tagKeywd": [
 *       		"#사무실비치용",
 *      		 "#고기구울때",
 *      		 "#현장학습용",
 *      		 "#갈비찜용",
 *      		 "#돈까스용",
 *     		  	 "#샤브샤브용",
 *     		     "#반찬없을때",
 *               "#손님접대용",
 *       		 "#여행가서잘먹었어요"
 *    		],
 *     },
 *     {
 *     		"titleNm": "우리집을 위한 필수템",
 *     		"tagKeywd": [
 *       		"#신랑필수품",
 *       		"#아기가작먹어요",
 *       		"#항상쓰는 주방세제",
 *       		"#향이오래가요"
 *     		],
 *     }   
 *    ],
 *   "baseTime": "2017.10.20.09시 기준"
 * }
*/