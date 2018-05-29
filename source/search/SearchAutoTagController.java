 /**
 * @api {get}  http://auto.ssglog.com:9093/WNRun.do 자동완성 태그
 * @apiVersion 0.0.0
 * @apiName SearchAutoTagController.search
 * @apiGroup Common Search
 * @apiPermission none
 *
 * @apiDescription 검색 자동완성(태그) URL 정리
 *
 * @apiUse zoneParameter
 * @apiParam {String} [query]    검색어
 *
 *
 * @apiParamExample {URL} Request-Example :
 * {
 *   "dev": {
 *       "SSG": "http://dev-search.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-ssg&query=",
 *       "신세계몰": "http://dev-search.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-shin&query=",
 *		 "신세계백화점": "http://dev-search.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-dept&query=",
 *       "이마트": "http://dev-search.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-emart&query="
 *   },
 *   "qa": {
 *       "SSG": "http://qa-search.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-ssg&query=",
 *       "신세계몰": "http://qa-search.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-shin&query=",
 *		 "신세계백화점": "http://qa-search.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-dept&query=",
 *       "이마트": "http://qa-search.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-emart&query="
 *   },
 *   "prod": {
 *       "SSG": "http://auto.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-ssg&query=",
 *       "신세계몰": "http://auto.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-shin&query=",
 *		 "신세계백화점": "http://auto.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-dept&query=",
 *       "이마트": "http://auto.ssglocal.com:9093/WNRun.do?datatype=jsonp&convert=fw&target=tag-emart&query="
 *   }
 * }
 *
 * @apiExample Example usage:
 * > http://auto.ssglog.com:9093/WNRun.do?datatype=json&convert=fw&target=tag-ssg&query=%EC%95%84%EC%9D%B4
 *
 * @apiSuccess {String} responsestatus			응답코드
 * @apiSuccess {Object} result				    응답결과값
 * @apiSuccess {List} result.items						추천검색어 결과 리스트
 * @apiSuccess {String} result.totalcount				추천검색어 결과 갯수
 *
 *
 * @apiSuccessExample Response (example):
 * {
 * 	"responsestatus":0,
 * 	"result":
 * 	[
 * 		{
 * 			"totalcount":2,
 * 			"items":
 * 			[
 * 				{
 *					"banrurl" : "" ,
 * 					"count":4,
 * 					"hkeyword":"<font style='font-size:12px'><font style='color:#CC6633'>아이</font>가좋아해요</font>",
 * 					"keyword":"아이가좋아해요",
 * 					"linkname":"",
 * 					"linkurl": ""
 * 					"type":1,
 * 				},
 *				{
 *					"banrurl" : "" ,
 * 					"count":1,
 * 					"hkeyword":"<font style='font-size:12px'><font style='color:#CC6633'>아이</font>가싫어해요</font>",
 * 					"keyword":"아이가싫어해요",
 * 					"linkname":"",
 * 					"linkurl": ""
 * 					"type":1,
 * 				},
 * 			]
 * 		}
 * 	]
 * }
*/