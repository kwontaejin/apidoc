var path = require("path");
var querystring = require('querystring');
var http = require('http');
var urlLib = require('url');

module.exports = function (app) {
  app.post('/mapi/sample/request', function (req, res) {

    var zone = '';
    if(req.body.zone === 'local') {
      zone = 'local-';
    } else if(req.body.zone === 'dev') {
      zone = 'dev-';
    } else if(req.body.zone === 'qa') {
      zone = 'qa-';
    } else if(req.body.zone === 'stg') {
      zone = 'stg-';
    }

    console.log('[Sample Request Start] url : ' + req.body.retUrl + ', zone : ' + (req.body.zone === '' ? 'prod' : req.body.zone));
    console.log('parameter : ' + JSON.stringify(req.body.parameter));

    // prepare the header
    var headers = {
      'Content-Type': 'application/json',
      'Cookie' : (req.headers.cookie == undefined ? '' : req.headers.cookie),
      'User-Agent' : 'mapi-doc'
    };

    var fullUrl = urlLib.parse(req.body.retUrl);
    var options = {
      host: zone + fullUrl.host,
      path: fullUrl.path,
      method: 'POST',
      headers: headers
    };
    var restRequest = http.request(options, function (response) {
      var responseString = '';
      response.setEncoding('utf-8');
      response.on('data', function (data) {
        responseString += data;
      });
      response.on('end', function () {
        var responseObject = JSON.parse(responseString);
        res.json(responseObject);
      });
    });
    
    restRequest.write(JSON.stringify(req.body.parameter));
    restRequest.on('error', function(err) {
      res.json(JSON.parse('{"error" : "' + err + '"}'));
    })
    restRequest.end();
    
  });
}
