/**
 * @api {post} /cartApi/insertCartItem.ssg 장바구니담기
 * @apiVersion 0.0.0
 * @apiName CartApiController.insertCartItem
 * @apiGroup Front Cart
 * @apiSampleRequest off
 * @apiPermission none
 *
 * @apiDescription 전시리스트에서 상품을 장바구니에 담을때 사용.
 * 
 * 내부적으로는 pay서버와 rest통신을 한다.
 * 
 * (참고 : 상품상세는 해당 api를 사용하지 않으며, pay 서버를 직접 호출한다.)
 *
 * @apiParam {String} apiVersion api버전
 * @apiParam {String} cart_type_cd 장바구니 유형코드(10 : 일반, 30:정기배송), default : 10
 * @apiParam {Array} item_list 장바구니에 담을 상품목록
 * @apiParam {String} item_list.item_id 상품ID
 * @apiParam {String} item_list.uitem_id 단품ID
 * @apiParam {String} item_list.site_no 상품의 siteNo
 * @apiParam {String} item_list.ord_qty 주문수량
 * @apiParam {String} item_list.salestr_no 영업점번호(선택)
 *
 * @apiParamExample {json} Request-Example :
 *  {
 *    "common":{
 *       "ts":"20150421101123",
 *       "mobil_app_no":"1",
 *       "apl_ver":"2.0.4",
 *       "os_cd":"20"
 *    },
 *    "params":{
 *       "cart_type_cd":"10",
 *       "item_list":[
 *          {
 *             "uitem_id":"00000",
 *             "site_no":"6001",
 *             "item_id":"0000009014489",
 *             "ord_qty":"1"
 *          }
 *       ]
 *    },
 *    "ckwhere":"emart_app_iOS"
 * }
 * @apiExample Example usage:
 *  curl -X POST  --header 'Content-Type: application/json' --header 'Accept: application/json' http://dev-m.apps.ssg.com/cartApi/insertCartItem.ssg -d '
 * > {"common":{"ts":"20150421101123","mobil_app_no":"1","apl_ver":"2.0.4","os_cd":"20"},"params":{"cart_type_cd":"10","item_list":[{"uitem_id":"00000","site_no":"6001","item_id":"0000009014489","ord_qty":"1"}]},"ckwhere":"emart_app_iOS"}'
 *
 * @apiSuccess {String}     res_code 응답코드
 * @apiSuccess {String}     res_message 응답메시지
 * @apiSuccess {Object}     data 응답결과값
 * @apiSuccess {Array[]} data.result_item_list 응답결과목록
 * @apiSuccess {String} data.result_item_list.ord_qty 주문수량
 * @apiSuccess {String} data.result_item_list.cart_id
 * @apiSuccess {String} data.result_item_list.item_id
 * @apiSuccess {String} data.result_item_list.uitem_id
 * @apiSuccess {String} data.result_item_list.cart_item_site_no
 * @apiSuccess {String} data.result_item_list.master_cart_id
 * @apiSuccess {String} data.cartRsgMsg 장바구니 담기 결과 응답값
 * @apiSuccess {String} data.delete_count
 * @apiSuccess {String} data.result_url
 * @apiSuccess {String} data.result_count
 * @apiSuccess {String} data.update_count 추가된 장바구니 개수
 * @apiSuccess {Integer} data.result_item_count
 * @apiSuccess {String} data.insert_count 장바구니 담기 성공개수
 *
 *
 * @apiSuccessExample Response (example):
 * {
 *   "cached": false,
 *   "method": "insertCartItem",
 *   "res_code": "200",
 *   "res_message": "성공",
 *   "data": {
 *     "result_item_list": [
 *       {
 *         "ord_qty": "1",
 *         "cart_id": "1339874945",
 *         "item_id": "0000009014489",
 *         "uitem_id": "00000",
 *         "cart_item_site_no": "6001",
 *         "master_cart_id": "1339874945"
 *       }
 *     ],
 *     "cartRstMsg": "장바구니에 상품이 담겼습니다.",
 *     "delete_count": "0",
 *     "result_url": "http://dev-pay.ssg.com/m/cart/dmsShpp.ssg",
 *     "result_count": "1",
 *     "update_count": "0",
 *     "result_item_count": 1,
 *     "insert_count": "1"
 *   }
 * }
 * @apiError NoAccessRight Only authenticated Admins can access the data.
 * @apiError UserNotFound   The <code>id</code> of the User was not found.
 */