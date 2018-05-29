/**
 * @api {post} /api/starfield/lnb.json 스타필드 LNB 정보
 * @apiVersion 0.0.0
 * @apiName StarfieldMainController.lnb
 * @apiGroup Starfield
 * @apiPermission none
 *
 * @apiDescription 스타필드 LNB 정보
 *
 *
 * @apiExample Example usage:
 *  curl -X POST --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/api/starfield/main.ssg
 *
 * @apiSuccess {String} id                  스타필드 점포 번호
 * @apiSuccess {String} nm                  스타필드 점포 이름
 * @apiSuccess {String} img                 아이콘명
 * @apiSuccess {String} link                링크
 * @apiSuccess {list}   list                뎁스별 반복
 *
 * @apiSuccessExample Response (example):
 * [{
 *		"id": "01",
 *		"nm": "스타필드 하남",
 *		"img": null,
 *		"link": null,
 *		"list": [{
 *				"id": null,
 *				"nm": "점포안내",
 *				"img": null,
 *				"link": "",
 *				"list": null
 *			}, {
 *				"id": null,
 *				"nm": "층별안내",
 *				"img": null,
 *				"link": "/store/floorInfo.ssg?offlineStrIf=01",
 *				"list": null
 *			}, {
 *				"id": null,
 *				"nm": "쇼핑존",
 *				"img": null,
 *				"link": "",
 *				"list": [{
 *						"id": null,
 *						"nm": "스타필드DEV테스트",
 *						"img": null,
 *						"link": "7000000250",
 *						"list": null
 *					}, {
 *						"id": null,
 *						"nm": "스타필드 DEV 실데이터 테스트",
 *						"img": null,
 *						"link": "7000000251",
 *						"list": null
 *					}
 *				]
 *			}, {
 *				"id": null,
 *				"nm": "엔터테인먼트존",
 *				"img": null,
 *				"link": "",
 *				"list": [{
 *						"id": null,
 *						"nm": "테스트용_플레이존",
 *						"img": null,
 *						"link": "7000000215",
 *						"list": null
 *					}, {
 *						"id": null,
 *						"nm": "테스트용_쇼핑존",
 *						"img": null,
 *						"link": "7000000214",
 *						"list": null
 *					}, {
 *						"id": null,
 *						"nm": "테스트용_쇼핑존",
 *						"img": null,
 *						"link": "7000000214",
 *						"list": null
 *					}, {
 *						"id": null,
 *						"nm": "테스트용_푸드존",
 *						"img": null,
 *						"link": "7000000216",
 *						"list": null
 *					}
 *				]
 *			}, {
 *				"id": null,
 *				"nm": "푸드존",
 *				"img": null,
 *				"link": "",
 *				"list": []
 *			}, {
 *				"id": null,
 *				"nm": "이벤트",
 *				"img": null,
 *				"link": "",
 *				"list": null
 *			}
 *		]
 *	}, {
 *		"id": "02",
 *		"nm": "스타필드 코엑스몰",
 *		"img": null,
 *		"link": null,
 *		"list": [{
 *				"id": null,
 *				"nm": "점포안내",
 *				"img": null,
 *				"link": "",
 *				"list": null
 *			}, {
 *				"id": null,
 *				"nm": "층별안내",
 *				"img": null,
 *				"link": "/store/floorInfo.ssg?offlineStrIf=02",
 *				"list": null
 *			}, {
 *				"id": null,
 *				"nm": "쇼핑존",
 *				"img": null,
 *				"link": "",
 *				"list": [{
 *						"id": null,
 *						"nm": "스타필드DEV테스트",
 *						"img": null,
 *						"link": "7000000250",
 *						"list": null
 *					}, {
 *						"id": null,
 *						"nm": "스타필드 DEV 실데이터 테스트",
 *						"img": null,
 *						"link": "7000000251",
 *						"list": null
 *					}
 *				]
 *			}, {
 *				"id": null,
 *				"nm": "엔터테인먼트존",
 *				"img": null,
 *				"link": "",
 *				"list": [{
 *						"id": null,
 *						"nm": "테스트용_푸드존",
 *						"img": null,
 *						"link": "7000000216",
 *						"list": null
 *					}
 *				]
 *			}, {
 *				"id": null,
 *				"nm": "푸드존",
 *				"img": null,
 *				"link": "",
 *				"list": []
 *			}, {
 *				"id": null,
 *				"nm": "이벤트",
 *				"img": null,
 *				"link": "",
 *				"list": null
 *			}
 *		]
 *	}, {
 *		"id": "03",
 *		"nm": "스타필드 고양",
 *		"img": null,
 *		"link": null,
 *		"list": [{
 *				"id": null,
 *				"nm": "점포안내",
 *				"img": null,
 *				"link": "",
 *				"list": null
 *			}, {
 *				"id": null,
 *				"nm": "층별안내",
 *				"img": null,
 *				"link": "/store/floorInfo.ssg?offlineStrIf=03",
 *				"list": null
 *			}, {
 *				"id": null,
 *				"nm": "쇼핑존",
 *				"img": null,
 *				"link": "",
 *				"list": [{
 *						"id": null,
 *						"nm": "스타필 [DEV 정상 작동여부 테스트]드",
 *						"img": null,
 *						"link": "7000000235",
 *						"list": null
 *					}, {
 *						"id": null,
 *						"nm": "스타필드 DEV 실데이터 테스트",
 *						"img": null,
 *						"link": "7000000251",
 *						"list": null
 *					}, {
 *						"id": null,
 *						"nm": "스타필드DEV테스트",
 *						"img": null,
 *						"link": "7000000250",
 *						"list": null
 *					}
 *				]
 *			}, {
 *				"id": null,
 *				"nm": "엔터테인먼트존",
 *				"img": null,
 *				"link": "",
 *				"list": [{
 *						"id": null,
 *						"nm": "테스트용_플레이존",
 *						"img": null,
 *						"link": "7000000215",
 *						"list": null
 *					}
 *				]
 *			}, {
 *				"id": null,
 *				"nm": "푸드존",
 *				"img": null,
 *				"link": "",
 *				"list": []
 *			}, {
 *				"id": null,
 *				"nm": "이벤트",
 *				"img": null,
 *				"link": "",
 *				"list": null
 *			}
 *		]
 *	}
 *]
 *
 *
 */